package org.apache.commons.math3.util;

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.974937185533099d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.313219942645561d, 1.2260986406399412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31321994264556d + "'", double2 == 7.31321994264556d);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.0f, (double) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.02283260560253408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02283260560253408d + "'", double1 == 0.02283260560253408d);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531175985E-6d + "'", double1 == 7.629394531175985E-6d);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.37438953472E11d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        double double1 = org.apache.commons.math3.util.FastMath.signum(112.81581913850151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.150779711560351d + "'", double1 == 4.150779711560351d);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8255079892949791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 0L, 2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729284E-13d + "'", double1 == 9.094947017729284E-13d);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.9732551840809704d, 1.1190346870425511E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9732551840809704d + "'", double2 == 1.9732551840809704d);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.974937185533099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.9749371855331d + "'", double1 == 9.9749371855331d);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5209980537883248d + "'", double1 == 1.5209980537883248d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.7371252E25f, (double) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.737125E25f + "'", float2 == 7.737125E25f);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.061328855954495554d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.061290475572342844d) + "'", double1 == (-0.061290475572342844d));
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 34.999996f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.610125138662287d + "'", double1 == 7.610125138662287d);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8640954259078426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8640954259078427d + "'", double1 == 0.8640954259078427d);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-1), (-0.630805074209827d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.610125138662287d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        int int1 = org.apache.commons.math3.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453291479645996d) + "'", double1 == (-0.017453291479645996d));
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 7.737125E25f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8685623921825124E25d + "'", double2 == 3.8685623921825124E25d);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9999999999998679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951307475d + "'", double1 == 57.29577951307475d);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        float float1 = org.apache.commons.math3.util.FastMath.signum(374.99997f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675304813E-12d + "'", double1 == 6.118326675304813E-12d);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02909330424175981d + "'", double1 == 0.02909330424175981d);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 5, 2.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9580333260613902d + "'", double1 == 1.9580333260613902d);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1024, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        double double1 = org.apache.commons.math3.util.FastMath.cos(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.971286084435162d) + "'", double1 == (-0.971286084435162d));
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1296.7941421366083d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0914126326390014E99d + "'", double2 == 4.0914126326390014E99d);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.31321994264556d, (-0.013462623778017066d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9735692101318191d + "'", double2 == 0.9735692101318191d);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.094947017729284E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729286E-13d + "'", double1 == 9.094947017729286E-13d);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        float float1 = org.apache.commons.math3.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 'a', 12.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        int int1 = org.apache.commons.math3.util.FastMath.round(1500.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 48000.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.4411627128891868d, 44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411627128891868d + "'", double2 == 1.4411627128891868d);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.98714636101983d + "'", double1 == 9.98714636101983d);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        int int2 = org.apache.commons.math3.util.FastMath.min(9, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8446874961776067d + "'", double1 == 0.8446874961776067d);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.037091348628667E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.037091348627933E-7d + "'", double1 == 6.037091348627933E-7d);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9659011330697134d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 265.94345040106276d + "'", double1 == 265.94345040106276d);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.4359738368E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257748d + "'", double1 == 11.548739357257748d);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023560237179d + "'", double1 == 0.5403023560237179d);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104773809653514d + "'", double1 == 3.8104773809653514d);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-6.1035153E-5f), 1500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.103515261202119E-5d) + "'", double2 == (-6.103515261202119E-5d));
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.7615941309233423d), (-9.704060527839234d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7615941309233424d) + "'", double2 == (-0.7615941309233424d));
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0000000000000002E100d, 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002E100d + "'", double2 == 1.0000000000000002E100d);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9.999999f, 42971.83113775489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478785d + "'", double1 == 74.20994852478785d);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.729577951308233E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.56939756606048E10d + "'", double1 == 7.56939756606048E10d);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.44871722863096E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.02283260560253408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02283062218882923d + "'", double1 == 0.02283062218882923d);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.44871722863096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448719238886445E-4d + "'", double1 == 8.448719238886445E-4d);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1023L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.0f + "'", float1 == 1023.0f);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.0d, 0.7241400178893854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.999999999999999d + "'", double2 == 5.999999999999999d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.7853981633974483d), 44.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.0070091039492d + "'", double2 == 44.0070091039492d);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2207031E-4f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6420149920119997d, (-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20824159849321072d + "'", double2 == 0.20824159849321072d);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.7615941309233423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        double double1 = org.apache.commons.math3.util.FastMath.log10(20.049877523736615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3021117240420959d + "'", double1 == 1.3021117240420959d);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8414439706668982d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48000.0f, 0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47999.996f + "'", float2 == 47999.996f);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.7615941309233423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6508801521799592d) + "'", double1 == (-0.6508801521799592d));
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.0075707739244519d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.4422495703074083d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8844991406148166d + "'", double2 == 2.8844991406148166d);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.759350929417189d, 0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6885686776071497d + "'", double2 == 0.6885686776071497d);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1024, 0.8255079892949791d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100L, (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2401310215141802E-16d, (double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.240130903246081E-17d + "'", double2 == 1.240130903246081E-17d);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.349101754933678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09545486558053895d + "'", double1 == 0.09545486558053895d);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.7781512503836434d, 0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.778151250383643d + "'", double2 == 3.778151250383643d);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1024.0004882811143d, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.000488281114d + "'", double2 == 1024.000488281114d);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.220703125E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207031189367021E-4d + "'", double1 == 1.2207031189367021E-4d);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085532134423065d + "'", double1 == 20.085532134423065d);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.061290475572342844d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.930494765951626d + "'", double1 == 6.930494765951626d);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 0, 1.4411627128891868d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.759350929417189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368887786267312d + "'", double1 == 1.1368887786267312d);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.4768639379495386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7405240741728077d) + "'", double1 == (-0.7405240741728077d));
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8623150089993341d, 2.9103830456733704E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.856115509710435E-13d + "'", double2 == 4.856115509710435E-13d);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.477888730288475d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 231.46791666571625d + "'", double2 == 231.46791666571625d);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 9, (-1023L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.012614126025312d) + "'", double1 == (-29.012614126025312d));
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(155.74607629780772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.361757477043805E67d + "'", double1 == 4.361757477043805E67d);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.31622776601683805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005519215703220059d) + "'", double1 == (-0.005519215703220059d));
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.892546881191539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.43494882292201d + "'", double1 == 108.43494882292201d);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1024.0001f, 0.01728018604825701d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0001220703125d + "'", double2 == 1024.0001220703125d);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        double double2 = org.apache.commons.math3.util.FastMath.max(19.949874371066198d, 0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.949874371066198d + "'", double2 == 19.949874371066198d);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9073862646776047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5125258378901132d + "'", double1 == 1.5125258378901132d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.005519215703220059d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.632848614896423E-5d) + "'", double1 == (-9.632848614896423E-5d));
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 2147483647, 750.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.5845631E30f, 1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007334883977608064d + "'", double2 == 0.007334883977608064d);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-9.632848614896423E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.632848599998937E-5d) + "'", double1 == (-9.632848599998937E-5d));
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-127), (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.755020761982979E-5d + "'", double1 == 3.755020761982979E-5d);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9977630759545902d + "'", double1 == 0.9977630759545902d);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.9749371855331d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.9749371855331d + "'", double2 == 9.9749371855331d);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.018864831372454823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.11321160719436832d), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1024), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-3.137566414384587E306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.463965950463316E102d) + "'", double1 == (-1.463965950463316E102d));
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.40979009083827d + "'", double1 == 148.40979009083827d);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.991989996645917E-56d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 9, (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.795192390859045E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.795192390859045E46d + "'", double1 == 5.795192390859045E46d);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718315292959719d + "'", double1 == 1.718315292959719d);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7165256995489035d + "'", double1 == 1.7165256995489035d);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1024.0f, 10.079368399158986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0496050813779d + "'", double2 == 1024.0496050813779d);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(57.32153907959692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.571098934738399d + "'", double1 == 7.571098934738399d);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.2260986406399412d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.000000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.285091215917852d + "'", double1 == 12.285091215917852d);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-1023L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1023L + "'", long1 == 1023L);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.761141328797799d, 0.8352990546308762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25065299898745796d) + "'", double2 == (-0.25065299898745796d));
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.499188385108773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.184458789852743d + "'", double1 == 2.184458789852743d);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.881784197001252E-16d, 20.085532134423065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001252E-16d + "'", double2 == 8.881784197001252E-16d);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.569820717348332d, 1.220703125E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5698207173483318d + "'", double2 == 1.5698207173483318d);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 97L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.7615941309233423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9132181397411985d) + "'", double1 == (-0.9132181397411985d));
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.385850023714672d, 0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0202140366142471d + "'", double2 == 1.0202140366142471d);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double1 = org.apache.commons.math3.util.FastMath.acos(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        long long2 = org.apache.commons.math3.util.FastMath.max(1025L, (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(Double.POSITIVE_INFINITY, (double) 6.0000005f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.9539726886959428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 111.95438834610738d + "'", double1 == 111.95438834610738d);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        double double1 = org.apache.commons.math3.util.FastMath.cos(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(32.01562118716424d, 57.32153907959692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-25.305917892432674d) + "'", double2 == (-25.305917892432674d));
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.11026740251372914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11004516131854963d) + "'", double1 == (-0.11004516131854963d));
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428090415820634d + "'", double1 == 0.9428090415820634d);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        float float1 = org.apache.commons.math3.util.FastMath.signum(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.0d), 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.8E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7405240741728077d), 44.0070091039492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7405240741728077d) + "'", double2 == (-0.7405240741728077d));
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.671830818864701E103d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        float float2 = org.apache.commons.math3.util.FastMath.min(750.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.895475622246554d + "'", double1 == 0.895475622246554d);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9127058362020531d) + "'", double1 == (-0.9127058362020531d));
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0000000000000002E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.615120516841261d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841261d + "'", double2 == 4.615120516841261d);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1023L, 1023.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10.000001f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-127));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.17889304790669835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.19589283408591d + "'", double1 == 1.19589283408591d);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 10.000001f, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000953674316d + "'", double2 == 10.000000953674316d);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.080594601624405E-9d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207033E-4f + "'", float1 == 1.2207033E-4f);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5360843953061922d) + "'", double1 == (-1.5360843953061922d));
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.0141204E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.38989177586092d + "'", double1 == 74.38989177586092d);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.11004516131854963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10960414795451248d) + "'", double1 == (-0.10960414795451248d));
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19068996526228799d + "'", double1 == 0.19068996526228799d);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        double double1 = org.apache.commons.math3.util.FastMath.signum(160.80803418105256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920928955078125E-7d, 1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078128E-7d + "'", double2 == 1.1920928955078128E-7d);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-9.632848614896423E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6812492467611788E-6d) + "'", double1 == (-1.6812492467611788E-6d));
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078157E-7d + "'", double1 == 1.1920928955078157E-7d);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5771174481917147d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0003709130606282d, (-5.9029581035870565E20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.9029581035870565E20d) + "'", double2 == (-5.9029581035870565E20d));
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1190346870425511E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9721522630525295E-31d + "'", double1 == 1.9721522630525295E-31d);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.1759754114836391d, 0.672330695785645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22850376359397642d + "'", double2 == 0.22850376359397642d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 6.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2794150403540232d) + "'", double1 == (-0.2794150403540232d));
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(57.29577951307475d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 9, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000953674316d + "'", double1 == 10.000000953674316d);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.184458789852743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33934385609142426d + "'", double1 == 0.33934385609142426d);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5282839739597525d) + "'", double1 == (-0.5282839739597525d));
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        int int2 = org.apache.commons.math3.util.FastMath.min(1025, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0842022E-19f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 100L, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7502685605935906d + "'", double1 == 0.7502685605935906d);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-14));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.913940518571937E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515625E-5d + "'", double1 == 6.103515625E-5d);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999585824487d + "'", double1 == 0.9999999585824487d);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5545968900472659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8215975647065147d) + "'", double1 == (-0.8215975647065147d));
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(11.548739357257746d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 100, 1024.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5209980537883248d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5209980537883248d + "'", double2 == 1.5209980537883248d);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        long long2 = org.apache.commons.math3.util.FastMath.min(10L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.5360843953061922d), 6.930494765951626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.930494765951626d + "'", double2 == 6.930494765951626d);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(74.38989177586092d, 1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.3898917758609d + "'", double2 == 74.3898917758609d);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.671830818864701E103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 237.68018390304016d + "'", double1 == 237.68018390304016d);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.1622776601683795d, 1.4403865801148885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2815044999386025d + "'", double2 == 0.2815044999386025d);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000002f, (float) (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000002f + "'", float2 == 1.0000002f);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1024.0001220703125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(100.2188872880747d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 8L, (double) 1500L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.000001f + "'", float2 == 8.000001f);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-127.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        long long2 = org.apache.commons.math3.util.FastMath.min(10L, 1023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.30039148809513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6261826799366557d + "'", double1 == 1.6261826799366557d);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6672440571753369d) + "'", double1 == (-0.6672440571753369d));
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        double double1 = org.apache.commons.math3.util.FastMath.tan(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.648361369288039d + "'", double1 == 0.648361369288039d);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1025, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.5f + "'", float2 == 512.5f);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.999999f, 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828122E-4f + "'", float2 == 4.8828122E-4f);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.7755575615628914E-17d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729282E-13d + "'", double2 == 9.094947017729282E-13d);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.011048543456039806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011048993055354018d + "'", double1 == 0.011048993055354018d);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, (long) 1024);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.9999999f, 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.000001f + "'", float2 == 8.000001f);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.4768639379495386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6110142312416813d + "'", double1 == 1.6110142312416813d);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 6.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.817120640969395d + "'", double1 == 1.817120640969395d);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 9.999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164059608E-7d + "'", double1 == 9.536743164059608E-7d);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0201468328002705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6286665988545064d + "'", double1 == 1.6286665988545064d);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9.999999f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.99999046326093E9d + "'", double2 == 9.99999046326093E9d);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1023, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.009967783941837574d), (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5065230921350898E254d) + "'", double2 == (-1.5065230921350898E254d));
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.0914126326390014E99d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.396415115233689E49d + "'", double1 == 6.396415115233689E49d);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.130528872063391E-6d, 0.16499547112384425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16499547112384425d + "'", double2 == 0.16499547112384425d);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-25.305917892432674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.30591789243267d) + "'", double1 == (-25.30591789243267d));
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000061553940698d + "'", double1 == 1.0000061553940698d);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 10, 0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.5845633E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5111573E23f + "'", float1 == 1.5111573E23f);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        int int1 = org.apache.commons.math3.util.FastMath.round(6000.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6000 + "'", int1 == 6000);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 374.99997f, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.240130903246081E-17d, 0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2401309032460812E-17d + "'", double2 == 1.2401309032460812E-17d);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.629394531175985E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629365427493558E-6d + "'", double1 == 7.629365427493558E-6d);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.151292546497023d, 0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11294857116009238d) + "'", double2 == (-0.11294857116009238d));
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 6, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3683211063593682d + "'", double1 == 0.3683211063593682d);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.768372E-7f, 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.768372E-7f + "'", float2 == 4.768372E-7f);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9738115534140308d, 1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5938892634491227d + "'", double2 == 0.5938892634491227d);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.615120592379816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-6.1035153E-5f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999938966709995d + "'", double1 == 0.999938966709995d);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.48168124860751377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.918828546453101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15566292355646663d + "'", double1 == 0.15566292355646663d);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.8828125E-4f, (double) 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.882813E-4f + "'", float2 == 4.882813E-4f);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.037494614331192756d + "'", double1 == 0.037494614331192756d);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.6672440571753369d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9073862646776047d, (-0.9127058362020531d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9073862646776047d + "'", double2 == 0.9073862646776047d);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.009967783941837574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.20824159849321072d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20824159849321072d + "'", double2 == 0.20824159849321072d);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6000.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.9580333260613902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4520097748883845d) + "'", double1 == (-2.4520097748883845d));
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10.0f, 44.0070091039492d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.762747174039086d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.762747174039086d + "'", double2 == 1.762747174039086d);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.009967783941837574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7397064891248464E-4d) + "'", double1 == (-1.7397064891248464E-4d));
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 750L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 749.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5694629941431792d + "'", double1 == 1.5694629941431792d);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8416713321019201d + "'", double1 == 0.8416713321019201d);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        double double1 = org.apache.commons.math3.util.FastMath.atan(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4801364395941514d + "'", double1 == 1.4801364395941514d);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7615941309233423d), 0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7615941309233423d) + "'", double2 == (-0.7615941309233423d));
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705654518541791d + "'", double1 == 0.5705654518541791d);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.9580333260613902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03417412840354696d + "'", double1 == 0.03417412840354696d);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        double double1 = org.apache.commons.math3.util.FastMath.exp(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.154056433601276E39d + "'", double1 == 1.154056433601276E39d);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.4520097748883845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.848890218459358d + "'", double1 == 5.848890218459358d);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.759350929417189d, 1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4422495703074083d + "'", double2 == 1.4422495703074083d);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9, (-0.11294857116009238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7802246589084126d + "'", double2 == 0.7802246589084126d);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(512.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0f, 1.5111573E23f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5111573E23f + "'", float2 == 1.5111573E23f);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932229419742513d + "'", double1 == 2.9932229419742513d);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 35, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7502685605935906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5597692393574885d + "'", double1 == 0.5597692393574885d);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.29807406E33f, 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29807406E33f + "'", float2 == 1.29807406E33f);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        double double2 = org.apache.commons.math3.util.FastMath.max(57.29577951308232d, 1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.782135461917777E-9d, 2.130647803622625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.130647803622625d + "'", double2 == 2.130647803622625d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.9999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.76076974417489d) + "'", double1 == (-17.76076974417489d));
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2645189576252271d + "'", double1 == 1.2645189576252271d);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        double double1 = org.apache.commons.math3.util.FastMath.asin(47.65470400249466d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9999999585824487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709624298973d + "'", double1 == 0.8414709624298973d);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1024, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-0.99999994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9604645E-8f + "'", float1 == 5.9604645E-8f);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1023.0d + "'", double1 == 1023.0d);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        double double1 = org.apache.commons.math3.util.FastMath.sin(230.25850929941265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.796960035003417d) + "'", double1 == (-0.796960035003417d));
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09453594272628993d + "'", double1 == 0.09453594272628993d);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        double double1 = org.apache.commons.math3.util.FastMath.rint(108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108222.0d + "'", double1 == 108222.0d);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0d, 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-5.9029581035870565E20d), 57.29577951307475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.196498107675438d) + "'", double2 == (-6.196498107675438d));
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.718315292959719d, 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.588325623556069E8d + "'", double2 == 8.588325623556069E8d);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1025.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0d + "'", double2 == 1025.0d);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-17.76076974417489d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999806537986d) + "'", double1 == (-0.9999999806537986d));
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1023.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62364218539641d + "'", double1 == 7.62364218539641d);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.743392130574644E-23d + "'", double1 == 3.743392130574644E-23d);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1023L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9866275920404852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005846743218732369d) + "'", double1 == (-0.005846743218732369d));
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735692101318192d + "'", double1 == 0.9735692101318192d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.585786437626905d), (-0.0075707739244519d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.585786437626905d) + "'", double2 == (-0.585786437626905d));
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9232666633273902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03467284536035253d) + "'", double1 == (-0.03467284536035253d));
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5988104444497883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8199525775350112d + "'", double1 == 1.8199525775350112d);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 9, 1.29807406E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2676506E30f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6313226197565623E-11d + "'", double1 == 3.6313226197565623E-11d);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6215477523208264d) + "'", double1 == (-0.6215477523208264d));
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double2 = org.apache.commons.math3.util.FastMath.log(34.99999999999999d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9999999958776927d, 0.8446874961776067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double1 = org.apache.commons.math3.util.FastMath.abs(112.81581913850151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 112.81581913850151d + "'", double1 == 112.81581913850151d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.29807406E33f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29807406E33f + "'", float2 == 1.29807406E33f);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        double double2 = org.apache.commons.math3.util.FastMath.log(26.562736412595044d, 1.9539726886959428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2042575597576729d + "'", double2 == 0.2042575597576729d);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0554544523933395E-6d + "'", double1 == 6.0554544523933395E-6d);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 2.130528872063391E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.8402864822065015d, 1.4322216757321002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8402864822065013d + "'", double2 == 1.8402864822065013d);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.004962015874444895d, (-0.9719903465379038d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9719903465379038d) + "'", double2 == (-0.9719903465379038d));
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        double double1 = org.apache.commons.math3.util.FastMath.abs(97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0463806640928d + "'", double1 == 97.0463806640928d);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.11294857116009238d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11294857116009238d + "'", double2 == 0.11294857116009238d);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.725887222397812d) + "'", double1 == (-27.725887222397812d));
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        double double1 = org.apache.commons.math3.util.FastMath.exp(36.01102806275611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.359039207590521E15d + "'", double1 == 4.359039207590521E15d);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1622776601683795d + "'", double1 == 2.1622776601683795d);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.2207031189367021E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9133899457889196d) + "'", double1 == (-3.9133899457889196d));
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.443593622809233E69d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 230 + "'", int1 == 230);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.827881037133875E11d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-63) + "'", int1 == (-63));
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1500L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 35.0f, 22026.474197238054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 5.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.7746497577372d + "'", double1 == 343.7746497577372d);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8640954259078426d, 20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.085536923187668d + "'", double2 == 20.085536923187668d);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450729502920265d + "'", double1 == 0.7450729502920265d);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1977594109665195d + "'", double1 == 2.1977594109665195d);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        int int1 = org.apache.commons.math3.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5698207173483318d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.974937185533099d, 0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24034274195624494d + "'", double2 == 0.24034274195624494d);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.2207033E-4f, (-1024.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2207033E-4f) + "'", float2 == (-1.2207033E-4f));
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1024.0d, (-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04402615488638885d + "'", double2 == 0.04402615488638885d);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.817120640969395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2202849466483139d + "'", double1 == 1.2202849466483139d);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.011048993055354018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010988398859591287d + "'", double1 == 0.010988398859591287d);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5347252927908293d) + "'", double1 == (-1.5347252927908293d));
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.31358451852720004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19077079376318204d + "'", double1 == 0.19077079376318204d);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.80038650342911d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.80038650342911d + "'", double2 == 0.80038650342911d);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.0842022E-19f, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.729577951308233E21d, 1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(148.40979009083827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.294449988132773d + "'", double1 == 5.294449988132773d);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E100d + "'", double1 == 1.0E100d);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.268356063861754E-9d + "'", double1 == 5.268356063861754E-9d);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        long long2 = org.apache.commons.math3.util.FastMath.min(750L, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025L, (float) 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.615120516841261d, 0.990081729765975d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.006517711624664084d) + "'", double2 == (-0.006517711624664084d));
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.24034274195624494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.271684935418713d + "'", double1 == 1.271684935418713d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 14L, (float) 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.112095380568981d + "'", double1 == 2.112095380568981d);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.5545968900472659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.776061130789305d) + "'", double1 == (-31.776061130789305d));
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48000.0d + "'", double1 == 48000.0d);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.11321160719436832d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.736374376643928d + "'", double1 == 7.736374376643928d);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(100.00000763058662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342441912637d + "'", double1 == 5.298342441912637d);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0426665814898082d) + "'", double1 == (-1.0426665814898082d));
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.4520097748883845d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.35232069507293856d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8383231924340317d + "'", double2 == 2.8383231924340317d);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010518784647500397d + "'", double1 == 0.010518784647500397d);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.6414445250304635d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.103515625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000003d + "'", double1 == 97.00000000000003d);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(10.082648376090521d, 2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1029798377113775d + "'", double2 == 1.1029798377113775d);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.17364804653184446d), 1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5670585390721963d + "'", double2 == 1.5670585390721963d);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.991989996645917E-56d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5574077246549023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 750, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8344632077604134d + "'", double1 == 0.8344632077604134d);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.4768639379495386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3899208787571631d + "'", double1 == 0.3899208787571631d);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 749.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.9999389648439d + "'", double1 == 749.9999389648439d);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2, (-14.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9738115534140308d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07621974786783883d + "'", double2 == 0.07621974786783883d);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1024), 6.620073206530356d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.99994f) + "'", float2 == (-1023.99994f));
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1368887786267312d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8795935176771806d + "'", double2 == 0.8795935176771806d);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.29577951307475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998679d + "'", double1 == 0.9999999999998679d);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.768372E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.768373E-7f + "'", float1 == 4.768373E-7f);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.02283260560253408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022832605602534084d + "'", double1 == 0.022832605602534084d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7456061400682787d, 6.103515625000001E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7456061400682787d + "'", double2 == 0.7456061400682787d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.1628723067131066d, (-57.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0861605114833828d + "'", double2 == 3.0861605114833828d);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7461777875704901d + "'", double1 == 0.7461777875704901d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        float float2 = org.apache.commons.math3.util.FastMath.min(97.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7476805260785286d, 0.9111477955680065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6871714861810375d + "'", double2 == 0.6871714861810375d);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        float float2 = org.apache.commons.math3.util.FastMath.max(1023.0f, 6000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0f + "'", float2 == 6000.0f);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.359039207590521E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.359039207590521E15d + "'", double1 == 4.359039207590521E15d);
    }
}

