package org.apache.commons.math3.util;

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
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.636436139626906d, 4.76837215046544E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6364361396270847d + "'", double2 == 0.6364361396270847d);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9466715061814477d, (-750.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0879536745370611E17d + "'", double2 == 7.0879536745370611E17d);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.007570773924451899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1963571677463782d) + "'", double1 == (-0.1963571677463782d));
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.4E-45f, 112);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.2759576E-12f + "'", float2 == 7.2759576E-12f);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.31622776601683805d), 2.2012493530417956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31622776601683805d + "'", double2 == 0.31622776601683805d);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.9379882965789272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2873511500385141d + "'", double1 == 0.2873511500385141d);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.2245095517692758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7972360373305154d + "'", double1 == 1.7972360373305154d);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.20117348891112896d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 6.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.079441482075189d + "'", double1 == 2.079441482075189d);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.240206570923631d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.138117606204215d + "'", double2 == 0.138117606204215d);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.9997010053589297d, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8839283263911947E-6d + "'", double2 == 1.8839283263911947E-6d);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.3472175051613533d, 0.21991180375937053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3472175051613533d + "'", double2 == 1.3472175051613533d);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(12.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.28803497911837345d, 1.9438542029972974E55d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28803497911837345d + "'", double2 == 0.28803497911837345d);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0176411299313266d, 24000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6955243449660649d, 114.59156092460519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114.60410393149922d + "'", double2 == 114.60410393149922d);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 5.8274116E13f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8274116272128E13d + "'", double2 == 5.8274116272128E13d);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-4.016404014253986d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.5474254E26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5996388013001026d, 0.8862740270915485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.064851827889289d + "'", double2 == 1.064851827889289d);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000004f, 95.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2016.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(52.0f, 5.9999995f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.56848573573709d, 0.02567142327678562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.568557862127426d + "'", double2 == 4.568557862127426d);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        double double1 = org.apache.commons.math3.util.FastMath.abs(108.36909013398467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.36909013398467d + "'", double1 == 108.36909013398467d);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.44935555E17f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-62.999996f), 87);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.748777E27f) + "'", float2 == (-9.748777E27f));
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.851651944097903E8d + "'", double1 == 4.851651944097903E8d);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        double double1 = org.apache.commons.math3.util.FastMath.cos(42.281978014156664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12916096376943806d) + "'", double1 == (-0.12916096376943806d));
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 95.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        int int2 = org.apache.commons.math3.util.FastMath.max((-24), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4787371664446284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31990285504313426d) + "'", double1 == (-0.31990285504313426d));
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 137);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 137.0f + "'", float1 == 137.0f);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.984378812835757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.987667336931829d) + "'", double1 == (-0.987667336931829d));
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7476805260785288d + "'", double1 == 0.7476805260785288d);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-57.285126329382095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.022098885221519555d, 1.220703125E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02209888522151955d + "'", double2 == 0.02209888522151955d);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.006517711624664084d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.15841285229840546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15908299996009573d) + "'", double1 == (-0.15908299996009573d));
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.03849869813274515d, 1.570796044359925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02450413114846576d + "'", double2 == 0.02450413114846576d);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-35.000004f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        float float1 = org.apache.commons.math3.util.FastMath.abs(16.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 16.0f + "'", float1 == 16.0f);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.2053244E-5f, 4.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.205325E-5f + "'", float2 == 8.205325E-5f);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.05754533762304682d, (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05754533762304682d + "'", double2 == 0.05754533762304682d);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6000.0d, 109);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-6.395994744886729E7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.395994744886729E7d + "'", double1 == 6.395994744886729E7d);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-4.5035996273704955E15d), (-0.9132181397411984d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18852698277949576d) + "'", double2 == (-0.18852698277949576d));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.99999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9604645E-8f + "'", float1 == 5.9604645E-8f);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.015628966602108815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01563023926086494d + "'", double1 == 0.01563023926086494d);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        int int2 = org.apache.commons.math3.util.FastMath.max((-46), 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(67492.433469899d, 95);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.673650743718166E33d + "'", double2 == 2.673650743718166E33d);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6143999.5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5310603550457816d), 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1113714.285704971d) + "'", double2 == (-1113714.285704971d));
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 4.0000005f, 2.183039280066544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.000000476837158d + "'", double2 == 4.000000476837158d);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.3440688253002957E43d, 4.507682749749894E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10076989848420022d) + "'", double2 == (-0.10076989848420022d));
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0029602048452943563d, 0.8352990546308762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03090864192980489d + "'", double2 == 0.03090864192980489d);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.4738100493246071d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008269545389751129d) + "'", double1 == (-0.008269545389751129d));
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.441639728767535d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(36.83486947926985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.299407810311169d + "'", double1 == 4.299407810311169d);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.2455323929060171d), (double) 127.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2455323929060171d + "'", double2 == 0.2455323929060171d);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.000002f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000001f + "'", float2 == 9.000001f);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        int int1 = org.apache.commons.math3.util.FastMath.round((-100.000015f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(7.625595310085968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7203303322120274d + "'", double1 == 2.7203303322120274d);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.621405651764134d + "'", double1 == 6.621405651764134d);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.984378812835757d, 1.222048239275884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.182142966065322d + "'", double2 == 1.182142966065322d);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(8.445151201175241E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.445150197320443E-4d + "'", double1 == 8.445150197320443E-4d);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        int int1 = org.apache.commons.math3.util.FastMath.round(95.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        double double2 = org.apache.commons.math3.util.FastMath.pow(28.031427297728094d, 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9055278128819425E66d + "'", double2 == 3.9055278128819425E66d);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7979814834746045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9239385290558519d + "'", double1 == 0.9239385290558519d);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0357153140224502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.817120640969395d + "'", double1 == 2.817120640969395d);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.4835298641951802d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.6865874069985795d), 1.817120640969395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.36126135694227524d) + "'", double2 == (-0.36126135694227524d));
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.722673277468218d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2825589641379689d) + "'", double1 == (-1.2825589641379689d));
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.345632762712187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        long long2 = org.apache.commons.math3.util.FastMath.min(1025L, (long) 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120592379816d + "'", double1 == 4.615120592379816d);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.257495530973488d, (-0.6493713266343334d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6493713266343334d) + "'", double2 == (-0.6493713266343334d));
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.027009992528778577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027003427115127206d + "'", double1 == 0.027003427115127206d);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9630315308191313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189460164233138d + "'", double1 == 1.1189460164233138d);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.011048544114584294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011048319343698858d + "'", double1 == 0.011048319343698858d);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(86.74231627807738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9223372036854775807L, 1025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48121182505960347d + "'", double1 == 0.48121182505960347d);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1048576.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.23794004E27f, 22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.192297E33f + "'", float2 == 5.192297E33f);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.005159740711202605d), (-0.5063590621241333d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005159740711202605d) + "'", double2 == (-0.005159740711202605d));
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 5, 95);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.980704E29f + "'", float2 == 1.980704E29f);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8839283263911947E-6d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.631755105089335E-58d + "'", double2 == 5.631755105089335E-58d);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.3407554936658988d), (-0.6158517539445397d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3407554936658988d) + "'", double2 == (-0.3407554936658988d));
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        int int2 = org.apache.commons.math3.util.FastMath.min(87, (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 85);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 85L + "'", long1 == 85L);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.718315292959719d, 1.6363319661787273E69d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.718315292959719d + "'", double2 == 1.718315292959719d);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.6263033E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6263032587282567E-16d + "'", double1 == 1.6263032587282567E-16d);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707131510417711d, 42);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.722141997665035E8d + "'", double2 == 1.722141997665035E8d);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9811607348543806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8679892780935093d + "'", double1 == 0.8679892780935093d);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-34.0f), 0.7615941559679877d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-33.999996f) + "'", float2 == (-33.999996f));
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.06121390174112848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06129053316029253d + "'", double1 == 0.06129053316029253d);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.664058605036434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.664058605036434d + "'", double2 == 0.664058605036434d);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-7276.563998161455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7276.563998161455d + "'", double1 == 7276.563998161455d);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0009693077094823d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-1024.0f), (double) 661L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 298.0d + "'", double2 == 298.0d);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        double double1 = org.apache.commons.math3.util.FastMath.acos(84010.50108557595d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5529410816553442d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.45158262939846133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707962075856072d + "'", double1 == 0.5707962075856072d);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 0.015625004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015626275478252225d + "'", double1 == 0.015626275478252225d);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        long long1 = org.apache.commons.math3.util.FastMath.round(89.93708824838384d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 90L + "'", long1 == 90L);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7252312445040109d, 1.0038848218537937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7243266797487267d + "'", double2 == 0.7243266797487267d);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0455496908326596d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0455496908326594d) + "'", double2 == (-1.0455496908326594d));
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.3899208787571631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9092973276085183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7207948226954853d + "'", double1 == 0.7207948226954853d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        double double2 = org.apache.commons.math3.util.FastMath.log(13.0d, 10.775572601667566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9268338064251921d + "'", double2 == 0.9268338064251921d);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 1.4074442083028742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4074442083028742d + "'", double2 == 1.4074442083028742d);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6649237511146353d + "'", double1 == 1.6649237511146353d);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.39567227992801673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4853824481344817d + "'", double1 == 1.4853824481344817d);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 38, 1.3234889800848443E-23d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.999996f + "'", float2 == 37.999996f);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.30039148809513d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.5035996E15f, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.127541722024175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.127541722024175d + "'", double1 == 10.127541722024175d);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E30d + "'", double1 == 1.5845632502852868E30d);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.5565355E-17f, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.805697930099055E-163d + "'", double2 == 2.805697930099055E-163d);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5707619637766896d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006135788921002694d + "'", double2 == 0.006135788921002694d);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-63959947L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15677179356334517d) + "'", double1 == (-0.15677179356334517d));
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, (-1.5874010519681967d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.12499492157923593d, (-0.34807962410585763d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12499492157923592d + "'", double2 == 0.12499492157923592d);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.18852698277949576d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-2.614630070254418E38d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(112.28984325071114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8244390624724165d + "'", double1 == 4.8244390624724165d);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 16128);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 16128.0f + "'", float1 == 16128.0f);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.061117385232788E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3268488628104324E9d + "'", double1 == 2.3268488628104324E9d);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-126.99999237060547d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.103516E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.2759576E-12f + "'", float1 == 7.2759576E-12f);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-2.5104620932674017E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.7707893739848156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        int int2 = org.apache.commons.math3.util.FastMath.min(26, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0624389611184597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24987789241639546d + "'", double1 == 0.24987789241639546d);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8190397210252126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7854285922632093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24152573278580192d) + "'", double1 == (-0.24152573278580192d));
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.094128058066607E-6d, (double) 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.094128058066607E-6d + "'", double2 == 3.094128058066607E-6d);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103803720955957d + "'", double1 == 2.103803720955957d);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        int int2 = org.apache.commons.math3.util.FastMath.min((-67), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67) + "'", int2 == (-67));
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15904041823988746d + "'", double1 == 0.15904041823988746d);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.13845599541372E62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.5203598367898d + "'", double1 == 143.5203598367898d);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.4201670368266393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40869420820251295d) + "'", double1 == (-0.40869420820251295d));
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5707509268824842d, 100.00000763058662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.01234316119029d + "'", double2 == 100.01234316119029d);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4210854715202004E-14d, 0.42393142244212184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4210854715202007E-14d + "'", double2 == 1.4210854715202007E-14d);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.009265538105056E-36d + "'", double1 == 3.009265538105056E-36d);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9569323043843873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8505899239287635d) + "'", double1 == (-0.8505899239287635d));
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 100, 1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.02704116433650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5493445896015094d + "'", double1 == 1.5493445896015094d);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2.34967110883676E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3493950827402165E-4d) + "'", double1 == (-2.3493950827402165E-4d));
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.3368087E-19f, (float) 724L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.3368087E-19f + "'", float2 == 4.3368087E-19f);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9259559902848267d, (-0.002864717361895405d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0002204029014312d + "'", double2 == 1.0002204029014312d);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.0517578E-5f, 1023.00006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.00006f + "'", float2 == 1023.00006f);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        long long1 = org.apache.commons.math3.util.FastMath.abs(63959947L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63959947L + "'", long1 == 63959947L);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.5111573E23f), 1023);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 141.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.874342729548825d + "'", double1 == 11.874342729548825d);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-724.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.000001f + "'", float1 == 8.000001f);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        long long2 = org.apache.commons.math3.util.FastMath.min((-49L), 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49L) + "'", long2 == (-49L));
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.29105342757312413d, 48000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8409242565311499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.318508883771207d + "'", double1 == 2.318508883771207d);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 51L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(121.00001f, 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 121.00001f + "'", float2 == 121.00001f);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1.2207033E-4f), 2.9932228461263812d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.5581072508214118d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.08520242944567852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08540950652865989d + "'", double1 == 0.08540950652865989d);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0E-200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-200d + "'", double1 == 1.0E-200d);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-17.854718247901992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5148471747309298d) + "'", double1 == (-1.5148471747309298d));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.768371582029804E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.556090791759155d) + "'", double1 == (-14.556090791759155d));
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4891786569747215d, 112);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5399608038721326E33d + "'", double2 == 2.5399608038721326E33d);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(22025.465794806678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.0d + "'", double1 == 22026.0d);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.4414062985774404E-4d, 2.534652329259588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.981093676386119E-10d + "'", double2 == 6.981093676386119E-10d);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1500, 1.8136451593772986d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1499.9999f + "'", float2 == 1499.9999f);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7476805260785286d, 1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.559979959933302d) + "'", double2 == (-0.559979959933302d));
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-4.489537669538574d), (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.489537669538574d) + "'", double2 == (-4.489537669538574d));
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        double double2 = org.apache.commons.math3.util.FastMath.min(3072.0d, 10.778977123006351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.778977123006351d + "'", double2 == 10.778977123006351d);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.220703128031649E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220703121968351E-4d + "'", double1 == 1.220703121968351E-4d);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2064384.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2064383.9f) + "'", float1 == (-2064383.9f));
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.5991879441440986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        double double2 = org.apache.commons.math3.util.FastMath.min(65.9642038991485d, (-1023.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1023.0d) + "'", double2 == (-1023.0d));
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.8924475E-6f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.06869976497710933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07117356709453243d) + "'", double1 == (-0.07117356709453243d));
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.980232238769531E-8d + "'", double1 == 2.980232238769531E-8d);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        float float1 = org.apache.commons.math3.util.FastMath.signum(141.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.09967381678567376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3157116038185384d + "'", double1 == 0.3157116038185384d);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000005f + "'", float1 == 1.0000005f);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.037494614331192756d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.999231893784963d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(57.29577914238959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.806328772615d + "'", double1 == 3282.806328772615d);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.42393142244212184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-11.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2239800905693157d) + "'", double1 == (-2.2239800905693157d));
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.8211864E-34f, (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        int int1 = org.apache.commons.math3.util.FastMath.round((-15.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        float float2 = org.apache.commons.math3.util.FastMath.max(121.00001f, 6.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 121.00001f + "'", float2 == 121.00001f);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(113.05919416648635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421039145551427d + "'", double1 == 5.421039145551427d);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-15), 32.01562118716424d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.7615941542245016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.837383096255359d + "'", double1 == 0.837383096255359d);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        float float2 = org.apache.commons.math3.util.FastMath.min((-42.0f), 3.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-42.0f) + "'", float2 == (-42.0f));
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.220703131063298E-4d, (-0.006517711624664084d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.006517711624664084d) + "'", double2 == (-0.006517711624664084d));
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.6393874603973986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986208908512648d + "'", double1 == 0.9986208908512648d);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2979.9579870417283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0d + "'", double1 == 2979.0d);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        float float2 = org.apache.commons.math3.util.FastMath.max(112.0f, (float) (-34L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 112.0f + "'", float2 == 112.0f);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 7.7990222E28f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.21952815734656d + "'", double1 == 67.21952815734656d);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-6.2396687926517345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.372890020158183d, (-0.507733245764594d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.507733245764594d) + "'", double2 == (-0.507733245764594d));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9865166189553409d, 1.2785394510828827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2785394510828827d + "'", double2 == 1.2785394510828827d);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.2227587494850775E-162d, 0.9428569762377156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2227587494850775E-162d + "'", double2 == 2.2227587494850775E-162d);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18916607826819679d + "'", double1 == 0.18916607826819679d);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.17452205010929986d), (-0.2245095517692758d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1745220501092999d) + "'", double2 == (-0.1745220501092999d));
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.778151319412887d + "'", double1 == 0.778151319412887d);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(38.999996f, 6.395994700000028E7d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.0f + "'", float2 == 39.0f);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0788405256891818E-19d, (-4.644483341943245d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0788405256891818E-19d) + "'", double2 == (-1.0788405256891818E-19d));
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 9.3458478E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.34584778752E12d + "'", double1 == 9.34584778752E12d);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(8.000001f, 4.611686E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.000001f + "'", float2 == 8.000001f);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.66633186E17f, 0.30196465536956996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.8634010859072955E41d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(225.6516556453549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.983179481759456E97d + "'", double1 == 9.983179481759456E97d);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.999938966709995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1331220770383494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12497672296565861d + "'", double1 == 0.12497672296565861d);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.03045703062337168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030447616490799845d + "'", double1 == 0.030447616490799845d);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.5474252E26f, (double) 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.0d + "'", double2 == 230.0d);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.03910760948811d + "'", double1 == 35.03910760948811d);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(12.16264444841069d, 7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.192008522685015d + "'", double2 == 14.192008522685015d);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.002762136028646074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002762129004191503d + "'", double1 == 0.002762129004191503d);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1523231175411188d, 2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4222940841899434d + "'", double2 == 2.4222940841899434d);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.664058605036434d, 0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030765742067207565d + "'", double2 == 0.030765742067207565d);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.575736556591671E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 16.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5083775242205284d + "'", double1 == 1.5083775242205284d);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0449875513618778d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999999708962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.8244390624724165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6834468251959231d + "'", double1 == 0.6834468251959231d);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        long long2 = org.apache.commons.math3.util.FastMath.min((-63959947L), (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63959947L) + "'", long2 == (-63959947L));
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4934018991172873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9564986140232484d + "'", double1 == 0.9564986140232484d);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.50964403924188d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3820430096814796E16d + "'", double2 == 3.3820430096814796E16d);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.4837637461282407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(46340.950001051984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.743802877399936d + "'", double1 == 10.743802877399936d);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.16227766016838d, 0.026871352843612424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012569432679386039d + "'", double2 == 0.012569432679386039d);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.000000476837158d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 9.6935236E-24f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.736583018476897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6717606467088741d) + "'", double1 == (-0.6717606467088741d));
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 4.768371013597152E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0678869494090629d, 0.018076171710472027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004417737432825211d) + "'", double2 == (-0.004417737432825211d));
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        double double1 = org.apache.commons.math3.util.FastMath.floor(375.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 375.0d + "'", double1 == 375.0d);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.7465363222182906d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.6704132351346599d), (-724));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.5967129900882E-219d) + "'", double2 == (-7.5967129900882E-219d));
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.3531047710855999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        long long2 = org.apache.commons.math3.util.FastMath.min((-127L), (long) (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0020572272738824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5399901561304421d + "'", double1 == 0.5399901561304421d);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.000001f, 1.570502024105884E10d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.000002f + "'", float2 == 9.000002f);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-44.0f), 3.1664968E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-16.628369761528415d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1L, 1.5570244291020932d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8414711136259806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261916121524525d + "'", double1 == 1.2261916121524525d);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.570796326794866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(198836.6517898549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 74L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 74.0f + "'", float1 == 74.0f);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.01728276659971805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.011344361305298496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011344117993174857d + "'", double1 == 0.011344117993174857d);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.3687091E8f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3687088E8f + "'", float2 == 5.3687088E8f);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.363655626077857d + "'", double1 == 2.363655626077857d);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.89704490591024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.582875862207597d) + "'", double1 == (-0.582875862207597d));
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.3525223293259374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33861057481406626d + "'", double1 == 0.33861057481406626d);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.04453594E13f, (double) 87L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0445359415295998E13d + "'", double2 == 1.0445359415295998E13d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 19);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7848229996318725E8d + "'", double1 == 1.7848229996318725E8d);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.48689816668285923d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.02209888522151955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002441903015205d + "'", double1 == 1.0002441903015205d);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9900817297659751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7804143539550034d + "'", double1 == 0.7804143539550034d);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.08509937967107274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.3407554936658988d), 0.1709704813917884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3407554936658988d) + "'", double2 == (-0.3407554936658988d));
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9999999793211509d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 512.0f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        int int2 = org.apache.commons.math3.util.FastMath.min(82, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.119694790316062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        float float2 = org.apache.commons.math3.util.FastMath.max((-6.0000005f), 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5574081330086431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479615911592163d + "'", double1 == 1.2479615911592163d);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8416706118107826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9174260797529045d + "'", double1 == 0.9174260797529045d);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        int int2 = org.apache.commons.math3.util.FastMath.min(106, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.82118644197349E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-77.25073564122303d) + "'", double1 == (-77.25073564122303d));
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.99627207622075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-15));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.999999999999998d) + "'", double1 == (-14.999999999999998d));
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6711062449719222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.4994888620096063d), 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37542.60032247775d + "'", double2 == 37542.60032247775d);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.2752186792611908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8220761705355898d + "'", double1 == 0.8220761705355898d);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-13L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        double double2 = org.apache.commons.math3.util.FastMath.pow(50.00003828849029d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.812541878132458E11d + "'", double2 == 7.812541878132458E11d);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        int int2 = org.apache.commons.math3.util.FastMath.min(40, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.39427356861218293d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0652086128946063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8064232240356983d + "'", double1 == 1.8064232240356983d);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.664339742098155d) + "'", double1 == (-8.664339742098155d));
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.27376591469257794d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-29));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1661.5776058793872d) + "'", double1 == (-1661.5776058793872d));
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0678869494090629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4079391918240248d + "'", double1 == 0.4079391918240248d);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.9905748953335048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5320726150076251d + "'", double1 == 1.5320726150076251d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.62949953421312E15d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7917957937422434E110d + "'", double2 == 1.7917957937422434E110d);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5707958499577952d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        long long1 = org.apache.commons.math3.util.FastMath.round(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 286L + "'", long1 == 286L);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.5725018298157405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 376.5766156904528d + "'", double1 == 376.5766156904528d);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9092974268256814d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        int int1 = org.apache.commons.math3.util.FastMath.round(121.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 121 + "'", int1 == 121);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2016.0f, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8673322E-8f + "'", float2 == 5.8673322E-8f);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.6964543897941453E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6964543897941453E-10d + "'", double1 == 2.6964543897941453E-10d);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.3687088E8f, (double) 6.2277026E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3687091E8f + "'", float2 == 5.3687091E8f);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.970291913552122d, 1.000000000705009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.970291913552122d + "'", double2 == 3.970291913552122d);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        int int2 = org.apache.commons.math3.util.FastMath.min(1024, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', (long) (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.2980741E33f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.795192390859045E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.407320583316448E23d + "'", double1 == 2.407320583316448E23d);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8430153355241219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8430153355241219d + "'", double1 == 0.8430153355241219d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8796857765384196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6373932969780973d + "'", double1 == 0.6373932969780973d);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1025.0000000262442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.889624833399925d + "'", double1 == 17.889624833399925d);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.2380693740851022E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2380693740851046E-15d + "'", double1 == 2.2380693740851046E-15d);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44920032009295796d + "'", double1 == 0.44920032009295796d);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3860955000761808E82d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 189.1384684272796d + "'", double1 == 189.1384684272796d);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1022.9999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.62364218539641d) + "'", double1 == (-7.62364218539641d));
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.4835298641951802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961946980917455d + "'", double1 == 0.9961946980917455d);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-12.600018220521122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        int int2 = org.apache.commons.math3.util.FastMath.min((-7), 258048);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.102398704460064E-240d, (-13.0591403123201d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.102398704460063E-240d + "'", double2 == 9.102398704460063E-240d);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.39711760170500326d, (double) 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.768373287333816E-7d + "'", double2 == 4.768373287333816E-7d);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5845631E30f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9089668247421057d, 0.9312063052667533d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9312063052667533d + "'", double2 == 0.9312063052667533d);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9999999935301913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.469808709720757E-9d) + "'", double1 == (-6.469808709720757E-9d));
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22.24923197281617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.71690915460709d + "'", double1 == 4.71690915460709d);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6000.00048828125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47258990005819373d) + "'", double1 == (-0.47258990005819373d));
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.006613162659182065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006613210862542312d + "'", double1 == 0.006613210862542312d);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-35), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35L) + "'", long2 == (-35L));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6929693744345002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3011415658699481d + "'", double1 == 1.3011415658699481d);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(8.552389107874104d, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4692892608394357E11d + "'", double2 == 1.4692892608394357E11d);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999303766734422d + "'", double1 == 0.9999303766734422d);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-27.725887222397812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.49755813888E11d) + "'", double1 == (-5.49755813888E11d));
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.663561548316891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.1274905242232915d), 1.2220482392758838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1274905242232915d + "'", double2 == 0.1274905242232915d);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        long long2 = org.apache.commons.math3.util.FastMath.min((-29L), (long) (-49));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-49L) + "'", long2 == (-49L));
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(11014.000000000002d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11014.00004539677d + "'", double2 == 11014.00004539677d);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.256472782294562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25937114537702016d) + "'", double1 == (-0.25937114537702016d));
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9287285890811148d) + "'", double1 == (-0.9287285890811148d));
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6483621820319939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8655109334162819d + "'", double1 == 0.8655109334162819d);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4431436235212173d) + "'", double1 == (-0.4431436235212173d));
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 6.047306400992099E54d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        long long1 = org.apache.commons.math3.util.FastMath.round(14.491552334199826d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0001f + "'", float1 == 1025.0001f);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4844222297453324d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 16128, (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1544968138046352d, 416);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.023588710932147E25d + "'", double2 == 9.023588710932147E25d);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2490457723982544d) + "'", double1 == (-1.2490457723982544d));
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6499700825897167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.4276814831852543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8d + "'", double1 == 0.8d);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 7.0368744E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0368744177664E13d + "'", double1 == 7.0368744177664E13d);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0021077632011064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001053326851825d + "'", double1 == 1.001053326851825d);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.24071465746731802d), 2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.240714657467318d) + "'", double2 == (-0.240714657467318d));
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.079576664122082E-13d, 0.7853951831651208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.467542420684997E-13d + "'", double2 == 6.467542420684997E-13d);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9759679168660529d, 1.4242728127018154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.975967916866053d + "'", double2 == 0.975967916866053d);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(57.297561358141586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(69.53786160730876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.934966851305078d + "'", double1 == 4.934966851305078d);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.09801546060418229d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.1771933557663626E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.177193355766367E-8d + "'", double1 == 5.177193355766367E-8d);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.06121390174112848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24741443317059836d + "'", double1 == 0.24741443317059836d);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9905152468032868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9905152468032867d) + "'", double1 == (-0.9905152468032867d));
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.570750926882484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441980456765423d + "'", double1 == 0.9441980456765423d);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.626935056102789E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0335283017511962E17d + "'", double1 == 4.0335283017511962E17d);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.420521517896809E7d, (-2.541098841762901E-21d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.420521517896808E7d + "'", double2 == 6.420521517896808E7d);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(16.911534525287767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8854448922062113d + "'", double1 == 2.8854448922062113d);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.09951163E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.299737579712394E13d + "'", double1 == 6.299737579712394E13d);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        long long2 = org.apache.commons.math3.util.FastMath.max(12L, 128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.8260092206769861d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.220703125E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2207031189367021E-4d) + "'", double1 == (-1.2207031189367021E-4d));
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.38770518426248524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.8109550258763553d), (-0.6641687893997885d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.6738779353175968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9946917938265513d) + "'", double1 == (-0.9946917938265513d));
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5.729577951308231E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.793076005481666d + "'", double1 == 50.793076005481666d);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 6L, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.5073795E29f + "'", float2 == 9.5073795E29f);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 12.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.289428545755805d + "'", double1 == 2.289428545755805d);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.40625f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.47238216160195395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47238216160195395d + "'", double1 == 0.47238216160195395d);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0194839173657902E-28d, 1.4242728127018154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0194839173657907E-28d + "'", double2 == 2.0194839173657907E-28d);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.9527368038560544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.768372150465078E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        long long2 = org.apache.commons.math3.util.FastMath.max(14L, (long) 85);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(12.000001f, 82);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8028443E25f + "'", float2 == 5.8028443E25f);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6110610404570322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.2679097686563066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1023);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1023 + "'", int1 == 1023);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.130528872063391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.953601409492212E10d, (-0.5908872108403207d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5908872108403207d) + "'", double2 == (-0.5908872108403207d));
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-29));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7569856324386435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891171717341581d + "'", double1 == 0.9891171717341581d);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.3789063f, (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3789063f + "'", float2 == 0.3789063f);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3328.0f, 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.36207616E8f + "'", float2 == 4.36207616E8f);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.009241694678239648d, (-0.12452369428236172d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 258047.98f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.154048013116315d + "'", double1 == 13.154048013116315d);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6065306597126334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5452076238305836d + "'", double1 == 0.5452076238305836d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.568557862127426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.717136108769004d + "'", double1 == 1.717136108769004d);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.2455323929060171d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.5366847334153033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.3458488E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        long long2 = org.apache.commons.math3.util.FastMath.min(15L, 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.6571063883041222d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.110223E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.36870912E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9451738260608966d) + "'", double1 == (-0.9451738260608966d));
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7001686872743049d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 149L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        int int2 = org.apache.commons.math3.util.FastMath.max((-38), 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(51.999996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3803161142273d + "'", double1 == 2979.3803161142273d);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.21991180375937053d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        int int2 = org.apache.commons.math3.util.FastMath.min(62, 24000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.9251446403922804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0628794909955053d) + "'", double1 == (-1.0628794909955053d));
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.14492059268744914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13533528323661265d + "'", double1 == 0.13533528323661265d);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8956399139416201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.714168230976534d + "'", double1 == 0.714168230976534d);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        long long2 = org.apache.commons.math3.util.FastMath.max(49L, (long) 19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.8014400656965636E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014400656965636E16d + "'", double1 == 1.8014400656965636E16d);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(44.29430561789672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.813181320788414d + "'", double1 == 3.813181320788414d);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(36.54883000018738d, 2.1306478036226255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.54883000018737d + "'", double2 == 36.54883000018737d);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-4.124460139243949E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0449875513618778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04400497277345335d + "'", double1 == 0.04400497277345335d);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.81474976710656E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794893d + "'", double1 == 1.570796326794893d);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 49);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.000004f + "'", float1 == 49.000004f);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.183039280066544d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.017453291479645996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999847695174547d + "'", double1 == 0.999847695174547d);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        long long2 = org.apache.commons.math3.util.FastMath.min((-13L), 121L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13L) + "'", long2 == (-13L));
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-4.644483341943245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009614495783373379d + "'", double1 == 0.009614495783373379d);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 0.015625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.23794004E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2379400392853803E27d + "'", double1 == 1.2379400392853803E27d);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-512.0f), 85.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.0f + "'", float2 == 512.0f);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(512.4999389648438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8830656988855172E222d + "'", double1 == 1.8830656988855172E222d);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0000005f, (float) (-10L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0000005f) + "'", float2 == (-1.0000005f));
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.258437780964463d + "'", double1 == 4.258437780964463d);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000004f, 0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000002f + "'", float2 == 1.0000002f);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        double double1 = org.apache.commons.math3.util.FastMath.acos(31.910491617380085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.99038372622381d + "'", double1 == 103.99038372622381d);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.5527137E-15f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1054274E-15f + "'", float2 == 7.1054274E-15f);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 95, 5.8028443E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8028443E25f + "'", float2 == 5.8028443E25f);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.102398704460064E-240d, 2.000003572217667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.102398704460064E-240d + "'", double2 == 9.102398704460064E-240d);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        double double1 = org.apache.commons.math3.util.FastMath.asin(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.0016997123712174172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11934158783038878d) + "'", double1 == (-0.11934158783038878d));
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.9851128205308588d, 7.378697629483821E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9851128205308588d + "'", double2 == 1.9851128205308588d);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        int int1 = org.apache.commons.math3.util.FastMath.round(20.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.011020261488361868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011019815387207426d + "'", double1 == 0.011019815387207426d);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.12836832618957508d, (-2.2343605386104213d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5565511495583535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5703078669494845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1623268462368155d + "'", double1 == 1.1623268462368155d);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2993419E33f, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.1977139126350744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8791814797127908d + "'", double1 == 1.8791814797127908d);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-77), 121.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 121.0f + "'", float2 == 121.0f);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7476805260785288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.5269841324701218E-175d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 20, (-6.103515261202119E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.999999999999996d + "'", double2 == 19.999999999999996d);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.5370264E31f, 1.80144028E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.80144028E16f + "'", float2 == 1.80144028E16f);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8822181326231554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7955912160680348d + "'", double1 == 0.7955912160680348d);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2.842859999667946E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        long long2 = org.apache.commons.math3.util.FastMath.max(67L, (long) 82);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 82L + "'", long2 == 82L);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.34457037979822E287d, 2.534652329259588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3445703797982198E287d + "'", double2 == 2.3445703797982198E287d);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8505899239287635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(20.523056711799125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.737877514817272d + "'", double1 == 2.737877514817272d);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.643596238307588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(79.22121624008889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.065431157228115d + "'", double1 == 5.065431157228115d);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 131072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.737097583153588d) + "'", double1 == (-23.737097583153588d));
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0012766217907877948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999991851185123d + "'", double1 == 0.9999991851185123d);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 5.877472E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.37651803597089E-13d + "'", double1 == 8.37651803597089E-13d);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 3.5527137E-15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.7990222E28f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7979814834746045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6981532841544033d + "'", double1 == 0.6981532841544033d);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        long long2 = org.apache.commons.math3.util.FastMath.min(49L, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.693523592216698E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.5295101006116452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.16499547112384425d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16499547112384425d + "'", double2 == 0.16499547112384425d);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 16L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.061290475572342844d, 87.09341963470486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06129047557234285d + "'", double2 == 0.06129047557234285d);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-9.704060527839234d), (double) 20.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.704060527839232d) + "'", double2 == (-9.704060527839232d));
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0141204E32f, (-7.4505815E-9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0141204E32f + "'", float2 == 1.0141204E32f);
    }
}

