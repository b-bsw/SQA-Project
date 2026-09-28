package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.395560437890808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.341378834035669d + "'", double1 == 2.341378834035669d);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.3645773857050396E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.62624646822723d) + "'", double1 == (-11.62624646822723d));
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8414709624298973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0017485284275232642d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.017452406441346557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.172979183131974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4741028400800176d + "'", double1 == 1.4741028400800176d);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.2737368E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.7105054E-20f + "'", float1 == 2.7105054E-20f);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.9249057814734434E-146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3874097381355818E-73d + "'", double1 == 1.3874097381355818E-73d);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 109.0f, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.872605741056E12d + "'", double2 == 1.872605741056E12d);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.4258259770489514E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.306852819440056d + "'", double1 == 19.306852819440056d);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.0930501604482622d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0016240316693311781d) + "'", double1 == (-0.0016240316693311781d));
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.8669148977008805E31d, 0.9442157056960517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7564260666383823d, 0.9483291904489717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19005372815008248d + "'", double2 == 0.19005372815008248d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 6L, (-1.681247833462456E-6d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.192093E-7f + "'", float1 == 1.192093E-7f);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.733041938654942E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.489562688139413E-4d + "'", double1 == 6.489562688139413E-4d);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.020431121366449895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020429699966498963d + "'", double1 == 0.020429699966498963d);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(7.0368744E13f, 22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.951479E20f + "'", float2 == 2.951479E20f);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.5475403976954647E-5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.023631415874861814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02363141587486181d) + "'", double1 == (-0.02363141587486181d));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 192.00003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.257495530973488d + "'", double1 == 5.257495530973488d);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99999316981082d + "'", double1 == 89.99999316981082d);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        double double2 = org.apache.commons.math3.util.FastMath.pow(512.5d, 48000);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 77L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-4.185891831851989d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        double double1 = org.apache.commons.math3.util.FastMath.asin(750.0003050086722d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.998222988255625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.703958628749687d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000008f, 1.0678494519699369E-13d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.082648376090521d, 0.6215477523208265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5092289492215414d + "'", double2 == 1.5092289492215414d);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-14));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 50L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1546709519529927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.154670951952993d + "'", double1 == 1.154670951952993d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.3486868894677745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3557956740321896d + "'", double1 == 0.3557956740321896d);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, (-1024));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1024) + "'", int2 == (-1024));
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        int int2 = org.apache.commons.math3.util.FastMath.min((-5), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5658388325948494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2513348203398038d + "'", double1 == 1.2513348203398038d);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.5035996E15f), 4.6202334E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9999999999998178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707957231599103d + "'", double1 == 1.5707957231599103d);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4161536.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-77), (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0038848218537937d, 0.3557956740321896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.001380476919493d + "'", double2 == 1.001380476919493d);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0279410268437934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.89668242649342d + "'", double1 == 58.89668242649342d);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0409981776839905E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.964480206210241E10d + "'", double1 == 5.964480206210241E10d);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.68851581036831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2147001683791265d + "'", double1 == 1.2147001683791265d);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-50));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.396415115233689E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1163850408516038E48d + "'", double1 == 1.1163850408516038E48d);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1411011610973407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0682233666688539d + "'", double1 == 1.0682233666688539d);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.10412335356742336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10374868784289946d) + "'", double1 == (-0.10374868784289946d));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.5347252927908293d), 1049600.000026874d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        double double1 = org.apache.commons.math3.util.FastMath.acos(11.575836902790211d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403443755868327d + "'", double1 == 0.5403443755868327d);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.4929859817864055E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.5602333178783d + "'", double1 == 105.5602333178783d);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        long long2 = org.apache.commons.math3.util.FastMath.min(51L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.0282408E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0282408E32f + "'", float1 == 2.0282408E32f);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.020093845590042958d, 0.09545486558053895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020093845590042958d + "'", double2 == 0.020093845590042958d);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.776264E-21f, (float) 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.776264E-21f + "'", float2 == 6.776264E-21f);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99327.99f + "'", float2 == 99327.99f);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-5.305943194514724d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.56848573573709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.20420038285032d + "'", double1 == 48.20420038285032d);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.000000003691417d, 10.395560437890808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.424551185103434d + "'", double2 == 14.424551185103434d);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8180579987125934d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.6953302980477645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08194897316958018d + "'", double1 == 0.08194897316958018d);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.050344007274675445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050322743661769115d + "'", double1 == 0.050322743661769115d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5223347012340139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6859592695212269d + "'", double1 == 1.6859592695212269d);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-34L), 5999.999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(56.33181993058053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        double double1 = org.apache.commons.math3.util.FastMath.signum(11.430432289730845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5619516332603731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-15));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.2207032644558522E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207032674875024E-4d + "'", double1 == 1.2207032674875024E-4d);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000003569043052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000003569043054d + "'", double1 == 1.0000003569043054d);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.511732844609233E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        int int1 = org.apache.commons.math3.util.FastMath.abs(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 12, 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.39882781628543595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6711062449719222d + "'", double1 == 0.6711062449719222d);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        double double1 = org.apache.commons.math3.util.FastMath.atan(19.36491594307659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5192023754710313d + "'", double1 == 1.5192023754710313d);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.121079351920185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8046132754103141d + "'", double1 == 1.8046132754103141d);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        int int2 = org.apache.commons.math3.util.FastMath.min(3072, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 18);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6000.0d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.572245084590763E-27d + "'", double2 == 3.572245084590763E-27d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7670734698904623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6965292885977625d + "'", double1 == 0.6965292885977625d);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.4551915E-9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4551915228366852E-9d + "'", double1 == 1.4551915228366852E-9d);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.445152205030683E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.445151201175241E-4d + "'", double1 == 8.445151201175241E-4d);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.06338233E37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.25710314926863d + "'", double1 == 85.25710314926863d);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9127058362020531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.9850571258202687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.996260786024779d + "'", double1 == 1.996260786024779d);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(225.6516556453549d, 8.445152205030683E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.7772740342787473E-4d) + "'", double2 == (-2.7772740342787473E-4d));
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.099338555038559d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.649946976182961E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 57.32153907959692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.32153907959692d + "'", double2 == 57.32153907959692d);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(99.99999999999999d, 1.0445360463872E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.573628439715033E-12d + "'", double2 == 9.573628439715033E-12d);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-4.12316828E11f), 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(660.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.70992026436488d + "'", double1 == 25.70992026436488d);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-4.1588830833596715d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-149.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3071.9998f, (-49));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4569678E-12f + "'", float2 == 5.4569678E-12f);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3874097381355818E-73d, 1.5200669294466769d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3874097381355818E-73d + "'", double2 == 1.3874097381355818E-73d);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.5258789E-5f, (-22026.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5258789E-5f) + "'", float2 == (-1.5258789E-5f));
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8209470861497329d + "'", double1 == 0.8209470861497329d);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        double double1 = org.apache.commons.math3.util.FastMath.log(73.14335945248362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.292421343475038d + "'", double1 == 4.292421343475038d);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 192);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-128.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.4414062985774393E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002441704346068d + "'", double1 == 1.0002441704346068d);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.7079938E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7079938359367694E27d + "'", double1 == 2.7079938359367694E27d);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(71.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-127.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.2513348203398038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(375.0d, (double) (-62.999992f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 374.99999999999994d + "'", double2 == 374.99999999999994d);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.3687091E8f, (float) (-1023L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.3687091E8f + "'", float2 == 5.3687091E8f);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 16.63553233343869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        int int1 = org.apache.commons.math3.util.FastMath.abs(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        int int1 = org.apache.commons.math3.util.FastMath.round(16128.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16128 + "'", int1 == 16128);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9499111091905081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02231703323144474d) + "'", double1 == (-0.02231703323144474d));
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 749.9998f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.337171937726513E-50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.337171937726513E-50d + "'", double1 == 4.337171937726513E-50d);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.45093845821887724d, 3.410605131648481E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4509384582188772d + "'", double2 == 0.4509384582188772d);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-34.999996f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4738100493246071d) + "'", double1 == (-0.4738100493246071d));
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.061117385232788E7d + "'", double1 == 4.061117385232788E7d);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1751822318188396d + "'", double1 == 1.1751822318188396d);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6234989627162255d) + "'", double1 == (-0.6234989627162255d));
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5658388325948494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.71595650537671d + "'", double1 == 89.71595650537671d);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9589901563876679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.743826085999204d) + "'", double1 == (-0.743826085999204d));
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-3.6268613048244727d), 0.03654572906696694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.626861304824472d) + "'", double2 == (-3.626861304824472d));
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.04260447632084876d), (-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04260447632084876d) + "'", double2 == (-0.04260447632084876d));
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.4414062E-4f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25f + "'", float2 == 0.25f);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.081218734622052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1142250547198906d + "'", double1 == 2.1142250547198906d);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 112.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.718498871295094d + "'", double1 == 4.718498871295094d);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.3458488E12f, 3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.3458478E12f + "'", float2 == 9.3458478E12f);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.09738634525693146d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09707963479993689d) + "'", double1 == (-0.09707963479993689d));
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 34, 1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.000004f + "'", float2 == 34.000004f);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.011675895096193602d, 0.29920478501236675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03900329941145959d + "'", double2 == 0.03900329941145959d);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        float float2 = org.apache.commons.math3.util.FastMath.max(47.0f, (float) 22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(74.3898917758609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.028240766936998E32d + "'", double1 == 2.028240766936998E32d);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5687609160957652d), (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.035547557255985324d) + "'", double2 == (-0.035547557255985324d));
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.12120703299629262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0499999832316724d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-7.684013597604755E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.556537E-17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.5565375E-17f + "'", float1 == 5.5565375E-17f);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4304247186494576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 3.0000007f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0523598900433975d + "'", double1 == 0.0523598900433975d);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(44.67977267251466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.268086060879367E19d + "'", double1 == 1.268086060879367E19d);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.2308055906286415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(15.174271293851461d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.20718610721275d + "'", double2 == 15.20718610721275d);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9738671125025468d, 0.2304259041251446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.052163496001968346d + "'", double2 == 0.052163496001968346d);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999772686049571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430539212513212d + "'", double1 == 1.5430539212513212d);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.33973578114302E61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.7371252E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.7371252E25f + "'", float1 == 7.7371252E25f);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.011020261488361868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011081208247316237d + "'", double1 == 0.011081208247316237d);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-6), 1.0969762035384047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.0d) + "'", double2 == (-6.0d));
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.447327196772732E34d, 3.3236692321000443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01501655463450288d + "'", double2 == 0.01501655463450288d);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.13533528323661273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.009171805590283d + "'", double1 == 1.009171805590283d);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1.192093E-7f), 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.686572097284444E-243d) + "'", double2 == (-4.686572097284444E-243d));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5370264E31f, (-44.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5370264E31f + "'", float2 == 1.5370264E31f);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 46L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-5));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.050322743661769115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050280307901413496d + "'", double1 == 0.050280307901413496d);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.003014266594967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2989.9569449385945d + "'", double1 == 2989.9569449385945d);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.6268613048244727d, (-1.4138207963594455E41d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 749.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.089966194164164d + "'", double1 == 13.089966194164164d);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.14748365E9f), 2.0282408E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.7262340257027773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.664058605036434d + "'", double1 == 0.664058605036434d);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.471710130960498E228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.471710130960498E228d + "'", double1 == 3.471710130960498E228d);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 2.8592453E20f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.09834447715602475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09834447715602475d + "'", double1 == 0.09834447715602475d);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 85L, (-28));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.1664968E-7f + "'", float2 == 3.1664968E-7f);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.905339522827515E-4d + "'", double1 == 6.905339522827515E-4d);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-106980.47743852626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 1.09951176E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-67));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.933327349611498E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9333273496E10d + "'", double1 == 1.9333273496E10d);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 230L, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 460.0f + "'", float2 == 460.0f);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        float float2 = org.apache.commons.math3.util.FastMath.min(8.0f, (-10.999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999999f) + "'", float2 == (-10.999999f));
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.1542291646997856E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.154179419937708E-5d + "'", double1 == 3.154179419937708E-5d);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.020907704486165288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020910751761746445d + "'", double1 == 0.020910751761746445d);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0469529584324009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.848956988734151d + "'", double1 == 2.848956988734151d);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.6543612251060553E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6543612251060553E-24d + "'", double1 == 1.6543612251060553E-24d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(32.10942077636719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.992760093696703E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.992760093696703E-17d + "'", double1 == 7.992760093696703E-17d);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000269272749114d, (-4.01583876946393d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000269272749114d) + "'", double2 == (-1.0000269272749114d));
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.5545968900472659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-2.14748339E9f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1500.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1501.0d + "'", double1 == 1501.0d);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.436248262932771E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 185371.20226542125d + "'", double1 == 185371.20226542125d);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999999f), (float) 128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.9662094680453555d, (-42));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1291852997704508E-12d + "'", double2 == 1.1291852997704508E-12d);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-7), (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.64926744E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.007570918573144928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19635841828461364d) + "'", double1 == (-0.19635841828461364d));
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.19902312E12f, 0.5492548965142435d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.19902299E12f + "'", float2 == 2.19902299E12f);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7017639929214721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6541110865841415d + "'", double1 == 0.6541110865841415d);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.240130903246081E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.240130903246081E-17d + "'", double1 == 1.240130903246081E-17d);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-47));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 47L + "'", long1 == 47L);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0678494519699369E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267947898d + "'", double1 == 1.5707963267947898d);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0061035156f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.9132181397411985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0455496908326596d) + "'", double1 == (-1.0455496908326596d));
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(20.871061917633263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.796382366979923E8d + "'", double1 == 5.796382366979923E8d);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.011675895096193602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011675364561515205d + "'", double1 == 0.011675364561515205d);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.4657022738769552d, 14.536964742657117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4657022738769552d + "'", double2 == 1.4657022738769552d);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.661650474533378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5845218105606061d + "'", double1 == 0.5845218105606061d);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-38.22907066290581d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.703958628749687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3613277863117221d + "'", double1 == 1.3613277863117221d);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.6036003925924347d), 50);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0901234420462585E-11d + "'", double2 == 1.0901234420462585E-11d);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.1003275537854505E-17d, 2.848956988734151d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1003275537854505E-17d + "'", double2 == 3.1003275537854505E-17d);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        float float2 = org.apache.commons.math3.util.FastMath.max(47.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-149L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-148.99998f) + "'", float1 == (-148.99998f));
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.5444866095419745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-38.00000000000007d) + "'", double1 == (-38.00000000000007d));
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.037091348627933E-7d, 1.5430539212513212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.037091348627934E-7d + "'", double2 == 6.037091348627934E-7d);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 5.4606145E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.2667715847722035E-218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        int int2 = org.apache.commons.math3.util.FastMath.max(67, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.990081729765975d, 1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9900817297659751d + "'", double2 == 0.9900817297659751d);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 24000, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24000L + "'", long2 == 24000L);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-4.620233E-10f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.620233E-10f + "'", float2 == 4.620233E-10f);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.990700744648233d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.0f, 34.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        long long2 = org.apache.commons.math3.util.FastMath.max(6000L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6000L + "'", long2 == 6000L);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.9843788128357573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.861822012057944d + "'", double1 == 9.861822012057944d);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9329331452021941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6805519689447348d + "'", double1 == 1.6805519689447348d);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.779595846079306d, 0.00248838801679664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.303968219577201E-4d + "'", double2 == 7.303968219577201E-4d);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        int int2 = org.apache.commons.math3.util.FastMath.min((-50), 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-50) + "'", int2 == (-50));
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.890577041667747d, (-121));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1229558.1758154717d + "'", double2 == 1229558.1758154717d);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        double double1 = org.apache.commons.math3.util.FastMath.signum(44.00203622623245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.1640858863087704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.410747148417297d + "'", double1 == 4.410747148417297d);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.998223045192107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-10.999999f), 1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999998f) + "'", float2 == (-10.999998f));
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.011048993055354018d, 148.40979009083827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.109770400819922d) + "'", double2 == (-1.109770400819922d));
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 34.000004f, 1.33158070377639E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.489537669538574d) + "'", double2 == (-4.489537669538574d));
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(661.6940238674958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.34457037979822E287d + "'", double1 == 2.34457037979822E287d);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-3.9133899457889196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5758602769182997d) + "'", double1 == (-1.5758602769182997d));
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.5861856399961191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-4), 67L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67L + "'", long2 == 67L);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 141.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.641919645521111d + "'", double1 == 5.641919645521111d);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.000000000014552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.416510530506886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999605269981473d + "'", double1 == 0.9999605269981473d);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(256.0f, 167.93114918845825d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 255.99998f + "'", float2 == 255.99998f);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 2.1474839E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304176427147723E11d + "'", double1 == 1.2304176427147723E11d);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 6.0559039E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(10.127541722024173d, 0.8608291180359888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.127541722024171d + "'", double2 == 10.127541722024171d);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2045.9999f), 127.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2045.9999f) + "'", float2 == (-2045.9999f));
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5604328654353665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604328654353665d + "'", double1 == 1.5604328654353665d);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.013553240791789689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.30112958742788d) + "'", double1 == (-4.30112958742788d));
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.03654572906696694d, 0.01562627175205221d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1667412956541297d + "'", double2 == 1.1667412956541297d);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8929616830058433d, (-0.722673277468218d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0852550225714481d + "'", double2 == 1.0852550225714481d);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-34.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.2136421954640464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126.83235515216347d + "'", double1 == 126.83235515216347d);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.841534261491384E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.10293727139822d + "'", double1 == 149.10293727139822d);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        int int1 = org.apache.commons.math3.util.FastMath.abs(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.2676506E30f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8588046979169688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3603376903131017d + "'", double1 == 2.3603376903131017d);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3414339173983056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1028668791044902d + "'", double1 == 1.1028668791044902d);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-38.00000000000007d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.592796587855801E16d) + "'", double1 == (-1.592796587855801E16d));
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-15));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.56780537673735E31d, 31.499999999999993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.56780537673735E31d + "'", double2 == 4.56780537673735E31d);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-7.4505815E-9f), (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7105058E-20f) + "'", float2 == (-2.7105058E-20f));
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.20824159849321072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20824159849321075d + "'", double1 == 0.20824159849321075d);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3021117240420959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2654634647117526d + "'", double1 == 0.2654634647117526d);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.0202140366142471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        long long2 = org.apache.commons.math3.util.FastMath.min(11L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6469779601696886E-23d, 16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        long long1 = org.apache.commons.math3.util.FastMath.abs(16L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16L + "'", long1 == 16L);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        int int2 = org.apache.commons.math3.util.FastMath.min((-63), (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        double double1 = org.apache.commons.math3.util.FastMath.asin(156.43922347836767d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.669418070491609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06404342696225596d + "'", double1 == 0.06404342696225596d);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.005159763605553577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.1060180357077195E-102d, 7.754140548665503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.584892295492983E-103d + "'", double2 == 6.584892295492983E-103d);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.7480575296890003d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.964480206210241E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453125E-6d + "'", double1 == 7.62939453125E-6d);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 8.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.911129868857448d) + "'", double1 == (-0.911129868857448d));
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7504916449365889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9740797827830469d + "'", double1 == 0.9740797827830469d);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.93496684993349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7808614425251377d + "'", double1 == 1.7808614425251377d);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        int int2 = org.apache.commons.math3.util.FastMath.min(34, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0404061971005592E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0404061971005592E21d + "'", double1 == 1.0404061971005592E21d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6189512067707561d + "'", double1 == 0.6189512067707561d);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 127, (-14L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        long long1 = org.apache.commons.math3.util.FastMath.round(4162.307786953581d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4162L + "'", long1 == 4162L);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        double double1 = org.apache.commons.math3.util.FastMath.abs(57.29291493894794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29291493894794d + "'", double1 == 57.29291493894794d);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1500, 0.9403184054350179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1921433311464832d + "'", double2 == 0.1921433311464832d);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.14351994778492885d), 0.022098885221519555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14351994778492885d + "'", double2 == 0.14351994778492885d);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9604645E-8f + "'", float1 == 5.9604645E-8f);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.4952969556875082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45841043000825465d + "'", double1 == 0.45841043000825465d);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 255.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03980600663114686d) + "'", double1 == (-0.03980600663114686d));
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4837637461282407d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1133533995731875E7d + "'", double2 == 1.1133533995731875E7d);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        long long2 = org.apache.commons.math3.util.FastMath.max(1025L, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        double double1 = org.apache.commons.math3.util.FastMath.exp(433.79201523650374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4744490214040653E188d + "'", double1 == 2.4744490214040653E188d);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-67), (-42));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5234036E-11f) + "'", float2 == (-1.5234036E-11f));
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.154229163653721E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.36418132096685d) + "'", double1 == (-10.36418132096685d));
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9999999999998679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329251994099d + "'", double1 == 0.01745329251994099d);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 21L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.594078672416073E8d + "'", double1 == 6.594078672416073E8d);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1023.0f), 6000.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.0d, 0.9640275969202823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2598760304231198d + "'", double2 == 1.2598760304231198d);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 38, 4.292421343475038d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.999996f + "'", float2 == 37.999996f);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 749.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        double double1 = org.apache.commons.math3.util.FastMath.exp(60.30380470871524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5474250491067235E26d + "'", double1 == 1.5474250491067235E26d);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.06243896f, (double) (-9.223372E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.062438957f + "'", float2 == 0.062438957f);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.556537E-17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 16.000002f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-126.99999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8148137583349884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8148137583349884d + "'", double1 == 1.8148137583349884d);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        long long2 = org.apache.commons.math3.util.FastMath.max(29L, (-121L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(9.573628439715033E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.094128058066607E-6d + "'", double1 == 3.094128058066607E-6d);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.094947E-13f, 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998223045192107d + "'", double1 == 2.998223045192107d);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9866876842868689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4074442083028742d + "'", double1 == 1.4074442083028742d);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(512.5789572728952d, 0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5696983072904778d + "'", double2 == 1.5696983072904778d);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1024), (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1024L) + "'", long2 == (-1024L));
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(83.01599101056074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.111311157597502d + "'", double1 == 9.111311157597502d);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 15L, 8.376517822945032E-13d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1920928955078068E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        double double1 = org.apache.commons.math3.util.FastMath.signum(229.3648145037862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        int int2 = org.apache.commons.math3.util.FastMath.max(258048, (-38));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 258048 + "'", int2 == 258048);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-6L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.23752928622151E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6503832929156677d) + "'", double1 == (-0.6503832929156677d));
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.6378974212549495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6820476518787174d + "'", double1 == 0.6820476518787174d);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        int int1 = org.apache.commons.math3.util.FastMath.round((-148.99998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7677.584358657442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.72762780694547d + "'", double1 == 19.72762780694547d);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-74.20321057778875d), 73.59231792902837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.20321057778875d + "'", double2 == 74.20321057778875d);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.02249305674199273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022491160493153518d + "'", double1 == 0.022491160493153518d);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2.4758801E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.213373949227512d + "'", double1 == 1.213373949227512d);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.3525223293259374d, 0.4464931094577818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5688831949237588d + "'", double2 == 0.5688831949237588d);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8209470861497329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.8932911433831696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2429410049321068d) + "'", double1 == (-1.2429410049321068d));
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 512, (-4.50359936E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-512.0f) + "'", float2 == (-512.0f));
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        int int2 = org.apache.commons.math3.util.FastMath.max(13, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-58670.88521551002d), 6000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7768243192326673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7131433404238178d + "'", double1 == 0.7131433404238178d);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8133637952951194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9018668390040291d + "'", double1 == 0.9018668390040291d);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.03490658295929199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1022.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5698178535259502d) + "'", double1 == (-1.5698178535259502d));
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.743392130574644E-23d, (-0.7559662776027263d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-38), (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1875f) + "'", float2 == (-1.1875f));
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5401805983518602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6158517539445397d) + "'", double1 == (-0.6158517539445397d));
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(97.000015f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0003709130606282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001236224037475d + "'", double1 == 1.0001236224037475d);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.718281612429424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43429444738862744d + "'", double1 == 0.43429444738862744d);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4107813643634838d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5725018298157405d + "'", double2 == 6.5725018298157405d);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(127.00000762939453d, 1.1751240468668798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.561543646156017d + "'", double2 == 1.561543646156017d);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5673056820522289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428569762377156d + "'", double1 == 0.9428569762377156d);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.637689859280612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0765780104851164d + "'", double1 == 1.0765780104851164d);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5707870865672484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707870865672486d + "'", double1 == 1.5707870865672486d);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(97.0009698887435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        double double1 = org.apache.commons.math3.util.FastMath.asin(19.608439339962796d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1136117014086105E-8d + "'", double1 == 1.1136117014086105E-8d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.1673594611985832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16893970234622963d + "'", double1 == 0.16893970234622963d);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.010988398859591287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10482556396028254d + "'", double1 == 0.10482556396028254d);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.002151468416961833d, 1.0202140366142471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0202163051633146d + "'", double2 == 1.0202163051633146d);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(53246.62611076307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.575836902613856d + "'", double1 == 11.575836902613856d);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(155.74607629780772d, 0.8897341156536202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 155.7460762978077d + "'", double2 == 155.7460762978077d);
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.7763568E-15f, 13.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7763568E-15f + "'", float2 == 1.7763568E-15f);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000000018626451d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1311.2060649015373d, (double) 5.999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.7937262437874324d) + "'", double2 == (-2.7937262437874324d));
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-10));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2269808089751189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.55886968494193d + "'", double1 == 1.55886968494193d);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.2455323929060171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4043263937877364d) + "'", double1 == (-1.4043263937877364d));
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-149));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.5694538891241967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-12.944289813551192d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.4825767815644055d, (-0.0019531261253500206d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5715830600540215d + "'", double2 == 1.5715830600540215d);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.011020261488361868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011020038428303692d + "'", double1 == 0.011020038428303692d);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.2491542559227393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.768372150465439E-7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-21) + "'", int1 == (-21));
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.0f, (-48.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.3862856729793054E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        int int1 = org.apache.commons.math3.util.FastMath.round(749.99976f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6435222263726064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8021983709610774d + "'", double1 == 0.8021983709610774d);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000906170137727d + "'", double1 == 1.0000906170137727d);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-24) + "'", int1 == (-24));
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707963267942904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515827052890689d + "'", double1 == 0.4515827052890689d);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.1170794008387335d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 10.999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-0.13457274443050346d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.421010862427522E-20d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4210108624275216E-20d + "'", double2 == 5.4210108624275216E-20d);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.28957769347715206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.4357702930920064d, (double) 38.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011467135489846358d + "'", double2 == 0.011467135489846358d);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7300932779126392d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(48.20420038285032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6393874603973986d + "'", double1 == 3.6393874603973986d);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.521670408657297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.126421973329211d + "'", double1 == 2.126421973329211d);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.413832468402249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.381457401064214d + "'", double1 == 30.381457401064214d);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.624618747740735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.440386572051328d + "'", double1 == 1.440386572051328d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0016997123712174172d), 1.5694629941431792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.001699712371217417d) + "'", double2 == (-0.001699712371217417d));
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.2220482392758836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2220482392758836d + "'", double1 == 1.2220482392758836d);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0000001372850489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414710589833171d + "'", double1 == 0.8414710589833171d);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1597153257338446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14817456615045993d + "'", double1 == 0.14817456615045993d);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.010043827553259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00999372352878049d + "'", double1 == 0.00999372352878049d);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5677910224103013d, 31.70081736714295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677910224103013d + "'", double2 == 1.5677910224103013d);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double1 = org.apache.commons.math3.util.FastMath.cos(12.786622405592862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9758424700897873d + "'", double1 == 0.9758424700897873d);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.050322743661769115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.883280825338084d + "'", double1 == 2.883280825338084d);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.5088191087165586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6012051176687013d + "'", double1 == 0.6012051176687013d);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5475585765788982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027009992528778577d + "'", double1 == 0.027009992528778577d);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(38.000004f, (-67));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5749804E-19f + "'", float2 == 2.5749804E-19f);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 22, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22.0f + "'", float2 == 22.0f);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 28.999998f, 6.796720822921585E297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.999998092651367d + "'", double2 == 28.999998092651367d);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-7.4505815E-9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.268868740146718E-7d) + "'", double1 == (-4.268868740146718E-7d));
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.4949571158367E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4826497148707175E12d + "'", double1 == 1.4826497148707175E12d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.08509937967107274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08520242944567852d + "'", double1 == 0.08520242944567852d);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816212E43d + "'", double1 == 2.688117141816212E43d);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        int int2 = org.apache.commons.math3.util.FastMath.max(11, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-9.223372E18f), (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.09801546060418229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09785919563819116d + "'", double1 == 0.09785919563819116d);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.062778942642255d + "'", double1 == 1.062778942642255d);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.66320749752745d + "'", double1 == 3.66320749752745d);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.925955988934938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6554224620945639d + "'", double1 == 0.6554224620945639d);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 85, 1296.7941421366083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1296.7941421366083d + "'", double2 == 1296.7941421366083d);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.06243896f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-13.516370020918933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999999999996362d) + "'", double1 == (-0.999999999996362d));
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(50.42126034728076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.613461748453113d + "'", double1 == 4.613461748453113d);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(8.448719238886445E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448719238886446E-4d + "'", double1 == 8.448719238886446E-4d);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.08583325804146333d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00003683673414d + "'", double2 == 100.00003683673414d);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(8.552389107874104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842758405966032d + "'", double1 == 2.842758405966032d);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.881785E-16f, 1.5572364748926293d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881786E-16f + "'", float2 == 8.881786E-16f);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.9536014095E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198836.6517898549d + "'", double1 == 198836.6517898549d);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160755d + "'", double1 == 0.05483113556160755d);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658503988659d) + "'", double1 == (-0.03490658503988659d));
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.15693881177778274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1563016207189039d + "'", double1 == 0.1563016207189039d);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 87);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5184364492350668d + "'", double1 == 1.5184364492350668d);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3874097381355818E-73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3874097381355818E-73d + "'", double1 == 1.3874097381355818E-73d);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-104.99922643163309d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        int int1 = org.apache.commons.math3.util.FastMath.round(416.00003f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416 + "'", int1 == 416);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        double double2 = org.apache.commons.math3.util.FastMath.pow(39.0d, (-49));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0910238782494635E-78d + "'", double2 == 1.0910238782494635E-78d);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3072.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3072.0005f + "'", float1 == 3072.0005f);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.283188721677932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.304812462981526d, 3.109218387044385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.304812462981526d + "'", double2 == 1.304812462981526d);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1920929665620893E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6469779601696886E-23d + "'", double1 == 2.6469779601696886E-23d);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.022097089107228303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022098887417204192d + "'", double1 == 0.022098887417204192d);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(28.699742556943686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.45582719860614E12d + "'", double1 == 1.45582719860614E12d);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7440230792707043d) + "'", double1 == (-0.7440230792707043d));
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.022343035780788705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022344894809652845d + "'", double1 == 0.022344894809652845d);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 7.9375f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.9375d + "'", double1 == 7.9375d);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.8460065493236117E48d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8460065493236117E48d + "'", double1 == 5.8460065493236117E48d);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        double double2 = org.apache.commons.math3.util.FastMath.min(6000.00048828125d, (double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.629395440744702E-6d + "'", double2 == 7.629395440744702E-6d);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.006931009667375755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39711760170500326d + "'", double1 == 0.39711760170500326d);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-1.5444866095419745d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        long long2 = org.apache.commons.math3.util.FastMath.max(63959947L, 43L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63959947L + "'", long2 == 63959947L);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        double double1 = org.apache.commons.math3.util.FastMath.signum(239.46884570409546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.8402864822065015d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.4414062985774404E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.624618747740734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8822181326231554d + "'", double1 == 0.8822181326231554d);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 36L, (double) 0.25000003f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0008680452972d + "'", double2 == 36.0008680452972d);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.6138839560447091d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6138839560447091d + "'", double1 == 1.6138839560447091d);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-29));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5192023754710313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        double double1 = org.apache.commons.math3.util.FastMath.asin(39.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.5707960311239704d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.268736768472422E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.768998281229633d + "'", double1 == 5.768998281229633d);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0788405256891817E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0788405256891817E-19d + "'", double1 == 1.0788405256891817E-19d);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-6L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.299125E-23f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.964480206210241E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.775572601667566d + "'", double1 == 10.775572601667566d);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        double double1 = org.apache.commons.math3.util.FastMath.sin(6.085773155951752E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.085773152195142E-5d + "'", double1 == 6.085773152195142E-5d);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 85.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17887017243876716d + "'", double1 == 0.17887017243876716d);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.17512404686688d, (-0.14499148489666977d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01519216769352183d + "'", double2 == 0.01519216769352183d);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 3.469447E-18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-4.50359936E15f), (-0.5026536249078912d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8862740270915485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862740270915485d + "'", double1 == 0.8862740270915485d);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 192);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9088714301767988d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.934138719000235E-6d + "'", double2 == 6.934138719000235E-6d);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.796720822921585E297d, 57.29577951307475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.796720822921585E297d + "'", double2 == 6.796720822921585E297d);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.027538327591038E8d, 433.79201523650374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.027538327591038E8d + "'", double2 == 9.027538327591038E8d);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.5310603550457816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48619121425785156d) + "'", double1 == (-0.48619121425785156d));
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.020907704486165288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27548763941221577d + "'", double1 == 0.27548763941221577d);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 4.768373E-7f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.4507335189035081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.103311802479151d + "'", double1 == 1.103311802479151d);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 11L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999994421064d + "'", double1 == 0.9999999994421064d);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8414709624298973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3197767728038898d + "'", double1 == 1.3197767728038898d);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(69.53786160730874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.772006583446662d + "'", double1 == 0.772006583446662d);
    }
}

