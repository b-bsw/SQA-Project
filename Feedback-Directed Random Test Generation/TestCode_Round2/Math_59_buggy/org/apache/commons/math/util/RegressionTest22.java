package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3402145963603704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.383464577367716d + "'", double1 == 9.383464577367716d);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0653122583386827d, 1.8285569054478337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.065312258338683d + "'", double2 == 1.065312258338683d);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.2489243820885466E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5708188160387193d + "'", double1 == 1.5708188160387193d);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 37, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        double double1 = org.apache.commons.math.util.FastMath.cos(2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4078492487008538d + "'", double1 == 0.4078492487008538d);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.181805463686414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0555329814992728d + "'", double1 == 0.0555329814992728d);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        double double1 = org.apache.commons.math.util.FastMath.asinh(51.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.625068916307673d + "'", double1 == 4.625068916307673d);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        double double1 = org.apache.commons.math.util.FastMath.exp(34.23750238789774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.398750140267755E14d + "'", double1 == 7.398750140267755E14d);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.42581659714188025d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4258165971418802d + "'", double2 == 0.4258165971418802d);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7811629682982569d, 1.6289834386711253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44714617074826196d + "'", double2 == 0.44714617074826196d);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.16715178130022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8273879941950103d + "'", double1 == 0.8273879941950103d);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2979.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.461303446511725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4778393749317348d) + "'", double1 == (-0.4778393749317348d));
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.05358338937456895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.352065689643733E-4d) + "'", double1 == (-9.352065689643733E-4d));
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5847565194252626E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194252626E-6d + "'", double1 == 1.5847565194252626E-6d);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21569900424612215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21740762886853365d + "'", double1 == 0.21740762886853365d);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        int int2 = org.apache.commons.math.util.FastMath.max(5507, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.014613329118427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.72462062236846d + "'", double1 == 172.72462062236846d);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.03449930605017342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034485625514134866d + "'", double1 == 0.034485625514134866d);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0511733744167922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8184464592320668d, 1.7950781550795927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8184464592320666d + "'", double2 == 1.8184464592320666d);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0392324049825148d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06230885991602587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06234924844199808d + "'", double1 == 0.06234924844199808d);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.601570775718839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.64070598427006d + "'", double1 == 99.64070598427006d);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000135327670998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.71831861458285d + "'", double1 == 2.71831861458285d);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        double double2 = org.apache.commons.math.util.FastMath.min(6.46346031073593d, (-0.012208349338536975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012208349338536975d) + "'", double2 == (-0.012208349338536975d));
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        double double2 = org.apache.commons.math.util.FastMath.min(10.244215505684302d, (-1.0600665629065072E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0600665629065072E-5d) + "'", double2 == (-1.0600665629065072E-5d));
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6220107246567897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5525264598777494d + "'", double1 == 0.5525264598777494d);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6079788782430798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47497803524953397d + "'", double1 == 0.47497803524953397d);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017455065036229588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2717104239752095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8312900536850981d, 0.9915001880826704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9915001880826704d + "'", double2 == 0.9915001880826704d);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999989097008681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550938742d + "'", double1 == 7.211102550938742d);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(226.84826038896668d, 1.0880187727330415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 226.84826038896665d + "'", double2 == 226.84826038896665d);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        int int2 = org.apache.commons.math.util.FastMath.max(6, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.31656378283939074d), 0.8895943182893177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.31656378283939074d) + "'", double2 == (-0.31656378283939074d));
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1144754686842937d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.011982924064042687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011911697268412192d + "'", double1 == 0.011911697268412192d);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        double double2 = org.apache.commons.math.util.FastMath.min(5.276114056013788E21d, (-0.7726957173974609d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7726957173974609d) + "'", double2 == (-0.7726957173974609d));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.010682762630607235d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0405312203410338E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5426358183879162d + "'", double1 == 0.5426358183879162d);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0625777230983877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6108652381980155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47677144967045476d + "'", double1 == 0.47677144967045476d);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7820302396610384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.059976116562831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.059976116562831d + "'", double1 == 2.059976116562831d);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.012209562535656249d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3175766709741277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0891224103059294d + "'", double1 == 1.0891224103059294d);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.570788754385651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6154530614821584d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8675159836353801d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6467231614773944d + "'", double1 == 0.6467231614773944d);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.44248081051227434d, (-1.3502411804946023E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000110093625383d + "'", double2 == 1.0000110093625383d);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.024653336246160933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7884010119012819d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03169096295775694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.031690962957756946d + "'", double1 == 0.031690962957756946d);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5788404741295278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6607171481253945d + "'", double1 == 0.6607171481253945d);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8427842873511954E202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8197233074908405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9053857230434113d + "'", double1 == 0.9053857230434113d);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7941243666430794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0281434657352284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8089563172728977d, 1.7074275585391845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4424578548146718d + "'", double2 == 0.4424578548146718d);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.009529184451583001d, 0.7853981633974482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02586747778105082d + "'", double2 == 0.02586747778105082d);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0625777230983877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8337177321043896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6063454536491417d + "'", double1 == 0.6063454536491417d);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1374094813460001d + "'", double1 == 0.1374094813460001d);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        double double1 = org.apache.commons.math.util.FastMath.log(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.833213344056216d + "'", double1 == 2.833213344056216d);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8922451992629654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7167268785408383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23470120688042762d + "'", double1 == 0.23470120688042762d);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.700942273550203E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.700942273550203E19d + "'", double1 == 3.700942273550203E19d);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.661382183678883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2978407219369448d + "'", double1 == 1.2978407219369448d);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        double double1 = org.apache.commons.math.util.FastMath.rint(71.61475609949856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.0d + "'", double1 == 72.0d);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        double double1 = org.apache.commons.math.util.FastMath.cos(34.026480513893276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8622815200471214d) + "'", double1 == (-0.8622815200471214d));
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9960788823760445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1691596119333798d + "'", double1 == 1.1691596119333798d);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.041945072145264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9124034991009714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.969904514319578d + "'", double1 == 0.969904514319578d);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5518737433602259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        double double2 = org.apache.commons.math.util.FastMath.min(35.0d, (-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6865874069985796d) + "'", double2 == (-0.6865874069985796d));
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.29167236570643446d, 4.147784570106808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2916723657064345d + "'", double2 == 0.2916723657064345d);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.047067248963123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8083866399530157d + "'", double1 == 0.8083866399530157d);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.4239386535423835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.42421822005818d + "'", double1 == 83.42421822005818d);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9608236039126866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9608236039126867d + "'", double1 == 0.9608236039126867d);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8069622770304092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.897439174822847d + "'", double1 == 0.897439174822847d);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        double double2 = org.apache.commons.math.util.FastMath.min(34.23750238789774d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.627115805918354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.176177375677374d + "'", double1 == 1.176177375677374d);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.014438678988775109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014439682442491103d + "'", double1 == 0.014439682442491103d);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7084452722420731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0308314129639413d + "'", double1 == 2.0308314129639413d);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7415933335367688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.09927770074216d + "'", double1 == 2.09927770074216d);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7976786466071603d), 6.101912399578768E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7976786466071601d) + "'", double2 == (-0.7976786466071601d));
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.19735170462481363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19482886944033456d) + "'", double1 == (-0.19482886944033456d));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.004363724684235064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004363724684235065d + "'", double1 == 0.004363724684235065d);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        double double1 = org.apache.commons.math.util.FastMath.signum((-33.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.014013181411766374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000981862333536d + "'", double1 == 1.0000981862333536d);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        int int2 = org.apache.commons.math.util.FastMath.min(37, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4938217385693559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45869279545028524d + "'", double1 == 0.45869279545028524d);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.42918313798454755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4588949508357674d + "'", double1 == 0.4588949508357674d);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0794581324702177d, 5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6843418860808015E-14d + "'", double2 == 5.6843418860808015E-14d);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3801753953415168E-182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9999103740052037d), 1.1854652182422676d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        double double2 = org.apache.commons.math.util.FastMath.min(1.85525793289872d, 1.1310143745245964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1310143745245964d + "'", double2 == 1.1310143745245964d);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.220703125E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.1083832032431884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.38482341774904d + "'", double1 == 22.38482341774904d);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.32719023706934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3333286138345395d + "'", double1 == 0.3333286138345395d);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.003029269128215333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.51866214109214d) + "'", double1 == (-2.51866214109214d));
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        double double2 = org.apache.commons.math.util.FastMath.max(1.862645149230957E-9d, 0.8683078057307718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8683078057307718d + "'", double2 == 0.8683078057307718d);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.05934737555189802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707958182283288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012976262233056d + "'", double1 == 2.3012976262233056d);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2511260027859388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.224043948064119d + "'", double1 == 0.224043948064119d);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.57070552693625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441803853319909d + "'", double1 == 0.9441803853319909d);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9999999999999983d), 0.989925281440789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.989925281440789d + "'", double2 == 0.989925281440789d);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9260406133217521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7470173180819818d + "'", double1 == 0.7470173180819818d);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.589691795662765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4588214153419555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4440807867778165d) + "'", double1 == (-0.4440807867778165d));
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13285280634323596d) + "'", double1 == (-0.13285280634323596d));
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 6013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9908249037020886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6934553975274538d + "'", double1 == 2.6934553975274538d);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5155829442931129d, 0.6932565044940331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6317555895253838d + "'", double2 == 0.6317555895253838d);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.009528896059822961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7637144409979837d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0281434657352284d, 0.6088496173769596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0281434657352284d + "'", double2 == 1.0281434657352284d);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0856069384097307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0277580097816033d + "'", double1 == 1.0277580097816033d);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.13800468479027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8103207573667655d + "'", double1 == 1.8103207573667655d);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1542738581313687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9145014161184981d + "'", double1 == 0.9145014161184981d);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1628200628694076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1628200628694079d + "'", double1 == 1.1628200628694079d);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1854652182422678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0887907137013375d + "'", double1 == 1.0887907137013375d);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8105257933460475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.515845598485778d + "'", double1 == 2.515845598485778d);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(39.56166260838806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4074135410297393d + "'", double1 == 3.4074135410297393d);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9181093036277246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03710561167834259d) + "'", double1 == (-0.03710561167834259d));
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7746387500310367d, 0.01984738594460336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5451804579148973d + "'", double2 == 1.5451804579148973d);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9198805219398823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5089906026975917d + "'", double1 == 2.5089906026975917d);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5507, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2657156711620368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5456293329809854d + "'", double1 == 2.5456293329809854d);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.584755263699313E-6d + "'", double1 == 1.584755263699313E-6d);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7868773786253227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6650638591935858d + "'", double1 == 0.6650638591935858d);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        double double2 = org.apache.commons.math.util.FastMath.atan2(55.9664273046815d, 36.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9866500802305528d + "'", double2 == 0.9866500802305528d);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7167268785408383d, (-0.13145613893303285d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6472208927985474d + "'", double2 == 1.6472208927985474d);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7010319566582488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        double double2 = org.apache.commons.math.util.FastMath.min(0.999999983592552d, 1.4239994887637555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999983592552d + "'", double2 == 0.999999983592552d);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.32269275245300827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.488932795017217d + "'", double1 == 18.488932795017217d);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.963688479552775d, 0.015105430502911008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5631041023265138d + "'", double2 == 1.5631041023265138d);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(684.1197129515763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 684.1197129515764d + "'", double1 == 684.1197129515764d);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2018125075709377E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.065312258338683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8749401759781723d + "'", double1 == 0.8749401759781723d);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.8427842873511956E202d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219106381578E-8d + "'", double1 == 2.7659219106381578E-8d);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        double double1 = org.apache.commons.math.util.FastMath.acosh(34.237502387897734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.226255443643855d + "'", double1 == 4.226255443643855d);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        double double2 = org.apache.commons.math.util.FastMath.min(2.2227587494850775E-162d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1103012106843946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.192465179596234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3693701490342281d + "'", double1 == 0.3693701490342281d);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3368167172784004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0572610275230316d + "'", double1 == 1.0572610275230316d);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.835879646400315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.8078463628702286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.57418497422074d + "'", double1 == 15.57418497422074d);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9526653195309732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.048491623229691465d) + "'", double1 == (-0.048491623229691465d));
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.8774717541114375E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8774717541114375E-39d + "'", double1 == 5.8774717541114375E-39d);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6215302002977274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9716189987139433d) + "'", double1 == (-0.9716189987139433d));
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4439747880964912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        long long2 = org.apache.commons.math.util.FastMath.min(37L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.405819438223506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1620169140071894d + "'", double1 == 2.1620169140071894d);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.013277527411913046d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        double double1 = org.apache.commons.math.util.FastMath.asin(65.8643006099024d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.692617836018588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.128438542496736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0082595747181473d + "'", double1 == 1.0082595747181473d);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9988359491211439d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988359491211439d + "'", double1 == 0.9988359491211439d);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        float float2 = org.apache.commons.math.util.FastMath.max(7.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.95887644469623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.931772633139733d + "'", double1 == 1.931772633139733d);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5717930045758977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6501827875018285d + "'", double1 == 0.6501827875018285d);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.080810473338706E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000004123056d + "'", double1 == 1.000000004123056d);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        long long2 = org.apache.commons.math.util.FastMath.min(33L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5606216214385817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.12125281221169d + "'", double1 == 32.12125281221169d);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.4402149326390393E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4402149084213346E-4d) + "'", double1 == (-2.4402149084213346E-4d));
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.926772007304508d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.581866402923032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1741146780167413d + "'", double1 == 1.1741146780167413d);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9448615067357444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9448615067357444d + "'", double1 == 0.9448615067357444d);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.36342295838328d + "'", double1 == 88.36342295838328d);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3993780062099792d), (-0.054839968556690856d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6013);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6013.0f + "'", float1 == 6013.0f);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.2089948465116955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2344507960798224d) + "'", double1 == (-0.2344507960798224d));
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        long long2 = org.apache.commons.math.util.FastMath.min(29L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.06248983243787372d), 1.3828979036148312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06248983243787372d) + "'", double2 == (-0.06248983243787372d));
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9159709810535507d, (-0.04112335167120564d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04112335167120564d) + "'", double2 == (-0.04112335167120564d));
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.10178798778736835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09693430364396066d + "'", double1 == 0.09693430364396066d);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-323.3062153431158d) + "'", double1 == (-323.3062153431158d));
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.309027772999469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7025722210756764d + "'", double1 == 3.7025722210756764d);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.03927547481280819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03927547481280819d + "'", double1 == 0.03927547481280819d);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.22638423669012675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.005703194797602166d), 8.881784197001248E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.999999983592552d, 0.7317887661991493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999879932139d + "'", double2 == 0.9999999879932139d);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.13018952509948228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13904424034177987d + "'", double1 == 0.13904424034177987d);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.123425674293008E-4d), (-42.96713148885693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.123425674293009E-4d) + "'", double2 == (-5.123425674293009E-4d));
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1650012094878277d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        long long1 = org.apache.commons.math.util.FastMath.abs(17L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        double double1 = org.apache.commons.math.util.FastMath.log(0.580846352739766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5432690102198382d) + "'", double1 == (-0.5432690102198382d));
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.055627941708065d), 0.535391480731942d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(16.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.554823780131915d + "'", double1 == 2.554823780131915d);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2130137128033769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01574435112081428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015743050386915508d + "'", double1 == 0.015743050386915508d);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.876827152556707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7915431754166559d + "'", double1 == 0.7915431754166559d);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.924127750058071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.370439403300275d + "'", double1 == 1.370439403300275d);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4454760174920582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7673381456085452d) + "'", double1 == (-0.7673381456085452d));
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9723148318154615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.132925695361849d + "'", double1 == 1.132925695361849d);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5115567593090742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4131400861757801d + "'", double1 == 0.4131400861757801d);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4258165971418802d, (-0.4440807867778165d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4610165184849624d + "'", double2 == 1.4610165184849624d);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7204111979381276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1379435771909256d + "'", double1 == 1.1379435771909256d);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5115567593090742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9982458499025022d + "'", double1 == 0.9982458499025022d);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0152212606741864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5274319619951918d + "'", double1 == 0.5274319619951918d);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9699398265477828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7486778430423748d + "'", double1 == 0.7486778430423748d);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.26241737750193517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.035408201752167d) + "'", double1 == (-15.035408201752167d));
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202401830118581d + "'", double1 == 0.005202401830118581d);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.08828586723825156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        double double2 = org.apache.commons.math.util.FastMath.max(0.022638173012735963d, 0.01378859300458183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.022638173012735963d + "'", double2 == 0.022638173012735963d);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.505614555895704d) + "'", double1 == (-49.505614555895704d));
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1255639071109433d, 4.432766869820022E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000004d + "'", double2 == 1.0000000000000004d);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        int int2 = org.apache.commons.math.util.FastMath.max((-33), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        double double2 = org.apache.commons.math.util.FastMath.max(0.022630443056965113d, 1.0006521406531765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0006521406531765d + "'", double2 == 1.0006521406531765d);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.51866214109214d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09492219498557733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9954982701054496d + "'", double1 == 0.9954982701054496d);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.42041931513487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(18.488932795017217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.48893279501722d + "'", double1 == 18.48893279501722d);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.102016471588857E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5707963267948963d), (-1.7405072374130097d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5377459288874316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999895347724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.544990610780073E-9d) + "'", double1 == (-4.544990610780073E-9d));
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.35049754306911085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33711799610094684d + "'", double1 == 0.33711799610094684d);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.297282285720732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29728228572073206d + "'", double1 == 0.29728228572073206d);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2722218725854069E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854069E-14d + "'", double1 == 1.2722218725854069E-14d);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 108L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        float float2 = org.apache.commons.math.util.FastMath.max(17.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5103963463916682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7144202869401653d + "'", double1 == 0.7144202869401653d);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.22638423669012675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9744843412484949d + "'", double1 == 0.9744843412484949d);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 90.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5156.620156177409d + "'", double1 == 5156.620156177409d);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.315356337104293E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.295729891944237E-21d + "'", double1 == 2.295729891944237E-21d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.0457103449725933E-4d), 40.6686938236807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.6686938236807d + "'", double2 == 40.6686938236807d);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        long long2 = org.apache.commons.math.util.FastMath.min((-5L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.29728228572073206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30184498661054304d + "'", double1 == 0.30184498661054304d);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.258039429329131d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.045864920222764E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0463288790911705E-4d) + "'", double1 == (-3.0463288790911705E-4d));
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9365964011255326d, 1.584755263699313E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9365964011255326d + "'", double2 == 0.9365964011255326d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.30642979586841934d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.055410715024554476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.056974640904439d + "'", double1 == 1.056974640904439d);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3169578969248166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        int int2 = org.apache.commons.math.util.FastMath.max((-90), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3956124250860893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8625222728658754d + "'", double1 == 0.8625222728658754d);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.0457103449725933E-4d), 0.05165599792339188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.045710344972593E-4d) + "'", double2 == (-3.045710344972593E-4d));
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0880187727330415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0880187727330417d + "'", double1 == 1.0880187727330417d);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-33.40828846862413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6143783922567794E14d + "'", double1 == 1.6143783922567794E14d);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.69482111198402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.648418694578667d + "'", double1 == 0.648418694578667d);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7219067166708866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5434322330346599d + "'", double1 == 0.5434322330346599d);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        double double1 = org.apache.commons.math.util.FastMath.atan(49.59008907222208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5506337397727343d + "'", double1 == 1.5506337397727343d);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.823310651799671E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8233107E7d + "'", double1 == 5.8233107E7d);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3383671073348347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9731097152599588d + "'", double1 == 0.9731097152599588d);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.498241304416574d) + "'", double1 == (-0.498241304416574d));
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8048.369284881994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.686371961004665d + "'", double1 == 9.686371961004665d);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6580161192200634d, (-63.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.825520424709834E11d + "'", double2 == 2.825520424709834E11d);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.761141324937585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1820039699637546d + "'", double1 == 2.1820039699637546d);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.07139823206237136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0715199269340581d) + "'", double1 == (-0.0715199269340581d));
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9336979767153191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9336979767153191d + "'", double1 == 0.9336979767153191d);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1877181244729043d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6085180763729596d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4051.542025492594d + "'", double1 == 4051.542025492594d);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.48652823534968553d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0228884541592955d, 1.000074537634835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0228884541592955d + "'", double2 == 1.0228884541592955d);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.787162844955128d, (-5.192987713658941d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4652560018032714d + "'", double2 == 3.4652560018032714d);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000705818430178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011881162631153918d + "'", double1 == 0.011881162631153918d);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        double double1 = org.apache.commons.math.util.FastMath.sin(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.30888908362985534d) + "'", double1 == (-0.30888908362985534d));
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10475317834218718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1047531783421872d + "'", double1 == 0.1047531783421872d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3993780062099792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8450167959828723d, 2.4615926968669573E-293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.694813279936381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        long long1 = org.apache.commons.math.util.FastMath.round(2.076738876852442d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5274728362673281d), 0.04212400351101203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.527472836267328d) + "'", double2 == (-0.527472836267328d));
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.988092346097116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005202464798769022d) + "'", double1 == (-0.005202464798769022d));
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0268328847498687d, (-0.6180780088437617d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.112631227666096d + "'", double2 == 2.112631227666096d);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.661382183678883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        int int2 = org.apache.commons.math.util.FastMath.max(33, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0432322944097694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8640359722236102d) + "'", double1 == (-0.8640359722236102d));
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.872928489116717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.872928489116717d + "'", double1 == 0.872928489116717d);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999999983592552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557407668450882d + "'", double1 == 1.557407668450882d);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4993327597777462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17589803024473025d + "'", double1 == 0.17589803024473025d);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.01204168896484698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01204197997900222d + "'", double1 == 0.01204197997900222d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 17L, (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        double double2 = org.apache.commons.math.util.FastMath.min(13.188688139030402d, (-0.08002467258422295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08002467258422295d) + "'", double2 == (-0.08002467258422295d));
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5771201712143844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9555984013705581d + "'", double1 == 0.9555984013705581d);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3503618485308446d + "'", double1 == 1.3503618485308446d);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.20986096342796d + "'", double1 == 93.20986096342796d);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.604885025084334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0973039206233832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.012822889714884954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6038473373858848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03304499360141309d) + "'", double1 == (-0.03304499360141309d));
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.854802108020353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5456269355454904d + "'", double1 == 0.5456269355454904d);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.688117141816098E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418160985E43d + "'", double1 == 2.6881171418160985E43d);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2057193346742117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1870763470697897d + "'", double1 == 0.1870763470697897d);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.017628405034299E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.517959872387207E75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9999103740052037d), (-0.03746288709529651d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 90, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.502934118112607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8028961524453899d) + "'", double1 == (-0.8028961524453899d));
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 9, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7219067166708866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8496509381333528d + "'", double1 == 0.8496509381333528d);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2225981852327883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3463176128848677d + "'", double1 == 1.3463176128848677d);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557647d) + "'", double1 == (-0.7615941559557647d));
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1648615463474224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.195945676325781d, 48.153426409720026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10748808244533065d + "'", double2 == 0.10748808244533065d);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3076068662567917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2601615017708116d + "'", double1 == 0.2601615017708116d);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6848167883550325d), 0.694290324463072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6848167883550323d) + "'", double2 == (-0.6848167883550323d));
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.02709946932405838d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.238794745664782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4795437395710178d + "'", double1 == 1.4795437395710178d);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04229712549613145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04229712549613146d + "'", double1 == 0.04229712549613146d);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.3945753355078114d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2989847789037956d, 0.02016420058550522d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02016420058550522d + "'", double2 == 0.02016420058550522d);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9996832018446994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017447763349069056d + "'", double1 == 0.017447763349069056d);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9150577654397632d, (-0.22649705709056728d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.813441530945765d + "'", double2 == 1.813441530945765d);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9543698520048145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4113770610417682d + "'", double1 == 1.4113770610417682d);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8361528200478593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1662106041552343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.34501162170677324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410715221203457d + "'", double1 == 0.9410715221203457d);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, 71.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 71.0f + "'", float2 == 71.0f);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1998.6364724075595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6602465455257652d) + "'", double1 == (-0.6602465455257652d));
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        double double1 = org.apache.commons.math.util.FastMath.acosh(89.99999999999994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192925985263683d + "'", double1 == 5.192925985263683d);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.29100619138474915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29100619138474915d + "'", double1 == 0.29100619138474915d);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.398750140267755E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.929562688685152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9759469874168021d) + "'", double1 == (-0.9759469874168021d));
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7678918407989204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8456138577445713d) + "'", double1 == (-0.8456138577445713d));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.21633966230316995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24377959524211273d) + "'", double1 == (-0.24377959524211273d));
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        long long2 = org.apache.commons.math.util.FastMath.min(11014L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8550196364002437d, 1.9542174043274347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8550196364002437d + "'", double2 == 0.8550196364002437d);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.853553411092362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3676050451129373d + "'", double1 == 1.3676050451129373d);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.207534329995823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9149994934381422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5440211108893697d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4960257599228209d) + "'", double1 == (-0.4960257599228209d));
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-34), (float) 5507);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.0f) + "'", float2 == (-34.0f));
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8895257804916458d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8895257804916457d) + "'", double1 == (-0.8895257804916457d));
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6615388636231894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5077441992239914d + "'", double1 == 0.5077441992239914d);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9363862393833727d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.42001722271167297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5219877681494083d + "'", double1 == 1.5219877681494083d);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4610165184849624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37913243899141097d + "'", double1 == 0.37913243899141097d);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        double double1 = org.apache.commons.math.util.FastMath.signum(522.7354584310932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3845369719462828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36664107033374965d) + "'", double1 == (-0.36664107033374965d));
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9489572732237299d + "'", double1 == 0.9489572732237299d);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6884571549908809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.744145695188831d + "'", double1 == 0.744145695188831d);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.080810473338706E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5708004490110032d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.24282050753856244d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2563369027010307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2921879962402267d + "'", double1 == 1.2921879962402267d);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.999999999999998d, 2.1036763924831257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996d + "'", double2 == 9.999999999999996d);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0176055895227847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0087643875171173d + "'", double1 == 1.0087643875171173d);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.952027174244469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960476769076153d + "'", double1 == 0.960476769076153d);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5406452814972723d + "'", double1 == 0.5406452814972723d);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17634393932348133d + "'", double1 == 0.17634393932348133d);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-5156.620156177409d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2906564430950338E20d, 0.011811386517645064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645397928556647d + "'", double1 == 0.9645397928556647d);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.012209562553744129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3175766709741277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.134890207766664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.926772007304508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.06516780684692637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06313235186379443d + "'", double1 == 0.06313235186379443d);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.189396403106622E14d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        float float2 = org.apache.commons.math.util.FastMath.min((-33.0f), (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8495476049206573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8495476049206573d + "'", double1 == 0.8495476049206573d);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.334254164290209E-203d), (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.3342541642902094E-203d) + "'", double2 == (-4.3342541642902094E-203d));
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        double double1 = org.apache.commons.math.util.FastMath.log(16.087617698774597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7780498890586274d + "'", double1 == 2.7780498890586274d);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        double double1 = org.apache.commons.math.util.FastMath.log(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.242924991852436d + "'", double1 == 1.242924991852436d);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        int int2 = org.apache.commons.math.util.FastMath.max(9, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3683334104437261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35291321775550033d + "'", double1 == 0.35291321775550033d);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09124532328745265d) + "'", double1 == (-0.09124532328745265d));
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.21517385352860152d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 108L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.0d + "'", double1 == 108.0d);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.01022852700990079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010176393528485206d) + "'", double1 == (-0.010176393528485206d));
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0683060003022046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997668052055587d + "'", double1 == 0.997668052055587d);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.053671212772351E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.053671212772351E-8d + "'", double1 == 1.053671212772351E-8d);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4078492487008538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4320765512755453d + "'", double1 == 0.4320765512755453d);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6563678204210392d, 1.1016289084929767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6563678204210394d + "'", double2 == 0.6563678204210394d);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8813796553363304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949623212218715d + "'", double1 == 0.7949623212218715d);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.208592005262939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.099359816103417d + "'", double1 == 1.099359816103417d);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1854652182422676d, 0.014438678988775109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1854652182422674d + "'", double2 == 1.1854652182422674d);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.005402970483247057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2673674050312176d) + "'", double1 == (-2.2673674050312176d));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        int int2 = org.apache.commons.math.util.FastMath.max(108, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.079986049317652E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998602436399E-5d + "'", double1 == 9.07998602436399E-5d);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.011871350870521892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011871072036275292d + "'", double1 == 0.011871072036275292d);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9403224593445607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6094981059306717d) + "'", double1 == (-0.6094981059306717d));
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.0052823489951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018219144375279217d + "'", double1 == 0.018219144375279217d);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.434519033732938d) + "'", double1 == (-0.434519033732938d));
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9979202349577406d, 1.3801753953415168E-182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9979202349577405d + "'", double2 == 0.9979202349577405d);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3555350356334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9374603813901875d + "'", double1 == 0.9374603813901875d);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(114.09415978466134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.850142197051865d + "'", double1 == 4.850142197051865d);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8347789329832497d, 0.648418694578667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9103907546988218d + "'", double2 == 0.9103907546988218d);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.192465179596234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1040455147470324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10385869980070621d + "'", double1 == 0.10385869980070621d);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.06778350904650679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0678354273703599d) + "'", double1 == (-0.0678354273703599d));
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3923239496630908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.179967774840945d + "'", double1 == 1.179967774840945d);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3808196560341965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32267727649642797d + "'", double1 == 0.32267727649642797d);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        long long1 = org.apache.commons.math.util.FastMath.round(0.44714617074826196d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6517148788876671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.795044807102277d + "'", double1 == 0.795044807102277d);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.25876123621075164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26478028937108844d + "'", double1 == 0.26478028937108844d);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.195756838919679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.306058977981987d + "'", double1 == 2.306058977981987d);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        double double1 = org.apache.commons.math.util.FastMath.log10((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.42235061818001024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4223506181800102d) + "'", double1 == (-0.4223506181800102d));
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.103676392483125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036716079445307026d + "'", double1 == 0.036716079445307026d);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8021405098245961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2303098228266975d + "'", double1 == 2.2303098228266975d);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-34L), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.470817953541134d) + "'", double1 == (-6.470817953541134d));
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.009213398835148424d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        double double1 = org.apache.commons.math.util.FastMath.floor(18.746619681958038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011640508788560195d + "'", double1 == 0.0011640508788560195d);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 6013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.765921910638158E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7659219106381588E-8d + "'", double1 == 2.7659219106381588E-8d);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.009616414459745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0096164144597455d + "'", double1 == 2.0096164144597455d);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.176177375677374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8661792571949215d + "'", double1 == 0.8661792571949215d);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        int int2 = org.apache.commons.math.util.FastMath.min(71, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-90) + "'", int2 == (-90));
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1653657392500323E-156d, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999993d + "'", double2 == 0.9999999999999993d);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.002774503742748542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 6013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.394826244685065d + "'", double1 == 9.394826244685065d);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.14254654307427778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7138300842826875d + "'", double1 == 1.7138300842826875d);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263292353d + "'", double1 == 1.5707963263292353d);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5404195002705843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.517068911969225d + "'", double1 == 0.517068911969225d);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4241182307716767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        float float2 = org.apache.commons.math.util.FastMath.min(9.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.69482111198402d, 1.202018531799359d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6948211119840201d + "'", double2 == 0.6948211119840201d);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7307284381561119d + "'", double1 == 0.7307284381561119d);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.202018531799359d, (-24.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.091550362467711d + "'", double2 == 3.091550362467711d);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7820737517313737d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45745637603981637d + "'", double1 == 0.45745637603981637d);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07127715650414634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07115669502320308d) + "'", double1 == (-0.07115669502320308d));
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7951386301113976d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1820039699637546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1410662984640167d + "'", double1 == 1.1410662984640167d);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        long long2 = org.apache.commons.math.util.FastMath.max(17L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }
}

