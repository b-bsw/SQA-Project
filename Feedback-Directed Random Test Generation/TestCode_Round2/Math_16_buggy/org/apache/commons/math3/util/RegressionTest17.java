package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0445360463872E13d, 0.9998536059613301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20636850759189573d + "'", double2 == 0.20636850759189573d);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(8877.068217828435d, 3072);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.691673596021348E41d, (double) 84.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.10942077636719d + "'", double2 == 32.10942077636719d);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 10, 8.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.999999f + "'", float2 == 8.999999f);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-6.000001f), (-0.061328855954495554d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.00031438115249d + "'", double2 == 6.00031438115249d);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.010518784647500397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010518590673716181d + "'", double1 == 0.010518590673716181d);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.268736768472422E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.268736773814742E-9d + "'", double1 == 3.268736773814742E-9d);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4874365673914125E14d, 85);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 109, (long) 50);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 50L + "'", long2 == 50L);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        int int2 = org.apache.commons.math3.util.FastMath.max(37, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        int int2 = org.apache.commons.math3.util.FastMath.min(192, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.686997580331529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3059445746892195d + "'", double1 == 1.3059445746892195d);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        float float2 = org.apache.commons.math3.util.FastMath.max(37.000004f, 39936.004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39936.004f + "'", float2 == 39936.004f);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.8828125E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.882812305974466E-4d + "'", double1 == 4.882812305974466E-4d);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710665478671954d + "'", double1 == 3.2710665478671954d);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.9916154164156743d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-2.9999998f), (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0468749962747097d) + "'", double2 == (-0.0468749962747097d));
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-3.614768820366027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-2.14748339E9f), 2.3978953594960317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483392E9d + "'", double2 == 2.147483392E9d);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        float float1 = org.apache.commons.math3.util.FastMath.abs(40.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.0f + "'", float1 == 40.0f);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(16.252646034500078d, 2.4247223454937545E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4247223454937545E21d + "'", double2 == 2.4247223454937545E21d);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 2015.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3044905014766304d + "'", double1 == 3.3044905014766304d);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013291660012496436d + "'", double1 == 0.013291660012496436d);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5847443794151275d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        double double1 = org.apache.commons.math3.util.FastMath.sin(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063590621241333d) + "'", double1 == (-0.5063590621241333d));
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 43L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(74.0d, (-17.76076974417489d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8063511429202184d + "'", double2 == 1.8063511429202184d);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        long long2 = org.apache.commons.math3.util.FastMath.min(18L, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 74L, (float) 149L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1043171489277315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0508649527545066d + "'", double1 == 1.0508649527545066d);
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5701461468115028d, (-0.2726787747159125d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5701461468115026d + "'", double2 == 1.5701461468115026d);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0000798685164107d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.436248262932771E10d + "'", double2 == 3.436248262932771E10d);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.5314547471274426d), 42971.83463481174d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2147483647, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.6363957575729347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6898166422297646d) + "'", double1 == (-0.6898166422297646d));
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.970193088617227d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3260263323678612d) + "'", double1 == (-1.3260263323678612d));
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-77) + "'", int2 == (-77));
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.0601456127484035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.982753492378883d + "'", double1 == 28.982753492378883d);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7819835177797978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7095171732065253d + "'", double1 == 0.7095171732065253d);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 38, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.010913347279288d) + "'", double1 == (-9.010913347279288d));
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.2549818703122236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1202597334155252E-15d + "'", double1 == 1.1202597334155252E-15d);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.0051598093960231765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0051598093960231765d + "'", double1 == 0.0051598093960231765d);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        int int2 = org.apache.commons.math3.util.FastMath.max(750, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        double double2 = org.apache.commons.math3.util.FastMath.log(31.70081736714295d, 3.64402339812979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3741204505837239d + "'", double2 == 0.3741204505837239d);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.0786964586302374E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0786964586302374E-39d + "'", double1 == 5.0786964586302374E-39d);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        long long2 = org.apache.commons.math3.util.FastMath.max(4L, 22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4554972406527213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8967745299456955d + "'", double1 == 0.8967745299456955d);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9977630759545904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.382431946694851E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3824319466948512E-10d + "'", double1 == 1.3824319466948512E-10d);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.30063120215704364d) + "'", double1 == (-0.30063120215704364d));
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0794415416798357d, 0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2308055906286415d + "'", double2 == 1.2308055906286415d);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(46.0d, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23552.0d + "'", double2 == 23552.0d);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8905770416677471d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.890577041667747d + "'", double2 == 0.890577041667747d);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5565987203972821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 38, 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.7781512503836434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574942309013249d + "'", double1 == 1.5574942309013249d);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.9999998f), 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.12316828E11f) + "'", float2 == (-4.12316828E11f));
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1096.6331584284585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.000911466453774d + "'", double1 == 7.000911466453774d);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        long long2 = org.apache.commons.math3.util.FastMath.min(16L, 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(98.34967800989337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.281702296513576d + "'", double1 == 5.281702296513576d);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.932447891572509d, 0.011048543456039806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005011144635550706d + "'", double2 == 0.005011144635550706d);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1500.0006666663703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5223347012340139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.927573873935792d + "'", double1 == 29.927573873935792d);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6499700825897167d, (-38));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3645773857050396E-12d + "'", double2 == 2.3645773857050396E-12d);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(67492.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.1932569E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1932569E-7f + "'", float1 == 1.1932569E-7f);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8063511429202184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217869420968477d + "'", double1 == 1.217869420968477d);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.4143575485932556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4143575485932558d + "'", double1 == 1.4143575485932558d);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.50359936E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5035996E15f + "'", float1 == 4.5035996E15f);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.0930501604482622d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09331964687974771d) + "'", double1 == (-0.09331964687974771d));
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9811019697333431d + "'", double1 == 0.9811019697333431d);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.15566292355646663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027168305393405843d + "'", double1 == 0.0027168305393405843d);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(229.3648145037862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.144794964072185d + "'", double1 == 15.144794964072185d);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.2676506E30f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.06869976497710933d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.09481857711035843d, 0.876754767185269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09481857711035843d + "'", double2 == 0.09481857711035843d);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.49609375f), (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.8924475E-6f) + "'", float2 == (-1.8924475E-6f));
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.570792512097631d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8363.276335768865d + "'", double2 == 8363.276335768865d);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        float float2 = org.apache.commons.math3.util.FastMath.max((-0.49609375f), (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        int int1 = org.apache.commons.math3.util.FastMath.abs(22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073486E-6f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073485E-6f + "'", float2 == 1.9073485E-6f);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5624904366973482d, (double) 6000.0005f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6000.00069172926d + "'", double2 == 6000.00069172926d);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        int int1 = org.apache.commons.math3.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1023.99994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0023620462865979784d, 1.1245083181663118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002100511640988539d + "'", double2 == 0.002100511640988539d);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-10445360463872L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        int int2 = org.apache.commons.math3.util.FastMath.max(46, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9290531082255364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016215035664422825d + "'", double1 == 0.016215035664422825d);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        double double1 = org.apache.commons.math3.util.FastMath.signum(19.608439339962796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9239385290558518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9239385290558518d + "'", double1 == 0.9239385290558518d);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.109218387044385d, 15.174271293851463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.397452353331163d + "'", double2 == 2.397452353331163d);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0986122886681098d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.002151468416961833d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.2425467563871425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24254675638714251d + "'", double1 == 0.24254675638714251d);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        int int2 = org.apache.commons.math3.util.FastMath.min(3072, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10L, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-15.749999f), 11014.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.749999f + "'", float2 == 15.749999f);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8608291180359888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6966846086773758d + "'", double1 == 0.6966846086773758d);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.864108630049296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.527419688948176d + "'", double1 == 0.527419688948176d);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-20L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7144176165949068d) + "'", double1 == (-2.7144176165949068d));
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(11014.0d, (-35));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.20549588650465E-7d + "'", double2 == 3.20549588650465E-7d);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.2466344651024274E-65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.000000476837272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931474189785528d + "'", double1 == 0.6931474189785528d);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.2380693740851022E-15d, (-57.285126329382095d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 141, 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0559039E11f + "'", float2 == 6.0559039E11f);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7976556325708719d), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39882781628543595d) + "'", double2 == (-0.39882781628543595d));
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-0.06243896f), 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.06243896f + "'", float2 == 0.06243896f);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5670585390721965d, 0.842385207305781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.842385207305781d + "'", double2 == 0.842385207305781d);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(416.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.1175823681357513E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.4322216757321002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.156568880217209d + "'", double1 == 1.156568880217209d);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.7182822016385244d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.159276472395984E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.064187021914602d + "'", double1 == 9.064187021914602d);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9124034991009714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8180579987125934d + "'", double1 == 0.8180579987125934d);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-49L), 1356.9350801851149d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-48.999996f) + "'", float2 == (-48.999996f));
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.20942362448062432d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.11030288331712183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4602685391035752d + "'", double1 == 1.4602685391035752d);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6653746816831396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09443741634619399d) + "'", double1 == (-0.09443741634619399d));
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-14.999999f), 1.0E21d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.999998f) + "'", float2 == (-14.999998f));
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-14.999998f), (float) (-1024L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.999998f) + "'", float2 == (-14.999998f));
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707941962660246d, 192);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.517553372175038E37d + "'", double2 == 4.517553372175038E37d);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.061290475572342844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0010697205988505387d + "'", double1 == 0.0010697205988505387d);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1227455410149547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5673056820522289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.4788634144627d + "'", double1 == 286.4788634144627d);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 29.0f, 258048);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.0516640514709925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.051664051470993d + "'", double1 == 4.051664051470993d);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.012757379727106452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012757033706954423d + "'", double1 == 0.012757033706954423d);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        long long2 = org.apache.commons.math3.util.FastMath.max(1025L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.294967808E9d, (-0.9026163845490671d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20575706424847762d) + "'", double2 == (-0.20575706424847762d));
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        float float2 = org.apache.commons.math3.util.FastMath.max((-22026.0f), 99.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-3.8676375522391298d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.317781526637439d) + "'", double1 == (-1.317781526637439d));
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        int int1 = org.apache.commons.math3.util.FastMath.abs(121);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 121 + "'", int1 == 121);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.437470063761967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1956924712738806d + "'", double1 == 2.1956924712738806d);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.7772088E-35f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0013247113583604495d, (-1.6571063883041222d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.140793241382152d + "'", double2 == 3.140793241382152d);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.9665319669045798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.80109699435246d + "'", double1 == 51.80109699435246d);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.5565355E-17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.617445E-24f + "'", float1 == 6.617445E-24f);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.76837215046544E-7d, (double) 100.000015f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.76837215046544E-7d + "'", double2 == 4.76837215046544E-7d);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        long long1 = org.apache.commons.math3.util.FastMath.abs(11L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 63, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.5347445780600277d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.99331524545442d) + "'", double1 == (-0.99331524545442d));
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        int int2 = org.apache.commons.math3.util.FastMath.max(86, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.300664126286459E30d, 112.28984325071114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.300664126286459E30d + "'", double2 == 1.300664126286459E30d);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.001953125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0019531250000000004d + "'", double1 == 0.0019531250000000004d);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.2374686846925546E-18d, 4.000000476837158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.000000476837158d + "'", double2 == 4.000000476837158d);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9998140668686113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8413705101635477d) + "'", double1 == (-0.8413705101635477d));
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-63L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0d + "'", double1 == 63.0d);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 22, 7.392373E-9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.392373E-9f + "'", float2 == 7.392373E-9f);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.5585053273486719d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-31.72467049624589d), (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5597692393574885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.072414916432464d + "'", double1 == 32.072414916432464d);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6888366918779438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6031944538876137d) + "'", double1 == (-0.6031944538876137d));
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 44L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        double double2 = org.apache.commons.math3.util.FastMath.log(26.562736412595044d, 0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3742610963161992d) + "'", double2 == (-1.3742610963161992d));
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.5565355E-17f, (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.299125E-23f + "'", float2 == 5.299125E-23f);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.382432E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.382431946599295E-10d + "'", double1 == 1.382431946599295E-10d);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707941962660246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334019733542954d + "'", double1 == 1.2334019733542954d);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.9249057814734434E-146d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9249057814734434E-146d + "'", double2 == 1.9249057814734434E-146d);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3486991523486093E-6d, 6.000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3486991523486093E-6d + "'", double2 == 1.3486991523486093E-6d);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.971286084435162d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3785958186782753d + "'", double1 == 0.3785958186782753d);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.6714016625072592E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6714016625072592E-60d + "'", double1 == 1.6714016625072592E-60d);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.0058456728177067995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005845739404514474d) + "'", double1 == (-0.005845739404514474d));
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.507682749749894E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2207032644558522E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.503599627370496E15d) + "'", double1 == (-4.503599627370496E15d));
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9999999935301913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577914238959d + "'", double1 == 57.29577914238959d);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.401298464324817E-45d) + "'", double1 == (-1.401298464324817E-45d));
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(8.88178366760566E-16d, 69.53701189487664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2772742781977455E-17d + "'", double2 == 1.2772742781977455E-17d);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.02042970020377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020429700203772293d + "'", double1 == 0.020429700203772293d);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        int int1 = org.apache.commons.math3.util.FastMath.abs(192);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192 + "'", int1 == 192);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.159276472395984E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05052044487089575d) + "'", double1 == (-0.05052044487089575d));
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.1977594109665195d, (double) 29.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.268453796226458E9d + "'", double2 == 8.268453796226458E9d);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-42));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.0633824E37f, 0.5942992187596847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(47.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        long long1 = org.apache.commons.math3.util.FastMath.abs(192L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 192L + "'", long1 == 192L);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.5067879719422177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4690632290346675d) + "'", double1 == (-0.4690632290346675d));
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 86.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.206769224304003E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.410301219381425E13d + "'", double1 == 2.410301219381425E13d);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        double double1 = org.apache.commons.math3.util.FastMath.log(22026.474197238054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.00000038146972d + "'", double1 == 10.00000038146972d);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.176243631242751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4294121896934133d + "'", double1 == 1.4294121896934133d);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-750L), (float) 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.309341227634172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144264491992202d + "'", double1 == 1.144264491992202d);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 16L, (double) 39.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.000002f + "'", float2 == 16.000002f);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.796720822921585E297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.796720822921585E297d + "'", double1 == 6.796720822921585E297d);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11.085564054390163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9959536527026902d) + "'", double1 == (-0.9959536527026902d));
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.03467284536035253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03467979309627836d) + "'", double1 == (-0.03467979309627836d));
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1580072.847490559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1257.0094858395298d + "'", double1 == 1257.0094858395298d);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.4E-45f), 1.1646222122142713d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.1626899390303921E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1626899390303921E-17d) + "'", double1 == (-1.1626899390303921E-17d));
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5701296602269954d + "'", double1 == 1.5701296602269954d);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 2.1474839E9f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1474839039999995E9d + "'", double2 == 2.1474839039999995E9d);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 15.274185406184992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.632416418432009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.6363319661787496E69d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.102398704460064E-240d + "'", double2 == 9.102398704460064E-240d);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 86L, 7.2759576E-12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 86.0f + "'", float2 == 86.0f);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 21);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.35232069507293856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9385744227556342d + "'", double1 == 0.9385744227556342d);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7707893739848156d), (-13));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.409049975400581E-5d) + "'", double2 == (-9.409049975400581E-5d));
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(15.174271293851461d, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395815941323134d + "'", double2 == 1.5395815941323134d);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.9103830456310187E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9103830456733704E-11d + "'", double1 == 2.9103830456733704E-11d);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(192.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 192.00003f + "'", float1 == 192.00003f);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1753554136824456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2392940286894514d + "'", double1 == 3.2392940286894514d);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0232274784994995d, (double) 3.0000007f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0232274784994995d + "'", double2 == 1.0232274784994995d);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.43597357E12f, (float) 48000);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597357E12f + "'", float2 == 3.43597357E12f);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7416573867739413d + "'", double1 == 3.7416573867739413d);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.6641687893997885d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8724880508484311d) + "'", double1 == (-0.8724880508484311d));
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9999546011007675d, (-1.6738779353175968d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6739233342168293d) + "'", double2 == (-0.6739233342168293d));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(11.7910068511973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.791006851197302d + "'", double1 == 11.791006851197302d);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.08583325804146333d), (double) 32.000008f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08583325804146333d + "'", double2 == 0.08583325804146333d);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6000, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.9103834E-11f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.06413302264162797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0020572272738824d + "'", double1 == 1.0020572272738824d);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-0.49609375f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7916281914203646d) + "'", double1 == (-0.7916281914203646d));
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28) + "'", int1 == (-28));
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.492459E-10f, (-14.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.492459E-10f + "'", float2 == 3.492459E-10f);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6885686776071497d, 0.05751362495359344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6885686776071497d + "'", double2 == 0.6885686776071497d);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.931471805599453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 56.0f, 82.0602573466037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-26.060257346603706d) + "'", double2 == (-26.060257346603706d));
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5707338638168467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5090347375700772d + "'", double1 == 2.5090347375700772d);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.03417412840354696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03418743827970073d + "'", double1 == 0.03418743827970073d);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5403021903467493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8575532752700432d + "'", double1 == 0.8575532752700432d);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.10118316786443415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10135590904357498d + "'", double1 == 0.10135590904357498d);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.831008000716577E22d, 62.58344286260509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07954809138671995d + "'", double2 == 0.07954809138671995d);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-42L), (-15.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.47588E27f, 43.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43.0f + "'", float2 == 43.0f);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1041008551170817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.6011880928080983E28d, 11.532562594670797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.532562594670797d + "'", double2 == 11.532562594670797d);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4602685391035752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1345167430694847d + "'", double1 == 1.1345167430694847d);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        double double1 = org.apache.commons.math3.util.FastMath.rint(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        double double2 = org.apache.commons.math3.util.FastMath.min((-3.614768820366027d), 9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.614768820366027d) + "'", double2 == (-3.614768820366027d));
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.6268613048244727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1612231530729575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8214380988735541d + "'", double1 == 0.8214380988735541d);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.18838862103418857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18952113006314425d + "'", double1 == 0.18952113006314425d);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.9999986f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.783412408121364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.699514748210191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8530946248522677d + "'", double1 == 2.8530946248522677d);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-3.748066029033894E7d), (double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.297362804412842E-6d + "'", double2 == 5.297362804412842E-6d);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.015625f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0038848218537937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267945724d + "'", double1 == 1.5707963267945724d);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.16745572513813106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40921354466602283d + "'", double1 == 0.40921354466602283d);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0027168305393405843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000036905863599d + "'", double1 == 1.0000036905863599d);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7665477785848038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1523231175411188d + "'", double1 == 1.1523231175411188d);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.07954809138671995d, 7.444680502256067E34d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07954809138671995d + "'", double2 == 0.07954809138671995d);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0000000002328306d, (-1024));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.562684647563167E-309d + "'", double2 == 5.562684647563167E-309d);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 258048);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.6469779601696886E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2005.3522829578808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8879813966787504d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5777218104420236E-30d, 2.4414062985774404E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4414062985774404E-4d + "'", double2 == 2.4414062985774404E-4d);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(258047.98f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-62.99999999999999d), (-2.2343605386104213d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-62.99999999999999d) + "'", double2 == (-62.99999999999999d));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        float float1 = org.apache.commons.math3.util.FastMath.abs(128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 128.0f + "'", float1 == 128.0f);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.171869616492817E-49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.171869616492817E-49d + "'", double1 == 3.171869616492817E-49d);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.941742215644044E83d, 1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549025d + "'", double2 == 1.5574077246549025d);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440688253002957E43d + "'", double1 == 1.3440688253002957E43d);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        double double1 = org.apache.commons.math3.util.FastMath.atan(72.64597536373867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5570318086614539d + "'", double1 == 1.5570318086614539d);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.103515625000001E-5d, 0.12949601773888192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.103515625000001E-5d + "'", double2 == 6.103515625000001E-5d);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.9190098068653538E10d, 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9190098068653538E10d + "'", double2 == 1.9190098068653538E10d);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        int int2 = org.apache.commons.math3.util.FastMath.min(512, (-28));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-28) + "'", int2 == (-28));
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2.234360538610421d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8929394309310698d) + "'", double1 == (-0.8929394309310698d));
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.8434441617117128d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6931474189785528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2500001788139912d + "'", double1 == 1.2500001788139912d);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.3472175051613533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.853230586269599d + "'", double1 == 0.853230586269599d);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8484681979535594d, 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16405567475301122d + "'", double2 == 0.16405567475301122d);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.42077103379809366d), 1.151292546497023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42077103379809366d + "'", double2 == 0.42077103379809366d);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.2491542559227393d, 1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.98218342691022d + "'", double2 == 7.98218342691022d);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.81474976710656E14d, 0.9166893899372177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.81474976710656E14d + "'", double2 == 2.81474976710656E14d);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 3072.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.03008425321327d + "'", double1 == 8.03008425321327d);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 6000.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6000.0d + "'", double1 == 6000.0d);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.1401003924481925d, (-6.305123299389195d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 87);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 87.00001f + "'", float1 == 87.00001f);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-35));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.080211319309233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.805039451839418d + "'", double1 == 1.805039451839418d);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941542245016d + "'", double1 == 0.7615941542245016d);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.922386521532856E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.922386521532856E25d + "'", double1 == 5.922386521532856E25d);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-30032.88671720342d), 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.7589008592061665E33d) + "'", double2 == (-4.7589008592061665E33d));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2207031250000033E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207031280316523E-4d + "'", double1 == 1.2207031280316523E-4d);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5996388013001026d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.076086085740535d) + "'", double1 == (-10.076086085740535d));
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.385850023714672d, (double) 100.000015f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.385850023714672d + "'", double2 == 1.385850023714672d);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(50.42126034728076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.613658420493685d + "'", double1 == 4.613658420493685d);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.0075704846535947735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0075706292857074566d) + "'", double1 == (-0.0075706292857074566d));
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999998750125d + "'", double1 == 0.999999998750125d);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.009241694678239648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5295101006116452d + "'", double1 == 0.5295101006116452d);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.1E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.8414710492169523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9443505256250473d + "'", double1 == 0.9443505256250473d);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.15411301352167d, (double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.15411301352167d + "'", double2 == 6.15411301352167d);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.736583018476897d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.536744E-7f, 0.023097294972507593d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536745E-7f + "'", float2 == 9.536745E-7f);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.4690632290346675d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        float float2 = org.apache.commons.math3.util.FastMath.min(63.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.29105342757312413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 230L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 230 + "'", int1 == 230);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9999999966478914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941545479653d + "'", double1 == 0.7615941545479653d);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        double double2 = org.apache.commons.math3.util.FastMath.min(9.11547140682732d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        double double1 = org.apache.commons.math3.util.FastMath.floor(749.9998168945312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.0d + "'", double1 == 749.0d);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(375.0f, 4161536.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 375.0f + "'", float2 == 375.0f);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.0978507187362676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.012958729957493d + "'", double1 == 4.012958729957493d);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.005011144635550706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005011123662625024d + "'", double1 == 0.005011123662625024d);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.991477554164109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.2609551558045143d), (double) 3.60287949E16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.013462623778017066d, 0.9738115534140308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015070404040468794d + "'", double2 == 0.015070404040468794d);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(29.04250833647213d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.08501667294426d + "'", double2 == 58.08501667294426d);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        double double1 = org.apache.commons.math3.util.FastMath.exp(9.21052320575111E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000009d + "'", double1 == 1.000000000000009d);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.111474989126999E36d, (double) 1.6263033E-16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43122301523956036d) + "'", double2 == (-0.43122301523956036d));
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        float float1 = org.apache.commons.math3.util.FastMath.signum(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.626535952270647E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.486339547584802E10d, 258048);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        double double2 = org.apache.commons.math3.util.FastMath.min(54.51797669983169d, 114.59156092460519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.51797669983169d + "'", double2 == 54.51797669983169d);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.7990222E28f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6821738184917208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11114736252488898d) + "'", double1 == (-0.11114736252488898d));
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.3981910502487487E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3981910502487487E-10d + "'", double1 == 2.3981910502487487E-10d);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 374.99997f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.25132649810594E162d + "'", double1 == 7.25132649810594E162d);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2.290822861412639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8988168321355658d) + "'", double1 == (-0.8988168321355658d));
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 31.70081736714295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        double double1 = org.apache.commons.math3.util.FastMath.acos(21.799911408087066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.37121413816834664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1904800798987882d + "'", double1 == 1.1904800798987882d);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8215975647065147d), 0.9999999741081426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8215975647065147d) + "'", double2 == (-0.8215975647065147d));
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11.447142425533318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8997639095379518d) + "'", double1 == (-0.8997639095379518d));
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.9663132900858417E-6d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 97, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-149L), 0.972630067242408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-148.99999999999997d) + "'", double2 == (-148.99999999999997d));
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.6308050742098271d), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.836065670400107d) + "'", double2 == (-2.836065670400107d));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        int int2 = org.apache.commons.math3.util.FastMath.max((-724), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        float float1 = org.apache.commons.math3.util.FastMath.signum(416.00003f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7683707192685373d), 2.518455217059944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7683707192685373d) + "'", double2 == (-0.7683707192685373d));
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.64926744E12f, 0.0035172567579617323d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926731E12f + "'", float2 == 1.64926731E12f);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        int int2 = org.apache.commons.math3.util.FastMath.max((-47), 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 205 + "'", int2 == 205);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.03467284536035253d), 1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.034672845360352526d) + "'", double2 == (-0.034672845360352526d));
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 3, 46.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9735692101318191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        double double1 = org.apache.commons.math3.util.FastMath.rint(6.103515625000001E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.7916281914203646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.8014400656965632E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.42994786944633d + "'", double1 == 37.42994786944633d);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.473814720414451d) + "'", double1 == (-0.473814720414451d));
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 50L, 0.3789063f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5707647845032549d, 0.010518978623430845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570800005457995d + "'", double2 == 1.570800005457995d);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0633824E37f, 1246.3114137236385d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.06338233E37f + "'", float2 == 1.06338233E37f);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        int int2 = org.apache.commons.math3.util.FastMath.max((-35), 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3072, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.20652549972907766d), 1.0E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20652549972907766d) + "'", double2 == (-0.20652549972907766d));
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 121, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.443593622809233E69d, 1.3414339173983056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9998536059613301d, 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7483766645706134E11d + "'", double2 == 2.7483766645706134E11d);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.5063656411097587d), 7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.3307293015091775d + "'", double2 == 7.3307293015091775d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1597153257338444d, 12.16264444841069d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1597153257338446d + "'", double2 == 1.1597153257338446d);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        double double2 = org.apache.commons.math3.util.FastMath.log((-15.999999046325684d), 1.4419647480158577d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9999655062931482d, 3.739111695586088E71d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.739111695586088E71d + "'", double2 == 3.739111695586088E71d);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        double double1 = org.apache.commons.math3.util.FastMath.sin(6.620073206530356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3305515345317579d + "'", double1 == 0.3305515345317579d);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.345632762712187d, 1.1621183532803174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.345632762712187d + "'", double2 == 2.345632762712187d);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2980741372624545E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.192093E-7f, (-1499.9999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.192093E-7f) + "'", float2 == (-1.192093E-7f));
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8623150089993341d, (-42));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9606773298604233E-13d + "'", double2 == 1.9606773298604233E-13d);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2772742781977455E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2772742781977455E-17d + "'", double1 == 1.2772742781977455E-17d);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.695108876643778E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003695791652218d + "'", double1 == 1.0003695791652218d);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.99822295029797d, (double) 46L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99822295029797d + "'", double2 == 2.99822295029797d);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.33158070377639E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.331580703776382E-7d + "'", double1 == 1.331580703776382E-7d);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.441162712889187d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441162712889187d + "'", double2 == 1.441162712889187d);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 127.00001f, 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.00000762939453d + "'", double2 == 127.00000762939453d);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.08640384017873165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08618946083013478d) + "'", double1 == (-0.08618946083013478d));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.620233E-10f, 1.222048239275884d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.6202334E-10f + "'", float2 == 4.6202334E-10f);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 40);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5458015331759765d + "'", double1 == 1.5458015331759765d);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-127.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.072762216191133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.21991180375937053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.600018220521122d) + "'", double1 == (-12.600018220521122d));
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.1576810513783636E-19d, 8.376517822945031E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.376517822945031E-13d + "'", double2 == 8.376517822945031E-13d);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.4258259770489514E8d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4258259770489514E8d + "'", double2 == 2.4258259770489514E8d);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.8754980340813943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917079266501333d + "'", double1 == 0.9917079266501333d);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-4.515449934892307d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 22, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.5707963267876206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9738671125025468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.135272762622845d + "'", double1 == 1.135272762622845d);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.9663132900858417E-6d, 2.990700744648233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.990700744648233d + "'", double2 == 2.990700744648233d);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 126.99999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060545d + "'", double2 == 126.99999237060545d);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.09481857711035845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6196625787827068d, (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1311.2060649015373d + "'", double2 == 1311.2060649015373d);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.8284271247461903d, 7.629365427493558E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000007932441165d + "'", double2 == 1.000007932441165d);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.7480575296890003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5772793400051265d + "'", double1 == 0.5772793400051265d);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3414339173983056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.930200124969514d + "'", double1 == 0.930200124969514d);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.796960035003417d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0902244075622802d) + "'", double1 == (-1.0902244075622802d));
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        double double1 = org.apache.commons.math3.util.FastMath.asin(116618.90399762228d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-8.881785E-16f), 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        float float2 = org.apache.commons.math3.util.FastMath.max(13.000001f, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1.09951163E12f, 1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6942252369286008E32d + "'", double2 == 1.6942252369286008E32d);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5640537039872793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999772686049571d + "'", double1 == 0.9999772686049571d);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2999.9999166666644d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 87L, 40);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.5657512E13f + "'", float2 == 9.5657512E13f);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        double double2 = org.apache.commons.math3.util.FastMath.min((-72.35560618424385d), (double) 4161536.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-72.35560618424385d) + "'", double2 == (-72.35560618424385d));
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.8870997475188376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8870997475188376d + "'", double1 == 1.8870997475188376d);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 3072L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 10, (-126.99999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000326E-127d + "'", double2 == 1.0000000000000326E-127d);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(47999.99609375d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.2993419E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6589960183062683d + "'", double1 == 0.6589960183062683d);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.268736768472422E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.014120383468518E32d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.014120383468518E32d + "'", double2 == 1.014120383468518E32d);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6000.0d + "'", double1 == 6000.0d);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.06252029346191121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06252029346191121d + "'", double1 == 0.06252029346191121d);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.1051760129492685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 447.17151850423704d + "'", double1 == 447.17151850423704d);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-38.22907066290581d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.22907066290581d + "'", double1 == 38.22907066290581d);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.669418070491609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6694180704916093d + "'", double1 == 3.6694180704916093d);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 85, (-67));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.759824E-19f + "'", float2 == 5.759824E-19f);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-11.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.486339547584802E10d, 7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.814697265625E-6d) + "'", double2 == (-3.814697265625E-6d));
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.25594028828308535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25056166115903017d + "'", double1 == 0.25056166115903017d);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.1474839E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 0.06243896f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0624389611184597d + "'", double1 == 0.0624389611184597d);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(72.89110995790382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.982066806979557d + "'", double1 == 4.982066806979557d);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.0000002f, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0002f + "'", float2 == 3072.0002f);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.3687098E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.037091348627933E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.219172252686382d) + "'", double1 == (-6.219172252686382d));
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5207126162141167d, 0.4043787951567745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0968025644129813d) + "'", double2 == (-0.0968025644129813d));
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8136451593772986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2195064651094762d + "'", double1 == 1.2195064651094762d);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.07876066216728575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.64926744E12f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E12f + "'", float2 == 1.64926744E12f);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        double double2 = org.apache.commons.math3.util.FastMath.min((-44.36141949623185d), (-74.20321057778875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-74.20321057778875d) + "'", double2 == (-74.20321057778875d));
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        long long2 = org.apache.commons.math3.util.FastMath.max((-20L), 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.43022620016570173d, (-77));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.604509091765879E28d + "'", double2 == 1.604509091765879E28d);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        float float1 = org.apache.commons.math3.util.FastMath.signum(39936.004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(15.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        int int2 = org.apache.commons.math3.util.FastMath.min(121, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 750, 44.0070091039492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.880845232863578d + "'", double2 == 1.880845232863578d);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.19068996526228799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19186496118348442d + "'", double1 == 0.19186496118348442d);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.656682604204755d), 1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6566826042047549d) + "'", double2 == (-1.6566826042047549d));
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8373333600970126d + "'", double1 == 0.8373333600970126d);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-11.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.013553240791789689d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.3132616294189077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281612429424d + "'", double1 == 2.718281612429424d);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.022920740387489907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022662006340855953d + "'", double1 == 0.022662006340855953d);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-28.999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 16);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 16.0f + "'", float1 == 16.0f);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1753554136824456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.2980742E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2980742E33f + "'", float2 == 1.2980742E33f);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9073862646776047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015836877905996926d + "'", double1 == 0.015836877905996926d);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-63));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9899925302460492d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.989992530246049d) + "'", double1 == (-0.989992530246049d));
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9950547536867306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0021530211942107245d) + "'", double1 == (-0.0021530211942107245d));
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(16.911534525287763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.911534525287767d + "'", double1 == 16.911534525287767d);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0038848218537937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.51836340946489d + "'", double1 == 57.51836340946489d);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        float float2 = org.apache.commons.math3.util.FastMath.min((-11.0f), 52.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-11.0f) + "'", float2 == (-11.0f));
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 63.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1673594611985832d + "'", double1 == 0.1673594611985832d);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(15.749999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 15.75f + "'", float1 == 15.75f);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.54742505E26f, (-3.8676375522391298d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1060180357077195E-102d + "'", double2 == 5.1060180357077195E-102d);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.088825268418815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08509937967107274d + "'", double1 == 0.08509937967107274d);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.0877197964243557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4942079184999423d) + "'", double1 == (-0.4942079184999423d));
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8402864822065013d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007601801268019861d + "'", double2 == 0.007601801268019861d);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.39701689679318236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.088825268418815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0888252684188153d + "'", double1 == 1.0888252684188153d);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.022343035780788705d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.8641086300492958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9524805460485446d + "'", double1 == 0.9524805460485446d);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        int int2 = org.apache.commons.math3.util.FastMath.min(38, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.3785958186782753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38770518426248524d + "'", double1 == 0.38770518426248524d);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.132761631686654d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0000000000291038d), 1.0763895617482287E-43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000000000291036d) + "'", double2 == (-1.0000000000291036d));
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-4.81036337152E12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.684342E-14f, 112);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.951479E20f + "'", float2 == 2.951479E20f);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2547299842205948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5047078206453659d + "'", double1 == 0.5047078206453659d);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.8977400331674263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.460450367827319d) + "'", double1 == (-1.460450367827319d));
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(74.35674296486278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.0d + "'", double1 == 75.0d);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.482576781564405d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.11805318683721E16d + "'", double2 == 1.11805318683721E16d);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        double double2 = org.apache.commons.math3.util.FastMath.min((-6.211487457547996E31d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.211487457547996E31d) + "'", double2 == (-6.211487457547996E31d));
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.06338233E37f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9999999979388464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745329248396938d) + "'", double1 == (-0.01745329248396938d));
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.11052669025126904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11097897061135335d + "'", double1 == 0.11097897061135335d);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02249305674199273d + "'", double1 == 0.02249305674199273d);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.3424226808222062d, 0.48168124860751377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4262242037092108d + "'", double2 == 1.4262242037092108d);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        float float2 = org.apache.commons.math3.util.FastMath.min(16127.999f, 1.2993419E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16127.999f + "'", float2 == 16127.999f);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(22.491165328790636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8067636098309507d + "'", double1 == 3.8067636098309507d);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.66633186E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9999995f + "'", float1 == 5.9999995f);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5684342783118803d, (-6.57117967769818E-20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(89.9236056725866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.510019655837535d + "'", double1 == 4.510019655837535d);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5031586665657326d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5031586665657326d + "'", double2 == 1.5031586665657326d);
    }
}

