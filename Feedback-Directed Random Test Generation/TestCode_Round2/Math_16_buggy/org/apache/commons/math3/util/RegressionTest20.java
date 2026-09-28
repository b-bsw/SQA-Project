package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9734594443576855d, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-81.68389945583091d) + "'", double2 == (-81.68389945583091d));
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.7990222E28f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 7.083549E24f, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 8388608.0f, 3.953601409492212E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.953601409492212E10d + "'", double2 == 3.953601409492212E10d);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.22670225318342424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6097501917041614d + "'", double1 == 0.6097501917041614d);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.5707963267876206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1023.9999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        double double1 = org.apache.commons.math3.util.FastMath.exp(69.53786160730876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502853104E30d + "'", double1 == 1.5845632502853104E30d);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(192.00001525878906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3510324301452217d + "'", double1 == 3.3510324301452217d);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        double double1 = org.apache.commons.math3.util.FastMath.asin(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        double double1 = org.apache.commons.math3.util.FastMath.floor(14667.719555349075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14667.0d + "'", double1 == 14667.0d);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 8.881786E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.612435531802323E-6d + "'", double1 == 9.612435531802323E-6d);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.9999995f, (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.023437498f + "'", float2 == 0.023437498f);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(16.911534525287767d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(46655.999999999956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2673191.888962366d + "'", double1 == 2673191.888962366d);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        double double2 = org.apache.commons.math3.util.FastMath.min((-7.224719895935548d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.224719895935548d) + "'", double2 == (-7.224719895935548d));
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7451734706821028d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(8.000001f, 5.6843426E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.000001f + "'", float2 == 8.000001f);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-21));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5715830600540215d, 3.1855810236609772E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1855810236609772E16d + "'", double2 == 3.1855810236609772E16d);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.4606145E16f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4606145E16f + "'", float2 == 5.4606145E16f);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.2491542559227398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10735431664969686d) + "'", double1 == (-0.10735431664969686d));
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.36693586126414035d, 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2881030657857744E16d + "'", double2 == 5.2881030657857744E16d);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1529215E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.15292164E18f + "'", float1 == 1.15292164E18f);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0969762035384047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.0024670109333179424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002467013435748902d) + "'", double1 == (-0.002467013435748902d));
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 100.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120667918368d + "'", double1 == 4.615120667918368d);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        double double1 = org.apache.commons.math3.util.FastMath.abs(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 6.776264E-21f, (-0.749444424663085d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.77626438582797E-21d) + "'", double2 == (-6.77626438582797E-21d));
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(67492.433469899d, 0.999938966709995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 67492.433469899d + "'", double2 == 67492.433469899d);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-8.316789127129839d), 1.2930884003786862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.316789127129837d) + "'", double2 == (-8.316789127129837d));
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-2.466211969798772d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3510667325132117d) + "'", double1 == (-1.3510667325132117d));
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-4.3978976548952886E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.397897656312988E-5d) + "'", double1 == (-4.397897656312988E-5d));
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.220703125E-4d, 0.026871352843612424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.220703125E-4d + "'", double2 == 1.220703125E-4d);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.64926731E12f, 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6143003604059988d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 121);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 121L + "'", long1 == 121L);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.6790281238451179d), 1.154670951952993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3395313360487884d + "'", double2 == 1.3395313360487884d);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.15292164E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        int int2 = org.apache.commons.math3.util.FastMath.min((-29), 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-29) + "'", int2 == (-29));
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        long long1 = org.apache.commons.math3.util.FastMath.round(1024.00078010447d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(231.47324788320893d, (double) (-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 231.4732478832089d + "'", double2 == 231.4732478832089d);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 95, 121L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-12), 0.34559293815501096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.004975405176914d + "'", double2 == 12.004975405176914d);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.8742149727184364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.7056388834581453d, 3.9823973283939967E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570649137998787d + "'", double2 == 1.570649137998787d);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1751822318188396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771124457751959d + "'", double1 == 0.7771124457751959d);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7853981633974483d, (-0.7379567555085281d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04744140788892015d + "'", double2 == 0.04744140788892015d);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5572364748926293d, 109);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.010704257072606E33d + "'", double2 == 1.010704257072606E33d);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(31.999998f, 22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3421772E8f + "'", float2 == 1.3421772E8f);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(201.71582849120512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(11.532562594670797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101982.12064203272d + "'", double1 == 101982.12064203272d);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.0016997123712174172d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.88178366760566E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.011048544114584294d, 1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368887786267312d + "'", double2 == 1.1368887786267312d);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 100, (float) 63L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 48000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48000L + "'", long2 == 48000L);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.000001f, 89.92360567258659d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000002f + "'", float2 == 9.000002f);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2119.943841984046d + "'", double1 == 2119.943841984046d);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5430539212513212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333656900104355d + "'", double1 == 0.9333656900104355d);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2983485416910245d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.000000953674318d, 0.4154539484374528d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5292748139080856d + "'", double2 == 1.5292748139080856d);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.5687609160957652d), (double) 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5687609160957652d) + "'", double2 == (-0.5687609160957652d));
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6553829122395007d, (double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2673702232124384E-5d) + "'", double2 == (-1.2673702232124384E-5d));
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        float float1 = org.apache.commons.math3.util.FastMath.abs(10.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.1170554140246223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.971428693190841d + "'", double1 == 0.971428693190841d);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6215477523208265d, 160.80803418105256d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.152340739574648E-34d + "'", double2 == 6.152340739574648E-34d);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1500.0001f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1500L + "'", long1 == 1500L);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.20471195344719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9759679168660529d + "'", double1 == 0.9759679168660529d);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        long long2 = org.apache.commons.math3.util.FastMath.max(7L, 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.817120640969395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0357153140224502d + "'", double1 == 1.0357153140224502d);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.8889466E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.3843128629669922d), (double) 4.3368087E-19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3843128629669922d + "'", double2 == 0.3843128629669922d);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5707509268824842d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1E-44f, (-100.000015f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1E-44f) + "'", float2 == (-1.1E-44f));
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.022098885221519555d, 8.936085770210967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.936113095372896d + "'", double2 == 8.936113095372896d);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0008452289287066d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        double double1 = org.apache.commons.math3.util.FastMath.log10(123.08755801768092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.090214155633555d + "'", double1 == 2.090214155633555d);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        long long2 = org.apache.commons.math3.util.FastMath.max((-127L), 22026L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8430153355241219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.09951176E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44381664780109575d) + "'", double1 == (-0.44381664780109575d));
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.2207033E-4f), (float) 24000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2207033E-4f) + "'", float2 == (-1.2207033E-4f));
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 6000.00048828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-42L), 4.7772088E-35f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7772088E-35f + "'", float2 == 4.7772088E-35f);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.14748339E9f), (float) (-47L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748339E9f) + "'", float2 == (-2.14748339E9f));
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.34720030357470333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35421818990013976d + "'", double1 == 0.35421818990013976d);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9999999967708991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471789453949d + "'", double1 == 0.6931471789453949d);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        int int2 = org.apache.commons.math3.util.FastMath.max((-34), 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.27548763941221577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26881950884076594d + "'", double1 == 0.26881950884076594d);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.4551915E-9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.110223E-16f + "'", float1 == 1.110223E-16f);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(229.3648145037862d, 402.4286011229416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 229.3648145037862d + "'", double2 == 229.3648145037862d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2015.9999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.1035156E-5f, 0.981898135071284d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.103516E-5f + "'", float2 == 6.103516E-5f);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        long long2 = org.apache.commons.math3.util.FastMath.max(38L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.2924697E-26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2924697071141057E-26d + "'", double1 == 1.2924697071141057E-26d);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.2983485416910245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-62.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1468915797347967E27d + "'", double1 == 1.1468915797347967E27d);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.2207031189367021E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(512.5f, (-50));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5519144E-13f + "'", float2 == 4.5519144E-13f);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.4043263937877364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9136249863241899d) + "'", double1 == (-1.9136249863241899d));
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.10899577685250762d, (-0.6865874069985795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10899577685250761d + "'", double2 == 0.10899577685250761d);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0037377790192319412d, 2.0000000794728567d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.000003572217667d + "'", double2 == 2.000003572217667d);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), (-2016));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0000000000014222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281828462911d + "'", double1 == 1.718281828462911d);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        float float2 = org.apache.commons.math3.util.FastMath.max((-62.999992f), (float) 128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.13910784019083322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14001569601216154d + "'", double1 == 0.14001569601216154d);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.005159763605553577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005146474890687474d) + "'", double1 == (-0.005146474890687474d));
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 141, 24000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030861493754311d + "'", double1 == 0.9030861493754311d);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, 6000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5184364492350668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.392067998219646d + "'", double1 == 2.392067998219646d);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.999999523162843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030899611059745d + "'", double1 == 0.9030899611059745d);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.6714016625072592E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.759824E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9239385290558519d, 0.40408300167069183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9685386403653065d + "'", double2 == 0.9685386403653065d);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        int int2 = org.apache.commons.math3.util.FastMath.max(5, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.7559662776027264d), 1.5707963267948584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4485460293245229d) + "'", double2 == (-0.4485460293245229d));
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3.7778936E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.679185841765126d + "'", double1 == 52.679185841765126d);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35.999996f, 205);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.4226387499614237d, 447.17151850423704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4226387499614237d + "'", double2 == 1.4226387499614237d);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1024L), (float) 67L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        long long1 = org.apache.commons.math3.util.FastMath.abs(724L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 724L + "'", long1 == 724L);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-13L), 4.3368087E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3368087E-19f + "'", float2 == 4.3368087E-19f);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2924697E-26f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-86) + "'", int1 == (-86));
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5200669294466769d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        long long1 = org.apache.commons.math3.util.FastMath.abs(17L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6.1035153E-5f, (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5258788E-5f + "'", float2 == 1.5258788E-5f);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-63L), 2.688101119437145E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-63.0d) + "'", double2 == (-63.0d));
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614194366272d + "'", double1 == 44.3614194366272d);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-21));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5232132235179132d) + "'", double1 == (-1.5232132235179132d));
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        double double1 = org.apache.commons.math3.util.FastMath.signum(82.0602573466037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 128L, 0.11835125533092143d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.99999f + "'", float2 == 127.99999f);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.10960414795451248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11608913756097965d) + "'", double1 == (-0.11608913756097965d));
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 749.99994f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8958211783688693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8057576132663624d + "'", double1 == 0.8057576132663624d);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.1920929E-7f, (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.9406100635476846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0090262908655008d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0090262908655008d + "'", double2 == 1.0090262908655008d);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 2.1305288720633893E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        double double1 = org.apache.commons.math3.util.FastMath.asin(73.59231792902837d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4349004398852625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.199226912462197d + "'", double1 == 4.199226912462197d);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(148.4197576646372d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.4197576646372d + "'", double2 == 148.4197576646372d);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8721836054182673d) + "'", double1 == (-0.8721836054182673d));
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.240342741956245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0290216161557213d + "'", double1 == 1.0290216161557213d);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.617445E-24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.888609E-31f + "'", float1 == 7.888609E-31f);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        double double2 = org.apache.commons.math3.util.FastMath.max((-148.99999999999997d), (double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001192092896d + "'", double2 == 1.0000001192092896d);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.0d + "'", double1 == 75.0d);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.2233715E18f, 230);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.265566627983154E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.89110995790382d + "'", double1 == 72.89110995790382d);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(7.0368744E13f, 86);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.8136451593772986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 4.5035996E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        double double2 = org.apache.commons.math3.util.FastMath.max(143.55307120752224d, 1.5771174481917147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 143.55307120752224d + "'", double2 == 143.55307120752224d);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.20942362448062432d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 6.2277026E10f, 0.017610831014788973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2277025792E10d + "'", double2 == 6.2277025792E10d);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0158029440740917d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030899869919435d + "'", double1 == 0.9030899869919435d);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.5474254E26f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        long long2 = org.apache.commons.math3.util.FastMath.min(128L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(70.01428280002321d, 0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5621885533986446d + "'", double2 == 1.5621885533986446d);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8180579987125934d, (double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8180579987125933d + "'", double2 == 0.8180579987125933d);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.1855810236609772E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        float float2 = org.apache.commons.math3.util.FastMath.max(8.881786E-16f, (float) 31855810236609772L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.18558111E16f + "'", float2 == 3.18558111E16f);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.4929859817864055E45d, (-14.999998092651365d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        double double1 = org.apache.commons.math3.util.FastMath.floor(26.162497122918175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-3.9999999999999787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.017452405505090827d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999491777925882d) + "'", double1 == (-0.9999491777925882d));
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), 87L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.1274905242232915d), 0.08703103478010532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04045948944318617d) + "'", double2 == (-0.04045948944318617d));
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        int int2 = org.apache.commons.math3.util.FastMath.max(192, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46) + "'", int1 == (-46));
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7464043275756789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.8148137583349884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.016404014253986d) + "'", double1 == (-4.016404014253986d));
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.733041938654942E-10d, 2.392067998219646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.733041938654942E-10d + "'", double2 == 2.733041938654942E-10d);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0E-200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000001E-200d + "'", double1 == 1.0000000000000001E-200d);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5628219188284787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5977958246549382d + "'", double1 == 0.5977958246549382d);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(39.65457130176138d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 983040.06f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.491552334199826d + "'", double1 == 14.491552334199826d);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8524213316116924d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.77265803052248E-72d + "'", double2 == 9.77265803052248E-72d);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.503599627370496E15d, 9.53674430092943E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-9223372036854775808L), (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.6294995E14f) + "'", float2 == (-5.6294995E14f));
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        int int1 = org.apache.commons.math3.util.FastMath.abs(205);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 205 + "'", int1 == 205);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 9223370937343148032L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(661.00006f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3071.9998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3071.9998f + "'", float1 == 3071.9998f);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(512.4999f, 2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.4999f + "'", float2 == 512.4999f);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.21991180375937053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21991180375937053d + "'", double1 == 0.21991180375937053d);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(231.46791666571625d, 0.9179032580179187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5668307731246351d + "'", double2 == 1.5668307731246351d);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        int int2 = org.apache.commons.math3.util.FastMath.max(62, (-67));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        long long2 = org.apache.commons.math3.util.FastMath.min(72L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-44), 4.7772088E-35f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-44.0f) + "'", float2 == (-44.0f));
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1945388.779136774d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.4741028400800176d, 0.9999999999780624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47410284010195514d + "'", double2 == 0.47410284010195514d);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.1759754114836391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1620979406554996d + "'", double1 == 0.1620979406554996d);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-13.0591403123201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        double double1 = org.apache.commons.math3.util.FastMath.asin(10.127541722024175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9333656900104355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6838990170178814d + "'", double1 == 1.6838990170178814d);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.500290951070782d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(15.749999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 11);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-8.376517822945031E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0097419586828951E-28d + "'", double1 == 1.0097419586828951E-28d);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.4349004398852625d, (-0.9999999979388464d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.5749804E-19f, 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5749804E-19f + "'", float2 == 2.5749804E-19f);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 67L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 4.5519144E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0012766224843186505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999185117627d + "'", double1 == 0.999999185117627d);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9432571842576234d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7171517285126258d, (-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7171517285126258d + "'", double2 == 0.7171517285126258d);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.776264E-21f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-67) + "'", int1 == (-67));
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.727786289925683d, 155.74607629780772d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 155.8513645045997d + "'", double2 == 155.8513645045997d);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7453291188362752d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.06893358452826272d), 201.7158284912051d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06893358452826272d) + "'", double2 == (-0.06893358452826272d));
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 750, 2.8211864E-34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8211864E-34f + "'", float2 == 2.8211864E-34f);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1195.8237618366045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1196.0d + "'", double1 == 1196.0d);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-5.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.04515356978469217d), 1.4349004398852625d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1765355471794627d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.8750847578455696d), 1.3956124250860895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8750847578455696d) + "'", double2 == (-1.8750847578455696d));
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.5532447566107d + "'", double1 == 98.5532447566107d);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.894234176820905E299d, 0.7131835741878096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-6L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 56L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5529410816553442d + "'", double1 == 1.5529410816553442d);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.019686241372257017d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5674635228626927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.80904440074012d + "'", double1 == 89.80904440074012d);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9124034991009714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.969904514319578d + "'", double1 == 0.969904514319578d);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-18));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-49.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.146891579734805E27d), (-62.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        long long2 = org.apache.commons.math3.util.FastMath.min(97L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.23226068750587248d), 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012529309049415136d) + "'", double2 == (-0.012529309049415136d));
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.01562627175205221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.005159740711202605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005159740711202604d) + "'", double1 == (-0.005159740711202604d));
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        double double1 = org.apache.commons.math3.util.FastMath.acos(8.936085770210967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.017453294916019414d, 4.882813470127877E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453294916019414d + "'", double2 == 0.017453294916019414d);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.137816820747311E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.06869976497710933d), 69.5378615119413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06869976497710933d) + "'", double2 == (-0.06869976497710933d));
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5707963267942904d, (double) 1023.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0d + "'", double2 == 1023.0d);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(8.359154094323616E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.359154094323617E102d + "'", double1 == 8.359154094323617E102d);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.4201670368266393d), 0.1635222099724446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07039959309069449d + "'", double2 == 0.07039959309069449d);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        float float2 = org.apache.commons.math3.util.FastMath.min(192.00002f, 1.54742505E26f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.00002f + "'", float2 == 192.00002f);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.1071487177940904d), 0.06179885322941391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5150361649345374d) + "'", double2 == (-1.5150361649345374d));
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.20942362448062432d), 4.464152347486313d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5860134523134308E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.1936619037451575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3759029782030896d + "'", double1 == 1.3759029782030896d);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0012766217907877948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012766217907877948d + "'", double1 == 0.0012766217907877948d);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        int int2 = org.apache.commons.math3.util.FastMath.max(106, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.9233845397715967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.3616600342037056d, 0.16500355124533647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.397522517933007d + "'", double2 == 0.397522517933007d);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.913940518571937E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.913940518571937E11d + "'", double1 == 3.913940518571937E11d);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1580072.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.9999995f, 44);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.732421234282649E34d + "'", double2 == 1.732421234282649E34d);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.102398704460064E-240d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.102398704460064E-240d + "'", double1 == 9.102398704460064E-240d);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0E21d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.765625E17d + "'", double2 == 9.765625E17d);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2015.9998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1920928955078099E-7d, (double) 9.536745E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078099E-7d + "'", double2 == 1.1920928955078099E-7d);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.012958729957493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.012958729957493d + "'", double1 == 4.012958729957493d);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.43597357E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.3236692321000447d, (double) 63L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.052707790809375536d + "'", double2 == 0.052707790809375536d);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-26), (long) (-47));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-26L) + "'", long2 == (-26L));
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.1691265005705735E29d, 14.100656565716712d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1691265005705735E29d + "'", double2 == 3.1691265005705735E29d);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7249453328133406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8109550258763553d) + "'", double1 == (-0.8109550258763553d));
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        int int1 = org.apache.commons.math3.util.FastMath.round((-7.9999995f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0822918092226002d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4290669569246366d + "'", double1 == 1.4290669569246366d);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-50), (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-50.0f) + "'", float2 == (-50.0f));
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1624361521972155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1977139126350744d + "'", double1 == 3.1977139126350744d);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4538925674179464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-4.620233E-10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6202330850064754E-10d + "'", double1 == 4.6202330850064754E-10d);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.776264385827971E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.460450367827319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.335144E-4f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.7772088E-35f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.87E-42f + "'", float1 == 2.87E-42f);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        long long2 = org.apache.commons.math3.util.FastMath.min(1L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 19, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5623517462205421d, (-0.9934325699263659d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9934325699263659d) + "'", double2 == (-0.9934325699263659d));
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.2491542559227393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.9999263715154889d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.129457630882402d + "'", double1 == 3.129457630882402d);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.223372E18f, 1.110223E-16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.110223E-16f + "'", float2 == 1.110223E-16f);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 750L, 6.9999995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999998f, 29.012614126025312d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.13457274443050346d), 10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13457274443050346d) + "'", double2 == (-0.13457274443050346d));
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.5662961598647253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1023.9999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0012766217907877948d, 0.9999999741081426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012766211303121258d + "'", double2 == 0.0012766211303121258d);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-13), (float) (-5L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-43.673229889783244d), 8.376517822945032E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948775d) + "'", double2 == (-1.5707963267948775d));
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        float float1 = org.apache.commons.math3.util.FastMath.abs(38.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 38.0f + "'", float1 == 38.0f);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.029101515410080516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029097407913850314d + "'", double1 == 0.029097407913850314d);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.7616197142345807d, (double) 5.5565375E-17f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7616197142345807d + "'", double2 == 0.7616197142345807d);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 4.5035996E15f, 11.672846070537526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726936208978296d + "'", double1 == 0.8726936208978296d);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3383347192042697E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        long long2 = org.apache.commons.math3.util.FastMath.max(1023L, (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.102398704460064E-240d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.102398704460065E-240d + "'", double1 == 9.102398704460065E-240d);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.007570484655252586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-724), 512);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.8414443782266199d), (-26));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2538498315611778E-8d) + "'", double2 == (-1.2538498315611778E-8d));
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-724.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-723.99994f) + "'", float1 == (-723.99994f));
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9759679168660529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6537345627319346d + "'", double1 == 1.6537345627319346d);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 5, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.17512404686688d, 9.765626164153218E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1751240468668798d + "'", double2 == 1.1751240468668798d);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-14), (long) (-38));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38L) + "'", long2 == (-38L));
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2513348203398038d, 286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 286.4788975654116d + "'", double2 == 286.4788975654116d);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.10453398E11f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 21L, 1.2089258E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        long long2 = org.apache.commons.math3.util.FastMath.min(87L, (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.2779131873068914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 2147483647L, 0.585786437626905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.061290475572342844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06121390174112848d + "'", double1 == 0.06121390174112848d);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.62949953421312E15d, 5.9604644775390625E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000021616718853d + "'", double2 == 1.0000021616718853d);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-16.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5083775167989393d) + "'", double1 == (-1.5083775167989393d));
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7940.239921833475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.58333003429132d + "'", double1 == 138.58333003429132d);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        double double1 = org.apache.commons.math3.util.FastMath.cos(15.174271293851461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8609347784399619d) + "'", double1 == (-0.8609347784399619d));
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.01562627175205221d, 0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01562627175205221d + "'", double2 == 0.01562627175205221d);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.022920740387489907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7757130845382267d) + "'", double1 == (-3.7757130845382267d));
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000002d + "'", double1 == 0.7500000000000002d);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5729.578825572446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.0d + "'", double1 == 5729.0d);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.2233720368547748E18d) + "'", double1 == (-9.2233720368547748E18d));
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.051757812026305E-5d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.814697265032881E-6d + "'", double2 == 3.814697265032881E-6d);
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 13, (-44L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(11915.86542515003d, 50.793076005481666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11915.865425150028d + "'", double2 == 11915.865425150028d);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0000076293915d + "'", double1 == 32.0000076293915d);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.091998982501293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0449875513618778d + "'", double1 == 1.0449875513618778d);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.11805318683721E16d, 0.8414711136259806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004670901542416914d) + "'", double2 == (-0.004670901542416914d));
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.3762399214389404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3762399214389404d + "'", double1 == 0.3762399214389404d);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5866881333874634d) + "'", double1 == (-0.5866881333874634d));
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2089258E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2089258E24f + "'", float1 == 1.2089258E24f);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.570800005457995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        int int2 = org.apache.commons.math3.util.FastMath.min(2016, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(22026.0f, (-26));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.2821298E-4f + "'", float2 == 3.2821298E-4f);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5894638344822235d, 3.755020761982979E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.279136527822644d + "'", double2 == 19.279136527822644d);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        int int2 = org.apache.commons.math3.util.FastMath.max(42, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.2776724662502028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.285158316011355d + "'", double1 == 0.285158316011355d);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.623641767289499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6236417672895d + "'", double1 == 7.6236417672895d);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.97480452983425E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.5285148312638d + "'", double1 == 85.5285148312638d);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-121), 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.44935555E17f) + "'", float2 == (-5.44935555E17f));
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9.6935236E-24f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.693523592216698E-24d + "'", double1 == 9.693523592216698E-24d);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7262340257027773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7579685469787616d + "'", double1 == 0.7579685469787616d);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 17, (long) (-35));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(69.53786160730874d, (double) 87.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 69.53786160730874d + "'", double2 == 69.53786160730874d);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 7.0368744E13f, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7179869184E10d + "'", double2 == 1.7179869184E10d);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        double double2 = org.apache.commons.math3.util.FastMath.log(39.65457130176138d, 4.695330298047765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4202396179411706d + "'", double2 == 0.4202396179411706d);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6821738184917203d + "'", double1 == 2.6821738184917203d);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) -1, (float) (-2016L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2016.0f) + "'", float2 == (-2016.0f));
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4835298641951802d, (-0.9026163845490671d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7365417344870808d + "'", double2 == 1.7365417344870808d);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.564058481760474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4472840338540104d + "'", double1 == 0.4472840338540104d);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-86));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        int int1 = org.apache.commons.math3.util.FastMath.abs(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 6, (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.5073795E29f + "'", float2 == 9.5073795E29f);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        float float2 = org.apache.commons.math3.util.FastMath.max((-4.620233E-10f), (-19.999998f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.620233E-10f) + "'", float2 == (-4.620233E-10f));
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(16.503188655621596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28803497911837345d + "'", double1 == 0.28803497911837345d);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000001192092682d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.000002f + "'", float1 == 9.000002f);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.20824159849321075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0217607485745892d + "'", double1 == 1.0217607485745892d);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(11014.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        long long2 = org.apache.commons.math3.util.FastMath.min(47L, (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-19.999998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        int int2 = org.apache.commons.math3.util.FastMath.max((-7), (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(9.536743164062499E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000004547d + "'", double1 == 1.0000000000004547d);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4510921930962484d + "'", double1 == 3.4510921930962484d);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(416.0f, 24000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416.0f + "'", float2 == 416.0f);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1635411564360822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2012493530417956d + "'", double1 == 2.2012493530417956d);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(14.0f, 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.48941851000927195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6313673203263278d + "'", double1 == 0.6313673203263278d);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 16.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.5111573E23f, (float) (-86));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5111573E23f) + "'", float2 == (-1.5111573E23f));
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.022343035780788705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02234303578078871d + "'", double1 == 0.02234303578078871d);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-11));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.0f + "'", float1 == 11.0f);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        int int1 = org.apache.commons.math3.util.FastMath.abs(49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        double double1 = org.apache.commons.math3.util.FastMath.floor(9.536744300927985E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        long long2 = org.apache.commons.math3.util.FastMath.min(128L, 750L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-63L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.187928385330527E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4290630924152068E-6d + "'", double1 == 1.4290630924152068E-6d);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5729.578825572446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5730.0d + "'", double1 == 5730.0d);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-975527.4450396402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707953017084113d) + "'", double1 == (-1.5707953017084113d));
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(306.28826703726253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0454523567806196E133d + "'", double1 == 1.0454523567806196E133d);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-724));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-723.99994f) + "'", float1 == (-723.99994f));
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.922386521532856E25d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        float float2 = org.apache.commons.math3.util.FastMath.min((-9.223372E18f), (float) (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        double double1 = org.apache.commons.math3.util.FastMath.asin(686.4773600637391d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.003828850494936428d, 0.7730812391918281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.046246598903591965d + "'", double2 == 0.046246598903591965d);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.45158270528713884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        int int2 = org.apache.commons.math3.util.FastMath.min(112, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.8692317197309762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6885686776071497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.8E-45f, 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8E-45f + "'", float2 == 2.8E-45f);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.2277026E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.2277026E10f + "'", float1 == 6.2277026E10f);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-34), 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2887572196644654d + "'", double1 == 1.2887572196644654d);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9999999993288339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-34L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0217607485745892d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574081330086431d + "'", double1 == 1.5574081330086431d);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.81474976710656E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9915799420065793d + "'", double1 == 0.9915799420065793d);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951163E12f + "'", float1 == 1.09951163E12f);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        double double1 = org.apache.commons.math3.util.FastMath.tan(110.19359790649689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24244446861191662d + "'", double1 == 0.24244446861191662d);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.028240766936998E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.028240766936998E32d + "'", double1 == 2.028240766936998E32d);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        int int2 = org.apache.commons.math3.util.FastMath.min(121, (-21));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-21) + "'", int2 == (-21));
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.572245084590763E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.234743841429217E-29d + "'", double1 == 6.234743841429217E-29d);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.9604644775390625E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3234889800848443E-23d + "'", double1 == 1.3234889800848443E-23d);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5040345674078843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.463965950463316E102d), 38.72983346207417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.463965950463316E102d) + "'", double2 == (-1.463965950463316E102d));
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        double double2 = org.apache.commons.math3.util.FastMath.pow(36.01102806275611d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9999546011007675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29317834776176d + "'", double1 == 57.29317834776176d);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5092289492215414d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5573218601131689d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        int int2 = org.apache.commons.math3.util.FastMath.min(57, 48000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.4924307727615732E12d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267927916d + "'", double2 == 1.5707963267927916d);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.0f, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.08618946083013478d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.469446951953615E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953615E-18d + "'", double1 == 3.469446951953615E-18d);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0023620462865979784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        int int2 = org.apache.commons.math3.util.FastMath.max(8, 121);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 121 + "'", int2 == 121);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        long long1 = org.apache.commons.math3.util.FastMath.abs(74L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 74L + "'", long1 == 74L);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6230626596813659d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.42077103379809366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35119970579998244d + "'", double1 == 0.35119970579998244d);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.0455496908326596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.222758749485078E-162d, (-1.0902244075622802d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0902244075622802d + "'", double2 == 1.0902244075622802d);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        float float1 = org.apache.commons.math3.util.FastMath.signum(37.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        long long2 = org.apache.commons.math3.util.FastMath.max(11L, 750L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        double double1 = org.apache.commons.math3.util.FastMath.rint(19.72762780694547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-22026.0f), 0.13512126156864773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-22026.0d) + "'", double2 == (-22026.0d));
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 43, 1.5474252E26f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43.0f + "'", float2 == 43.0f);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 1359.4785752092612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(16.911534525287763d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.3207731692232265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.725974744838183d + "'", double1 == 0.725974744838183d);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-28), 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28L) + "'", long2 == (-28L));
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 63.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3609.6341093241863d + "'", double1 == 3609.6341093241863d);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2246467991473535E-16d, 0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8580495997631784E-4d + "'", double2 == 4.8580495997631784E-4d);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.53711887601422E15d, 1.0007751983046094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948963d + "'", double2 == 1.5707963267948963d);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9963140402878587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.1357533839793369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13492855323327174d + "'", double1 == 0.13492855323327174d);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.962109144995424E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.962109144995424E32d + "'", double1 == 1.962109144995424E32d);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 0, (double) 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        int int2 = org.apache.commons.math3.util.FastMath.min(121, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5709996927170293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999793211509d + "'", double1 == 0.9999999793211509d);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.4043787951567745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1544968138046352d + "'", double1 == 1.1544968138046352d);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9999999999999999d), 0.03418743827970073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5366221983913497d) + "'", double2 == (-1.5366221983913497d));
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-16.999998f), 1.718315292959719d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999996f) + "'", float2 == (-16.999996f));
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(37.999996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.80144007E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.80144028E16f + "'", float1 == 1.80144028E16f);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 4.3368087E-19f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-77L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.254320865115006d) + "'", double1 == (-4.254320865115006d));
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.010518978623430845d, 14.491552334199826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010518978623430845d + "'", double2 == 0.010518978623430845d);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7802246589084126d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5138194831251995E15d + "'", double2 == 3.5138194831251995E15d);
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-36.63870901270898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5435095630016273d) + "'", double1 == (-1.5435095630016273d));
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.15972740774199012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7966205565614266d) + "'", double1 == (-0.7966205565614266d));
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.09453594272628993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-4), (-13L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-11), 109L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 57, 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-8.881785E-16f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0587912E-22f + "'", float1 == 1.0587912E-22f);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.4825767815644055d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3328232608285072E9d + "'", double2 == 1.3328232608285072E9d);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707961895098572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473176442907d + "'", double1 == 1.1624473176442907d);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-2.14748352E9f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-46), 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1023.99994f, 1.0445360463872E13d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.8E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3072.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-12));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.934138719000235E-6d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05680446438604993d + "'", double2 == 0.05680446438604993d);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 24000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24000 + "'", int1 == 24000);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.00031438115249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6973483401028054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.771691154038246d + "'", double1 == 0.771691154038246d);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.4825767815644055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04332913877186294d + "'", double1 == 0.04332913877186294d);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.0468749962747097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04690937387533363d) + "'", double1 == (-0.04690937387533363d));
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8694396821294437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.130528872060167E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.130528872063391E-6d + "'", double1 == 2.130528872063391E-6d);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.3531047710855999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3461505979441017d + "'", double1 == 0.3461505979441017d);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.8984560355111834E18d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }
}

