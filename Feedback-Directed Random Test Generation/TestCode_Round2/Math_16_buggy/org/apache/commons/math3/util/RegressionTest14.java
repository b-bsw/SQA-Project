package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(29.012614126025312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.072762216191133d + "'", double1 == 3.072762216191133d);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-8), 34.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2 == (-8.0f));
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.624619224577892d + "'", double1 == 7.624619224577892d);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.695330298047765d, (-0.33909301561996863d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5918923135843258d + "'", double2 == 0.5918923135843258d);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.505473743921135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.55307120752224d + "'", double1 == 143.55307120752224d);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        float float2 = org.apache.commons.math3.util.FastMath.max((-4.8103634E12f), (-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748365E9f) + "'", float2 == (-2.14748365E9f));
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0201468328002705d, (-36.14246844765979d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.113374435736984d + "'", double2 == 3.113374435736984d);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.778151250383644d + "'", double1 == 3.778151250383644d);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3071.9998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.1357533839793369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8672493357705295d) + "'", double1 == (-0.8672493357705295d));
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5996388013001026d + "'", double1 == 1.5996388013001026d);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.853230586269599d, (-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.246925917517865d + "'", double2 == 1.246925917517865d);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 121L, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 123904.0f + "'", float2 == 123904.0f);
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0.75f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000001d + "'", double1 == 0.7500000000000001d);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.02209708691207961d, 3.748066029033894E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02209708691207961d + "'", double2 == 0.02209708691207961d);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(72.89110995790382d, 2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5415740898287724d + "'", double2 == 1.5415740898287724d);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0000009536747712d, 2.1729791831319734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000020723165843d + "'", double2 == 1.0000020723165843d);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 46L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.521670408657297d + "'", double1 == 4.521670408657297d);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000008f + "'", float1 == 32.000008f);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8559934009085187d) + "'", double1 == (-0.8559934009085187d));
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 750, 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 87);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1645206134117347E-165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1645206134117347E-165d + "'", double1 == 1.1645206134117347E-165d);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.015625637653511198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.158842274367654d) + "'", double1 == (-4.158842274367654d));
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.9916154164156743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9925907227207792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9975241159642256d) + "'", double1 == (-0.9975241159642256d));
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.849653111851499E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.165292957783155d + "'", double1 == 17.165292957783155d);
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        double double2 = org.apache.commons.math3.util.FastMath.log(512.5789572728952d, (-9.704060527839234d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8892415974417167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(572.9578286961271d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 572.9578286961271d + "'", double2 == 572.9578286961271d);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(28.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 230);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.43022620016570173d, 0.8778599937165045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43022620016570173d + "'", double2 == 0.43022620016570173d);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000123108260284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0000001372850489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182822016385244d + "'", double1 == 2.7182822016385244d);
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.754140548665503d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7940.239921833475d + "'", double2 == 7940.239921833475d);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-34.999996f), 2.8284271247461903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.114095929857086d + "'", double2 == 35.114095929857086d);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-0.49278093949912594d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.206769224304003E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.206769224304003E11d + "'", double1 == 4.206769224304003E11d);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6215477523208265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7275232359393338d + "'", double1 == 0.7275232359393338d);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        int int2 = org.apache.commons.math3.util.FastMath.max((-42), 137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 137 + "'", int2 == 137);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 86L, (float) 3072L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 86.0f + "'", float2 == 86.0f);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7665477425729947d, (-2.34967110883676E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7665477785848038d + "'", double2 == 0.7665477785848038d);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        double double1 = org.apache.commons.math3.util.FastMath.log((-29.328990934768964d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.33934385609142426d, (-0.0050790161833526295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0055041955898292d + "'", double2 == 1.0055041955898292d);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-3.036360625353949E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        float float1 = org.apache.commons.math3.util.FastMath.signum(31.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        float float2 = org.apache.commons.math3.util.FastMath.min(1025.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2382096176443156E-13d + "'", double1 == 2.2382096176443156E-13d);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.4013650846586734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4013650846586732d) + "'", double1 == (-1.4013650846586732d));
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        double double1 = org.apache.commons.math3.util.FastMath.atan(12.285091215917852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4895759193423777d + "'", double1 == 1.4895759193423777d);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.2949673E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.345158334326972E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3222.099095010802d + "'", double1 == 3222.099095010802d);
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.999999880790727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 0.015625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.015625f + "'", float2 == 0.015625f);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        int int2 = org.apache.commons.math3.util.FastMath.min(38, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 2147483647, 21);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.7079938E27f, (float) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.556536E-17f, 1.1122363532585344d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.556537E-17f + "'", float2 == 5.556537E-17f);
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 8, (-0.9999999999897818d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9999995f + "'", float2 == 7.9999995f);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(19.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.686997580331529d + "'", double1 == 3.686997580331529d);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-37.999996185302734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-11));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.0d) + "'", double1 == (-11.0d));
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1588830833596715d) + "'", double1 == (-4.1588830833596715d));
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.3956142355310157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3380498542013137d + "'", double1 == 1.3380498542013137d);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 87, (-9.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 86.99999f + "'", float2 == 86.99999f);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 128L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0406148914328552d) + "'", double1 == (-1.0406148914328552d));
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        int int2 = org.apache.commons.math3.util.FastMath.max((-15), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-12.999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4201670368266393d) + "'", double1 == (-0.4201670368266393d));
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 230L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 230.0f + "'", float1 == 230.0f);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0009693077094823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8820588250089578d + "'", double1 == 0.8820588250089578d);
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.6077497654366413d, (double) (-7.3786976E19f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1500.0001f, (-10.097464363504391d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1580072.847490559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1580072.0d + "'", double1 == 1580072.0d);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 9, (long) 512);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 512L + "'", long2 == 512L);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.22864910185707277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22670225318342424d + "'", double1 == 0.22670225318342424d);
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(37.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 37.000004f + "'", float1 == 37.000004f);
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        int int2 = org.apache.commons.math3.util.FastMath.min((-11), 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000007f + "'", float1 == 3.0000007f);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1719142372802612E16d + "'", double1 == 1.1719142372802612E16d);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.5577912567662449d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.9850571258202687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 127, (-2016L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.2665848258979956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.274185406184992d + "'", double1 == 15.274185406184992d);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.882813470127877E-4d, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.051758418829923E-5d + "'", double2 == 3.051758418829923E-5d);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.2411226046620543E10d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 109);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6913478822291435d + "'", double1 == 4.6913478822291435d);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3021117240420959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0919835173646293d + "'", double1 == 1.0919835173646293d);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.008837747656337245d), 0.061877705960518836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.061877705960518836d + "'", double2 == 0.061877705960518836d);
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5996946512663103d, 1.2664005294302816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5996946512663103d + "'", double2 == 0.5996946512663103d);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(9.210523205751152E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.21052320575111E-15d + "'", double1 == 9.21052320575111E-15d);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        long long2 = org.apache.commons.math3.util.FastMath.max(86L, (long) 128);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(50.9780097157571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        long long2 = org.apache.commons.math3.util.FastMath.max(46L, (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        int int1 = org.apache.commons.math3.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        double double1 = org.apache.commons.math3.util.FastMath.cos(10.00340430020405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8372146593705739d) + "'", double1 == (-0.8372146593705739d));
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        double double1 = org.apache.commons.math3.util.FastMath.rint(230.25850929940455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 230.0d + "'", double1 == 230.0d);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1023.00006f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        double double2 = org.apache.commons.math3.util.FastMath.max(271.3685902448305d, 1.2207032644558522E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 271.3685902448305d + "'", double2 == 271.3685902448305d);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.36693586126414035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 2015.9999f, (double) (-8.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.220703125E-4d) + "'", double2 == (-1.220703125E-4d));
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-34.657358789578716d), 7.198544273811357E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.657358789578716d) + "'", double2 == (-34.657358789578716d));
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1023.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.585786437626905d), (double) 2.8211864E-34f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.82118644197349E-34d + "'", double2 == 2.82118644197349E-34d);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.011020261488361868d, 0.10626723781312271d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6193685383271323d + "'", double2 == 0.6193685383271323d);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1612231530729573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172908762064605d + "'", double1 == 0.9172908762064605d);
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.04453605E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-4), (-20L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        long long1 = org.apache.commons.math3.util.FastMath.round(9.223370937343148E18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223370937343148032L + "'", long1 == 9223370937343148032L);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(141.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.06491568643588523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-3.4667109783961534d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        int int2 = org.apache.commons.math3.util.FastMath.min((-15), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        double double1 = org.apache.commons.math3.util.FastMath.abs(84.73931296875567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.13533528323661262d, (-0.4045683399228926d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.1855810236609772E16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31855810236609772L + "'", long1 == 31855810236609772L);
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 39);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39.000004f + "'", float1 == 39.000004f);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-4.836344889159275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0232274784994992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 9223370937343148032L, (float) 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233709E18f + "'", float2 == 9.2233709E18f);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(21481.281039031423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.66808436663482d + "'", double1 == 10.66808436663482d);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.610556285247321E-4d + "'", double1 == 1.610556285247321E-4d);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.570502024105884E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.19603850046547d + "'", double1 == 10.19603850046547d);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 15L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 15.000001f + "'", float1 == 15.000001f);
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        long long1 = org.apache.commons.math3.util.FastMath.abs(14L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        double double1 = org.apache.commons.math3.util.FastMath.acos(286.8623667551892d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.7079938E27f, 230.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.7079938E27f + "'", float2 == 2.7079938E27f);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 109, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.0576995672643544E47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.529646975408425E23d + "'", double1 == 5.529646975408425E23d);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.0794415416798357d, (double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0794415452628074d + "'", double2 == 2.0794415452628074d);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        float float2 = org.apache.commons.math3.util.FastMath.max(374.99997f, 16127.999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16127.999f + "'", float2 == 16127.999f);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0232274784994992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274784994995d + "'", double1 == 1.0232274784994995d);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-4.50359936E15f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7976556325708719d) + "'", double1 == (-0.7976556325708719d));
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2667715847722035E-218d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-724) + "'", int1 == (-724));
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8725523440809979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7174420339143484d + "'", double1 == 0.7174420339143484d);
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7768243192326673d + "'", double1 == 0.7768243192326673d);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.556943144653333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.910491617380085d + "'", double1 == 31.910491617380085d);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.1640858863087704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 6143999.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1694277838348877E-5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.292469630076908E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.292469630076908E-26d + "'", double1 == 1.292469630076908E-26d);
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0279410268437934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0138742657962048d + "'", double1 == 1.0138742657962048d);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7973736912471375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5863265390186986d + "'", double1 == 0.5863265390186986d);
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.10626723781312271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5475585765788982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5475585765788984d + "'", double1 == 1.5475585765788984d);
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.5756660649621339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.1345179953744407d, (double) 1023L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(88.94410169625873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.431018062556063d + "'", double1 == 9.431018062556063d);
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-14), (-0.6036003925924347d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6138839560447091d) + "'", double2 == (-1.6138839560447091d));
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.9103830456310187E-11d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.862645149203852E-9d + "'", double2 == 1.862645149203852E-9d);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.5845631E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845631E30f + "'", float2 == 1.5845631E30f);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.06491568643588523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0021077632011064d + "'", double1 == 1.0021077632011064d);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.150779711560351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 237.8221591609373d + "'", double1 == 237.8221591609373d);
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.2304259041251446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4678259253815853d) + "'", double1 == (-1.4678259253815853d));
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6653746816831394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6653746816831396d + "'", double1 == 1.6653746816831396d);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2207031E-4f, (float) 512L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5258905478413947E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000116417d + "'", double1 == 1.000000000116417d);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.552713678800501E-15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899925302460492d) + "'", double1 == (-0.9899925302460492d));
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        float float2 = org.apache.commons.math3.util.FastMath.max(14.999999f, (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        float float1 = org.apache.commons.math3.util.FastMath.signum(127.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.531169184716246E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1691265005705735E29d + "'", double1 == 3.1691265005705735E29d);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-1024));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.9999999999999d) + "'", double1 == (-1023.9999999999999d));
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-50), (float) 46);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        double double1 = org.apache.commons.math3.util.FastMath.signum(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.882812888051005E-4d, 0.8929616830058433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.882812888051006E-4d + "'", double2 == 4.882812888051006E-4d);
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.4201670368266393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(96.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3072.0002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0005f + "'", float1 == 3072.0005f);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.1003275537854505E-17d, (double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1003275537854505E-17d + "'", double2 == 3.1003275537854505E-17d);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-38));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 38.0f + "'", float1 == 38.0f);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8446874961776067d, (double) 46.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.0d + "'", double2 == 46.0d);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.6953302980477645d, 1.986979343053352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.098452070725588d + "'", double2 == 5.098452070725588d);
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-32.318429737814974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5398640985425933d) + "'", double1 == (-1.5398640985425933d));
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.443593622809233E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.363907966290751d + "'", double1 == 5.363907966290751d);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999999999780624d, (double) 37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999991883102d + "'", double2 == 0.9999999991883102d);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        int int2 = org.apache.commons.math3.util.FastMath.max((-49), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.856115509710435E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6247955454703815d + "'", double1 == 4.6247955454703815d);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        int int1 = org.apache.commons.math3.util.FastMath.abs(109);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.1170554140246223d, 4.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1170554140246223d + "'", double2 == 2.1170554140246223d);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.770157551990498E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        float float1 = org.apache.commons.math3.util.FastMath.signum(24000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.05243197782655937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.925955988934938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-7.62364218539641d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0004887584365d + "'", double1 == 1023.0004887584365d);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.12521084603836322d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12456259140973969d) + "'", double1 == (-0.12456259140973969d));
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.017452406441346557d, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6714016625072592E-60d + "'", double2 == 1.6714016625072592E-60d);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-1024L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8338268425894416d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8338268425894416d + "'", double2 == 0.8338268425894416d);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        int int1 = org.apache.commons.math3.util.FastMath.round(749.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 31, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30.999998f + "'", float2 == 30.999998f);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0864876632426175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4129623579314118d + "'", double1 == 0.4129623579314118d);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1500.0001f, 661);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8129545935888933d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0013247113583604495d + "'", double2 == 0.0013247113583604495d);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        long long1 = org.apache.commons.math3.util.FastMath.round(21.878988300937984d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22L + "'", long1 == 22L);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.382432E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.382431946694851E-10d + "'", double1 == 1.382431946694851E-10d);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0E-200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.9999995f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.951760157141521E27d + "'", double1 == 4.951760157141521E27d);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.3776033183918694E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3225436741518254d) + "'", double1 == (-0.3225436741518254d));
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        double double1 = org.apache.commons.math3.util.FastMath.log(51.878049774137445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9488957676494953d + "'", double1 == 3.9488957676494953d);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8011238661903161d, 1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080487E43d + "'", double2 == 1.3440585709080487E43d);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 34.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3520643918278d + "'", double1 == 2005.3520643918278d);
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1023.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6030126644276035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.10437952659709444d, 402.4287934927355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10437952659709444d + "'", double2 == 0.10437952659709444d);
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2.0f), (-1.335144E-4f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.014120383468518E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.69674459530097d + "'", double1 == 73.69674459530097d);
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.220703128031649E-4d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.220703128031649E-4d + "'", double2 == 1.220703128031649E-4d);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3072.0f, (float) 21L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1546709519529927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8192955636350346d + "'", double1 == 0.8192955636350346d);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1406354131908332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.17952391059202d + "'", double1 == 2.17952391059202d);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5475585765788984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625952d + "'", double1 == 0.9999092042625952d);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.007570629285707457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007570773926109965d) + "'", double1 == (-0.007570773926109965d));
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 50);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.588250504492026d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.852374279897447E7d + "'", double2 == 6.852374279897447E7d);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.4337816812784116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6480537223025351d + "'", double1 == 0.6480537223025351d);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.556536E-17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.617445E-24f + "'", float1 == 6.617445E-24f);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.625595429178968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1547339958017258d + "'", double1 == 2.1547339958017258d);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 100, (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0061035156f + "'", float2 == 0.0061035156f);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        float float2 = org.apache.commons.math3.util.FastMath.min(51.999996f, 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999996f + "'", float2 == 51.999996f);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-4.50359936E15f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(106.0d, (-0.007570773924451898d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570867749190289d + "'", double2 == 1.570867749190289d);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (-62.999992f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-62.999992f) + "'", float2 == (-62.999992f));
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.951760157141521E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000608595834288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.085773155951752E-5d + "'", double1 == 6.085773155951752E-5d);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-34L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.6379788E-12f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-18));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7001686872743049d, (-8.316789127129839d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7001686872743048d + "'", double2 == 0.7001686872743048d);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 127L, 31.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5624904366973482d, 3072);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16500355124533647d + "'", double1 == 0.16500355124533647d);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.991374238398652E30d, 0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7500000000000001d + "'", double2 == 0.7500000000000001d);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 63959947L, (-7.9999995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.9999995f) + "'", float2 == (-7.9999995f));
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        double double1 = org.apache.commons.math3.util.FastMath.signum(88.94410169625873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8813735907448332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.0f, 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536743E-7f + "'", float2 == 9.536743E-7f);
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08168132328422244d + "'", double1 == 0.08168132328422244d);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        int int2 = org.apache.commons.math3.util.FastMath.max(20, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6483608274590866d, 49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.649946976182961E14d + "'", double2 == 3.649946976182961E14d);
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.292469630076908E-26d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.8218109075452849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        double double1 = org.apache.commons.math3.util.FastMath.rint(487211.6611272416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 487212.0d + "'", double1 == 487212.0d);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-57.285126329382095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(487212.0d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.046279803109376E15d + "'", double2 == 1.046279803109376E15d);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.64926744E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9333108123671324d, 2.209973124492415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9333108123671324d + "'", double2 == 0.9333108123671324d);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.570792512097631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.05751362495359344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3860026151611985d + "'", double1 == 0.3860026151611985d);
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, (long) 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-35.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-34.999996f) + "'", float1 == (-34.999996f));
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.570750926882484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624361521972153d + "'", double1 == 1.1624361521972153d);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.2676506002282575E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 18);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.862645149203852E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.778105565676456E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7781055E7d + "'", double1 == 5.7781055E7d);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5668734864610468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.566873486461047d + "'", double1 == 0.566873486461047d);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9395033482133572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0839442125513057d + "'", double1 == 1.0839442125513057d);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-44.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.521546720938896d + "'", double1 == 1.521546720938896d);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-2.6754111826338143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8932911433831696d) + "'", double1 == (-0.8932911433831696d));
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.0f + "'", float1 == 40.0f);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        double double1 = org.apache.commons.math3.util.FastMath.rint(38.75229574078433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.23632416484367985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-5.8774718E-37f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.8774718E-37f) + "'", float2 == (-5.8774718E-37f));
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        int int2 = org.apache.commons.math3.util.FastMath.max(109, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8114933394509746d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6287965664024852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20148983846439464d) + "'", double1 == (-0.20148983846439464d));
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.0000007f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000007f + "'", float1 == 3.0000007f);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1024L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-127.0f), (double) (-1023.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.603379927602576d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7987847256936668d) + "'", double1 == (-0.7987847256936668d));
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1409471084848406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(74.35674296486278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.962109144995424E32d + "'", double1 == 1.962109144995424E32d);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.011048543456039806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-2016.0d), 0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2016.0000900857003d + "'", double2 == 2016.0000900857003d);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.999625033326321E-5d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.640121135009937E60d + "'", double2 == 1.640121135009937E60d);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.3978953594960317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.735970476275598d) + "'", double1 == (-0.735970476275598d));
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707963267912586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270528713884d + "'", double1 == 0.45158270528713884d);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.862645149203852E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149203852E-9d + "'", double1 == 1.862645149203852E-9d);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.24553239290601714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2505884194068268d) + "'", double1 == (-0.2505884194068268d));
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5251711488118009d, 0.5508158352787748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5251711488118009d + "'", double2 == 0.5251711488118009d);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.715289172677667d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E30d + "'", double1 == 1.5845632502852868E30d);
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.20148983846439464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-2.14748352E9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748352E9f + "'", float1 == 2.14748352E9f);
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.3466753987299895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3616600342037056d + "'", double1 == 0.3616600342037056d);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.06179885322941391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06187764556215683d + "'", double1 == 0.06187764556215683d);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4815203834508854d + "'", double1 == 1.4815203834508854d);
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        int int2 = org.apache.commons.math3.util.FastMath.max((-47), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-77), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77L) + "'", long2 == (-77L));
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1499.0006666663703d, 0.9182846632869424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1499.000947935973d + "'", double2 == 1499.000947935973d);
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.29813096209479945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1023, 1023);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.027181889027663657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4276814831852543d) + "'", double1 == (-0.4276814831852543d));
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-127.0f), (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.49609375f) + "'", float2 == (-0.49609375f));
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        long long2 = org.apache.commons.math3.util.FastMath.max(20L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.89704490591024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7310.338849499815d + "'", double1 == 7310.338849499815d);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 35.000008f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(26190.8356694386d, 2.1367205671564067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26190.8356694386d + "'", double2 == 26190.8356694386d);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.32841555916265663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4863445844633245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4209056993923017d + "'", double1 == 3.4209056993923017d);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.783412408121364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.406670953140611d + "'", double1 == 1.406670953140611d);
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 84.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.111474989126999E36d + "'", double1 == 4.111474989126999E36d);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.154229163653721E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1542291646997856E-5d + "'", double1 == 3.1542291646997856E-5d);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.000000000705009d, 0.012638627557620415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5581583721250276d + "'", double2 == 1.5581583721250276d);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23781619457280337d + "'", double1 == 0.23781619457280337d);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9999999403953552d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        int int2 = org.apache.commons.math3.util.FastMath.min((-29), (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02707996890662637d + "'", double1 == 0.02707996890662637d);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 22026L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.0f + "'", float1 == 22026.0f);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        long long1 = org.apache.commons.math3.util.FastMath.abs(56L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        int int1 = org.apache.commons.math3.util.FastMath.round(1023.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9676743679318145d + "'", double1 == 0.9676743679318145d);
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.337171937726513E-50d, 6.000012765099144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.646755658135536E-297d + "'", double2 == 6.646755658135536E-297d);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.385626020143185d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 230L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-29.012614126025312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999997489d) + "'", double1 == (-0.9999999999997489d));
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3282.642222003741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3283.0d + "'", double1 == 3283.0d);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.05037245961609866d), 1.8469725489740325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05037245961609865d) + "'", double2 == (-0.05037245961609865d));
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.327747459134791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9811607348543806d + "'", double1 == 0.9811607348543806d);
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        float float1 = org.apache.commons.math3.util.FastMath.abs(13.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        int int2 = org.apache.commons.math3.util.FastMath.max(230, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.505473743921135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9999010695219456d, 10.19603850046547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999010695219456d + "'", double2 == 0.9999010695219456d);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7456061400682787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1274905242232915d) + "'", double1 == (-0.1274905242232915d));
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.617445E-24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.730724416786881E-22d + "'", double1 == 4.730724416786881E-22d);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5673056820522289d, 1.0000000000000002E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        long long2 = org.apache.commons.math3.util.FastMath.min(4L, (-77L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-77L) + "'", long2 == (-77L));
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        long long1 = org.apache.commons.math3.util.FastMath.abs(121L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 121L + "'", long1 == 121L);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.8634010859072955E41d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8634010859072955E41d) + "'", double1 == (-2.8634010859072955E41d));
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 63L, (-0.123573122745224d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.123573122745224d) + "'", double2 == (-0.123573122745224d));
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.2207031249999999E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207031219683509E-4d + "'", double1 == 1.2207031219683509E-4d);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0103000084117455d + "'", double1 == 3.0103000084117455d);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.768372150465078E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768372150465078E-7d + "'", double1 == 4.768372150465078E-7d);
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.396415115233689E49d, 1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16083598627181606d) + "'", double2 == (-0.16083598627181606d));
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0329318964938872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8588046979169688d + "'", double1 == 0.8588046979169688d);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        double double2 = org.apache.commons.math3.util.FastMath.max(127.11046571371325d, 2.1181358553707477E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.11046571371325d + "'", double2 == 127.11046571371325d);
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.733151276556472d), (double) 7.392373E-9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963167118848d) + "'", double2 == (-1.5707963167118848d));
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.629394531472045E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.570867749190289d, (-13.999999999999998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570867749190289d + "'", double2 == 1.570867749190289d);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.2949673E9f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.759527733946123E225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 519.9925989494324d + "'", double1 == 519.9925989494324d);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 67L, 7.690910072194429d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 66.99999f + "'", float2 == 66.99999f);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.007570629285707457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0075704846535947735d) + "'", double1 == (-0.0075704846535947735d));
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-1.04453605E13f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10445360463872L) + "'", long1 == (-10445360463872L));
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5.1047944774642255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999263715154889d) + "'", double1 == (-0.9999263715154889d));
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.027041164336506638d, 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1817704800379587E-33d + "'", double2 == 1.1817704800379587E-33d);
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-29L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.5403019046233176d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7670734698904623d, 6.820816877190263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7670734698904623d + "'", double2 == 0.7670734698904623d);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.5310603550457816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5088191087165586d) + "'", double1 == (-0.5088191087165586d));
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8344632077604134d, (-0.027181889027663657d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8344632077604134d + "'", double2 == 0.8344632077604134d);
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-48.999996f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.0d) + "'", double1 == (-49.0d));
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-35.0f), 2.164663517184E12d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.999996f) + "'", float2 == (-34.999996f));
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.3687098E8f, 4.437470063761967d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3687091E8f + "'", float2 == 5.3687091E8f);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-2016));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.9527368038560544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2906437116258981d + "'", double1 == 0.2906437116258981d);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1.64926744E12f, (double) 149L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.649267441664E12d + "'", double2 == 1.649267441664E12d);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.60287949E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-35), 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.999996f) + "'", float2 == (-34.999996f));
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.629365427493558E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6293654273455295E-6d + "'", double1 == 7.6293654273455295E-6d);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.14973832340422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.70081736714295d + "'", double1 == 31.70081736714295d);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7227342478134157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7227342478134157d + "'", double1 == 0.7227342478134157d);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.1E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2380693740851022E-15d + "'", double1 == 2.2380693740851022E-15d);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4644174424073615d + "'", double1 == 4.4644174424073615d);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.2089258E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.545192702919391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999694838187878d + "'", double1 == 0.9999694838187878d);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.12949601773888192d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.840873528995979E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.840873528995979E49d + "'", double1 == 5.840873528995979E49d);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.6929696407506087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.191835700020732d + "'", double1 == 1.191835700020732d);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.796382254433037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9309514699964d + "'", double1 == 2.9309514699964d);
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.570867749190289d, (double) (-7.3786976E19f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-4.8828125E-4f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.16500355124533647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16352220997244465d + "'", double1 == 0.16352220997244465d);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3072.0000000000005d, 5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.570796311160112d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10.999999f, (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0053710933f + "'", float2 == 0.0053710933f);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.123573122745224d), 0.6546526650756924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6546526650756924d + "'", double2 == 0.6546526650756924d);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8742149727184364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(749.9998168945312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.28150449993860255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6553829122395007d + "'", double1 == 0.6553829122395007d);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(661.0d, 1.5258789062500003E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 660.9999999999999d + "'", double2 == 660.9999999999999d);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.9309514699964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 6000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6000 + "'", int1 == 6000);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        int int2 = org.apache.commons.math3.util.FastMath.min((-149), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.463717431233864E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.463717431233864E15d + "'", double1 == 7.463717431233864E15d);
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929665620922E-7d, 1.570792512097631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920929665620922E-7d + "'", double2 == 1.1920929665620922E-7d);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.466528223471357d, 4.111474989126999E36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.33181993058053d + "'", double2 == 56.33181993058053d);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 112.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-44));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-127.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(113.05919416648635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.308907490697951E48d + "'", double1 == 6.308907490697951E48d);
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 1.0499999832316724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0499999832316724d + "'", double2 == 1.0499999832316724d);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0E-200d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.922386521532856E25d + "'", double2 == 5.922386521532856E25d);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.000000000000022E200d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-13L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 2048.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 11, 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.2756035467681588E-4d, 87);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5213259301051565E22d + "'", double2 == 3.5213259301051565E22d);
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        long long2 = org.apache.commons.math3.util.FastMath.min(32L, (-42L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-42L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.015628966602108815d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015628966602108815d + "'", double2 == 0.015628966602108815d);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6931471805599453d, 70.01428280002321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599453d + "'", double2 == 0.6931471805599453d);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-27.725887222397812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5347445780600277d) + "'", double1 == (-1.5347445780600277d));
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        int int2 = org.apache.commons.math3.util.FastMath.max(97, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 86.0f, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7396.0d + "'", double2 == 7396.0d);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.24553239290601714d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8929616830058433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.004814790113768d + "'", double1 == 9.004814790113768d);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8813735907448332d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01377146235538802d + "'", double2 == 0.01377146235538802d);
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-8.881785E-16f), 9.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.16745572513813106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029226537549750234d + "'", double1 == 0.0029226537549750234d);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.941742215644044E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.941742215644044E83d + "'", double1 == 7.941742215644044E83d);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.37941688514109007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 96.99999f, (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0029602048452943563d + "'", double2 == 0.0029602048452943563d);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.588250504492026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2009190019566577d + "'", double1 == 0.2009190019566577d);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2930884003786862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.64402339812979d + "'", double1 == 3.64402339812979d);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4438.5341089142175d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8877.068217828435d + "'", double2 == 8877.068217828435d);
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 3072);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4596625685308554d) + "'", double1 == (-0.4596625685308554d));
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.342454046453526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8511991176289578d + "'", double1 == 0.8511991176289578d);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        double double2 = org.apache.commons.math3.util.FastMath.min((-126.99999999999997d), 1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-126.99999999999997d) + "'", double2 == (-126.99999999999997d));
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.5035996E15f, 22025.999999999996d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.50359936E15f + "'", float2 == 4.50359936E15f);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        long long1 = org.apache.commons.math3.util.FastMath.abs(15L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1023.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5729.578825572446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        int int2 = org.apache.commons.math3.util.FastMath.max(87, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.810432931264618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3658340175885983d + "'", double1 == 1.3658340175885983d);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.33158070377639E-7d, (double) (-724));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-724.0d) + "'", double2 == (-724.0d));
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.7755573961267688E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755573961267688E-17d + "'", double1 == 2.7755573961267688E-17d);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 10, 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6294995E15f + "'", float2 == 5.6294995E15f);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6620193590804253d, 0.18486245806963336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0928604837473515d + "'", double2 == 4.0928604837473515d);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        double double1 = org.apache.commons.math3.util.FastMath.asin(285.99999999999994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.118326675323529E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0678494519699369E-13d + "'", double1 == 1.0678494519699369E-13d);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.0877197964243557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.087719796424356d + "'", double1 == 2.087719796424356d);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-7.378697629483821E19d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.378697629483821E19d + "'", double1 == 7.378697629483821E19d);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0176411299313266d + "'", double1 == 1.0176411299313266d);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.556943144653333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5861856399961191d + "'", double1 == 0.5861856399961191d);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6000.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.448719238886159E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000003569043052d + "'", double1 == 1.0000003569043052d);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.12579431488456852d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        int int2 = org.apache.commons.math3.util.FastMath.max((-63), (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        long long2 = org.apache.commons.math3.util.FastMath.min(230L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0304351312815117d, 0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0304351312815117d + "'", double2 == 1.0304351312815117d);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 63, 3.051758418829923E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 63.0d + "'", double2 == 63.0d);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.0794415416798357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.442026886600883d + "'", double1 == 1.442026886600883d);
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 31);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.0405800537533875E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.64337209543182d + "'", double1 == 24.64337209543182d);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.932447891572509d, (double) 1.2980741E33f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.93244789157251d + "'", double2 == 6.93244789157251d);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.971286084435162d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7492689023673352d) + "'", double1 == (-0.7492689023673352d));
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.6215477523208264d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010848054736368648d) + "'", double1 == (-0.010848054736368648d));
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.009967783941837574d), (-0.9994192391908521d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999468945181156d + "'", double2 == 0.999468945181156d);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.556536E-17f, 2.273737E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.273737E-13f + "'", float2 == 2.273737E-13f);
    }
}

