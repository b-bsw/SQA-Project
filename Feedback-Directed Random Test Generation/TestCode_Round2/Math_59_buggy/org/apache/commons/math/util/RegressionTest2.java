package org.apache.commons.math.util;

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
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46749874460386d) + "'", double1 == (-0.46749874460386d));
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5922362574545064d) + "'", double1 == (-2.5922362574545064d));
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5404195002705842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5144957554275266d + "'", double1 == 0.5144957554275266d);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8611875304425891d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8611875304425891d + "'", double2 == 0.8611875304425891d);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8640359722236105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8640359722236104d) + "'", double1 == (-0.8640359722236104d));
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 5507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5507.0f + "'", float2 == 5507.0f);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8139497520487735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.367810338251987d + "'", double1 == 8.367810338251987d);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.838315415809956d + "'", double1 == 0.838315415809956d);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0668535532697389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9634526785268085d + "'", double1 == 1.9634526785268085d);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5515659755035023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2230306629577952d + "'", double1 == 1.2230306629577952d);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454178737585296d + "'", double1 == 0.017454178737585296d);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.188688139030402d + "'", double1 == 13.188688139030402d);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1877181244729043d + "'", double1 == 1.1877181244729043d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5663706143591734d + "'", double1 == 2.5663706143591734d);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        double double2 = org.apache.commons.math.util.FastMath.max(5.2003257647899614d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2003257647899614d + "'", double2 == 5.2003257647899614d);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49824130708557135d) + "'", double1 == (-0.49824130708557135d));
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0668535532697389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.989874861238103d + "'", double1 == 0.989874861238103d);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8482836399575129d + "'", double1 == 0.8482836399575129d);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.079985986933498E-5d, 1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.079985986933499E-5d + "'", double2 == 9.079985986933499E-5d);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.169015201985079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8631635751882506d) + "'", double1 == (-0.8631635751882506d));
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8598331705908712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.927271896797736d + "'", double1 == 0.927271896797736d);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-90.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.718281828459045d, (-2.356194490192345d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09478022484215487d + "'", double2 == 0.09478022484215487d);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        long long1 = org.apache.commons.math.util.FastMath.round(9.079985986933499E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6610060414837632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.87285640966904d + "'", double1 == 37.87285640966904d);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        int int1 = org.apache.commons.math.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2499132869489418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4900403122965926d + "'", double1 == 3.4900403122965926d);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 32.0f, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        double double2 = org.apache.commons.math.util.FastMath.max(6.691673596021347E41d, 0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4833023923748323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9020848703947254d + "'", double1 == 0.9020848703947254d);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7825372599825183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7189739987782058d + "'", double1 == 0.7189739987782058d);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.132601058453798d + "'", double1 == 2.132601058453798d);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        double double1 = org.apache.commons.math.util.FastMath.atan(76.73862422940539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5577658169136215d + "'", double1 == 1.5577658169136215d);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        double double1 = org.apache.commons.math.util.FastMath.acos(2097152.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5631767322193112d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980155d + "'", double1 == 0.6108652381980155d);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9036922050915067d), 0.743980336957493d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        float float2 = org.apache.commons.math.util.FastMath.max((-90.0f), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.4626264090759076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3504116548137945d) + "'", double1 == (-1.3504116548137945d));
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8334737036630135d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        long long1 = org.apache.commons.math.util.FastMath.abs((-90L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 90L + "'", long1 == 90L);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.496025759922821d) + "'", double1 == (-0.496025759922821d));
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double2 = org.apache.commons.math.util.FastMath.atan2(114.59155902616465d, (-0.6035270795055018d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5760630454288633d + "'", double2 == 1.5760630454288633d);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7456241416655579d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.49824130708557135d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.345524211214144d + "'", double1 == 2.345524211214144d);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0691594887363018d, 1.9155023779490905E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146893481167586d + "'", double1 == 0.5146893481167586d);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0374464491245434d + "'", double1 == 3.0374464491245434d);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2407288686697961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8068012007388357d + "'", double1 == 0.8068012007388357d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.009213398835148427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009213529184899944d) + "'", double1 == (-0.009213529184899944d));
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0432322944097696d), (-0.5872139151569482d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0432322944097694d) + "'", double2 == (-1.0432322944097694d));
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.011983210854855571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999282021879747d + "'", double1 == 0.9999282021879747d);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4029365680925863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1844562330844421d + "'", double1 == 1.1844562330844421d);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-6.053272382792838d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6269791532528178d + "'", double1 == 0.6269791532528178d);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        double double1 = org.apache.commons.math.util.FastMath.signum(23.628351601695012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8089563172728975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9836065573770492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9836065573770493d + "'", double1 == 0.9836065573770493d);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        long long1 = org.apache.commons.math.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776928d + "'", double1 == 0.9999999958776928d);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.322723236313804d) + "'", double1 == (-1.322723236313804d));
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257746d + "'", double1 == 11.548739357257746d);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5009408451299502d + "'", double1 == 0.5009408451299502d);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35, (-55.79430724113828d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-55.79430724113828d) + "'", double2 == (-55.79430724113828d));
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0E-323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.559685672897289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21020213304517052d + "'", double1 == 0.21020213304517052d);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9036922050915067d + "'", double1 == 0.9036922050915067d);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.11826379220364476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11826379220364476d + "'", double2 == 0.11826379220364476d);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5802053839637672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5802053839637673d + "'", double1 == 0.5802053839637673d);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        double double1 = org.apache.commons.math.util.FastMath.log(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3494089883469367d + "'", double1 == 1.3494089883469367d);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707055269358083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99479755129386d + "'", double1 == 89.99479755129386d);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45739982021475745d + "'", double1 == 0.45739982021475745d);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-466.4266135928925d) + "'", double1 == (-466.4266135928925d));
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1877181244729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020729591857664022d + "'", double1 == 0.020729591857664022d);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 5507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.23553270010918d + "'", double1 == 46.23553270010918d);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1752011936438014d), 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.19609258438980118d) + "'", double2 == (-0.19609258438980118d));
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        double double1 = org.apache.commons.math.util.FastMath.signum((-6.838249024841735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8700054540617281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386923871918913d + "'", double1 == 2.386923871918913d);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.999942448217206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414398880534d) + "'", double1 == (-0.8414398880534d));
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0269835496406734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6881171418161356E43d, 1.4004475999834715E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010176922302104895d) + "'", double1 == (-0.010176922302104895d));
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.345524211214144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1677879131291755d + "'", double1 == 1.1677879131291755d);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7577337065923179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12048339341382165d) + "'", double1 == (-0.12048339341382165d));
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.017454178737585296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13211426394445566d + "'", double1 == 0.13211426394445566d);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        double double1 = org.apache.commons.math.util.FastMath.atanh(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7336545584598283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2814145124371763d + "'", double1 == 1.2814145124371763d);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6672440571753369d) + "'", double1 == (-0.6672440571753369d));
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01518445968368543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.187482763357499d) + "'", double1 == (-4.187482763357499d));
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double2 = org.apache.commons.math.util.FastMath.atan2(32.0d, 9.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2966288756752378d + "'", double2 == 1.2966288756752378d);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.327581142581999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9811545263067579d + "'", double1 == 0.9811545263067579d);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        double double1 = org.apache.commons.math.util.FastMath.tanh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        int int1 = org.apache.commons.math.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        double double2 = org.apache.commons.math.util.FastMath.min(4.61512051684126d, 0.9811545263067579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9811545263067579d + "'", double2 == 0.9811545263067579d);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9955742875642762d) + "'", double1 == (-0.9955742875642762d));
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4223506181800103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4099056480256106d) + "'", double1 == (-0.4099056480256106d));
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.45739982021475745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5799604581126996d + "'", double1 == 1.5799604581126996d);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-27.876349504902667d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7218011448664199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8064012322901598d + "'", double1 == 0.8064012322901598d);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 212.75275683459444d + "'", double1 == 212.75275683459444d);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5607966601082315d, 37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.101733671056989E7d + "'", double2 == 2.101733671056989E7d);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0947125472611012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.01818825115909d + "'", double1 == 120.01818825115909d);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5558726996235265d + "'", double1 == 0.5558726996235265d);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.298342365610589d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298342365610588d + "'", double2 == 5.298342365610588d);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7431447610156813d + "'", double1 == 0.7431447610156813d);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5507L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5507.0f + "'", float1 == 5507.0f);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948961d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        double double2 = org.apache.commons.math.util.FastMath.max(0.017455064928217585d, 1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3956124250860895d + "'", double2 == 1.3956124250860895d);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        double double1 = org.apache.commons.math.util.FastMath.cosh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        double double1 = org.apache.commons.math.util.FastMath.log(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.011983210854855571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 9223372036854775807L, (-0.9955742875642764d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.315356337104293E-19d + "'", double2 == 1.315356337104293E-19d);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745240643728351d + "'", double1 == 0.01745240643728351d);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9473741150701356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5287649310207496d) + "'", double1 == (-2.5287649310207496d));
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.079986011887159E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565194245992E-6d + "'", double1 == 1.5847565194245992E-6d);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        double double1 = org.apache.commons.math.util.FastMath.atan((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5596856728972892d) + "'", double1 == (-1.5596856728972892d));
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.45054953406980763d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.9075758706536994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06820006471439112d + "'", double1 == 0.06820006471439112d);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5404195002705842d, (-0.7949577687638787d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5404195002705842d + "'", double2 == 0.5404195002705842d);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1L, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5847565194245992E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847577751518754E-6d + "'", double1 == 1.5847577751518754E-6d);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 90L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 90.0f + "'", float2 == 90.0f);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.9625468178726484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8065537826828391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0154861513366447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1992394507428932d + "'", double1 == 1.1992394507428932d);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6702918784382802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7218011448664199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.356159248556786d + "'", double1 == 41.356159248556786d);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.009213529184899944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009213529184899944d + "'", double1 == 0.009213529184899944d);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.01745329251994342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943424d + "'", double1 == 0.017453292519943424d);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.37746770784939d + "'", double1 == 34.37746770784939d);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        float float1 = org.apache.commons.math.util.FastMath.abs(5507.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5507.0f + "'", float1 == 5507.0f);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2814145124371763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3586387116292378d + "'", double1 == 3.3586387116292378d);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.18131977440149033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7415548299632772d) + "'", double1 == (-0.7415548299632772d));
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6019190803008256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027958762301768844d + "'", double1 == 0.027958762301768844d);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5844798497868198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.460256182988026d + "'", double1 == 0.460256182988026d);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.916079783099616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5631767322193112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.267649876135856d) + "'", double1 == (-32.267649876135856d));
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.32410684590028493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005656731589213857d + "'", double1 == 0.005656731589213857d);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.25569770210804E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1653657392500323E-156d + "'", double1 == 1.1653657392500323E-156d);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.010176746632802332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999948217360899d + "'", double1 == 0.999948217360899d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8640359722236104d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5631767322193112d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        double double1 = org.apache.commons.math.util.FastMath.cosh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.132601058453798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.346544339204282d + "'", double1 == 9.346544339204282d);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4029365680925863d, (-1.04323229440977d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.04323229440977d) + "'", double2 == (-1.04323229440977d));
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.5287649310207496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9873579129275408d) + "'", double1 == (-0.9873579129275408d));
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        float float1 = org.apache.commons.math.util.FastMath.abs((-90.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 90.0f + "'", float1 == 90.0f);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893683d) + "'", double1 == (-0.5440211108893683d));
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2799416321930788d + "'", double1 == 1.2799416321930788d);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.574240039999225d + "'", double1 == 37.574240039999225d);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.4862913247812135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04339396978120386d + "'", double1 == 0.04339396978120386d);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.345524211214144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 134.38863804832192d + "'", double1 == 134.38863804832192d);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17543139267904395d + "'", double1 == 0.17543139267904395d);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017452406437283508d) + "'", double1 == (-0.017452406437283508d));
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        long long1 = org.apache.commons.math.util.FastMath.abs(5507L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5507L + "'", long1 == 5507L);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        double double1 = org.apache.commons.math.util.FastMath.exp(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7987095471340483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6633147175924029d) + "'", double1 == (-0.6633147175924029d));
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.00000000042665d + "'", double1 == 9.00000000042665d);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5944359846634683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5518737433602259d + "'", double1 == 0.5518737433602259d);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6632456843634443d + "'", double1 == 0.6632456843634443d);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9234560495448352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9738051722046778d) + "'", double1 == (-0.9738051722046778d));
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0d), (-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.053272382792838d) + "'", double2 == (-6.053272382792838d));
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6795226183513794d), (-0.6035270795055018d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.46360058552194d + "'", double1 == 2.46360058552194d);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.26649174055900055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26649174055900055d + "'", double1 == 0.26649174055900055d);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        double double1 = org.apache.commons.math.util.FastMath.atanh(66029.68355238467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.999942448217206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0806165313998193E47d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8640359722236105d), 0.7735389809079516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8640359722236104d) + "'", double2 == (-0.8640359722236104d));
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6887971054572842d + "'", double1 == 0.6887971054572842d);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5872139151569482d), 1.1589375003169515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1589375003169515d + "'", double2 == 1.1589375003169515d);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8373983731296124d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9634526785268085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.491754101407853d + "'", double1 == 3.491754101407853d);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6887971054572842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.991318745538845d + "'", double1 == 1.991318745538845d);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.191476652127584E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-33.40828846862413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.3273845772164694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.018168583893839d + "'", double1 == 2.018168583893839d);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.486784401E19d + "'", double1 == 3.486784401E19d);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        long long2 = org.apache.commons.math.util.FastMath.min(90L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5760630454288633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9179848280242625d + "'", double1 == 0.9179848280242625d);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.460256182988026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46025618298802606d + "'", double1 == 0.46025618298802606d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806678d + "'", double1 == 22025.465794806678d);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-90L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5729.577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        double double2 = org.apache.commons.math.util.FastMath.min(31.98437118343895d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        double double2 = org.apache.commons.math.util.FastMath.pow(23.140692632779267d, 0.3846148358776134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3477990933099977d + "'", double2 == 3.3477990933099977d);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        long long1 = org.apache.commons.math.util.FastMath.round(6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.046019547268505E-4d + "'", double1 == 3.046019547268505E-4d);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2227587494850775E-162d + "'", double1 == 2.2227587494850775E-162d);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.352513421777619d + "'", double1 == 0.352513421777619d);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574076203137444d + "'", double1 == 1.5574076203137444d);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        double double2 = org.apache.commons.math.util.FastMath.max(22025.465794806678d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.465794806678d + "'", double2 == 22025.465794806678d);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.102016471589204E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        double double1 = org.apache.commons.math.util.FastMath.ceil(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35L, 3.0374464491245434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48980.58846231743d + "'", double2 == 48980.58846231743d);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7182818284590453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.11826379220364476d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8844064800831344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4215467286739085d + "'", double1 == 2.4215467286739085d);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5707963267948966d), 0.04074367013117616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0E-323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-323d + "'", double1 == 1.0E-323d);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.009213529184899944d), 0.7189739987782058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009213529184899942d) + "'", double2 == (-0.009213529184899942d));
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1674231661645518d, 7.824475489000561E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1674231661645518d + "'", double2 == 1.1674231661645518d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.2534690753051354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.707836221164656d + "'", double1 == 4.707836221164656d);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11012.999999999996d + "'", double1 == 11012.999999999996d);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5596122796450436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E52d + "'", double1 == 1.0E52d);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7893184915864662d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5830846312335454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5249037881284782d) + "'", double1 == (-0.5249037881284782d));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3978952727983707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        double double1 = org.apache.commons.math.util.FastMath.asin(11014.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590449d + "'", double1 == 1.7182818284590449d);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3408013099384417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6655280485429236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7850009775214999d) + "'", double1 == (-0.7850009775214999d));
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.358221623915482d + "'", double1 == 3.358221623915482d);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5847577751518754E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011658811940024915d + "'", double1 == 0.011658811940024915d);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.999999969540041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357600977E-15d + "'", double1 == 7.105427357600977E-15d);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0154861513366447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6117713285146709d + "'", double1 == 1.6117713285146709d);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6583966420468889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3331559825783589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.088431721273945d + "'", double1 == 19.088431721273945d);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1379435771909256d) + "'", double1 == (-1.1379435771909256d));
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5574076203137444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999969540041d + "'", double1 == 0.999999969540041d);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7218011448664199d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1589375003169515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1589375003169518d + "'", double1 == 1.1589375003169518d);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        double double1 = org.apache.commons.math.util.FastMath.ulp(66029.68355238467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4551915228366852E-11d + "'", double1 == 1.4551915228366852E-11d);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9866277300914504d, 9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707042962783768d + "'", double2 == 1.5707042962783768d);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        double double2 = org.apache.commons.math.util.FastMath.max(2.220446049250313E-16d, (-0.8640359722236104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999448616881847d) + "'", double1 == (-0.999448616881847d));
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.010458920780344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.666408003094785d + "'", double1 == 3.666408003094785d);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        long long1 = org.apache.commons.math.util.FastMath.round(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6633147175924029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5805651145852763d) + "'", double1 == (-0.5805651145852763d));
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4099056480256106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5274728362673282d) + "'", double1 == (-0.5274728362673282d));
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        double double2 = org.apache.commons.math.util.FastMath.min(0.13211426394445566d, 1.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13211426394445566d + "'", double2 == 0.13211426394445566d);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.149548905166106d + "'", double1 == 1.149548905166106d);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        double double2 = org.apache.commons.math.util.FastMath.atan2(23.140692632779267d, 2.918853748407959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4453238447142773d + "'", double2 == 1.4453238447142773d);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.32410684590028493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31868510059102656d + "'", double1 == 0.31868510059102656d);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-32.57791748631743d), (-0.6672440571753369d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5912749463979503d) + "'", double2 == (-1.5912749463979503d));
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        double double1 = org.apache.commons.math.util.FastMath.sin((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8939966636005579d) + "'", double1 == (-0.8939966636005579d));
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.433803554543751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.444667861009766d + "'", double1 == 1.444667861009766d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.322723236313804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8674595620891006d) + "'", double1 == (-0.8674595620891006d));
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893697d) + "'", double1 == (-0.5440211108893697d));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.69482111198402d + "'", double1 == 0.69482111198402d);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3619730303123129d + "'", double1 == 0.3619730303123129d);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 5507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.496025759922821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0898120925088963d + "'", double1 == 2.0898120925088963d);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6487212707001282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.806875836617005d) + "'", double1 == (-12.806875836617005d));
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        double double2 = org.apache.commons.math.util.FastMath.max(4.440892098500626E-16d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.61391130652238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7047567822517626d + "'", double1 == 0.7047567822517626d);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5802053839637673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23641824551800447d) + "'", double1 == (-0.23641824551800447d));
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5799604581126996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19864621794280862d + "'", double1 == 0.19864621794280862d);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0392740995950414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.892256650791169d + "'", double1 == 0.892256650791169d);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-27.87634950490267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3275811425819994d, 35.44341522934086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3275811425819994d + "'", double2 == 2.3275811425819994d);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4251878220010183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35430360994810484d + "'", double1 == 0.35430360994810484d);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8631635751882506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7599028021187388d) + "'", double1 == (-0.7599028021187388d));
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.1379435771909256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.164135227174141d) + "'", double1 == (-2.164135227174141d));
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.075847940722074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9324784144647662d + "'", double1 == 1.9324784144647662d);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9979202349577406d, 0.46285676099588835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46285676099588835d + "'", double2 == 0.46285676099588835d);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6801783019998602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011871350870521892d + "'", double1 == 0.011871350870521892d);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.918853748407959d, 1.4029365680925863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9188537484079586d + "'", double2 == 2.9188537484079586d);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5378946274303924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5378946274303926d + "'", double1 == 1.5378946274303926d);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7864052920748482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.057704222641604d + "'", double1 == 45.057704222641604d);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.6197243913529d + "'", double1 == 71.6197243913529d);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8089563172728976d, 37.87285640966904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8089563172728977d + "'", double2 == 0.8089563172728977d);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.25569770210804E-141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double2 = org.apache.commons.math.util.FastMath.min(1.991318745538845d, 0.5558726996235265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5558726996235265d + "'", double2 == 0.5558726996235265d);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813736213307353d + "'", double1 == 0.8813736213307353d);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.872983346207419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4444561992238574d + "'", double1 == 1.4444561992238574d);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9555128717466592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5515659755035023d, 0.009213529184899944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.551565975503502d + "'", double2 == 1.551565975503502d);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.32832234898519613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1674231661645518d, 1.0000000485233538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000485233538d + "'", double2 == 1.0000000485233538d);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double1 = org.apache.commons.math.util.FastMath.tan((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42041931513487113d + "'", double1 == 0.42041931513487113d);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.005402970483400531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005402970483400532d + "'", double1 == 0.005402970483400532d);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.122307281809905E-9d) + "'", double1 == (-4.122307281809905E-9d));
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5144957554275266d, 0.017454178737585296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017454178737585296d + "'", double2 == 0.017454178737585296d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.012208955882846451d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012209562553744129d) + "'", double1 == (-0.012209562553744129d));
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        double double1 = org.apache.commons.math.util.FastMath.abs(34.37746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.37746770784939d + "'", double1 == 34.37746770784939d);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.367918055200995d + "'", double1 == 1.367918055200995d);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.174802103936399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.951187273260123d + "'", double1 == 2.951187273260123d);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8414709848078965d), 22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8414709848078965d) + "'", double2 == (-0.8414709848078965d));
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.01745240643728351d), (-0.009213529184899942d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0565321053670247d) + "'", double2 == (-2.0565321053670247d));
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5577658169136215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.692617836018588d + "'", double1 == 8.692617836018588d);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12931063444698587d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12931063444698587d + "'", double2 == 0.12931063444698587d);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.6881171418160975E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9376558078861459d + "'", double1 == 0.9376558078861459d);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6012.84549645786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6013.0d + "'", double1 == 6013.0d);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8968903759882284d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5921640937280627d) + "'", double1 == (-0.5921640937280627d));
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232920103324d, 43.1284181946612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103323d + "'", double2 == 11013.232920103323d);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4551915228366852E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.539788332061041E-13d + "'", double1 == 2.539788332061041E-13d);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-90L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        double double1 = org.apache.commons.math.util.FastMath.acos((-323.0051853474518d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.927271896797736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.638566441559658d + "'", double1 == 1.638566441559658d);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-27.87634950490267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1597.197174862525d) + "'", double1 == (-1597.197174862525d));
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008983023749580713d + "'", double1 == 0.008983023749580713d);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8004740475253073d) + "'", double1 == (-0.8004740475253073d));
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        double double1 = org.apache.commons.math.util.FastMath.tan((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7645662682374061d + "'", double1 == 1.7645662682374061d);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.994185913465727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7591415563789915d + "'", double1 == 0.7591415563789915d);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0176055895227847d + "'", double1 == 1.0176055895227847d);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1677879131291755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0530637390494224d + "'", double1 == 1.0530637390494224d);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        int int1 = org.apache.commons.math.util.FastMath.round((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.534938999763997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9933731825245955d) + "'", double1 == (-0.9933731825245955d));
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.872732826701256E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.872732826701256E-25d + "'", double1 == 5.872732826701256E-25d);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6893272594363031d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8466727901645837d) + "'", double1 == (-0.8466727901645837d));
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4453238447142773d, 1.1653657392500323E-156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.445323844714277d + "'", double2 == 1.445323844714277d);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5878687580950964d) + "'", double1 == (-0.5878687580950964d));
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9736862425967708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.512687362897283d + "'", double1 == 1.512687362897283d);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.122307281809905E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8655103306675354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7134299764161373d + "'", double1 == 0.7134299764161373d);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8571332032039712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1482743665672453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4219732045494788d + "'", double1 == 1.4219732045494788d);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        double double2 = org.apache.commons.math.util.FastMath.max(7.872983346207419d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.872983346207419d + "'", double2 == 7.872983346207419d);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.315356337104293E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.085665678873264E-7d + "'", double1 == 5.085665678873264E-7d);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        double double2 = org.apache.commons.math.util.FastMath.max(0.017455064928217585d, 0.03449930605017342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03449930605017342d + "'", double2 == 0.03449930605017342d);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.011871350870521892d, (-1.3273845772164696d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1326494772257005d + "'", double2 == 3.1326494772257005d);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 97, 3.486784401E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.011983210854855571d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011983210854855573d + "'", double2 == 0.011983210854855573d);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.011983210854855571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.999448616881847d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.602036160225165d + "'", double2 == 1.602036160225165d);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        int int1 = org.apache.commons.math.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2722218725854067E-14d, 2.566370614359173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2722218725854069E-14d + "'", double2 == 1.2722218725854069E-14d);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3275811425819994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01745240643728351d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8334737036630134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.35430360994810484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.940141468803507d + "'", double1 == 11.940141468803507d);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7134299764161373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7764153489348606d + "'", double1 == 0.7764153489348606d);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        double double1 = org.apache.commons.math.util.FastMath.ceil(31.984371183438945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.31868510059102656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1597.197174862525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.87634950490267d) + "'", double1 == (-27.87634950490267d));
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        double double1 = org.apache.commons.math.util.FastMath.atan((-5.227971924677803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3818004626805416d) + "'", double1 == (-1.3818004626805416d));
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.008983023749580713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146893481167586d + "'", double1 == 0.5146893481167586d);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1664162281198318d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8598331705908712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06558580471017249d) + "'", double1 == (-0.06558580471017249d));
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995216443485196d + "'", double1 == 0.6995216443485196d);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6557942026326724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7038211969154579d + "'", double1 == 0.7038211969154579d);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0530637390494224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0530637390494226d + "'", double1 == 1.0530637390494226d);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.835438933818835d + "'", double1 == 1.835438933818835d);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.838315415809956d, 0.6212147412252023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8962302130072298d + "'", double2 == 0.8962302130072298d);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7864052920748482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6563678204210392d + "'", double1 == 0.6563678204210392d);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.691673596021347E41d, 0.845663344538835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        double double1 = org.apache.commons.math.util.FastMath.atanh(19.088431721273945d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 52.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2407288686697964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999303766734422d + "'", double1 == 0.9999303766734422d);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.374102388374377E-9d) + "'", double1 == (-1.374102388374377E-9d));
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.188688139030402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1416876847493498d + "'", double1 == 1.1416876847493498d);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7893184915864662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3280247521861903d + "'", double1 == 1.3280247521861903d);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.605170185988091d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.838315415809956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6088496173769596d + "'", double1 == 0.6088496173769596d);
    }
}

