package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-29), (float) 12L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        double double1 = org.apache.commons.math3.util.FastMath.log(70.01428280002321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 9223372036854775807L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8573168196649732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15394774414429493d) + "'", double1 == (-0.15394774414429493d));
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        int int2 = org.apache.commons.math3.util.FastMath.min(149, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.3466753987299895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4143575485932556d + "'", double1 == 1.4143575485932556d);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.949911109190508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9499111091905081d + "'", double1 == 0.9499111091905081d);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11962.131100329156d + "'", double1 == 11962.131100329156d);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0000269272749114d, 3.814697265625009E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2439404956380444E-7d + "'", double2 == 2.2439404956380444E-7d);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.9999998f, 5.298342441912637d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1529215E18f, 1.1227455410149547d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.15292144E18f + "'", float2 == 1.15292144E18f);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.000015f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 661);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7580103071638075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.5367431640625E-7d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5269841324701218E-175d + "'", double2 == 2.5269841324701218E-175d);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5144283572433307d) + "'", double1 == (-0.5144283572433307d));
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 3072L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3072.0000000000005d + "'", double1 == 3072.0000000000005d);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (-0.808844491375823d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.9905748953335048d), 6.930494765951626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9905748953335048d) + "'", double2 == (-0.9905748953335048d));
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.21991180375937056d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6036003925924347d) + "'", double1 == (-0.6036003925924347d));
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.14351994778492885d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500, (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6263033E-16f + "'", float2 == 1.6263033E-16f);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(55.42562584220407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.42562584220408d + "'", double1 == 55.42562584220408d);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(100.00000763058662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-2016));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.443593622809233E69d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5486215305415268d, (double) (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.0d) + "'", double2 == (-15.0d));
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.5565355E-17f, 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1932569E-7f + "'", float2 == 1.1932569E-7f);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3071.9998f, 7.624618747740735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.892753342130799E26d + "'", double2 == 3.892753342130799E26d);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        double double2 = org.apache.commons.math3.util.FastMath.log((-2.349101754933678d), 1580072.847490559d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-5L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.169420946081488E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1694277838348877E-5d + "'", double1 == 1.1694277838348877E-5d);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(48000.0f, (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0f + "'", float2 == 6000.0f);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        long long2 = org.apache.commons.math3.util.FastMath.min(6L, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.5845633E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.53786160730874d + "'", double1 == 69.53786160730874d);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        float float1 = org.apache.commons.math3.util.FastMath.abs(112.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 112.00001f + "'", float1 == 112.00001f);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        double double1 = org.apache.commons.math3.util.FastMath.abs(127.11046571371325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.11046571371325d + "'", double1 == 127.11046571371325d);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9239385290558519d, 1.0842021724855047E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9239385290558518d + "'", double2 == 0.9239385290558518d);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.004962015874444895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.304341850669857d) + "'", double1 == (-2.304341850669857d));
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2246467991473535E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.990700744648233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2481132455911637d + "'", double1 == 1.2481132455911637d);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.2207033E-4f), (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.4505815E-9f) + "'", float2 == (-7.4505815E-9f));
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(48000.0f, 141);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.012638627557620415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000798685164107d + "'", double1 == 1.0000798685164107d);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5896828217829762d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8904869112092367d, (double) 10445360463872L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0445360463872E13d + "'", double2 == 1.0445360463872E13d);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 12, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6975039373827737d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1162021663700457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.053236471998201d + "'", double1 == 2.053236471998201d);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308231E201d + "'", double1 == 5.729577951308231E201d);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2260986406399412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8866182725444937d + "'", double1 == 0.8866182725444937d);
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.910383E-11f), (-49.172535687931976d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9103834E-11f) + "'", float2 == (-2.9103834E-11f));
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        int int1 = org.apache.commons.math3.util.FastMath.round((-127.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.12150579067946177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12180677292442696d + "'", double1 == 0.12180677292442696d);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0995574287564276d) + "'", double1 == (-1.0995574287564276d));
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.030461739654624384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03045703062337168d + "'", double1 == 0.03045703062337168d);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(50.793076005481666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(104.86708613731835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.492985981786405E45d + "'", double1 == 3.492985981786405E45d);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.656682604204755d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(44.29429222643544d, 0.03444315284990291d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.29430561789672d + "'", double2 == 44.29430561789672d);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        int int2 = org.apache.commons.math3.util.FastMath.max((-4), 661);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 661 + "'", int2 == 661);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999940395531084d, 0.6975039373827737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999958425610765d + "'", double2 == 0.9999958425610765d);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.4043418471644635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 3072L, 0.011344117980650029d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3071.9998f + "'", float2 == 3071.9998f);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.15292144E18f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.0f, (-0.951638805994557d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.129248571153767E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.21991180375937056d), 1.3132616294189077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21991180375937056d) + "'", double2 == (-0.21991180375937056d));
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.05751362495359344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05754533762304682d + "'", double1 == 0.05754533762304682d);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.094947017729282E-13d, (-0.5026536249078912d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.094947017729281E-13d + "'", double2 == 9.094947017729281E-13d);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.585786437626905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5565987203972821d + "'", double1 == 0.5565987203972821d);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.0000005f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 6000L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.80143985E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.80144007E16f + "'", float1 == 1.80144007E16f);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.553423334544648d + "'", double1 == 3.553423334544648d);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2016.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2015.9999f) + "'", float1 == (-2015.9999f));
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double1 = org.apache.commons.math3.util.FastMath.asin(55.78140680443842d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0012766224843186505d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.5622070602489355d), 9.536743164059608E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7525265177153063d, 1.2207031249999999E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7525265177153062d + "'", double2 == 0.7525265177153062d);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.2061743125711886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.2980741E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.7371252E25f + "'", float1 == 7.7371252E25f);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.14748352E9f), (-0.5545968900472659d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748339E9f) + "'", float2 == (-2.14748339E9f));
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.3687098E8f, 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E15f + "'", float2 == 1.64926744E15f);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.027041164336506638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02704116433650664d + "'", double1 == 0.02704116433650664d);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.587367707538151E-14d, 0.011675895096193602d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011675895096193602d + "'", double2 == 0.011675895096193602d);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 4.5035996E15f, (-7.684013597604755E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.07977109790154036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.973552586323384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8641086300492958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-6.287685879697498E111d), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5904102385727168E-112d) + "'", double2 == (-1.5904102385727168E-112d));
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 44);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9312063052667533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3442544716776892d + "'", double1 == 1.3442544716776892d);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.4154539484374528d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.308272139545614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7249531797676281d + "'", double1 == 0.7249531797676281d);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        double double2 = org.apache.commons.math3.util.FastMath.max(9.53674430093088E-7d, 1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        int int2 = org.apache.commons.math3.util.FastMath.max(4, (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.8469725489740325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2491542559227398d + "'", double1 == 3.2491542559227398d);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        float float2 = org.apache.commons.math3.util.FastMath.max(63.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.7762636E-21f, 1.0000608595834288d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.776264E-21f + "'", float2 == 6.776264E-21f);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.556943144653333d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        double double2 = org.apache.commons.math3.util.FastMath.pow(225.6516556453549d, (-47));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4456221266466943E-111d + "'", double2 == 2.4456221266466943E-111d);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5996946512663103d + "'", double1 == 0.5996946512663103d);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.10412335356742336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09888586507799793d) + "'", double1 == (-0.09888586507799793d));
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.93244801066549d, 2.1181358553707477E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.932448010665489d + "'", double2 == 6.932448010665489d);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1917602425161025d, 1.5694629941431792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3777027516270768d) + "'", double2 == (-0.3777027516270768d));
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2207033E-4f, (-29));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.273737E-13f + "'", float2 == 2.273737E-13f);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0E100d, 9.085602717697938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E100d + "'", double2 == 1.0E100d);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.8582226493088282d), (-0.7707893739848156d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08743327532401257d) + "'", double2 == (-0.08743327532401257d));
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.9642038991485d + "'", double1 == 65.9642038991485d);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.07977109790154036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6506522708226594d + "'", double1 == 1.6506522708226594d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.882288307236088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.899538965103673d + "'", double1 == 8.899538965103673d);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-34), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 661L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-2.14748339E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2304173493603813E11d) + "'", double1 == (-1.2304173493603813E11d));
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double1 = org.apache.commons.math3.util.FastMath.exp(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1096.6331584284585d + "'", double1 == 1096.6331584284585d);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(22026.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.031427297728094d + "'", double1 == 28.031427297728094d);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097587d) + "'", double1 == (-0.5063656411097587d));
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-30032.88671720342d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.782135461917777E-9d, (-749.9999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5474252E26f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.177193355766363E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.275344667466088E-4d + "'", double1 == 2.275344667466088E-4d);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2993419E33f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-13.0591403123201d), 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-106980.47743852626d) + "'", double2 == (-106980.47743852626d));
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4449632606147725d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1040616953820165E18d + "'", double2 == 4.1040616953820165E18d);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 230L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5664485281041391d + "'", double1 == 1.5664485281041391d);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.691290568386469d + "'", double1 == 0.691290568386469d);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 4.0000005f, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.000000476837158d + "'", double2 == 4.000000476837158d);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) -1, 1023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.448719238886159E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999996430957373d + "'", double1 == 0.9999996430957373d);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(11.532562594670797d, 0.9999999999998178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.575836902790211d + "'", double2 == 11.575836902790211d);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.8212977905128216E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483291904489717d + "'", double1 == 0.9483291904489717d);
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-29.012614126025312d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.018531E-36f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.984137914278307E171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (-47L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 3.8146973E-6f, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 131072.0d + "'", double2 == 131072.0d);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6842868307608122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 106);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0844638552900231E46d + "'", double1 == 1.0844638552900231E46d);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.9843788128357573d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-2.349101754933678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(12.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.2491542559227398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double2 = org.apache.commons.math3.util.FastMath.pow(48000.0d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.465850228008332E-85d + "'", double2 == 5.465850228008332E-85d);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7465363222182906d) + "'", double1 == (-0.7465363222182906d));
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(24000.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24000.0d + "'", double1 == 24000.0d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841857910156025E-7d + "'", double1 == 2.3841857910156025E-7d);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-27.725887222397812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.812978183665497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-15.749999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.45187119653358443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42440892460022006d) + "'", double1 == (-0.42440892460022006d));
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-3.5369650302128113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.061731685305114276d) + "'", double1 == (-0.061731685305114276d));
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8114933394509746d) + "'", double1 == (-0.8114933394509746d));
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 2016L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.488074682093421E62d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.64926744E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.010518784647500399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010518978623430845d + "'", double1 == 0.010518978623430845d);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.999625033326321E-5d, 1.968131753285203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999625033326321E-5d + "'", double2 == 4.999625033326321E-5d);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.13533528323661265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14492059268744914d + "'", double1 == 0.14492059268744914d);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2207031189367021E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0000001192093038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414710492169523d + "'", double1 == 0.8414710492169523d);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32.000004f, (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0000002f + "'", float2 == 2.0000002f);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.704872438963137d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 173.11183609364076d + "'", double2 == 173.11183609364076d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        int int2 = org.apache.commons.math3.util.FastMath.max(38, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-15.749999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.0d) + "'", double1 == (-16.0d));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        double double2 = org.apache.commons.math3.util.FastMath.pow(36.01102806275612d, 16.252646034500078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.977860159833482E25d + "'", double2 == 1.977860159833482E25d);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(80.44386220622742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4609.093792148782d + "'", double1 == 4609.093792148782d);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3328.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3328.0f + "'", float1 == 3328.0f);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4.611686E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1920928955078157E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.9351525542706054d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(11.575836902790211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53246.62611076307d + "'", double1 == 53246.62611076307d);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4435936228092328E69d, 43);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.003014266594967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.5687609160957652d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.29100619138474915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0050790161833526295d) + "'", double1 == (-0.0050790161833526295d));
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.1367205671564067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1367205671564067d + "'", double1 == 2.1367205671564067d);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.121079351920185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961162546084487d + "'", double1 == 0.9961162546084487d);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.882813E-4f + "'", float1 == 4.882813E-4f);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.30039148809513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07505599059199855d + "'", double1 == 0.07505599059199855d);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.30746697826968333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29813096209479945d + "'", double1 == 0.29813096209479945d);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.99999994f, (double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3494765865309735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3494765865309735d + "'", double1 == 1.3494765865309735d);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5213171963583803d, 0.5785595485605854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2747499112619687d + "'", double2 == 1.2747499112619687d);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.813181025133959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9527368038560544d + "'", double1 == 1.9527368038560544d);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.13533528323661273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7683707192685373d), 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.614630070254418E38d) + "'", double2 == (-2.614630070254418E38d));
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 8.881786E-16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9721522630525295E-31d + "'", double1 == 1.9721522630525295E-31d);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.4359738368E11d, 1.1029798377113775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E11d + "'", double2 == 3.4359738368E11d);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.017453291479645992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017452405505090827d) + "'", double1 == (-0.017452405505090827d));
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.3733829795401761E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08583325804146333d) + "'", double1 == (-0.08583325804146333d));
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        double double1 = org.apache.commons.math3.util.FastMath.abs(9.385626020143185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.385626020143185d + "'", double1 == 9.385626020143185d);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        long long1 = org.apache.commons.math3.util.FastMath.round(50.793076005481666d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.6428736185724157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.83394510450251d + "'", double1 == 36.83394510450251d);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.29807406E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8863378582920313d + "'", double1 == 0.8863378582920313d);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0001f + "'", float1 == 1025.0001f);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.570796326736689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380685345d + "'", double1 == 4.810477380685345d);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        int int1 = org.apache.commons.math3.util.FastMath.abs(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(106.0f, 3072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9239385290558519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7979814834746045d + "'", double1 == 0.7979814834746045d);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999998555018376d), 36.011028062756125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998555018376d + "'", double2 == 0.9999998555018376d);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.4731873725534812d), (double) 14L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.0d + "'", double2 == 14.0d);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double1 = org.apache.commons.math3.util.FastMath.rint(375.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 375.0d + "'", double1 == 375.0d);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.570796326794411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373153065d + "'", double1 == 1.2533141373153065d);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.641588833612778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) (-34));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000004f, 1.0141204E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0141204E32f + "'", float2 == 1.0141204E32f);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.01728276659971805d, 2.1367205671564067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01728276659971805d + "'", double2 == 0.01728276659971805d);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.8211864E-34f, 23.472957530972497d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8211867E-34f + "'", float2 == 2.8211867E-34f);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9440892412430647d), (-2.229020270326605E-63d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9440892412430647d) + "'", double2 == (-0.9440892412430647d));
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.509071350945633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.030192941051162E16d, (-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1709704813917884d + "'", double2 == 0.1709704813917884d);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.6435381333569995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5673038117428982d) + "'", double1 == (-0.5673038117428982d));
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0000002f, 48000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9358793340080341d, 1.8218109075452849d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8862740270915485d + "'", double2 == 0.8862740270915485d);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.09951176E12f, (-1023.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1127887657566855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.22850376359397642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23054050688065747d + "'", double1 == 0.23054050688065747d);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 46, (-20L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.2233715E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.09481857711035843d, 1.3733829795401761E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09481857711035845d + "'", double2 == 0.09481857711035845d);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.8218109075452849d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4422495703074083d, 1023);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.992842419769159E162d + "'", double2 == 4.992842419769159E162d);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.4154539484374528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 97.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848858576443723d + "'", double1 == 9.848858576443723d);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.086097232552573E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.0964636728249658E-8d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-26) + "'", int1 == (-26));
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.1175823681357508E-22d, (double) 16128.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1175823681357513E-22d + "'", double2 == 2.1175823681357513E-22d);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.4435936228092328E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5508158352787748d + "'", double1 == 0.5508158352787748d);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19198621771937624d + "'", double1 == 0.19198621771937624d);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(87.09341963470486d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1500L, 100.00000762939453d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1499.9999f + "'", float2 == 1499.9999f);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 50L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 50.0f + "'", float1 == 50.0f);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.810477380965306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 122.79022124234764d + "'", double1 == 122.79022124234764d);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.94875668844129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46963893897202424d + "'", double1 == 0.46963893897202424d);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-38.22907066290581d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        double double1 = org.apache.commons.math3.util.FastMath.exp(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.827881037143875E11d + "'", double1 == 7.827881037143875E11d);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.3234889800848443E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.473814720414451d, (double) 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.473814720414451d + "'", double2 == 0.473814720414451d);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1190346870425513E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.951156451311066d) + "'", double1 == (-14.951156451311066d));
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-47L), (int) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.447447E30f) + "'", float2 == (-7.447447E30f));
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 10445360463872L, (-137.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.04453605E13f) + "'", float2 == (-1.04453605E13f));
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.012826747469946d, 0.02283062218882923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.012826747469946d + "'", double2 == 1.012826747469946d);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.553423334544648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5259804977597387d + "'", double1 == 1.5259804977597387d);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999999999998178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870194143d + "'", double1 == 0.8813735870194143d);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(46.73581812221961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6020517656472655d + "'", double1 == 3.6020517656472655d);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32.000004f, 97.00000000000001d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.2547422950466232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.999999f, 5.8774718E-37f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8774718E-37f + "'", float2 == 5.8774718E-37f);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        double double1 = org.apache.commons.math3.util.FastMath.tan(51.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030861493754441d + "'", double1 == 0.9030861493754441d);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1023.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.0075707739244519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1208597223574226d) + "'", double1 == (-2.1208597223574226d));
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(38.22907066290581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.669418070491609d + "'", double1 == 3.669418070491609d);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0909305359822086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08703103478010532d + "'", double1 == 0.08703103478010532d);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 5.831193E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.636224696176675E15d + "'", double1 == 7.636224696176675E15d);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1500624.3457795258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26190.8356694386d + "'", double1 == 26190.8356694386d);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5139390198587235d + "'", double1 == 1.5139390198587235d);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.64926744E15f, 3328.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E15f + "'", float2 == 1.64926744E15f);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(8.881785E-16f, (float) (-2016));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.881785E-16f) + "'", float2 == (-8.881785E-16f));
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) '#', 42971.83113775489d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.19276540932902125d, 0.0027621358640501454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9954630704099756d + "'", double2 == 0.9954630704099756d);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 85);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85.0f + "'", float2 == 85.0f);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2481132455911637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4837637461282407d + "'", double1 == 3.4837637461282407d);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5091784786580553d + "'", double1 == 2.5091784786580553d);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-18));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(15.174119582065703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.783412408121364d + "'", double1 == 2.783412408121364d);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1), (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.8828125E-4f) + "'", float2 == (-4.8828125E-4f));
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.509644039241865d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.509644039241864d + "'", double2 == 7.509644039241864d);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(51.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.046745412134744E21d + "'", double1 == 7.046745412134744E21d);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9092974268256815d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9688026558508415d) + "'", double1 == (-0.9688026558508415d));
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.557068888645458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(100.00001f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        double double1 = org.apache.commons.math3.util.FastMath.rint(44.36141937702255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.0d + "'", double1 == 44.0d);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.5091784786580553d, 2.138463037954397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5091784786580553d + "'", double2 == 2.5091784786580553d);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.5091784786580553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.76533687216326d + "'", double1 == 143.76533687216326d);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        double double1 = org.apache.commons.math3.util.FastMath.atan(37.999996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5444866069020453d + "'", double1 == 1.5444866069020453d);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        long long2 = org.apache.commons.math3.util.FastMath.max(32L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8880936454516588d, 3.051757812026305E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707619637766896d + "'", double2 == 1.5707619637766896d);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.2455323929060171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2817429346395727d) + "'", double1 == (-0.2817429346395727d));
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8778599937165045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.39567227992801673d, 1.1054730691723746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1054730691723746d + "'", double2 == 1.1054730691723746d);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-37.999996f), 1.8402864822065015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.999996185302734d + "'", double2 == 37.999996185302734d);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1025.0000000262442d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1049600.000026874d + "'", double2 == 1049600.000026874d);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5707963267942904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6332917887909931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.9362129819375358d, 3.156007379756452E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1023, 1023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1023L + "'", long2 == 1023L);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.2679097686563066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.659189757353836d + "'", double1 == 8.659189757353836d);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8904869112092367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05037245961609866d) + "'", double1 == (-0.05037245961609866d));
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 127, (float) (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.8774718E-37f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10445360463872L, (-1024));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-34L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3), (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8640954259078426d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        double double1 = org.apache.commons.math3.util.FastMath.exp(28.031427297728094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4924307727615732E12d + "'", double1 == 1.4924307727615732E12d);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.4524228376538795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1041008551170817d + "'", double1 == 1.1041008551170817d);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        double double1 = org.apache.commons.math3.util.FastMath.cos(122.07712677639502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9026163845490671d) + "'", double1 == (-0.9026163845490671d));
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.1040616953820165E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5139390198587235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.74231627807738d + "'", double1 == 86.74231627807738d);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9092974268256815d), 1.1621183532803174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9092974268256814d) + "'", double2 == (-0.9092974268256814d));
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1920928955078097E-7d, 0.9515181949376154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9515181949376154d + "'", double2 == 0.9515181949376154d);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        long long2 = org.apache.commons.math3.util.FastMath.max((-14L), 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000001372850489d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.02718858648935137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2401310215141802E-16d + "'", double1 == 1.2401310215141802E-16d);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.0066927999415745d, 37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.881146187797675E11d + "'", double2 == 6.881146187797675E11d);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.1691263E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8889466E22f + "'", float1 == 1.8889466E22f);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7249531797676281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.274490838357367d + "'", double1 == 1.274490838357367d);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8425767838562601d, (-0.02718858648935137d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8430153355241219d + "'", double2 == 0.8430153355241219d);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.64158883361278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2396109578603927d + "'", double1 == 2.2396109578603927d);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.1401003924481925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.500290951070782d + "'", double1 == 7.500290951070782d);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-121L), 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 121.0f + "'", float2 == 121.0f);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(108222.44191876269d, 34.581559855949905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570476785320265d + "'", double2 == 1.570476785320265d);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7853981633974483d, 8.699681400989514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.204690469334889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6889023782052348d) + "'", double1 == (-0.6889023782052348d));
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double2 = org.apache.commons.math3.util.FastMath.max((-2.4917798526449118d), 5.079172612257729E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.079172612257729E-4d + "'", double2 == 5.079172612257729E-4d);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1753554136824453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1753554136824456d + "'", double1 == 1.1753554136824456d);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0000038147045416d, (double) 48000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2825638.7176637845d + "'", double2 == 2825638.7176637845d);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.999999999999999d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.669418070491609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5645971953656318d + "'", double1 == 0.5645971953656318d);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.6379788E-12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.3368087E-19f + "'", float1 == 4.3368087E-19f);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        double double1 = org.apache.commons.math3.util.FastMath.exp(20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.284913114854943E8d + "'", double1 == 5.284913114854943E8d);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.02909330424175981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.599187944144099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9539726886959428d + "'", double1 == 1.9539726886959428d);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.1175823681357513E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11.532562594670797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6797035565939802d) + "'", double1 == (-1.6797035565939802d));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.13533528323661273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12692801104297252d + "'", double1 == 0.12692801104297252d);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        double double1 = org.apache.commons.math3.util.FastMath.signum(19.36491594307659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.3407554936658988d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32841555916265663d) + "'", double1 == (-0.32841555916265663d));
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.88178366760566E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178366760566E-16d + "'", double1 == 8.88178366760566E-16d);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4453060614371709d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, (-0.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2048.0f, 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.450873173395282E69d + "'", double2 == 3.450873173395282E69d);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.5673056820522289d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double1 = org.apache.commons.math3.util.FastMath.signum(69.5378615119413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0000004768373099d, 108.43633988276744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000004768373099d + "'", double2 == 1.0000004768373099d);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.7762636E-21f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-67) + "'", int1 == (-67));
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(126.99999237060548d, 1.4411627128891868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17767363635704037d + "'", double2 == 0.17767363635704037d);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-49L), 3.9665319669045798d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-48.999996f) + "'", float2 == (-48.999996f));
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1023.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8503.447640781234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 487211.6611272416d + "'", double1 == 487211.6611272416d);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 22026L, (float) (-2016));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-22026.0f) + "'", float2 == (-22026.0f));
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.814697265634253E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570792512097631d + "'", double1 == 1.570792512097631d);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.3440585709080678E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.33934385609142426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.44297075773338d + "'", double1 == 19.44297075773338d);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        long long1 = org.apache.commons.math3.util.FastMath.round(55.78140680443842d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0000608595834288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616197142345807d + "'", double1 == 0.7616197142345807d);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.972630067242408d) + "'", double1 == (-0.972630067242408d));
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-149), 106L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(71.74447588040013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9662094680453555d + "'", double1 == 4.9662094680453555d);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        double double2 = org.apache.commons.math3.util.FastMath.min(40922.90603882126d, (-0.6363957575729347d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6363957575729347d) + "'", double2 == (-0.6363957575729347d));
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.68434188608064E-14d, 7.625595310085968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.68434188608064E-14d + "'", double2 == 5.68434188608064E-14d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(38.75229574078433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6826675939177553d + "'", double1 == 3.6826675939177553d);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        double double1 = org.apache.commons.math3.util.FastMath.tan(36.011028062756125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.48692942311593d + "'", double1 == 8.48692942311593d);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.49174338951939384d, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4917433895193939d + "'", double2 == 0.4917433895193939d);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409903d + "'", double1 == 10.017874927409903d);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.768371013597152E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.32237741439296E-9d + "'", double1 == 8.32237741439296E-9d);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(686.4773600637391d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 686.477360063739d + "'", double2 == 686.477360063739d);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(70.01428280002321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.262881023007619d + "'", double1 == 4.262881023007619d);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.729577951308231E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2828063500117436E23d + "'", double1 == 3.2828063500117436E23d);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(86.74231627807738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(20.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4350.668043506033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207032644558522E-4d + "'", double1 == 1.2207032644558522E-4d);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(29.0f, (-62.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-29.0f) + "'", float2 == (-29.0f));
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-8L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.1691265E29f, (float) 50);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 43L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 43.000004f + "'", float1 == 43.000004f);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9953380705322046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7056388834581453d + "'", double1 == 2.7056388834581453d);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-31.776061130789305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9111477955680065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0930501604482622d) + "'", double1 == (-0.0930501604482622d));
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.022832605602534084d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84010.50108557596d + "'", double2 == 84010.50108557596d);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.9375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.2227587494850775E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7276.564038537341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8619263557749237d + "'", double1 == 3.8619263557749237d);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-1.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999998807907104d + "'", double1 == 1.9999998807907104d);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9893581078632866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4247770070950634d + "'", double1 == 1.4247770070950634d);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-13L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.45187119653358443d), (-57.295779513082316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.297561358141586d + "'", double2 == 57.297561358141586d);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.12150579067946177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12210729973125768d + "'", double1 == 0.12210729973125768d);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(39.0f, (-0.630805074209827d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.999996f + "'", float2 == 38.999996f);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        int int1 = org.apache.commons.math3.util.FastMath.round((-35.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-14.5560905533403d), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06869976497710933d) + "'", double2 == (-0.06869976497710933d));
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.141592653589793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0194839173657902E-28d + "'", double1 == 2.0194839173657902E-28d);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8484681979535594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695312E-8d + "'", double1 == 2.9802322387695312E-8d);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.13512126156864773d), 1049600.000026874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13512126156864773d + "'", double2 == 0.13512126156864773d);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1023);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 661, 9.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 661.0f + "'", float2 == 661.0f);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.3258176636680326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0940947389186513d + "'", double1 == 1.0940947389186513d);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-29), 0.017610831014788973d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-28.999998f) + "'", float2 == (-28.999998f));
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        double double2 = org.apache.commons.math3.util.FastMath.pow(160.80803418105256d, 3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000018d + "'", double2 == 1.000000000000018d);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.000000001862645d, 1.044757795734393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.044757795734393d + "'", double2 == 1.044757795734393d);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 38, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.630805074209827d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7427521618439966d) + "'", double1 == (-0.7427521618439966d));
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 230);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.9843788128357573d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0576995672643544E47d + "'", double2 == 3.0576995672643544E47d);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(8.8817837E-16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.881784E-16f + "'", float1 == 8.881784E-16f);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1023.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.00006f + "'", float1 == 1023.00006f);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9515181949376154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(46040.886104364334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.841091281687916d + "'", double1 == 35.841091281687916d);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.017915698460637734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0179147401920297d + "'", double1 == 0.0179147401920297d);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9999999801317847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941476116241d) + "'", double1 == (-0.7615941476116241d));
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8640954259078426d, 5.132761631686654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.204988268266269d + "'", double2 == 5.204988268266269d);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.24891856508546262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2542596133585809d) + "'", double1 == (-0.2542596133585809d));
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8608291180359888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6518089030439832d + "'", double1 == 0.6518089030439832d);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.9580333260613902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.925955988934938d + "'", double1 == 0.925955988934938d);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 6000, (long) 39);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6000L + "'", long2 == 6000L);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.0282408E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 51L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9999999701976777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        int int2 = org.apache.commons.math3.util.FastMath.min(38, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-4.836344889159275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3200537642354306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0969762035384047d + "'", double1 == 1.0969762035384047d);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99627207622075d + "'", double1 == 0.99627207622075d);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.31358451852720004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5036453863070315d) + "'", double1 == (-0.5036453863070315d));
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(148.4131591025766d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5251190530819294E40d + "'", double2 == 2.5251190530819294E40d);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5702884095118321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702884095118321d + "'", double1 == 1.5702884095118321d);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9943589486530622d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.2382098E-13f + "'", float1 == 2.2382098E-13f);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 44L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.29807406E33f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.739706489124846E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.036360625353949E-6d) + "'", double1 == (-3.036360625353949E-6d));
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15841285229840546d) + "'", double1 == (-0.15841285229840546d));
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6423065883854172d, 4.991374238398652E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.466528223471357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9850571258202687d + "'", double1 == 3.9850571258202687d);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.015628966602108815d, (-1.2304173493603813E11d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.015628966602108815d) + "'", double2 == (-0.015628966602108815d));
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        int int2 = org.apache.commons.math3.util.FastMath.max(44, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.556245054886526d, 0.03045703062337168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002936493094570402d + "'", double2 == 0.002936493094570402d);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.0f) + "'", float1 == (-0.0f));
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.492985981786405E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4929859817864055E45d + "'", double1 == 3.4929859817864055E45d);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 97L, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2016L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2016.0f + "'", float1 == 2016.0f);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.588325623556069E8d, 3.1855810236609772E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.58832562355607E8d + "'", double2 == 8.58832562355607E8d);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.028392510015146796d, 9.21052320575111E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267945722d + "'", double2 == 1.5707963267945722d);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.993222750278501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7300932779126392d + "'", double1 == 1.7300932779126392d);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 38, 512.49994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.49994f + "'", float2 == 512.49994f);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        int int1 = org.apache.commons.math3.util.FastMath.abs(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        int int2 = org.apache.commons.math3.util.FastMath.max(1023, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        double double1 = org.apache.commons.math3.util.FastMath.rint(36.011028062756125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5771174481917147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.000000005268356d, (double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-126.99999237060547d) + "'", double2 == (-126.99999237060547d));
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2015.9998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2015.9996f) + "'", float1 == (-2015.9996f));
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        int int2 = org.apache.commons.math3.util.FastMath.max(1023, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1023 + "'", int2 == 1023);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6215477523208264d), 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6215477523208263d) + "'", double2 == (-0.6215477523208263d));
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 12, 1.2980741372624545E33d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.000001f + "'", float2 == 12.000001f);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(96.0d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.298534883328E12d + "'", double2 == 3.298534883328E12d);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.617985073826121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999780624d + "'", double1 == 0.9999999999780624d);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7301521188343126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9290531082255364d + "'", double1 == 0.9290531082255364d);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 20);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.704872438963137d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.428833170792415E30d + "'", double2 == 3.428833170792415E30d);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 106.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0844638552900231E46d + "'", double1 == 1.0844638552900231E46d);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.09888586507799793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        double double1 = org.apache.commons.math3.util.FastMath.log10(19.085532134423065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.280704273261894d + "'", double1 == 1.280704273261894d);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        float float1 = org.apache.commons.math3.util.FastMath.abs(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }
}

