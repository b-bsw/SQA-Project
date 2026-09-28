package org.apache.commons.math.util;

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
        long long1 = org.apache.commons.math.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.017453528711286092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454414856913306d + "'", double1 == 0.017454414856913306d);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.001164728649041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2077341857639758d, 0.021278590635779134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021278590635779134d + "'", double2 == 0.021278590635779134d);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.959249046208901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3502411805356305E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.350250296373916E-5d) + "'", double1 == (-1.350250296373916E-5d));
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.079985949503008E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269352768d + "'", double1 == 1.5707055269352768d);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0398853009457363d) + "'", double1 == (-1.0398853009457363d));
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.015106579549212285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0152212606741864d + "'", double1 == 1.0152212606741864d);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-90L) + "'", long2 == (-90L));
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.018168583893839d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-90), (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5901022898226085d + "'", double1 == 6.5901022898226085d);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-5.227971924677802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.1307589219114205E-4d), (-0.6098494453571868d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6098494453571868d) + "'", double2 == (-0.6098494453571868d));
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6215302002977275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9716189987139436d) + "'", double1 == (-0.9716189987139436d));
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        double double2 = org.apache.commons.math.util.FastMath.max(0.05663520630914342d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082315d + "'", double2 == 1.5607966601082315d);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        long long2 = org.apache.commons.math.util.FastMath.min(34L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1098842226362917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10425570595294073d + "'", double1 == 0.10425570595294073d);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        long long2 = org.apache.commons.math.util.FastMath.max(37L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2523536496331222d, (-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.962203839343922d + "'", double2 == 3.962203839343922d);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.102293192940162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8340177271426653d + "'", double1 == 0.8340177271426653d);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        double double1 = org.apache.commons.math.util.FastMath.log(2.5804973451249884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9479821497841773d + "'", double1 == 0.9479821497841773d);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9906804649613175d, 1.9615319455195346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9615319455195346d + "'", double2 == 1.9615319455195346d);
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9111302618846769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9694531447943181d) + "'", double1 == (-0.9694531447943181d));
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (-33L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0053823416929744E-87d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2097152.0d, 1.2352049125074824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2097151.9999999998d + "'", double2 == 2097151.9999999998d);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.07365470632758757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07352180207555892d + "'", double1 == 0.07352180207555892d);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5384971956767416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2697583504133625d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.354638711533299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37029424927264715d + "'", double1 == 0.37029424927264715d);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1525354798260945d, (-0.4961516657893783d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1525354798260945d + "'", double2 == 1.1525354798260945d);
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04744297020583402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04747861379422898d + "'", double1 == 0.04747861379422898d);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        double double1 = org.apache.commons.math.util.FastMath.atan(51.99471985749452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515659755035023d + "'", double1 == 1.5515659755035023d);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-33), 11014L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11014L + "'", long2 == 11014L);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.011669273072701132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        double double1 = org.apache.commons.math.util.FastMath.signum((-56.72239180482502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7433261306201424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201426d + "'", double1 == 1.7433261306201426d);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.548781462475701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0625345798933474d + "'", double1 == 1.0625345798933474d);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6896428168918044d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1998.6364724075595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1998.6364724075593d) + "'", double1 == (-1998.6364724075593d));
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7820737517313737d) + "'", double1 == (-0.7820737517313737d));
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1003.824730229931d, (-0.061208797058628805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1003.8247302299309d + "'", double2 == 1003.8247302299309d);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        long long2 = org.apache.commons.math.util.FastMath.min(11014L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5805651145852762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5520883433674829d) + "'", double1 == (-0.5520883433674829d));
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.581866402923032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.017455065036229584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455065036229588d + "'", double1 == 0.017455065036229588d);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.027079934834453794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16455982144634757d + "'", double1 == 0.16455982144634757d);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.008491519610769879d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4865282353496856d) + "'", double1 == (-0.4865282353496856d));
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7006231354388308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0392324049825148d + "'", double1 == 1.0392324049825148d);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6046661120266558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6046661120266558d + "'", double1 == 0.6046661120266558d);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4960691053839213d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4960691053839213d) + "'", double2 == (-0.4960691053839213d));
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0681780852520792E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1552397460307036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06267212238698011d + "'", double1 == 0.06267212238698011d);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.079985974456667E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04494641518824685d + "'", double1 == 0.04494641518824685d);
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5009408451299502d, 1.0133237292727024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0133237292727024d + "'", double2 == 1.0133237292727024d);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.21930323887902778d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        int int1 = org.apache.commons.math.util.FastMath.abs(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.017453292519943424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017606491205851706d + "'", double1 == 0.017606491205851706d);
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6033871039701522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.7762080189137147E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7762080095740727E-4d) + "'", double1 == (-1.7762080095740727E-4d));
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6033871039701522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8450167959828723d + "'", double1 == 0.8450167959828723d);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.818989403547511E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.129071417624954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019706013727715386d + "'", double1 == 0.019706013727715386d);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9526653195309732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.9075758706536994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3202601476609297d + "'", double1 == 1.3202601476609297d);
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999103740052037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5571007519706128d) + "'", double1 == (-1.5571007519706128d));
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5280998217363506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        double double1 = org.apache.commons.math.util.FastMath.log(5.360130725463979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6789883638644025d + "'", double1 == 1.6789883638644025d);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6632349739413137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5805122465509817d + "'", double1 == 0.5805122465509817d);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2355885565015715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3329722006465774d + "'", double1 == 1.3329722006465774d);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7964493619549832d + "'", double1 == 0.7964493619549832d);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.145168389493613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.02627284444545242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.297282285720732d + "'", double1 == 0.297282285720732d);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2091797289097923d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7511679260882128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7308922663337033d + "'", double1 == 0.7308922663337033d);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7316602644632267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5188904424621902d) + "'", double1 == (-0.5188904424621902d));
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7219067166708867d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4299012280529384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8878506096345549d + "'", double1 == 0.8878506096345549d);
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.0d, 2.674083105727976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9999999999999996d + "'", double2 == 2.9999999999999996d);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8034325040154596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.0924287889629486d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09256090192802896d) + "'", double1 == (-0.09256090192802896d));
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7771211630872612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6807178123186235d + "'", double1 == 0.6807178123186235d);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        double double1 = org.apache.commons.math.util.FastMath.log1p(28.476411659486956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3835903387282156d + "'", double1 == 3.3835903387282156d);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.477888730288475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2464254229788256d + "'", double1 == 1.2464254229788256d);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.000000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078982d + "'", double1 == 0.8414709848078982d);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        double double1 = org.apache.commons.math.util.FastMath.exp((-5.573787011106193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037960773903277668d + "'", double1 == 0.0037960773903277668d);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 90L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.3273845772164694d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(63.11868704625112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3616.434376157249d + "'", double1 == 3616.434376157249d);
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8766799477951029d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5443731278415634d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9179181668776548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3076068662567917d + "'", double1 == 1.3076068662567917d);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.718295053847029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6487252814968991d + "'", double1 == 1.6487252814968991d);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.0321124266229886d), 1.1195215262618592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.032112426622988d) + "'", double2 == (-3.032112426622988d));
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5280998217363506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8932137554742252d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6269114619385457d + "'", double1 == 0.6269114619385457d);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7791612621104443d), (-0.012209562535656249d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.827444419368824E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.827444419368825E-10d + "'", double1 == 4.827444419368825E-10d);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2836621854632254d + "'", double1 == 0.2836621854632254d);
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        double double1 = org.apache.commons.math.util.FastMath.rint(72.52016602115306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.0d + "'", double1 == 73.0d);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3202601476609297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7443953462584165d + "'", double1 == 2.7443953462584165d);
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.2432260666726136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.788595248474207d + "'", double1 == 12.788595248474207d);
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9833476282002843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8323574178672647d + "'", double1 == 0.8323574178672647d);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        int int2 = org.apache.commons.math.util.FastMath.min(108, 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5918212578224735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5245506190419055d) + "'", double1 == (-0.5245506190419055d));
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248164d + "'", double1 == 1.3169578969248164d);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4556943022324125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.28745922495566d + "'", double1 == 4.28745922495566d);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9310815951878996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.394127193677877d + "'", double1 == 0.394127193677877d);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 7L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.022634307143927467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02263430714392747d + "'", double1 == 0.02263430714392747d);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8840556524639369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7084452722420731d + "'", double1 == 0.7084452722420731d);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 90);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.549516130084085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.984953198796575d + "'", double1 == 46.984953198796575d);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8160375106818367E7d + "'", double1 == 2.8160375106818367E7d);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.1749143444037795d), 1.7795906493412312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.174914344403779d) + "'", double2 == (-5.174914344403779d));
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23891208871475472d + "'", double1 == 0.23891208871475472d);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.07139823206237136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0689089720128332d) + "'", double1 == (-0.0689089720128332d));
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0142079431235729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.19724455153345d) + "'", double1 == (-1.19724455153345d));
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        double double1 = org.apache.commons.math.util.FastMath.exp(3332504.6983135534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        double double1 = org.apache.commons.math.util.FastMath.abs(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0281149846033601d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.39962445873177277d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41110713357077927d) + "'", double1 == (-0.41110713357077927d));
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2646955500554791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25876123621075164d + "'", double1 == 0.25876123621075164d);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.22820026671210777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22622481544472944d + "'", double1 == 0.22622481544472944d);
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7237305723485223d, 2083.76558392283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4615926968669573E-293d + "'", double2 == 2.4615926968669573E-293d);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.900735886184545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 133.38863804832198d + "'", double1 == 133.38863804832198d);
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.918131392275503d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6329856393072076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8832248240979842d + "'", double1 == 0.8832248240979842d);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7651502649370375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1493173174225013d + "'", double1 == 1.1493173174225013d);
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0656328345305126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06563283453051261d + "'", double1 == 0.06563283453051261d);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-33.71296437329639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.211249532128624d) + "'", double1 == (-4.211249532128624d));
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8550196364002437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.899352280489793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6415129230457017d + "'", double1 == 0.6415129230457017d);
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1589375003169518d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6692896481323396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6692896481323397d + "'", double1 == 0.6692896481323397d);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        double double2 = org.apache.commons.math.util.FastMath.min(46.81563844808717d, 3.9265347913128554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9265347913128554d + "'", double2 == 3.9265347913128554d);
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1718029187786896d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.551565975503502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9982900983985065d + "'", double1 == 0.9982900983985065d);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.829869827932433d, 1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6432168093568079d + "'", double2 == 0.6432168093568079d);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7637144409979837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.763714440997984d + "'", double1 == 1.763714440997984d);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0994172039830736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-323.00518534745174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.6375039853275775d) + "'", double1 == (-5.6375039853275775d));
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.017452406437283508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017451520489571555d) + "'", double1 == (-0.017451520489571555d));
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.38894538189191646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8143989712440974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7595880598482629d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4726612473342131E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.6963299593906205d), 40.01433581332975d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6963299593906203d) + "'", double2 == (-1.6963299593906203d));
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0964562107599607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.651112110129269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 94.6017554133467d + "'", double1 == 94.6017554133467d);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1648615463474224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16560936626723188d + "'", double1 == 0.16560936626723188d);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.49304209749558525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6372894457236022d + "'", double1 == 1.6372894457236022d);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-88.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.170516276532822d) + "'", double1 == (-5.170516276532822d));
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5278888682247538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.7351515234962698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.720723359053762d, 1.7467135528742425E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.7645662682374061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3331020656002197d) + "'", double1 == (-1.3331020656002197d));
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.06568301763189695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6365266652768211d + "'", double1 == 1.6365266652768211d);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.390204694268467E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.390204694268468E11d + "'", double1 == 6.390204694268468E11d);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.142599163434008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1349059180212415d + "'", double1 == 3.1349059180212415d);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8134592121885016d, 0.7038211969154579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2005820037610595d + "'", double2 == 1.2005820037610595d);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9132181497465548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4467806282467621d + "'", double1 == 1.4467806282467621d);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3212259960962827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7406028079520919d + "'", double1 == 1.7406028079520919d);
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.414477459402565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 610.6216028616939d + "'", double1 == 610.6216028616939d);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000085819143139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718305156620878d + "'", double1 == 1.718305156620878d);
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2334031175112166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8435636080687685d + "'", double1 == 0.8435636080687685d);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1018538754645497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04212400351101203d + "'", double1 == 0.04212400351101203d);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.56340880499775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4922458983356286d + "'", double1 == 2.4922458983356286d);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.013787719250806334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01378684562990205d + "'", double1 == 0.01378684562990205d);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.19724455153345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3649245612979685d + "'", double1 == 0.3649245612979685d);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4908919308538355E-81d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4908919308538355E-81d + "'", double1 == 1.4908919308538355E-81d);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5362901735522732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6088496173769596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.838315415809956d + "'", double1 == 1.838315415809956d);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9310815951878996d), 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1650012094878277d) + "'", double1 == (-1.1650012094878277d));
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.012283379416347176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012283070548383727d + "'", double1 == 0.012283070548383727d);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3329722006465774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3329722006465776d + "'", double1 == 1.3329722006465776d);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4320632796393198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3591162572543806d + "'", double1 == 0.3591162572543806d);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3940358404305488d, 1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7683757985702275d + "'", double2 == 1.7683757985702275d);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.1718029187786896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8248492834599012d) + "'", double1 == (-0.8248492834599012d));
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.045149707144593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8663783583972496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9307944769911614d + "'", double1 == 0.9307944769911614d);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.37242622246109275d, 0.06406001577433591d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9386870615337011d + "'", double2 == 0.9386870615337011d);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1748086632901192E-91d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.002309551127695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8435567492887723d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0054176192810886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1040455147470324d + "'", double1 == 0.1040455147470324d);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 11014L, 1.1022931929401623d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11014.0d + "'", double2 == 11014.0d);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7645662682374061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.208405400842924d + "'", double1 == 1.208405400842924d);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.07963789922157d + "'", double1 == 40.07963789922157d);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5788404741295278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535124586897125d + "'", double1 == 0.6535124586897125d);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0874684814275741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8272753678010331d + "'", double1 == 0.8272753678010331d);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8561916828402603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.694290324463072d + "'", double1 == 0.694290324463072d);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14353826050381374d) + "'", double1 == (-0.14353826050381374d));
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.037480427855015416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03746288709529651d) + "'", double1 == (-0.03746288709529651d));
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.729869874255455d) + "'", double1 == (-8.729869874255455d));
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0973039206233832d, 1.3211090992020038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1305148602552713d + "'", double2 == 1.1305148602552713d);
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5571007519706128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2107461918092115d + "'", double1 == 0.2107461918092115d);
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        double double1 = org.apache.commons.math.util.FastMath.atan(77.54353615872827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5579010602179555d + "'", double1 == 1.5579010602179555d);
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9756299818288702d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5520883433674829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8031592610293485d) + "'", double1 == (-0.8031592610293485d));
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.56340880499775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7185746547661834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7820302396610385d + "'", double1 == 0.7820302396610385d);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5113217269764148d), (-32.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5113217269764148d) + "'", double2 == (-0.5113217269764148d));
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        double double1 = org.apache.commons.math.util.FastMath.cos((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.921844042868401d) + "'", double1 == (-0.921844042868401d));
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6935247302816968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8285569054478337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6035270795055018d + "'", double1 == 0.6035270795055018d);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0054029704834161855d, (-88.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005402970483416185d + "'", double2 == 0.005402970483416185d);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        long long1 = org.apache.commons.math.util.FastMath.round(0.001164050878855877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.19078739776044754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19315418360439146d + "'", double1 == 0.19315418360439146d);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        float float2 = org.apache.commons.math.util.FastMath.min(34.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 90);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2979L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.010973228372790073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010973228372790075d + "'", double1 == 0.010973228372790075d);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.48557554205341846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6682015101903132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8014654691351221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09611518433557324d) + "'", double1 == (-0.09611518433557324d));
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.055410749812933396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05535410922055579d + "'", double1 == 0.05535410922055579d);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.102016471589204E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.005656731589213858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6255462598880301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7317887661991493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31226337743157023d) + "'", double1 == (-0.31226337743157023d));
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.022634307143927467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2979L, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017733418E-13d + "'", double1 == 9.094947017733418E-13d);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.662464632826401d + "'", double1 == 1.662464632826401d);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.12454753567443298d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12422578659026082d) + "'", double1 == (-0.12422578659026082d));
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999997649972645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403025036161081d + "'", double1 == 0.5403025036161081d);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.2028882366758453d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999982955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246490634d) + "'", double1 == (-1.5574077246490634d));
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9966529754586305d) + "'", double1 == (-0.9966529754586305d));
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.666408003094785d, 0.005656701421335315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0073763289064377d + "'", double2 == 1.0073763289064377d);
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.8427842873511956E202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.98366774371544d, (-0.01327713727966558d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0002186598203338d + "'", double2 == 1.0002186598203338d);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7431447610156813d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8163415799735056d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-46.772927173523236d) + "'", double1 == (-46.772927173523236d));
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09687988476337266d + "'", double1 == 0.09687988476337266d);
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.42581659714188025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4025621091978446d + "'", double1 == 0.4025621091978446d);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6204290412244261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5813842944587513d + "'", double1 == 0.5813842944587513d);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        double double1 = org.apache.commons.math.util.FastMath.abs(104.9439513269027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.9439513269027d + "'", double1 == 104.9439513269027d);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.019016309312897422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        double double2 = org.apache.commons.math.util.FastMath.pow(51.99999999999999d, (-0.9999492312032946d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019234627307895876d + "'", double2 == 0.019234627307895876d);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.4710393075566005E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.851928732545787d + "'", double1 == 19.851928732545787d);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.6881171418160975E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816098E43d + "'", double1 == 2.688117141816098E43d);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.7645662682374061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4058194382235059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.405819438223506d + "'", double1 == 1.405819438223506d);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4204038234137333E-166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4204038234137333E-166d + "'", double1 == 1.4204038234137333E-166d);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2979L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0092021272751517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7899781221824803d + "'", double1 == 0.7899781221824803d);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8272753678010331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1794413306714115d + "'", double1 == 1.1794413306714115d);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8241707059519972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9687363354669343d + "'", double1 == 0.9687363354669343d);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.760032670961511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999507776568d + "'", double1 == 0.9999999507776568d);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.47100149383084566d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4551255597896954d) + "'", double1 == (-0.4551255597896954d));
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.78302841225571E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.7830284123E10d + "'", double1 == 6.7830284123E10d);
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2602577590774198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0539849882470707d + "'", double1 == 1.0539849882470707d);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6390573296152584d, 0.4048061113733491d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.639057329615258d + "'", double2 == 2.639057329615258d);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4658506161222316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3258176636680326d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.005656852264782563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005656882435074592d + "'", double1 == 0.005656882435074592d);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0378042825874918d, 1.4710352225598886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.056103318098615d + "'", double2 == 1.056103318098615d);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        double double2 = org.apache.commons.math.util.FastMath.max((-466.4266135928925d), 34.237502387897734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.237502387897734d + "'", double2 == 34.237502387897734d);
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-33.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1016359.0d, 1.0000135327670998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1016358.9999999999d + "'", double2 == 1016358.9999999999d);
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4961516657893783d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4961516657893783d + "'", double1 == 0.4961516657893783d);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        double double1 = org.apache.commons.math.util.FastMath.asinh(32.843508051844005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.185132962746575d + "'", double1 == 4.185132962746575d);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.015515027990856209d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1794413306714115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5904534978892476d + "'", double1 == 0.5904534978892476d);
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2763452613426045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.000000000000002d + "'", double1 == 9.000000000000002d);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.08983120649906655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09007362435487686d + "'", double1 == 0.09007362435487686d);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.16560936626723188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.488717734948612d + "'", double1 == 9.488717734948612d);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4958174067642112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4588214153419555d) + "'", double1 == (-0.4588214153419555d));
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 7.0f, 44.61433989587707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.052324103888102E37d + "'", double2 == 5.052324103888102E37d);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 802L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9685252333342943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        double double1 = org.apache.commons.math.util.FastMath.log10((-135.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6178002687535424d, 0.44830029897233037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3004743096381028d + "'", double2 == 1.3004743096381028d);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09687988476337266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.601988246761649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6019882467616493d + "'", double1 == 2.6019882467616493d);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.4710393075566005E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9709549460406505E7d + "'", double1 == 4.9709549460406505E7d);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.23669574761529574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 108L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        double double1 = org.apache.commons.math.util.FastMath.acos(11.74703167794491d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        long long2 = org.apache.commons.math.util.FastMath.min((-33L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33L) + "'", long2 == (-33L));
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        double double1 = org.apache.commons.math.util.FastMath.asinh(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        float float1 = org.apache.commons.math.util.FastMath.abs(37.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 37.0f + "'", float1 == 37.0f);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.416897404767d + "'", double1 == 384.416897404767d);
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0092021272751517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8464072179531003d + "'", double1 == 0.8464072179531003d);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.3423042232497897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9772537590358271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9885614594125279d + "'", double1 == 0.9885614594125279d);
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.25488428787741324d, 2.855146420814098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2548842878774133d + "'", double2 == 0.2548842878774133d);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8477647080717694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        double double1 = org.apache.commons.math.util.FastMath.log(45.39364429304659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.815372101702062d + "'", double1 == 3.815372101702062d);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        long long1 = org.apache.commons.math.util.FastMath.abs(29L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4352296559186861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908249037020886d + "'", double1 == 0.9908249037020886d);
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5380434050958847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7126526144249963d + "'", double1 == 1.7126526144249963d);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        int int2 = org.apache.commons.math.util.FastMath.min(37, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7893184915864662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7098734309871929d) + "'", double1 == (-0.7098734309871929d));
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.267909733656017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, (float) 802L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.017852771405714795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017854668455550615d + "'", double1 == 0.017854668455550615d);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.4867844010000003E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266944.0602401732d + "'", double1 == 3266944.0602401732d);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2926117730048923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4343845205023977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02503473262240695d + "'", double1 == 0.02503473262240695d);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6632349739413136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4106259414168295d) + "'", double1 == (-0.4106259414168295d));
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        double double1 = org.apache.commons.math.util.FastMath.ceil(72.52016602115306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.0d + "'", double1 == 73.0d);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.004063539835111013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004063517469127154d + "'", double1 == 0.004063517469127154d);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3605018649890197E-20d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440211108893683d + "'", double1 == 0.5440211108893683d);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.20262627828929064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5873521856970938d) + "'", double1 == (-0.5873521856970938d));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.009446037147747973d, (-0.7456241416655579d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.33722455228312d + "'", double2 == 32.33722455228312d);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.3273845772164694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1992394507428932d, (-0.6935247302816968d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8816105979527297d + "'", double2 == 0.8816105979527297d);
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.715442569744188d + "'", double1 == 0.715442569744188d);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.473814720414451d, (-0.6919820465465093d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6767683198527974d + "'", double2 == 1.6767683198527974d);
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.852615231192999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5498264316201034d + "'", double1 == 0.5498264316201034d);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7277869932110255d, (-4.211249532128624d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.211249532128624d) + "'", double2 == (-4.211249532128624d));
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2230306629577952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2230306629577954d + "'", double1 == 1.2230306629577954d);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4204193151348753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4081432892132331d + "'", double1 == 0.4081432892132331d);
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.666408003094785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.666408003094785d + "'", double1 == 3.666408003094785d);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1062.1024200991178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01012531265250826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7672004358010963E-4d) + "'", double1 == (-1.7672004358010963E-4d));
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.06572723870683374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9363862393833727d + "'", double1 == 0.9363862393833727d);
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-90));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        double double1 = org.apache.commons.math.util.FastMath.signum((-179.76717759904133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.385765023619431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.109388427655633d + "'", double1 == 2.109388427655633d);
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2017803571211352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.962203839343922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.681774213978926d) + "'", double1 == (-0.681774213978926d));
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4453238447142773d, 6012.84549645786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4453238447142776d + "'", double2 == 1.4453238447142776d);
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        double double2 = org.apache.commons.math.util.FastMath.max(0.022630443056965113d, 1.0113012745810993E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0113012745810993E24d + "'", double2 == 1.0113012745810993E24d);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.857180126010562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7709242776556768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.770924277655677d + "'", double1 == 0.770924277655677d);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        long long2 = org.apache.commons.math.util.FastMath.max(34L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.83569384937053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.14961820688242d + "'", double1 == 171.14961820688242d);
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        double double2 = org.apache.commons.math.util.FastMath.min(0.02626982285800363d, 1.2273817004129048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02626982285800363d + "'", double2 == 0.02626982285800363d);
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9930827464263656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8317095147254143d) + "'", double1 == (-2.8317095147254143d));
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.009528896059822961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1617078113618549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1755167185076145d + "'", double1 == 1.1755167185076145d);
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.962203839343922d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5429791986523687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.8157584261849007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03169096295775694d + "'", double1 == 0.03169096295775694d);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1415888340962679d) + "'", double1 == (-0.1415888340962679d));
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7850452143345826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        double double1 = org.apache.commons.math.util.FastMath.atan(19.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5182132651839548d + "'", double1 == 1.5182132651839548d);
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.5216140716751916d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(229.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.00000000000003d + "'", double1 == 229.00000000000003d);
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4173029002651345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8890349204664698d + "'", double1 == 0.8890349204664698d);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.011983210854855573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011982924064042687d + "'", double1 == 0.011982924064042687d);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4110955828127631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7659218723865387E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.13018704579946147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1309275654913041d + "'", double1 == 0.1309275654913041d);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9974718549539727d, 4.410959116828621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.410959116828621d + "'", double2 == 4.410959116828621d);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8476439862408351d + "'", double1 == 0.8476439862408351d);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.034594658672037475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.37695480406821247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3604833687127776d + "'", double1 == 0.3604833687127776d);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.103465364555801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5078344024735725d) + "'", double1 == (-0.5078344024735725d));
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7578112213568773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.986075506374595d + "'", double1 == 2.986075506374595d);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4689648070083365d + "'", double1 == 0.4689648070083365d);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0530637390494226d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.602036160225165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 34, (long) 5507);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5507L + "'", long2 == 5507L);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        long long2 = org.apache.commons.math.util.FastMath.min(108L, 802L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2930202336512058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1371104755700765d + "'", double1 == 1.1371104755700765d);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4867844010000003E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.898288562430334d) + "'", double1 == (-15.898288562430334d));
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3425054583783953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20366052482356314d + "'", double1 == 0.20366052482356314d);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5708004490110032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171529904029506d + "'", double1 == 0.9171529904029506d);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        double double1 = org.apache.commons.math.util.FastMath.log10(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 33, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.14353826050381374d), 1.5847577751512122E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14353826050381374d) + "'", double2 == (-0.14353826050381374d));
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8720836498654725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8720836498654726d + "'", double1 == 0.8720836498654726d);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.367810338251987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8708690291361337d + "'", double1 == 0.8708690291361337d);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1938123060184203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8013500856779887d + "'", double1 == 1.8013500856779887d);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.015626271689943825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.548742334243514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9878500592531264d + "'", double1 == 0.9878500592531264d);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        int int2 = org.apache.commons.math.util.FastMath.max(37, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3877864478353665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006768150309340383d) + "'", double1 == (-0.006768150309340383d));
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        double double2 = org.apache.commons.math.util.FastMath.pow(Double.NaN, (-1.0398853009457363d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.30557148829374003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005333228570945073d + "'", double1 == 0.005333228570945073d);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1301077462402083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0084759594740231d + "'", double1 == 1.0084759594740231d);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.267884728309447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000009d + "'", double1 == 97.00000000000009d);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.865562166738968E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9027759974305378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2793876643743006d + "'", double1 == 0.2793876643743006d);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.3835903387282156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.970861181982808d) + "'", double1 == (-0.970861181982808d));
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5760630454288633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0275630390369639d + "'", double1 == 1.0275630390369639d);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2966288756752378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.656947838781734d + "'", double1 == 2.656947838781734d);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        double double1 = org.apache.commons.math.util.FastMath.cos((-36.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962740468d) + "'", double1 == (-0.12796368962740468d));
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9185957173539763d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9179181668776548d, 0.42001722271167297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.141660177050161d + "'", double2 == 1.141660177050161d);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5709739450023905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301744614394251d + "'", double1 == 2.301744614394251d);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4081432892132331d, 2.4855874989531728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16275156943342878d + "'", double2 == 0.16275156943342878d);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6178002687535424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5185139398778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5015733900925633d, (-0.8211080655056975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5015733900925633d + "'", double2 == 0.5015733900925633d);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000072050412114d, 0.9735760889955918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000070146551758d + "'", double2 == 1.0000070146551758d);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (-90L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4802725274474673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.08738234671223126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.4160533322721292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.181747322616968d + "'", double1 == 2.181747322616968d);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1970429949276125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1970429949276125d + "'", double1 == 1.1970429949276125d);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3710356884721411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36301029014320507d + "'", double1 == 0.36301029014320507d);
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1062.3927302649324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1063.0d + "'", double1 == 1063.0d);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7688894800973336d, 1016359.4424036132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7688894800973336d + "'", double2 == 0.7688894800973336d);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.21930323887902778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.19609258438980118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8219361327000118d + "'", double1 == 0.8219361327000118d);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7764076780850522d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7007210565838747d) + "'", double1 == (-0.7007210565838747d));
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.23891208871475472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6205060806506729d + "'", double1 == 0.6205060806506729d);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1596819083340262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.188918746291335d + "'", double1 == 3.188918746291335d);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.04323229440977d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7319013265055243d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8450167959828723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6884571549908809d + "'", double1 == 0.6884571549908809d);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.1893964031066216E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 108);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8833851034664961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4162279412718506d + "'", double1 == 1.4162279412718506d);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        double double1 = org.apache.commons.math.util.FastMath.asinh(34.026480513893276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2205020972807485d + "'", double1 == 4.2205020972807485d);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.986075506374595d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-5.573787011106193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.174914344403779d), (-0.5873521856970938d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202401830372638d + "'", double1 == 0.005202401830372638d);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8186563384972326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8186563384972326d + "'", double1 == 0.8186563384972326d);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.1474836470000002E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015625E-7d + "'", double1 == 2.384185791015625E-7d);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.390204694268467E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703125E-4d + "'", double1 == 1.220703125E-4d);
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.9447553921348883d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.491754101407853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060942605739583d + "'", double1 == 0.060942605739583d);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7620196544019282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7620196544019282d + "'", double1 == 0.7620196544019282d);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8089563172728977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6801783019998603d + "'", double1 == 0.6801783019998603d);
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.43349402349577826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1224298829604082d + "'", double1 == 1.1224298829604082d);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.364828051779159E-23d, 1.265653458137023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.658569792660318E-23d + "'", double2 == 2.658569792660318E-23d);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-323.00518534745174d), 0.8495476049206573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5681661967396565d) + "'", double2 == (-1.5681661967396565d));
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.02627284444545242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.27492709475956467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035442021E-12d + "'", double1 == 1.8189894035442021E-12d);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        double double2 = org.apache.commons.math.util.FastMath.max(0.035592047388576235d, 0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7825372599825183d + "'", double2 == 0.7825372599825183d);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5604132228496979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44495067262734006d + "'", double1 == 0.44495067262734006d);
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        int int2 = org.apache.commons.math.util.FastMath.min((-33), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.4179477298040799d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3683334104437261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3604756670132249d + "'", double1 == 0.3604756670132249d);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 32.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        double double1 = org.apache.commons.math.util.FastMath.cosh(229.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4203859252448367E99d + "'", double1 == 1.4203859252448367E99d);
    }
}

