package org.apache.commons.math.util;

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
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.48653408229724276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008491621659255943d) + "'", double1 == (-0.008491621659255943d));
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6035270795055018d + "'", double1 == 0.6035270795055018d);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-140.2793696225354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.195945676325781d) + "'", double1 == (-5.195945676325781d));
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        double double1 = org.apache.commons.math.util.FastMath.acos((-28.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.017453292519943424d, 0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07031263443540531d + "'", double2 == 0.07031263443540531d);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-90));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 90L + "'", long1 == 90L);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 10, 0.6372778494888827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6372778494888827d + "'", double2 == 0.6372778494888827d);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        long long1 = org.apache.commons.math.util.FastMath.round(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        int int1 = org.apache.commons.math.util.FastMath.round(33.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-32.26764987613585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        double double1 = org.apache.commons.math.util.FastMath.atan((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.407075111026485d) + "'", double1 == (-1.407075111026485d));
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        float float1 = org.apache.commons.math.util.FastMath.abs((-33.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8922451992629652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6377640601517165d + "'", double1 == 0.6377640601517165d);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7336545584598283d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(45.057704222641604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.82989504995974d + "'", double1 == 3.82989504995974d);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943298d + "'", double1 == 1.7453292519943298d);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3845369719462828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double double1 = org.apache.commons.math.util.FastMath.asin((-466.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6269791532528178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.724498129545357d + "'", double1 == 0.724498129545357d);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.57070552693625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3010710787424613d + "'", double1 == 2.3010710787424613d);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1589375003169518d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        float float2 = org.apache.commons.math.util.FastMath.min((-33.0f), 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9853647714477322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17129545733050197d + "'", double1 == 0.17129545733050197d);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        double double1 = org.apache.commons.math.util.FastMath.log(0.892256650791169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11400146268484936d) + "'", double1 == (-0.11400146268484936d));
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4855874989531728d + "'", double1 == 2.4855874989531728d);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7591415563789915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013249519647527564d + "'", double1 == 0.013249519647527564d);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9735760889955917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735760889955918d + "'", double1 == 0.9735760889955918d);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        double double1 = org.apache.commons.math.util.FastMath.tan((-87.94552649650909d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019070115239284053d + "'", double1 == 0.019070115239284053d);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5430089060047839d) + "'", double1 == (-0.5430089060047839d));
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.379830211523892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.1831180523293d + "'", double1 == 229.1831180523293d);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.615354633267934E7d + "'", double1 == 3.615354633267934E7d);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8065537826828391d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) (-90));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6865874069985795d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994185913465727d + "'", double1 == 0.994185913465727d);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.250318945146276d, 0.724498129545357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2503189451462755d + "'", double2 == 2.2503189451462755d);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.13371234504895402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5113565640720369d) + "'", double1 == (-0.5113565640720369d));
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 4L, 8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4312712619442752d + "'", double2 == 0.4312712619442752d);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        int int2 = org.apache.commons.math.util.FastMath.min(33, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5540437953657898d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6720656417424269d + "'", double1 == 0.6720656417424269d);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.48505801955099925d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        double double1 = org.apache.commons.math.util.FastMath.sin((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22789274007256666d + "'", double1 == 0.22789274007256666d);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        long long1 = org.apache.commons.math.util.FastMath.round(2.010458920780344d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6632456843634443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8720836498654725d + "'", double1 == 0.8720836498654725d);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.005202448765189584d, 3.5216140716751916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.064947506970082E-9d + "'", double2 == 9.064947506970082E-9d);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.0432322944097698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6476859432225454d) + "'", double1 == (-0.6476859432225454d));
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1574487915559275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.181805463686414d + "'", double1 == 3.181805463686414d);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double1 = org.apache.commons.math.util.FastMath.tan(11012.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.755849220440437d) + "'", double1 == (-6.755849220440437d));
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.367810338251987d, 31.98437118343895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.367810338251989d + "'", double2 == 8.367810338251989d);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4900403122965926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3632703054402189d + "'", double1 == 0.3632703054402189d);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8089563172728976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9001202542666182d + "'", double1 == 0.9001202542666182d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14254654307427778d) + "'", double1 == (-0.14254654307427778d));
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0530637390494226d, (-0.5884022289215687d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0530637390494226d + "'", double2 == 1.0530637390494226d);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3590146193143267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8238673184078138d + "'", double1 == 0.8238673184078138d);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8947805892373116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.267151353526884d + "'", double1 == 51.267151353526884d);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        float float1 = org.apache.commons.math.util.FastMath.abs(33.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 33.0f + "'", float1 == 33.0f);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206642d + "'", double1 == 1.2130532941206642d);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.5663706143591734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440211108893694d + "'", double1 == 0.5440211108893694d);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7038211969154579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4617111047443176d + "'", double1 == 1.4617111047443176d);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        long long2 = org.apache.commons.math.util.FastMath.max(90L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3022547416014814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022728632940653824d + "'", double1 == 0.022728632940653824d);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.244215505684302d + "'", double1 == 10.244215505684302d);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.918853748407957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2264970570905673d) + "'", double1 == (-0.2264970570905673d));
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6657737487535582d, 1.1992394507428932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6657737487535582d + "'", double2 == 0.6657737487535582d);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745417862959511d + "'", double1 == 0.01745417862959511d);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9836065573770493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8325008986719311d + "'", double1 == 0.8325008986719311d);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.012209562553744129d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-90L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.481404746557165d) + "'", double1 == (-4.481404746557165d));
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        float float2 = org.apache.commons.math.util.FastMath.min(33.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7456241416655578d) + "'", double1 == (-0.7456241416655578d));
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7434618395438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9406268191575922d + "'", double1 == 0.9406268191575922d);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999103740052037d) + "'", double1 == (-0.9999103740052037d));
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        double double2 = org.apache.commons.math.util.FastMath.min(2.025293885879535d, 0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019070115239284053d + "'", double2 == 0.019070115239284053d);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0948410127421968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.407075111026485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7551415795108877d) + "'", double1 == (-0.7551415795108877d));
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1471972199216043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891860359276023d + "'", double1 == 0.9891860359276023d);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.011871350870521892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 33.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1894250945222025d + "'", double1 == 4.1894250945222025d);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(96.99999999999999d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999997d + "'", double2 == 96.99999999999997d);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0321124266229886d) + "'", double1 == (-3.0321124266229886d));
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6852301231749561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.685230123174956d) + "'", double1 == (-0.685230123174956d));
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936026854386766d + "'", double1 == 1.9936026854386766d);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        float float2 = org.apache.commons.math.util.FastMath.max((-90.0f), 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202425297685839d + "'", double1 == 0.005202425297685839d);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.445323844714277d, 1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0488587876978275d + "'", double2 == 2.0488587876978275d);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7825372599825183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        double double1 = org.apache.commons.math.util.FastMath.signum((-31.17011361997944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5912749463979503d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-1.0f), 1.4343845205023977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6088194853164001d) + "'", double2 == (-0.6088194853164001d));
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.005402970483400531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000145960805298d + "'", double1 == 1.0000145960805298d);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        double double1 = org.apache.commons.math.util.FastMath.exp(11.940141468803505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 153298.37563315977d + "'", double1 == 153298.37563315977d);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.0d, 0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5664325882614676d + "'", double2 == 1.5664325882614676d);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-33.40828846862413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        int int1 = org.apache.commons.math.util.FastMath.round((-33.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33) + "'", int1 == (-33));
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double1 = org.apache.commons.math.util.FastMath.sin(37.574240039999225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.124547535674433d) + "'", double1 == (-0.124547535674433d));
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.970291913552122d, 0.9836065573770493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3279443230305752d + "'", double2 == 1.3279443230305752d);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1830110809448033d + "'", double1 == 2.1830110809448033d);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9330380764829064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8034325040154596d + "'", double1 == 0.8034325040154596d);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.441486971549388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4414869715493879d) + "'", double1 == (-1.4414869715493879d));
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.289917197127753d + "'", double1 == 27.289917197127753d);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7551415795108877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8558700593570223d) + "'", double1 == (-0.8558700593570223d));
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479614275509088d + "'", double1 == 1.2479614275509088d);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 33.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 33.0f + "'", float2 == 33.0f);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0054029967707723775d, 1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002774496623513146d + "'", double2 == 0.002774496623513146d);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.002774496623513146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002774503742748542d + "'", double1 == 0.002774503742748542d);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7853981613362947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391074366519d + "'", double1 == 0.9033391074366519d);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(15.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.959249046208901d + "'", double1 == 3.959249046208901d);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9388149908366094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7764153489348606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10990588764248074d) + "'", double1 == (-0.10990588764248074d));
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6476859432225454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7713020696518287d) + "'", double1 == (-0.7713020696518287d));
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6865874069985796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.999942448217206d), (-0.16298994513340984d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999424482172059d) + "'", double2 == (-0.9999424482172059d));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5435938534266416E16d + "'", double1 == 4.5435938534266416E16d);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.250318945146276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03927547481280819d + "'", double1 == 0.03927547481280819d);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9736862425967708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.158783182388476d + "'", double1 == 2.158783182388476d);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        double double1 = org.apache.commons.math.util.FastMath.asin(44.99809670330265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (-90.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7182819603591994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.991328918078117d + "'", double1 == 0.991328918078117d);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8655103306675354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5246280046224637d + "'", double1 == 0.5246280046224637d);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        double double2 = org.apache.commons.math.util.FastMath.max(1.433759246577862d, 9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306922469822426d + "'", double2 == 9.306922469822426d);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9866275920404864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-33), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49304209749558525d + "'", double1 == 0.49304209749558525d);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.656559119563622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5847577751518754E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        double double1 = org.apache.commons.math.util.FastMath.ceil(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2966288756752378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022630443056965113d + "'", double1 == 0.022630443056965113d);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8064012322901598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9380411276052492d + "'", double1 == 0.9380411276052492d);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.815758426184901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.265653458137023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.852615231192999d + "'", double1 == 0.852615231192999d);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5440211108893698d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-7.661153040102054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995292357123677d) + "'", double1 == (-0.9995292357123677d));
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.154092655271697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12873439758804212d) + "'", double1 == (-0.12873439758804212d));
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7811629682982569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6631489452679061d + "'", double1 == 0.6631489452679061d);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267909733656017d + "'", double1 == 2.267909733656017d);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5760630454288633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.835879646400315d + "'", double1 == 4.835879646400315d);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8482836399575129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07145890874357941d) + "'", double1 == (-0.07145890874357941d));
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.1223072818099046E-9d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6019895799783384d + "'", double1 == 1.6019895799783384d);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3408013099384417d + "'", double1 == 0.3408013099384417d);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.012209562553744129d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012209562553744127d) + "'", double1 == (-0.012209562553744127d));
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9738051722046778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016996106527921995d) + "'", double1 == (-0.016996106527921995d));
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        double double1 = org.apache.commons.math.util.FastMath.floor((-87.94552649650909d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-88.0d) + "'", double1 == (-88.0d));
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6801783019998602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.971346020966706d + "'", double1 == 38.971346020966706d);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8390715290764523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.2432260666726136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2717104239752093d + "'", double1 == 1.2717104239752093d);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.298342365610588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01745417862959511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2587612362107516d + "'", double1 == 1.2587612362107516d);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-466.4266135928925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8427842873511956E202d) + "'", double1 == (-1.8427842873511956E202d));
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.09698324645938282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09713535133803505d) + "'", double1 == (-0.09713535133803505d));
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.10955796484928035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10955796484928035d + "'", double1 == 0.10955796484928035d);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        long long1 = org.apache.commons.math.util.FastMath.round(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9647007265430613d, 1.7167268785408383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9647007265430613d + "'", double2 == 0.9647007265430613d);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5713088006770572d + "'", double1 == 1.5713088006770572d);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.4414869715493879d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9952004122082412d) + "'", double1 == (-1.9952004122082412d));
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3828979036148312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8683173535625466d + "'", double1 == 0.8683173535625466d);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0037960591563502375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003796077390327768d + "'", double1 == 0.003796077390327768d);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005402996770772377d + "'", double1 == 0.005402996770772377d);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3043045862358962d, (-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7451749797335945d + "'", double2 == 0.7451749797335945d);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5713088006770572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.124738597288386E-4d) + "'", double1 == (-5.124738597288386E-4d));
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4343845205023977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4343845205023977d + "'", double1 == 1.4343845205023977d);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.079985961979837E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985949503006E-5d + "'", double1 == 9.079985949503006E-5d);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2018553154285492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8768177324556823d + "'", double1 == 0.8768177324556823d);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5155829442931129d, 0.8250752499738025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.515582944293113d + "'", double2 == 0.515582944293113d);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        double double1 = org.apache.commons.math.util.FastMath.log(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3025850929940455d + "'", double1 == 2.3025850929940455d);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.012055297180161666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.03449930605017342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18573988815053546d + "'", double1 == 0.18573988815053546d);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149230957E-9d + "'", double1 == 1.862645149230957E-9d);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.3689423485032375d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.092783262284966d + "'", double1 == 2.092783262284966d);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.445323844714277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2022162221140908d + "'", double1 == 1.2022162221140908d);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3010710787424613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.942359898401499d + "'", double1 == 4.942359898401499d);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8068012007388357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.2263037084224d + "'", double1 == 46.2263037084224d);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.002774503742748542d, (-0.999448616881847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0027745037427485417d + "'", double2 == 0.0027745037427485417d);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3796077390275217d, 0.01745284947299009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5248526696656155d + "'", double2 == 1.5248526696656155d);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        double double1 = org.apache.commons.math.util.FastMath.ulp(45.057704222641604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.57070552693625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2532779128893359d + "'", double1 == 1.2532779128893359d);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-323.0051853474518d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.470817953541134d) + "'", double1 == (-6.470817953541134d));
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.7615790383433858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        double double1 = org.apache.commons.math.util.FastMath.abs((-5.195945676325781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.195945676325781d + "'", double1 == 5.195945676325781d);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02181661564992912d + "'", double1 == 0.02181661564992912d);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.991318745538845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.09415978466134d + "'", double1 == 114.09415978466134d);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.21670660727375085d), (-0.9630272572571655d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21670660727375085d) + "'", double2 == (-0.21670660727375085d));
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5248526696656155d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8466727901645837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6624791557154159d + "'", double1 == 0.6624791557154159d);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        double double2 = org.apache.commons.math.util.FastMath.min(2.46819606815034E-4d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.46819606815034E-4d + "'", double2 == 2.46819606815034E-4d);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        double double1 = org.apache.commons.math.util.FastMath.rint(11.940141468803505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1331999452259886E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9446922743316068E-62d + "'", double1 == 1.9446922743316068E-62d);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.174802103936399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7408664348929599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4051557739351637d + "'", double1 == 2.4051557739351637d);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.06722830713210516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        double double2 = org.apache.commons.math.util.FastMath.atan2(48980.58846231743d, 2.522076013060139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707448354574094d + "'", double2 == 1.5707448354574094d);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.075847940722074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2957349683831911d + "'", double1 == 1.2957349683831911d);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7189739987782058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6681413889823316d + "'", double1 == 0.6681413889823316d);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.322723236313804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0100191552952706d + "'", double1 == 2.0100191552952706d);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        long long1 = org.apache.commons.math.util.FastMath.round(0.005202448765189584d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        double double1 = org.apache.commons.math.util.FastMath.cos(15.675653009906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9994780690209127d) + "'", double1 == (-0.9994780690209127d));
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7899781221824803d + "'", double1 == 0.7899781221824803d);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double1 = org.apache.commons.math.util.FastMath.signum(51.99999915301149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5507.000045396766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.4626264090759076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04298093908493936d) + "'", double1 == (-0.04298093908493936d));
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.48250862996283855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5035165489448541d + "'", double1 == 0.5035165489448541d);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0896856194228446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01901860187056251d + "'", double1 == 0.01901860187056251d);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.101733671056989E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.86085826032837d + "'", double1 == 16.86085826032837d);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8640359722236105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9756299818288702d) + "'", double1 == (-0.9756299818288702d));
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.005656731589213857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00565679192583975d + "'", double1 == 0.00565679192583975d);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8768177324556823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.237955471941575d + "'", double1 == 50.237955471941575d);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6610060414837632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double1 = org.apache.commons.math.util.FastMath.asin(63.11868704625112d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5486620049392715d + "'", double1 == 0.5486620049392715d);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.014497418220326751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01439333540156539d + "'", double1 == 0.01439333540156539d);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.512687362897283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.022728632940653824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8674595620891006d), (-1.202619401730384d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double1 = org.apache.commons.math.util.FastMath.tanh(120.01818825115909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.278210815113034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2782108151130336d) + "'", double1 == (-3.2782108151130336d));
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.17543139267904395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        double double1 = org.apache.commons.math.util.FastMath.tan(44.99809670330265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6128994572096305d + "'", double1 == 1.6128994572096305d);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.0924287889629486d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6986765821769388d), 0.7853981613362947d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double2 = org.apache.commons.math.util.FastMath.min(1.815758426184901d, (-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-32.57791748631743d) + "'", double2 == (-32.57791748631743d));
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4223506181800103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39962445873177277d) + "'", double1 == (-0.39962445873177277d));
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9735760889955918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.647394871191808d + "'", double1 == 2.647394871191808d);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6633147175924029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2281786100136092d + "'", double1 == 1.2281786100136092d);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7928643348714102d), (-0.0924287889629486d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3144002680633424d + "'", double1 == 1.3144002680633424d);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46904838772645735d + "'", double1 == 0.46904838772645735d);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.187482763357499d), 3.3648280517791587E-23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1589375003169515d, (-323.0051853474518d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.13800468479027d + "'", double2 == 3.13800468479027d);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.4636005855219394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5695861191798108d + "'", double1 == 1.5695861191798108d);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8238673184078138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19374578338773524d) + "'", double1 == (-0.19374578338773524d));
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2397288196990742d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.82989504995974d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 33);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2860268482059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.618381578861124d + "'", double1 == 3.618381578861124d);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9866275920404864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1546709519529945d + "'", double1 == 1.1546709519529945d);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985961979838E-5d + "'", double1 == 9.079985961979838E-5d);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.32410684590028493d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        double double1 = org.apache.commons.math.util.FastMath.exp((-6.755849220270756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011640508788560195d + "'", double1 == 0.0011640508788560195d);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.244215505684302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999974706003d + "'", double1 == 0.9999999974706003d);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.267909733656017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2679097336560172d + "'", double1 == 2.2679097336560172d);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        double double1 = org.apache.commons.math.util.FastMath.log(1.149548905166106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13936960904520276d + "'", double1 == 0.13936960904520276d);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5009408451299502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6502731920226421d + "'", double1 == 0.6502731920226421d);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double2 = org.apache.commons.math.util.FastMath.max(51.99999915301149d, (-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999915301149d + "'", double2 == 51.99999915301149d);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2130532941206642d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8813735870195429d, 0.830640877860784d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9004252816353321d + "'", double2 == 0.9004252816353321d);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        long long2 = org.apache.commons.math.util.FastMath.max((-90L), 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1286157825604266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5882496193148399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9198805219398823d + "'", double1 == 0.9198805219398823d);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0950379321938843d) + "'", double1 == (-1.0950379321938843d));
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.080398205182299E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.09698324645938282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0969832464593828d) + "'", double1 == (-0.0969832464593828d));
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5844798497868193d + "'", double1 == 1.5844798497868193d);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.356194490192345d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.613775297505947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.61377529750595d + "'", double1 == 8.61377529750595d);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7720875399559285d + "'", double1 == 0.7720875399559285d);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9811545263067579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9811545263067579d + "'", double1 == 0.9811545263067579d);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(44.9999998819046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.708203923697058d + "'", double1 == 6.708203923697058d);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8068012007388357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.930941044890651d + "'", double1 == 0.930941044890651d);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        double double2 = org.apache.commons.math.util.FastMath.max(9.306922469822426d, 1.835438933818835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306922469822426d + "'", double2 == 9.306922469822426d);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        double double1 = org.apache.commons.math.util.FastMath.exp((-88.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.054601895401186E-39d + "'", double1 == 6.054601895401186E-39d);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4219732045494788d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9955742875642764d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5515659755035023d, 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515659755035025d + "'", double2 == 1.5515659755035025d);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9933731825245955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7587969864330162d) + "'", double1 == (-0.7587969864330162d));
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17129545733050197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.814506754801041d + "'", double1 == 9.814506754801041d);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(100.0d, 114.09415978466134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        double double1 = org.apache.commons.math.util.FastMath.atanh(38.971346020966706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0011640508788560195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06669520249694419d + "'", double1 == 0.06669520249694419d);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.628351601695016d + "'", double1 == 23.628351601695016d);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0255887029643131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010973228372790073d + "'", double1 == 0.010973228372790073d);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7453292519943295d, (-0.46749874460386d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7038211969154579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012283997231502098d + "'", double1 == 0.012283997231502098d);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5713088006770572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.005402996770772377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005403023058834883d + "'", double1 == 0.005403023058834883d);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3477990933099977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-466.4266135928925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.534938999763997d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9880923460971159d, 1.835438933818835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.988092346097116d + "'", double2 == 0.988092346097116d);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.14254654307427778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14206815838939643d) + "'", double1 == (-0.14206815838939643d));
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7577337065923179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8598331705908712d + "'", double1 == 0.8598331705908712d);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8337177321043896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07898096151940606d) + "'", double1 == (-0.07898096151940606d));
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.674083105727976d + "'", double1 == 2.674083105727976d);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.016627146495379323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016627912719738187d + "'", double1 == 0.016627912719738187d);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5882496193148399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2602577590774198d + "'", double1 == 1.2602577590774198d);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.1622776601683795d, 0.5246280046224637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4063917980622467d + "'", double2 == 1.4063917980622467d);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.07351901771299219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9972986940697113d + "'", double1 == 0.9972986940697113d);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-2.0f), 1.5812207450977618d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.2432260666726136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05660497324994224d + "'", double1 == 0.05660497324994224d);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4894820176053498d, (-0.8211080655056973d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4894820176053496d + "'", double2 == 1.4894820176053496d);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        double double2 = org.apache.commons.math.util.FastMath.max(0.06669520249694419d, 0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06669520249694419d + "'", double2 == 0.06669520249694419d);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6986765821769388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7735460199712506d) + "'", double1 == (-0.7735460199712506d));
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        int int1 = org.apache.commons.math.util.FastMath.abs((-90));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.06406001577433591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3144002680633424d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        int int1 = org.apache.commons.math.util.FastMath.abs((-33));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9198805219398823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (-33));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33) + "'", int2 == (-33));
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7893750108307106d + "'", double1 == 0.7893750108307106d);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-1.5912749463979503d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8325008986719311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2990612758127336d + "'", double1 == 2.2990612758127336d);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019070115239284053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0926371180390901d + "'", double1 == 1.0926371180390901d);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        double double2 = org.apache.commons.math.util.FastMath.min(50.237955471941575d, 1.3280247521861903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3280247521861903d + "'", double2 == 1.3280247521861903d);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19864621794280862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6162298357006117d) + "'", double1 == (-1.6162298357006117d));
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011983210854855573d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5515659755035025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022764409478678704d + "'", double1 == 0.022764409478678704d);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0896856194228446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0438800790430118d + "'", double1 == 1.0438800790430118d);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.227971924677803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        double double1 = org.apache.commons.math.util.FastMath.log(4.835879646400315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5760630454288633d + "'", double1 == 1.5760630454288633d);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6991118430775187d + "'", double1 == 2.6991118430775187d);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8105257933460475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4968229050023305d + "'", double1 == 0.4968229050023305d);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(35.44341522934086d, 2.010458920780344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.44341522934085d + "'", double2 == 35.44341522934085d);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        double double1 = org.apache.commons.math.util.FastMath.sin(43.1284181946612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7538347920505799d) + "'", double1 == (-0.7538347920505799d));
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.5216140716751916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3709403595463754d) + "'", double1 == (-0.3709403595463754d));
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0826779851380144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8833329068775875d + "'", double1 == 1.8833329068775875d);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7899781221824803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6686000970514328d + "'", double1 == 0.6686000970514328d);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.872732826701256E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5958.7609015404305d + "'", double1 == 5958.7609015404305d);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 9.223372E18f, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9091395677903498d, 1.2022162221140908d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9091395677903495d + "'", double2 == 1.9091395677903495d);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4551915228366852E-11d, (-0.9994780690209127d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.78302841225571E10d + "'", double2 == 6.78302841225571E10d);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.3818004626805416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.113820254782413d) + "'", double1 == (-1.113820254782413d));
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        int int2 = org.apache.commons.math.util.FastMath.max(33, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7219067166708868d) + "'", double1 == (-0.7219067166708868d));
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.852615231192999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6580161192200634d + "'", double1 == 0.6580161192200634d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-89.3634064240365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5812207450977618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.5972751726331d + "'", double1 == 90.5972751726331d);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.5663706143591734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.018489475704365d + "'", double1 == 13.018489475704365d);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 100.0f, 4.761141324937584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        float float2 = org.apache.commons.math.util.FastMath.max((-33.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        double double1 = org.apache.commons.math.util.FastMath.log(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4881369946309988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43349402349577826d + "'", double1 == 0.43349402349577826d);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-33L), (float) (-33L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.0f) + "'", float2 == (-33.0f));
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5378946274303926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.743980336957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9204150691407506d + "'", double1 == 0.9204150691407506d);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152435d + "'", double1 == 1.5430806348152435d);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.46360058552194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.747031677944916d + "'", double1 == 10.747031677944916d);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0090635232033223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.052518065881558766d + "'", double1 == 0.052518065881558766d);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8674595620891006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.018489475704365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.45054953406980763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8962302130072298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.708203923697058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.601988246761649d + "'", double1 == 2.601988246761649d);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.557407710533861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7853981633974483d, 0.07031263443540531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974482d + "'", double2 == 0.7853981633974482d);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-57.29577951308232d), 0.01439333540156539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5705451157070798d) + "'", double2 == (-1.5705451157070798d));
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7243500169114551d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        double double2 = org.apache.commons.math.util.FastMath.max(0.08309759227292604d, 0.6632456843634443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6632456843634443d + "'", double2 == 0.6632456843634443d);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-90L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-90.0f) + "'", float2 == (-90.0f));
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5309649148733837d + "'", double1 == 0.5309649148733837d);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.492757420590521E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        double double2 = org.apache.commons.math.util.FastMath.max(0.022630443056965113d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707055269358083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.944180385331819d + "'", double1 == 0.944180385331819d);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        int int2 = org.apache.commons.math.util.FastMath.max(33, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04074367013117616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008301381573537d + "'", double1 == 1.0008301381573537d);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5378946274303926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.124547535674433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11710370870180292d) + "'", double1 == (-0.11710370870180292d));
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.708062067639405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.18131977440149033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42581659714188025d + "'", double1 == 0.42581659714188025d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.3945753355078114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3945753355078114d + "'", double1 == 2.3945753355078114d);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7456241416655579d) + "'", double1 == (-0.7456241416655579d));
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4617111047443176d, 0.01530032932138615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4617111047443176d + "'", double2 == 1.4617111047443176d);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.46025618298802606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.678421832629247d + "'", double1 == 0.678421832629247d);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.097167320859874E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000003d + "'", double1 == 1.000000000000003d);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.515582944293113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.5707963267948963d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3280247521861903d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }
}

