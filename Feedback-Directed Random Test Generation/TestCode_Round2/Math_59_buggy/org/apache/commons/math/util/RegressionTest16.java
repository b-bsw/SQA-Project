package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        int int2 = org.apache.commons.math.util.FastMath.max(7, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2969610063487869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8315869476589886d + "'", double1 == 0.8315869476589886d);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.0482269165174563d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        double double1 = org.apache.commons.math.util.FastMath.log(0.829869827932433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1864864243075482d) + "'", double1 == (-0.1864864243075482d));
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1102230246251568E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-90), (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.07906310090586803d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7456241416655577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.015515027990856209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015516273076331551d) + "'", double1 == (-0.015516273076331551d));
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.015516273076331551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015517518461615235d) + "'", double1 == (-0.015517518461615235d));
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8482836399575128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8482836399575129d + "'", double1 == 0.8482836399575129d);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4855755420534185d + "'", double1 == 0.4855755420534185d);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.4814657071109039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.184438072585855d) + "'", double1 == (-1.184438072585855d));
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6384637465390172d) + "'", double1 == (-0.6384637465390172d));
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.737447891018455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6724010655275585d + "'", double1 == 0.6724010655275585d);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5729347079345366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6518807419254518d + "'", double1 == 0.6518807419254518d);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19483917037841592d + "'", double1 == 0.19483917037841592d);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2039980656902276d + "'", double1 == 1.2039980656902276d);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.827444419368825E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.827444419368825E-10d + "'", double1 == 4.827444419368825E-10d);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7319013265055243d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        int int2 = org.apache.commons.math.util.FastMath.max(37, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.37242622246109275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.610267336878759d + "'", double1 == 0.610267336878759d);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        double double2 = org.apache.commons.math.util.FastMath.max(2.3275811425819994d, 0.013419653011645882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3275811425819994d + "'", double2 == 2.3275811425819994d);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0625345798933474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7950781550795927d + "'", double1 == 1.7950781550795927d);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5424056614562467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.005202425297431776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005215981409945167d + "'", double1 == 0.005215981409945167d);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-30.24580420121606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-30.0d) + "'", double1 == (-30.0d));
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8089563172728977d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8089563172728977d + "'", double2 == 0.8089563172728977d);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2558486026857986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573781157846E-5d + "'", double1 == 9.079573781157846E-5d);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6418625964264848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6043888810791588d + "'", double1 == 0.6043888810791588d);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0924287889629486d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09216692107539105d) + "'", double1 == (-0.09216692107539105d));
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5746813724695927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1697242825201424d + "'", double1 == 1.1697242825201424d);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213268484290538d) + "'", double1 == (-0.009213268484290538d));
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.334999362733612d), 2.5804973451249884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.3349993627336114d) + "'", double2 == (-3.3349993627336114d));
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-33.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2075343299958265d) + "'", double1 == (-3.2075343299958265d));
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        double double1 = org.apache.commons.math.util.FastMath.tan(70.77202832050486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.57304203147357d) + "'", double1 == (-11.57304203147357d));
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        double double1 = org.apache.commons.math.util.FastMath.rint((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) 90);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.518960038756951d, 0.9924347232553565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9920594666772955d + "'", double2 == 0.9920594666772955d);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.9733523361592433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6735761908999143d) + "'", double1 == (-0.6735761908999143d));
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7347234759768075E-18d + "'", double1 == 1.7347234759768075E-18d);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.46143952039710356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4614395203971036d + "'", double1 == 0.4614395203971036d);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6098494453571884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098494453571885d + "'", double1 == 0.6098494453571885d);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707252015575928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441880386963487d + "'", double1 == 0.9441880386963487d);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5936569354152138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.36301029014320507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9878652710342222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005302282169720471d) + "'", double1 == (-0.005302282169720471d));
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5378068149834339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0817889371810876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9499521125352932d + "'", double1 == 1.9499521125352932d);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646286d + "'", double1 == 1.5395564933646286d);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        double double1 = org.apache.commons.math.util.FastMath.log(3.962203839343922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3768003955505836d + "'", double1 == 1.3768003955505836d);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999996d + "'", double1 == 99.99999999999996d);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5574077246549018d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 11014L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.000000000002d + "'", double1 == 11014.000000000002d);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2534690753051354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.017451520489571555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.045864920222764E-4d) + "'", double1 == (-3.045864920222764E-4d));
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.397041808397797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-5.124738597288385E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.123425674293008E-4d) + "'", double1 == (-5.123425674293008E-4d));
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9913289158005998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.161865024476282d + "'", double1 == 1.161865024476282d);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4894820176053496d, 1.7084653196386397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4894820176053498d + "'", double2 == 1.4894820176053498d);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3022547416014814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.017454414856913306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745264264663458d + "'", double1 == 0.01745264264663458d);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.674083105727976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.284009842580364d + "'", double1 == 7.284009842580364d);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.527472836267328d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6109592601276898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.842197698275133d + "'", double1 == 0.842197698275133d);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0141932065037886d, 802.1409131831525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7351515234962698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        long long1 = org.apache.commons.math.util.FastMath.round(0.707105673541031d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 11014L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9115149784120505d + "'", double1 == 0.9115149784120505d);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7347234759768075E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8518598887744717E-34d + "'", double1 == 3.8518598887744717E-34d);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5729941962927688d + "'", double1 == 0.5729941962927688d);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-34.657359027997266d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.65735902799726d) + "'", double2 == (-34.65735902799726d));
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.944593378545059d + "'", double1 == 0.944593378545059d);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9107017292651758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7214688914525081d + "'", double1 == 0.7214688914525081d);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999999999549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681776d + "'", double1 == 0.5403023058681776d);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8462950832072025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0089915951359953d + "'", double1 == 1.0089915951359953d);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.29494940570620637d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.043813831672215d + "'", double1 == 1.043813831672215d);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.12796368962740468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12011467247130482d) + "'", double1 == (-0.12011467247130482d));
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.476411659486956d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9022330041131084d), 57.29661580689411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29661580689411d + "'", double2 == 57.29661580689411d);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.03996444158152412d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.16454021803458782d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        double double1 = org.apache.commons.math.util.FastMath.exp(229.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.840771850489593E99d + "'", double1 == 2.840771850489593E99d);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.510293288140764E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948954d + "'", double1 == 1.5707963267948954d);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.1008763214519655d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5261303806882357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.141628925110485d + "'", double1 == 1.141628925110485d);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.517101195721465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.040657838989812276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.017452406437283508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001522971108041d + "'", double1 == 1.0001522971108041d);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02741120805195372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5968032962364678d) + "'", double1 == (-3.5968032962364678d));
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5562675674585421d, (-0.7893184915864662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5276898058884654d + "'", double2 == 2.5276898058884654d);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.002094025184076574d), (-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4209664968123644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3757524667023402d) + "'", double1 == (-0.3757524667023402d));
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (-90));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        long long2 = org.apache.commons.math.util.FastMath.max(2979L, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        double double1 = org.apache.commons.math.util.FastMath.log(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.191623125197538d) + "'", double1 == (-31.191623125197538d));
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.050505149493486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8100237733214718d + "'", double1 == 0.8100237733214718d);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6801783019998602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8294457760771882d + "'", double1 == 0.8294457760771882d);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6421278036624098d + "'", double1 == 1.6421278036624098d);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-36L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.978407872665517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8246075608242496d + "'", double1 == 2.8246075608242496d);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5664325882614676d, 0.035592047388576235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.035592047388576235d + "'", double2 == 0.035592047388576235d);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.2205020972807485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8663182439645776d + "'", double1 == 1.8663182439645776d);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.015419200424859681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3279443230305754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9253501453713208d + "'", double1 == 0.9253501453713208d);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017454178737585296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        double double1 = org.apache.commons.math.util.FastMath.atanh(89.40934278535333d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6540234255635091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1826254444110533d + "'", double1 == 1.1826254444110533d);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5490756164177393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5490756164177393d + "'", double1 == 1.5490756164177393d);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5440211108893683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9955742875642781d + "'", double1 == 0.9955742875642781d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0002186598203338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6932565044940331d + "'", double1 == 0.6932565044940331d);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 802L + "'", long2 == 802L);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001248E-16d + "'", double1 == 8.881784197001248E-16d);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8655103306675355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614261854513965d + "'", double1 == 0.7614261854513965d);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9652889733989565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015342654774711285d) + "'", double1 == (-0.015342654774711285d));
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        double double1 = org.apache.commons.math.util.FastMath.asin((-6.053272382792838d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.31226337743157023d), (-0.3786185863965946d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3786185863965946d) + "'", double2 == (-0.3786185863965946d));
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557651d + "'", double1 == 0.7615941559557651d);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5661709721771937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4486337692446675d + "'", double1 == 0.4486337692446675d);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3080927484239064d + "'", double1 == 1.3080927484239064d);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6574725658556667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5816104187297197d) + "'", double1 == (-0.5816104187297197d));
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8890349204664698d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(46.30686372341393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2653.187853839075d + "'", double1 == 2653.187853839075d);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 108, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2091797289097923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23266652443292787d + "'", double1 == 0.23266652443292787d);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0475388422900291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8506266357067718d + "'", double1 == 2.8506266357067718d);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6176678238363069d, 0.3671733557939904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6176678238363068d + "'", double2 == 0.6176678238363068d);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.759443367433797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8714604795593413d + "'", double1 == 0.8714604795593413d);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0377040455078794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.456062191253004d + "'", double1 == 59.456062191253004d);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707448354574094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038699713831352d + "'", double1 == 1.0038699713831352d);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 108.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.062778942642255d + "'", double1 == 1.062778942642255d);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        double double1 = org.apache.commons.math.util.FastMath.cos(69.94033576878978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6783384885924554d + "'", double1 == 0.6783384885924554d);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9111302618846769d), 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.01327713727966558d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9868106151113394d + "'", double1 == 0.9868106151113394d);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.06516780684692637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06526029511396493d + "'", double1 == 0.06526029511396493d);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9716425476532478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6156614753256584d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.164135227174141d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8962960182679E13d + "'", double1 == 7.8962960182679E13d);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5507 + "'", int2 == 5507);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.620982778800085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8675159836353801d) + "'", double1 == (-0.8675159836353801d));
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4610626787992866d, 0.017452975427475453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4610626787992866d + "'", double2 == 1.4610626787992866d);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.751100853508406E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.8916039409537213d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        double double1 = org.apache.commons.math.util.FastMath.atan(132058.36709719698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570788754385651d + "'", double1 == 1.570788754385651d);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0029628152581531d, 0.9305202046730568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.002962815258153d + "'", double2 == 1.002962815258153d);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.5750132885251107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.575013288525111d + "'", double1 == 3.575013288525111d);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4453238447142773d, 0.9920594666772955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4411027897735058d + "'", double2 == 1.4411027897735058d);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8E-322d) + "'", double1 == (-2.8E-322d));
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7185746547661834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6678171192446252d + "'", double1 == 0.6678171192446252d);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.916079783099616d, 0.3504975430691109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5116205989233016d + "'", double2 == 1.5116205989233016d);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        double double1 = org.apache.commons.math.util.FastMath.log(2.963905663126391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0865078793721343d + "'", double1 == 1.0865078793721343d);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5936569354152137d), 1.4299012280529384d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8725391511850262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015228681040735291d + "'", double1 == 0.015228681040735291d);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7950499969146666d, 0.7189739987782058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7189739987782058d + "'", double2 == 0.7189739987782058d);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.202619401730384d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-179.76717759904133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.137529136120666d) + "'", double1 == (-3.137529136120666d));
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9913289158005998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003782225820577472d) + "'", double1 == (-0.003782225820577472d));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 33, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707963267948963d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.49008347417426656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        int int2 = org.apache.commons.math.util.FastMath.max(7, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0656328345305126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06356883351481228d + "'", double1 == 0.06356883351481228d);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5487703736876421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6137261894007203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7148773576751525d + "'", double1 == 0.7148773576751525d);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.999696121897531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5258806213658974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        double double2 = org.apache.commons.math.util.FastMath.min(3.450721885123068E-11d, 1.9408944922059557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450721885123068E-11d + "'", double2 == 3.450721885123068E-11d);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9816204068070169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8313988828976153d + "'", double1 == 0.8313988828976153d);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6516488549852542E98d, (-3.278210815113034d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.651648854985254E98d + "'", double2 == 1.651648854985254E98d);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7433261306201426d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6535124586897125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6079788782430797d + "'", double1 == 0.6079788782430797d);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9442173091730631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7567144400243719d + "'", double1 == 0.7567144400243719d);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6013L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6013 + "'", int1 == 6013);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 108, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985974456669E-5d + "'", double1 == 9.079985974456669E-5d);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.46904838772645735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.874493004141847d + "'", double1 == 26.874493004141847d);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.010228883744553106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01022852700990079d) + "'", double1 == (-0.01022852700990079d));
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        double double1 = org.apache.commons.math.util.FastMath.rint(6187.944187412891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6188.0d + "'", double1 == 6188.0d);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9402423370939733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9402423370939733d + "'", double1 == 0.9402423370939733d);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1022931929401623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019238645539126947d + "'", double1 == 0.019238645539126947d);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        double double2 = org.apache.commons.math.util.FastMath.max((-56.72239180482502d), 1.6574544541530776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6574544541530776d + "'", double2 == 1.6574544541530776d);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.873069731935379E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000098735571355d + "'", double1 == 1.000098735571355d);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5904534978892476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5606216214385817d + "'", double1 == 0.5606216214385817d);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9608236039126866d, 7.514508134546872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9608236039126866d + "'", double2 == 0.9608236039126866d);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        double double1 = org.apache.commons.math.util.FastMath.atan(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        long long2 = org.apache.commons.math.util.FastMath.min((-33L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7204111979381276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.586825283057189d + "'", double1 == 5.586825283057189d);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0798250505610605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018846502477804748d + "'", double1 == 0.018846502477804748d);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, (float) 6013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.199239450742893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5362739558005147d + "'", double1 == 1.5362739558005147d);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7875196816685027d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8334737036630135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014546860357711109d + "'", double1 == 0.014546860357711109d);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8744821014221125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9562768485549252d + "'", double1 == 0.9562768485549252d);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7126526144249963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7126526144249963d + "'", double1 == 1.7126526144249963d);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.999942448217206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        double double1 = org.apache.commons.math.util.FastMath.log(1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029584347712752483d + "'", double1 == 0.0029584347712752483d);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9894682501194513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1452603749664034d + "'", double1 == 0.1452603749664034d);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.12390750916924391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0935990917790617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.038858140883553674d + "'", double1 == 0.038858140883553674d);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 3.9481478E13f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.2530676585178546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6325267287722746d) + "'", double1 == (-0.6325267287722746d));
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6535124586897125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8585806444109295d + "'", double1 == 0.8585806444109295d);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        float float2 = org.apache.commons.math.util.FastMath.max(90.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.013343794706920285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013344586776258159d + "'", double1 == 0.013344586776258159d);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.123105625617656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.661382183678883d + "'", double1 == 2.661382183678883d);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.11293707858645427d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.27632259394013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8867182812524047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.841927185055935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2324530857994436d) + "'", double1 == (-1.2324530857994436d));
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        double double1 = org.apache.commons.math.util.FastMath.expm1(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        double double1 = org.apache.commons.math.util.FastMath.log(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162447330056086d + "'", double1 == 3.162447330056086d);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.954242509439325d + "'", double1 == 0.954242509439325d);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        double double1 = org.apache.commons.math.util.FastMath.atanh(26.28604042479942d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.258039429329131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.998515216396303d + "'", double1 == 25.998515216396303d);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0100191552952706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-36L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6035270795055016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6893272594363028d) + "'", double1 == (-0.6893272594363028d));
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5144957554275266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404195002705843d + "'", double1 == 0.5404195002705843d);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9282846855324671d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7182818284590455d + "'", double2 == 3.7182818284590455d);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.685230123174956d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.872983346207419d + "'", double1 == 7.872983346207419d);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.10689388179055553d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8014654691351221d, (-0.8053457690335615d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8053457690335615d) + "'", double2 == (-0.8053457690335615d));
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.11710370870180292d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.010177097973226868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8564693635507433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8987306850524697d + "'", double1 == 0.8987306850524697d);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.68391074271467d + "'", double1 == 73.68391074271467d);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6098494453571884d, 1.3973434260602215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.501051375145d + "'", double2 == 0.501051375145d);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5175112807146286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47577692960058543d + "'", double1 == 0.47577692960058543d);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4614395203971036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8954124969826761d + "'", double1 == 0.8954124969826761d);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7126526144249963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7893750108307105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10271662614180668d) + "'", double1 == (-0.10271662614180668d));
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        double double2 = org.apache.commons.math.util.FastMath.min(2.013752800218212d, (-3.5968032962364678d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5968032962364678d) + "'", double2 == (-3.5968032962364678d));
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8890349204664698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.008388815144683304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999648140965774d + "'", double1 == 0.9999648140965774d);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.169015201985079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7647469645064342d + "'", double1 == 1.7647469645064342d);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9982900983985065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        double double1 = org.apache.commons.math.util.FastMath.ulp(96.11528190732773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.22913468643648427d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.050505149493486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49713280602321935d + "'", double1 == 0.49713280602321935d);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.450721885123068E-11d, 0.7373226231318831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.932254498110376E-8d + "'", double2 == 1.932254498110376E-8d);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.09256090192802896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09242923933712993d) + "'", double1 == (-0.09242923933712993d));
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.9756299818288702d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9756299818288702d) + "'", double2 == (-0.9756299818288702d));
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.021462373800272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.021462373800272d + "'", double1 == 1.021462373800272d);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9092974268256817d, 0.017455065036229588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017455065036229588d + "'", double2 == 0.017455065036229588d);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(16.675653009906092d, 0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.67565300990609d + "'", double2 == 16.67565300990609d);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 802L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 802.0f + "'", float2 == 802.0f);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        int int2 = org.apache.commons.math.util.FastMath.min(5507, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1016289084929765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4471077803475823d + "'", double1 == 0.4471077803475823d);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        double double1 = org.apache.commons.math.util.FastMath.asin(89.99479755129386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5604874136486533d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5888449716910757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.0341111784814d + "'", double1 == 91.0341111784814d);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        int int2 = org.apache.commons.math.util.FastMath.max(6013, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6013 + "'", int2 == 6013);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3924150230910621d, 1.4004475999834715E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326793891d + "'", double2 == 1.570796326793891d);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.913891279076611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05085699686503582d + "'", double1 == 0.05085699686503582d);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-5156.620156177409d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-295452.57150105695d) + "'", double1 == (-295452.57150105695d));
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        float float2 = org.apache.commons.math.util.FastMath.max(802.0f, (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9562768485549252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2968014097523634d + "'", double1 == 0.2968014097523634d);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7688894800973336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7688894800973337d + "'", double1 == 0.7688894800973337d);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1794413306714115d, 1.9463500701061331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1794413306714115d + "'", double2 == 1.1794413306714115d);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9683274362856896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(32.843508051844005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.202456058843363d + "'", double1 == 3.202456058843363d);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.22820026671210777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9955742875642762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.420324011058295d) + "'", double1 == (-5.420324011058295d));
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1304751349378549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9915001880826704d + "'", double1 == 0.9915001880826704d);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1596819083340262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14814575056050414d + "'", double1 == 0.14814575056050414d);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1727924348551592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17366404762497195d + "'", double1 == 0.17366404762497195d);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3242386343317494d, (-1.395766663829712d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.382485449398286d + "'", double2 == 2.382485449398286d);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.012209562553744127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012135328274706769d) + "'", double1 == (-0.012135328274706769d));
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        double double1 = org.apache.commons.math.util.FastMath.signum(23.628351601695016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2005820037610595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.78828177486824d + "'", double1 == 68.78828177486824d);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), 34.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0003260171829864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6154530614821584d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7070668111573262d) + "'", double1 == (-0.7070668111573262d));
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6765286719118557d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5182132651839548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5182132651839548d + "'", double1 == 1.5182132651839548d);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03624593110524417d, 0.01204168896484698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01204168896484698d + "'", double2 == 0.01204168896484698d);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8334737036630135d + "'", double1 == 0.8334737036630135d);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.002962815258153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0014803119673161d + "'", double1 == 1.0014803119673161d);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9330380764829064d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        double double1 = org.apache.commons.math.util.FastMath.log(1.50871659209645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4112593504149052d + "'", double1 == 0.4112593504149052d);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144236d + "'", double1 == 53.598150033144236d);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        long long1 = org.apache.commons.math.util.FastMath.round(1.8860312344816034E45d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.618381578861124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9595080520584216d + "'", double1 == 1.9595080520584216d);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.23005929548649254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22612470361587986d) + "'", double1 == (-0.22612470361587986d));
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.211020790109826E-11d + "'", double1 == 5.211020790109826E-11d);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 34, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        double double1 = org.apache.commons.math.util.FastMath.tan((-12.806875836617005d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2452522471044109d) + "'", double1 == (-0.2452522471044109d));
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.480272527447467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3941430423415544d + "'", double1 == 3.3941430423415544d);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.16902146990801d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.814615669229906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.347076712451784d + "'", double1 == 1.347076712451784d);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        int int1 = org.apache.commons.math.util.FastMath.abs((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2017803571211352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5126873628972832d + "'", double1 == 1.5126873628972832d);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.181805463686414d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1224298829604082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.039232404982515d, 1.0457528827495823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.041063771711722d + "'", double2 == 1.041063771711722d);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02741120805195372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7764153489348606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3168593165814557d + "'", double1 == 1.3168593165814557d);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.719982772427445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.4402149326390393E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9198805219398823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.1071487177940904d), (-0.24282050753856244d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1071487177940904d) + "'", double2 == (-1.1071487177940904d));
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7875196816685027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.419447390606458d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.19609258438980118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19735170462481363d) + "'", double1 == (-0.19735170462481363d));
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8705409696704832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4034637098427396d + "'", double1 == 1.4034637098427396d);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        double double1 = org.apache.commons.math.util.FastMath.sinh(125.07732156842896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0455879577505533E54d + "'", double1 == 1.0455879577505533E54d);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6269114619385457d, (-0.6296683555679016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6269114619385456d + "'", double2 == 0.6269114619385456d);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        double double1 = org.apache.commons.math.util.FastMath.rint(2979.3805346802797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0d + "'", double1 == 2979.0d);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7346773280347003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012822538313959962d + "'", double1 == 0.012822538313959962d);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7949577687638787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6858739404357614E-7d + "'", double1 == 1.6858739404357614E-7d);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.13800468479027d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3469373133180005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4147280379840659d + "'", double1 == 1.4147280379840659d);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5507, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5175807674647721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.51685295210541d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        int int2 = org.apache.commons.math.util.FastMath.min(90, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.147277566020156d), 0.02741120805195372d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6743332553663808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6743332553663808d + "'", double1 == 0.6743332553663808d);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.267373051563951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8414621219996845d + "'", double1 == 1.8414621219996845d);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8694416130821835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3855784057749916d + "'", double1 == 2.3855784057749916d);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8211080655056974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7209733733613426d) + "'", double1 == (-1.7209733733613426d));
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 33L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        float float2 = org.apache.commons.math.util.FastMath.max(37.0f, 802.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 802.0f + "'", float2 == 802.0f);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7820302396610385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8642146972921027d + "'", double1 == 0.8642146972921027d);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        double double2 = org.apache.commons.math.util.FastMath.min(14.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8034290448474706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09505247209529073d) + "'", double1 == (-0.09505247209529073d));
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4330001021490115d, (-0.8282265872414869d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4330001021490115d + "'", double2 == 1.4330001021490115d);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5709739450023905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533849947252402d + "'", double1 == 1.2533849947252402d);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2969610063487869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.658162625053287d + "'", double1 == 3.658162625053287d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.380291914558474E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        long long2 = org.apache.commons.math.util.FastMath.max(29L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6033871039701522d, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.541936089741759E-20d + "'", double2 == 6.541936089741759E-20d);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-90.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192987713658942d + "'", double1 == 5.192987713658942d);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.50871659209645d, (-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5087165920964498d + "'", double2 == 1.5087165920964498d);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0925604496286767d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        double double1 = org.apache.commons.math.util.FastMath.rint(35.44341522934085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6516488549852542E98d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6516488549852545E98d + "'", double1 == 1.6516488549852545E98d);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9978031084482193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.551474405271228E-4d) + "'", double1 == (-9.551474405271228E-4d));
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5822681503789437d), 4.518030890222253E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5822681503789437d) + "'", double2 == (-0.5822681503789437d));
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        double double1 = org.apache.commons.math.util.FastMath.floor(257.19381419176113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 257.0d + "'", double1 == 257.0d);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9222344721288218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5149035983190735d + "'", double1 == 1.5149035983190735d);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7369048799450005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13258856747480902d) + "'", double1 == (-0.13258856747480902d));
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02556940209677608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025572189105137307d + "'", double1 == 0.025572189105137307d);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3.137529136120666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9576211840427852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.605491111809574d + "'", double1 == 2.605491111809574d);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.1307589219114205E-4d), 1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948957d + "'", double2 == 1.5707963267948957d);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.22612470361587986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2223846932466054d) + "'", double1 == (-0.2223846932466054d));
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7084653196386397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13723453705095956d) + "'", double1 == (-0.13723453705095956d));
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5751415331727446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5439535587853994d + "'", double1 == 0.5439535587853994d);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9980574414724095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990282485857992d + "'", double1 == 0.9990282485857992d);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1067486750760071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10715694715827395d) + "'", double1 == (-0.10715694715827395d));
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8110535914763489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9029439985409666d + "'", double1 == 0.9029439985409666d);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.05984490553849807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05984490553849806d) + "'", double1 == (-0.05984490553849806d));
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2793491738997593d + "'", double1 == 2.2793491738997593d);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        double double1 = org.apache.commons.math.util.FastMath.log(0.991328918078117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008708894495360405d) + "'", double1 == (-0.008708894495360405d));
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4682955026240894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16681346855285947d + "'", double1 == 0.16681346855285947d);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0029584347712752483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029628152581528955d + "'", double1 == 0.0029628152581528955d);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        long long1 = org.apache.commons.math.util.FastMath.round(0.10955796484928035d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        double double1 = org.apache.commons.math.util.FastMath.expm1(32.33722455228312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1063134264787278E14d + "'", double1 == 1.1063134264787278E14d);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        long long2 = org.apache.commons.math.util.FastMath.min(29L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1286157825604266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7050719644457958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615649143945545d + "'", double1 == 0.7615649143945545d);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5904534978892476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9391756960807233d + "'", double1 == 0.9391756960807233d);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.019016309312897425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01901860187056251d + "'", double1 == 0.01901860187056251d);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4855755420534185d, 0.69482111198402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6099535495393804d + "'", double2 == 0.6099535495393804d);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5844798497868193d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        double double1 = org.apache.commons.math.util.FastMath.signum((-43.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 33, 2979L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.5532447566107d + "'", double1 == 98.5532447566107d);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.23903957044228702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2130137128033769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0664861917502018d + "'", double1 == 1.0664861917502018d);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.054839968556690856d) + "'", double1 == (-0.054839968556690856d));
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5945828425407312d, 1.0000072050412114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000072050412114d + "'", double2 == 1.0000072050412114d);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        double double1 = org.apache.commons.math.util.FastMath.floor(240.27638476315678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 240.0d + "'", double1 == 240.0d);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        double double1 = org.apache.commons.math.util.FastMath.cosh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7467135528742547E19d + "'", double1 == 1.7467135528742547E19d);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.677053844817004E-155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.677053844817004E-155d + "'", double1 == 6.677053844817004E-155d);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.5405025668761214d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5405025668761214d) + "'", double2 == (-1.5405025668761214d));
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9988747933673575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988747933673576d + "'", double1 == 0.9988747933673576d);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.835879646400315d, (-0.026789739363150215d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.835879646400314d + "'", double2 == 4.835879646400314d);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.194012623990515E-40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194012623990515E-40d + "'", double1 == 8.194012623990515E-40d);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7466222644566186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8640730666191481d + "'", double1 == 0.8640730666191481d);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.492757420590522E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.25320738314893254d, (double) (-34L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.913390410867369E20d + "'", double2 == 1.913390410867369E20d);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9149994934381422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.42560923061381d + "'", double1 == 52.42560923061381d);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7621551316062607d + "'", double1 == 0.7621551316062607d);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.07352180207555892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0709446474695995d + "'", double1 == 0.0709446474695995d);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6801783019998602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8247292295049692d + "'", double1 == 0.8247292295049692d);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        double double1 = org.apache.commons.math.util.FastMath.log(13.026012785332021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5669483416477585d + "'", double1 == 2.5669483416477585d);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9787910788176273d, 0.3619730303123129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3619730303123129d + "'", double2 == 0.3619730303123129d);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1016359.4424036132d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        long long2 = org.apache.commons.math.util.FastMath.max((-33L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6178002687535424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0171573625269879d + "'", double1 == 1.0171573625269879d);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4859822068712754d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6329856393072076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6854037599156713d + "'", double1 == 0.6854037599156713d);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.03996444158152412d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2968014097523634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.005468132343413d + "'", double1 == 17.005468132343413d);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.021421851850931834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0214185756534747d + "'", double1 == 0.0214185756534747d);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7614261854513965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0905417743683503d, 88.89818203244916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0905417743683503d + "'", double2 == 1.0905417743683503d);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        double double1 = org.apache.commons.math.util.FastMath.tanh(49.59008907222208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.04747861379422898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.433815708350771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2165359386564516d + "'", double1 == 2.2165359386564516d);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 5507);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6367696710046598d) + "'", double1 == (-0.6367696710046598d));
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.1008763214519655d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6215302002977275d), 0.005202425297431776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6215302002977274d) + "'", double2 == (-0.6215302002977274d));
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01365870103245646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8645906008931825d) + "'", double1 == (-1.8645906008931825d));
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4411027897735058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2310097729015483d + "'", double1 == 2.2310097729015483d);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7257717102239228d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.523803578782063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.523803578782063d + "'", double1 == 0.523803578782063d);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.47154978371078976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3863161200666326d + "'", double1 == 0.3863161200666326d);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5515060405847224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1559734442091005d + "'", double1 == 1.1559734442091005d);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.1749143444037795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09031929381852975d) + "'", double1 == (-0.09031929381852975d));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.203901115297726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5916506688389258d) + "'", double1 == (-0.5916506688389258d));
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8466727901645837d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2083.76558392283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.50871659209645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980736720443409d + "'", double1 == 0.9980736720443409d);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.8317095147254143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-162.24500400080467d) + "'", double1 == (-162.24500400080467d));
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        double double1 = org.apache.commons.math.util.FastMath.atanh(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        long long1 = org.apache.commons.math.util.FastMath.round(70.77202832050486d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 71L + "'", long1 == 71L);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.009446037147747973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009490791763571364d + "'", double1 == 0.009490791763571364d);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 33, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }
}

