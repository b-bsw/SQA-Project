package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.6880966331881486E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        double double1 = org.apache.commons.math3.util.FastMath.sin(36.871107594012706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.736583018476897d) + "'", double1 == (-0.736583018476897d));
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 22026L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.4414062500710543E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999701976777d + "'", double1 == 0.9999999701976777d);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(57.32153907959692d, 3.813181025133959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.32153907959692d + "'", double2 == 57.32153907959692d);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(74.35674296486279d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.376558925953962E-14d + "'", double2 == 9.376558925953962E-14d);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.664475681299524E-8d + "'", double1 == 1.664475681299524E-8d);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5707963267948966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 14L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078099E-7d + "'", double1 == 1.1920928955078099E-7d);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-8.376517822945031E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.376517822945031E-13d + "'", double1 == 8.376517822945031E-13d);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5597471089165569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1597153257338444d + "'", double1 == 1.1597153257338444d);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8259078907006986d + "'", double1 == 0.8259078907006986d);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3, (long) 85);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9999999806537986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020093845590042958d + "'", double1 == 0.020093845590042958d);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 750);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 750L + "'", long1 == 750L);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0201468328002705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.450108003093554d + "'", double1 == 58.450108003093554d);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.6215477523208264d), 1.4801364395941514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6215477523208264d + "'", double2 == 0.6215477523208264d);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        long long2 = org.apache.commons.math3.util.FastMath.max(22026L, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.986979343053352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3094075755018562d + "'", double1 == 1.3094075755018562d);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.2794150403540232d), 0.19068996526228799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19068996526228799d + "'", double2 == 0.19068996526228799d);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1024L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.99999994f), (double) (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.699514748210191d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0090262908655008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017610831014788973d + "'", double1 == 0.017610831014788973d);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.44679360118879d + "'", double1 == 66.44679360118879d);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.01968878488836084d, (-0.011682137064909816d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0469529584324009d + "'", double2 == 1.0469529584324009d);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.3486991523486093E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.516370020918933d) + "'", double1 == (-13.516370020918933d));
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4453060614371709d + "'", double1 == 1.4453060614371709d);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 48000, (-127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48000L + "'", long2 == 48000L);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.882813082076609E-4d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1382155914975337E-50d + "'", double2 == 2.1382155914975337E-50d);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.20824159849321072d, 1.0842021724855044E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.103515628789562E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515621210439E-5d + "'", double1 == 6.103515621210439E-5d);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0001220703127d + "'", double1 == 1024.0001220703127d);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.7405240741728077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.951638805994557d) + "'", double1 == (-0.951638805994557d));
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7301521188343126d + "'", double1 == 0.7301521188343126d);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.000000001862645d, 2.482576781564405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000018626451d + "'", double2 == 1.0000000018626451d);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703413d + "'", double1 == 11013.232874703413d);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6483608274590866d, 2.844537546692157E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5560.3480290725165d + "'", double1 == 5560.3480290725165d);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.1415926535897922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210804127942924d + "'", double1 == 1.4210804127942924d);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43022620016570173d + "'", double1 == 0.43022620016570173d);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7301521188343126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.5707960311239704d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 750L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.000000000000001d + "'", double1 == 6.000000000000001d);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9782433465861597d + "'", double1 == 1.9782433465861597d);
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(148.40979009083827d, 1.7200786095266942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.4197576646372d + "'", double2 == 148.4197576646372d);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        long long1 = org.apache.commons.math3.util.FastMath.round(111.95438834610738d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 112L + "'", long1 == 112L);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.6714065E24f, (float) (-14L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.6714065E24f + "'", float2 == 9.6714065E24f);
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.587367707538151E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.79932245896842d) + "'", double1 == (-13.79932245896842d));
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.0786964586302374E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.759350929417189d, 9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.759350929417189d + "'", double2 == 0.759350929417189d);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.4449632606147725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44496326061477254d + "'", double1 == 0.44496326061477254d);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.017453291479645996d), 1.0E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453291479645996d) + "'", double2 == (-0.017453291479645996d));
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.2665848258979956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23632416484367985d + "'", double1 == 0.23632416484367985d);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.8844991406148166d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8844991406148166d + "'", double2 == 2.8844991406148166d);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(15.174271293851463d, 1.2202849466483139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.174271293851461d + "'", double2 == 15.174271293851461d);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.055454452319325E-6d + "'", double1 == 6.055454452319325E-6d);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.061328855954495554d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6321636932737211d + "'", double1 == 1.6321636932737211d);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8260092206769861d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5622070602489355d) + "'", double1 == (-0.5622070602489355d));
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.885078775995249E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.72467049624589d) + "'", double1 == (-31.72467049624589d));
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.528732941264681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02668142320876577d + "'", double1 == 0.02668142320876577d);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.623641707626563d, 1.0101769735763335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.623641707626562d + "'", double2 == 7.623641707626562d);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.853230586269599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9605905730125122d + "'", double1 == 0.9605905730125122d);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.022832605602534084d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.7683733E-7f, 3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.768373E-7f + "'", float2 == 4.768373E-7f);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.416510530506886d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.2815044999386025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2779131873068914d + "'", double1 == 0.2779131873068914d);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1500L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.2796991406480593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 39, (double) 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.999996f + "'", float2 == 38.999996f);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.020599913279624d) + "'", double1 == (-6.020599913279624d));
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.29971680358919567d, (-1.0480275261378338d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.29971680358919567d) + "'", double2 == (-0.29971680358919567d));
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 97L, 0.8880936454516588d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 39);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.591064607026499d + "'", double1 == 1.591064607026499d);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.7683715820308884E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7683715820312495E-7d + "'", double1 == 4.7683715820312495E-7d);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164059608E-7d + "'", double1 == 9.536743164059608E-7d);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1529215E18f + "'", float1 == 1.1529215E18f);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 4.611686E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.006851200750452483d, 0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005375191952790863d + "'", double2 == 0.005375191952790863d);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.842385207305781d, (-13.0591403123201d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.842385207305781d + "'", double2 == 0.842385207305781d);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 'a', 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.39567227992801673d, (-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39567227992801673d + "'", double2 == 0.39567227992801673d);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0909305359822086d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        float float2 = org.apache.commons.math3.util.FastMath.max((-2015.9999f), 96.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9735692101318192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735692101318192d + "'", double1 == 0.9735692101318192d);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        double double1 = org.apache.commons.math3.util.FastMath.log10(17.872171540421935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2521773242306398d + "'", double1 == 1.2521773242306398d);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5.416510530506886d, 3.814697265625009E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.416510530506885d + "'", double2 == 5.416510530506885d);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5573218601131689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557321860113169d + "'", double1 == 1.557321860113169d);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1858035486915015d + "'", double1 == 1.1858035486915015d);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.6414445250304635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6414445250304635d + "'", double1 == 1.6414445250304635d);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        double double1 = org.apache.commons.math3.util.FastMath.exp(201.71573230680755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.018180612889371E87d + "'", double1 == 4.018180612889371E87d);
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000002f, 2.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0000002f + "'", float2 == 2.0000002f);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.6363957575729347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.814697265625E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000038147045416d + "'", double1 == 1.0000038147045416d);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1022.99994f), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2045.9999f) + "'", float2 == (-2045.9999f));
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-14.5560905533403d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.441639728767535d) + "'", double1 == (-2.441639728767535d));
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6398352529683655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 39L, 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1.09951176E12f, (-0.5026536249078912d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.099511758848E12d + "'", double2 == 1.099511758848E12d);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.5896828217829762d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.29807406E33f, (float) 1500L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29807406E33f + "'", float2 == 1.29807406E33f);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.602681965908778d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1645206134117347E-165d + "'", double2 == 1.1645206134117347E-165d);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 7.737125E25f, (-25.305917892432674d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.781516350303278d) + "'", double2 == (-8.781516350303278d));
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.9604644775390625E-8d, 3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.840343680379087E-29d + "'", double2 == 2.840343680379087E-29d);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265625001E-6d + "'", double1 == 3.814697265625001E-6d);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499700825897167d + "'", double1 == 0.6499700825897167d);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9998140668686113d, (-0.08640384017873165d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9998140668686113d) + "'", double2 == (-0.9998140668686113d));
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        double double1 = org.apache.commons.math3.util.FastMath.tan(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1170794008387335d) + "'", double1 == (-1.1170794008387335d));
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.298292365610485d, (double) 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.628369761528415d) + "'", double2 == (-16.628369761528415d));
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.665378035886179d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-9.632848614896423E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.632848614896421E-5d) + "'", double1 == (-9.632848614896421E-5d));
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.350815104195135d + "'", double1 == 6.350815104195135d);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 97L, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0864876632426175d + "'", double1 == 1.0864876632426175d);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.129248571153767E29d, 3.121079351920185d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.491826999074709E93d + "'", double2 == 1.491826999074709E93d);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.768372E-7f, (-29));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.882813E-4f, 4.2949673E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.882813E-4f + "'", float2 == 4.882813E-4f);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517578E-5f + "'", float1 == 3.0517578E-5f);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.89793739384485E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 242856.69424260987d + "'", double1 == 242856.69424260987d);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3072.0f, 0.9998140668686113d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3071.9998f + "'", float2 == 3071.9998f);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.5988104444497883d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818285381576d + "'", double1 == 1.7182818285381576d);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.3683211063593682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3525223293259374d + "'", double1 == 0.3525223293259374d);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735525863233839d + "'", double1 == 0.9735525863233839d);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.0f, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144920592687449d + "'", double1 == 1.144920592687449d);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 14L, (double) 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.799911408087066d + "'", double2 == 21.799911408087066d);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        int int1 = org.apache.commons.math3.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 63L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9029845678036967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9665554546480869d + "'", double1 == 0.9665554546480869d);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-29), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.443593622809233E69d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4435936228092328E69d + "'", double2 == 3.4435936228092328E69d);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 99.99999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999237060547d + "'", double2 == 99.99999237060547d);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.1622776601683795d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 809.5430810031052d + "'", double2 == 809.5430810031052d);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5658388325948494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1612231530729575d + "'", double1 == 1.1612231530729575d);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.7764316821660115d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.6881171418161356E43d, 20.87998490068716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6881171418161356E43d + "'", double2 == 2.6881171418161356E43d);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2147483647L, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.189528855605421E-47d + "'", double2 == 2.189528855605421E-47d);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.704872438963137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.509644039241865d + "'", double1 == 7.509644039241865d);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(286.4788975654116d, 4.081218734622052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5565511495583535d + "'", double2 == 1.5565511495583535d);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.3043045862358962d, (double) 192.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.00001525878906d + "'", double2 == 192.00001525878906d);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999750018744576E-5d) + "'", double1 == (-4.999750018744576E-5d));
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9182846632869422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.027041164336506635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027041164336506638d + "'", double1 == 0.027041164336506638d);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-17.76076974417489d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.76076974417489d + "'", double1 == 17.76076974417489d);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2016.0f), (float) (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2016.0f) + "'", float2 == (-2016.0f));
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(239.46884570409546d, 1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0964636728249658E-8d) + "'", double2 == (-2.0964636728249658E-8d));
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.570750926882484d, 5.1771933557663606E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1221255244304277E-8d) + "'", double2 == (-1.1221255244304277E-8d));
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 48000, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707338638168467d + "'", double2 == 1.5707338638168467d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.43022620016570173d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        double double2 = org.apache.commons.math3.util.FastMath.min(70.26985858558899d, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.26985858558899d + "'", double2 == 70.26985858558899d);
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.8820097754150913d, 0.04006919567109118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.882288307236088d + "'", double2 == 2.882288307236088d);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.4287934927355d + "'", double1 == 402.4287934927355d);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.9604645E-8f, 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9604645E-8f + "'", float2 == 5.9604645E-8f);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.8066296601189507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34807962410585763d) + "'", double1 == (-0.34807962410585763d));
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.536744300927985E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000009536748848d + "'", double1 == 1.0000009536748848d);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        float float2 = org.apache.commons.math3.util.FastMath.max(6.0000005f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1025L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 122.07712677639502d + "'", double1 == 122.07712677639502d);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(192.00002f, 48000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6414445250304635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6414445250304637d + "'", double1 == 1.6414445250304637d);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-29));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 29L + "'", long1 == 29L);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 96.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.5067879719422177d), 0.80038650342911d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.80038650342911d + "'", double2 == 0.80038650342911d);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-6.305123299389195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        int int2 = org.apache.commons.math3.util.FastMath.min(39, (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63) + "'", int2 == (-63));
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.21991180375937056d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-29L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.844537546692157E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1024.0001220703125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.872173670950808d + "'", double1 == 17.872173670950808d);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.7683715820308884E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6398352529683655d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.013560982203286d + "'", double1 == 9.013560982203286d);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0469529584324009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8659030814983063d + "'", double1 == 0.8659030814983063d);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.2956339896854956d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005159786500818854d) + "'", double1 == (-0.005159786500818854d));
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(100.2188872880747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-1023));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.854718247901992d) + "'", double1 == (-17.854718247901992d));
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 15, 29L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1023);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.00006f + "'", float1 == 1023.00006f);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1024), 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9604645E-8f + "'", float2 == 5.9604645E-8f);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0202140366142471d, 2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.154434690031884d + "'", double2 == 2.154434690031884d);
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(458.3662361046586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1639304525356293E199d + "'", double1 == 1.1639304525356293E199d);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        double double2 = org.apache.commons.math3.util.FastMath.pow(38.72983346207417d, 230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.844153986113171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3779650346793701d + "'", double1 == 1.3779650346793701d);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.882813470127877E-4d + "'", double1 == 4.882813470127877E-4d);
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2676506002282294E30d + "'", double1 == 1.2676506002282294E30d);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) '#', (float) (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.011020261488361868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011020261488361868d + "'", double1 == 0.011020261488361868d);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63L, 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16128.0f + "'", float2 == 16128.0f);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-2L), (-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7665477425729947d, (double) 512.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7665477425729949d + "'", double2 == 0.7665477425729949d);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-97.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9735692101318191d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.345158334326972E10d + "'", double2 == 3.345158334326972E10d);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3826710608239539d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.126610105220086E-39d + "'", double2 == 8.126610105220086E-39d);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1746142944486795d, (-1.0480275261378338d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        double double2 = org.apache.commons.math3.util.FastMath.min(36.07140440247247d, (double) 512.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.07140440247247d + "'", double2 == 36.07140440247247d);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (-29L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.38905609893065d, 0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.38905609893065d + "'", double2 == 7.38905609893065d);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        double double2 = org.apache.commons.math3.util.FastMath.pow(100.0d, 3.099338555038559d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1580072.847490559d + "'", double2 == 1580072.847490559d);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.49994f, 4.8828122E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828122E-4f + "'", float2 == 4.8828122E-4f);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.0426665814898082d), (-0.5908872108403207d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13910784019083322d + "'", double2 == 0.13910784019083322d);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.5537502203873549d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8505583393414862d + "'", double1 == 0.8505583393414862d);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1361707344559157d + "'", double1 == 0.1361707344559157d);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 3.0000002f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.017610831014788973d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        double double2 = org.apache.commons.math3.util.FastMath.log((-16.628369761528415d), (double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 230L, 0.7665477425729949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5674635228626927d + "'", double2 == 1.5674635228626927d);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1023.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.07977109790154036d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1920928955078099E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3234889800848443E-23d + "'", double1 == 1.3234889800848443E-23d);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.118326675323529E-12d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9866275920404853d, (double) 39L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.0d + "'", double2 == 39.0d);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841857910156255E-7d + "'", double1 == 2.3841857910156255E-7d);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4507335189035081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.648361369288039d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-2016.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2016.0d) + "'", double1 == (-2016.0d));
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.005969084226160847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005969084226160847d + "'", double1 == 0.005969084226160847d);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        long long2 = org.apache.commons.math3.util.FastMath.min(86L, (long) (-63));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29291493894794d + "'", double1 == 57.29291493894794d);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9111477955680065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5342424578144773d + "'", double1 == 1.5342424578144773d);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(25.415396580804064d, 2.000000033134038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.493967590237556d + "'", double2 == 25.493967590237556d);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3072.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.718281828459045d, 207.29648124788537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.1977594109665195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34198014841116886d + "'", double1 == 0.34198014841116886d);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6414445250304635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975054538602377d + "'", double1 == 0.9975054538602377d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 38);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9950371911495349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8778599937165045d + "'", double1 == 0.8778599937165045d);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9999999403953552d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2220482392758836d, 4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2220482392758838d + "'", double2 == 1.2220482392758838d);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1023, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2521773242306398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.74447588040013d + "'", double1 == 71.74447588040013d);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 5L, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.5065230921350898E254d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        double double2 = org.apache.commons.math3.util.FastMath.pow(25.415396580804064d, 4.3923301810454625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1484736.8269696261d + "'", double2 == 1484736.8269696261d);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.8669148977008805E31d + "'", double1 == 6.8669148977008805E31d);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-14L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.35232069507293856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5896828217829762d), (double) 14L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0000000004656613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000002328306d + "'", double1 == 1.0000000002328306d);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000123108260284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0075707739244519d, 0.516965851669841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0075707739244519d + "'", double2 == 0.0075707739244519d);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6871714861810375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8425767838562601d + "'", double1 == 0.8425767838562601d);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3956124250860895d + "'", double1 == 1.3956124250860895d);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.44871722863096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448719238886159E-4d + "'", double1 == 8.448719238886159E-4d);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7665477425729947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.152323040032071d + "'", double1 == 2.152323040032071d);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.844153986113171d, (-4.999750018744576E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8441539875937955d + "'", double2 == 0.8441539875937955d);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.54742505E26f, (-0.45231565944180985d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.45231565944180985d) + "'", double2 == (-0.45231565944180985d));
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.09453594272628993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09481857711035843d + "'", double1 == 0.09481857711035843d);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(16128.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.3841857910156255E-7d, (-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3841857910156255E-7d + "'", double2 == 2.3841857910156255E-7d);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5574075204780884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027181889027663657d) + "'", double1 == (-0.027181889027663657d));
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.4247223454937545E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 37.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.4950732694200756E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4950732694200756E-19d + "'", double1 == 2.4950732694200756E-19d);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-2045.9999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.316789127129839d) + "'", double1 == (-8.316789127129839d));
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.232686862584267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.23752928622151E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.23752928622151E42d + "'", double1 == 3.23752928622151E42d);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1023.00006f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.623641767289499d + "'", double1 == 7.623641767289499d);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.5035996E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) (-127L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.11030288331712183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11052669025126904d + "'", double1 == 0.11052669025126904d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        float float2 = org.apache.commons.math3.util.FastMath.max(749.99994f, 126.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009850471303251545d + "'", double1 == 0.009850471303251545d);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.007570773924451899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007570629285707457d) + "'", double1 == (-0.007570629285707457d));
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-2015.9999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.2755538279996634d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7027968376412667E18d + "'", double2 == 3.7027968376412667E18d);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6022849320448147d + "'", double1 == 0.6022849320448147d);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.2207033E-4f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 85);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        double double1 = org.apache.commons.math3.util.FastMath.tan(7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6653746816831394d + "'", double1 == 1.6653746816831394d);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9981953489305545d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 255.53800932622195d + "'", double2 == 255.53800932622195d);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0012766224843186505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012766228310846718d + "'", double1 == 0.0012766228310846718d);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.000001f + "'", float1 == 9.000001f);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.015625637653511198d, 1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.52594044935736E-5d + "'", double2 == 1.52594044935736E-5d);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.0786964586302374E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.4063956532774693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9865166189553409d + "'", double1 == 0.9865166189553409d);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9999507580093402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414443782266199d) + "'", double1 == (-0.8414443782266199d));
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.755020761982979E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570758776587268d + "'", double1 == 1.570758776587268d);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.13533528323661265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1345179953744407d + "'", double1 == 0.1345179953744407d);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.5845631E30f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.3610195264493026d, 7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-38.22907066290581d) + "'", double2 == (-38.22907066290581d));
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6215477523208264d, 4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6215477523208265d + "'", double2 == 0.6215477523208265d);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10.127541722024175d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(286.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.991641660703783d + "'", double1 == 4.991641660703783d);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 5.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        int int2 = org.apache.commons.math3.util.FastMath.max((-63), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.6532181001114764E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(108222.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.6546391375242d + "'", double1 == 47.6546391375242d);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        int int2 = org.apache.commons.math3.util.FastMath.min(20, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0037377790192319412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.361757477043805E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.520090572373501E22d + "'", double1 == 3.520090572373501E22d);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0141204E32f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0282408E32f + "'", float2 == 2.0282408E32f);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3021117240420959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8338268425894415d + "'", double1 == 0.8338268425894415d);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.7781512503836434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.878988300937984d + "'", double1 == 21.878988300937984d);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8537.071147449265d + "'", double1 == 8537.071147449265d);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.531169184716246E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6188532336455966d + "'", double1 == 0.6188532336455966d);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(36.871107594012706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6435222263726064d + "'", double1 == 0.6435222263726064d);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.6313226197565623E-11d, (double) (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.0000002f, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.765626164153218E-4d + "'", double2 == 9.765626164153218E-4d);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000000000009095d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9998140668686113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998140668686112d) + "'", double1 == (-0.9998140668686112d));
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.5055429617727457E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.118326675304813E-12d + "'", double1 == 6.118326675304813E-12d);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(57.29577951307475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905128216E24d + "'", double1 == 3.8212977905128216E24d);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-2.0000000000000004d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256815d) + "'", double1 == (-0.9092974268256815d));
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.018862593966410546d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.49495711583675E13d + "'", double2 == 8.49495711583675E13d);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8503.447640781234d + "'", double1 == 8503.447640781234d);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9092974268256815d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 3.6379788E-12f, 1.557321860113169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.637978807091713E-12d + "'", double2 == 3.637978807091713E-12d);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 6.1035153E-5f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8904869112092367d, (double) 4.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6287965664024852d + "'", double2 == 0.6287965664024852d);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.8215975647065147d), 111.95438834610738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0073385494569225725d) + "'", double2 == (-0.0073385494569225725d));
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 52L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5707963267948872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442157056960517d + "'", double1 == 0.9442157056960517d);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3776033183918694E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3407554936658988d) + "'", double1 == (-0.3407554936658988d));
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-49.17253568793199d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8582226493088282d) + "'", double1 == (-0.8582226493088282d));
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4651572098523737d + "'", double1 == 2.4651572098523737d);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.061290475572342844d + "'", double1 == 0.061290475572342844d);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.516965851669841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.8685623921825124E25d, 2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8685623921825124E25d + "'", double2 == 3.8685623921825124E25d);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.015625f, (float) 750L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.015625f + "'", float2 == 0.015625f);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.5628219188284785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7502145818554039d + "'", double1 == 0.7502145818554039d);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.017453291479645996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.588250504492026d + "'", double1 == 1.588250504492026d);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(11.812917954340138d, (double) 37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.812917954340138d + "'", double2 == 11.812917954340138d);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 7.509644039241865d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6668706760619807d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3728503949255086E-7d + "'", double2 == 1.3728503949255086E-7d);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6499700825897167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011344117980650029d + "'", double1 == 0.011344117980650029d);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-44) + "'", int1 == (-44));
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 4.5035996E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4844222297453324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.0511287798066d + "'", double1 == 85.0511287798066d);
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.283188721677932d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.4414062500710543E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4414062985774404E-4d + "'", double1 == 2.4414062985774404E-4d);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.974937185533099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21481.281039031423d + "'", double1 == 21481.281039031423d);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.000000001862645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1024.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4023066454805946d + "'", double1 == 3.4023066454805946d);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.037091348628667E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        double double2 = org.apache.commons.math3.util.FastMath.pow(25.493967590237556d, 5.300478955492525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.849653111851499E7d + "'", double2 == 2.849653111851499E7d);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        double double1 = org.apache.commons.math3.util.FastMath.rint(15.174271293851461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        int int2 = org.apache.commons.math3.util.FastMath.max(750, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0842021724855044E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855047E-19d + "'", double1 == 1.0842021724855047E-19d);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        long long1 = org.apache.commons.math3.util.FastMath.round((-6.39599474488673E7d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-63959947L) + "'", long1 == (-63959947L));
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.361757477043805E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.361757477043805E67d + "'", double1 == 4.361757477043805E67d);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        int int1 = org.apache.commons.math3.util.FastMath.abs(48000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48000 + "'", int1 == 48000);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.37760331839187E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.0480275261378338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6493713266343334d) + "'", double1 == (-0.6493713266343334d));
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.6953302980477645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.695330298047765d + "'", double1 == 4.695330298047765d);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.155849015173716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.472957530972486d + "'", double1 == 23.472957530972486d);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0000005f + "'", float1 == 5.0000005f);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.000000000000001d, (double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.499999999999993d + "'", double2 == 31.499999999999993d);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9483582177369652d, 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6363319661787273E69d + "'", double2 == 1.6363319661787273E69d);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 6000, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 48000L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48000.0f + "'", float1 == 48000.0f);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.39599474488673E7d), (-0.1425465430742778d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.395994744886729E7d) + "'", double2 == (-6.395994744886729E7d));
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.3440585709080678E43d), (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3440585709080678E43d) + "'", double2 == (-1.3440585709080678E43d));
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005159740711202605d) + "'", double1 == (-0.005159740711202605d));
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 375.0f, (double) 63.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 375.0d + "'", double2 == 375.0d);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29100619138474915d) + "'", double1 == (-0.29100619138474915d));
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 750L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(9.765626164153218E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000004768373099d + "'", double1 == 1.0000004768373099d);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 21481.281039031423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2558427881104495d + "'", double1 == 0.2558427881104495d);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(74.38989177586092d, (-3.451272896403611E-39d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.3898917758609d + "'", double2 == 74.3898917758609d);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272356433182504d + "'", double1 == 0.0272356433182504d);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.910383045673371E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.0f), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6842868307608122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5942992187596847d + "'", double1 == 0.5942992187596847d);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.389301394574591d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-9223372036854775808L), 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.3786976E19f) + "'", float2 == (-7.3786976E19f));
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        long long2 = org.apache.commons.math3.util.FastMath.max(52L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-2.2343605386104213d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (short) 0, 70.26985858558899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-8));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-7.9999995f) + "'", float1 == (-7.9999995f));
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.76837215046544E-7d, 0.9994161213018331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.76837215046544E-7d + "'", double2 == 4.76837215046544E-7d);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8255079892949791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9711016755285863d + "'", double1 == 0.9711016755285863d);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.477888730288475d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-29));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 3L, 0.018862593966410546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.000059298989129d + "'", double2 == 3.000059298989129d);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1920928955078157E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6469779601696886E-23d + "'", double1 == 2.6469779601696886E-23d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022920740387489907d + "'", double1 == 0.022920740387489907d);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.699681400989514d, 239.46884570409546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.699681400989515d + "'", double2 == 8.699681400989515d);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1580072.847490559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6483621820319939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9999999801317847d), (double) 99.99999f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.1474839E9f + "'", float1 == 2.1474839E9f);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.082648376090521d, 3.171869616492817E-49d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.082648376090521d + "'", double2 == 10.082648376090521d);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.704872438963137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.007570629285707457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007570484655252586d) + "'", double1 == (-0.007570484655252586d));
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.08648169657722073d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0015093903479832123d) + "'", double1 == (-0.0015093903479832123d));
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7502685605935906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8484681979535594d + "'", double1 == 0.8484681979535594d);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.768371013597152E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 100.000015f, 0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7559662776027264d) + "'", double2 == (-0.7559662776027264d));
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.350815104195135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8028294689984552d + "'", double1 == 0.8028294689984552d);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-44), 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-44.0f) + "'", float2 == (-44.0f));
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.013560982203286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.2658595418453178E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(20.085532134423065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182816124294233d + "'", double1 == 2.7182816124294233d);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.10440635237314978d), 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1, (-0.0019531248835846782d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.841534261491385E64d, (double) 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.841534261491385E64d + "'", double2 == 2.841534261491385E64d);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9999999701976777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182817474479353d + "'", double1 == 2.7182817474479353d);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.570796326736689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274784994992d + "'", double1 == 1.0232274784994992d);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6885686776071497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0037377790192319412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037447732267826d + "'", double1 == 1.0037447732267826d);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-6), 5.439202631236047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.882813470127877E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022097089107228303d + "'", double1 == 0.022097089107228303d);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.0f, 8.699681400989515d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999996f + "'", float2 == 51.999996f);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        long long2 = org.apache.commons.math3.util.FastMath.min(35L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.5622070602489355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009812364279302056d) + "'", double1 == (-0.009812364279302056d));
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.7798091421779662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4584935100277907d + "'", double1 == 0.4584935100277907d);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.488074682093421E62d + "'", double1 == 2.488074682093421E62d);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.029101515410080516d, (double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.15292150460684698E18d + "'", double2 == 1.15292150460684698E18d);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0101769735763335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8885515163169583d) + "'", double1 == (-0.8885515163169583d));
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        int int2 = org.apache.commons.math3.util.FastMath.max(20, (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.04402615488638885d), 5.447327196772732E34d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04402615488638885d + "'", double2 == 0.04402615488638885d);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.11294857116009238d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012757379727106452d + "'", double2 == 0.012757379727106452d);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-2), 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.061328855954495554d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.7764316821660115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6602039004484537d) + "'", double1 == (-0.6602039004484537d));
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        double double2 = org.apache.commons.math3.util.FastMath.log(99.99999237060547d, (-0.2796991406480593d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.005519215703220059d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.6714065E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.78140680443842d + "'", double1 == 55.78140680443842d);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5845632502852868E30d, 4.882812888051005E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.034537054884188d + "'", double2 == 1.034537054884188d);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.6268613048244727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3017603994181974d + "'", double1 == 1.3017603994181974d);
    }
}

