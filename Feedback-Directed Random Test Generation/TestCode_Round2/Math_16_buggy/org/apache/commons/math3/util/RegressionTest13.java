package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.222758749485078E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 15L, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.15396076E11f + "'", float2 == 5.15396076E11f);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0141204E32f, 1.7763568E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0141204E32f + "'", float2 == 1.0141204E32f);
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(14.999999f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.999998f + "'", float2 == 29.999998f);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8862740270915485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05243197782655937d) + "'", double1 == (-0.05243197782655937d));
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(14.0f, (-375.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(36.07140440247247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.005947419223087d + "'", double1 == 6.005947419223087d);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.050344007274675445d, 2.4056437262473316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.050344007274675445d + "'", double2 == 0.050344007274675445d);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 109);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.21052320575111E-15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.12717101690833E64d + "'", double1 == 5.12717101690833E64d);
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.570476785320265d, 46);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0409981776839905E9d + "'", double2 == 1.0409981776839905E9d);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        float float1 = org.apache.commons.math3.util.FastMath.signum(46.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12521084603836322d) + "'", double1 == (-0.12521084603836322d));
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(10.000000953674318d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000953674316d + "'", double2 == 10.000000953674316d);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5049898015397962d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.770157551990498E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.770157551990498E-32d + "'", double1 == 3.770157551990498E-32d);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.085602964160698d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6000.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1413520055419473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.2142316598443891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.1305288720617787E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207031249990764E-4d + "'", double1 == 1.2207031249990764E-4d);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.26095515580451434d), 9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.00340430020405d + "'", double2 == 10.00340430020405d);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        float float2 = org.apache.commons.math3.util.FastMath.max((-0.06243896f), (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        double double1 = org.apache.commons.math3.util.FastMath.floor(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.19589283408591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 3.469447E-18f, (-4.999625033326321E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.469446951953614E-18d) + "'", double2 == (-3.469446951953614E-18d));
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        int int2 = org.apache.commons.math3.util.FastMath.min((-44), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-29.328990934768964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267912586d + "'", double1 == 1.5707963267912586d);
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.694813266259794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9347575224039227d + "'", double1 == 0.9347575224039227d);
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9092974268256817d) + "'", double1 == (-0.9092974268256817d));
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        double double1 = org.apache.commons.math3.util.FastMath.signum(13192.8407798297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.061877705960518836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06179885322941391d + "'", double1 == 0.06179885322941391d);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-8L), 8.881785E-16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2521.014298575622d), 0.018864831372454823d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.313219942645561d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570502024105884E10d + "'", double2 == 1.570502024105884E10d);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.0024879065139820676d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        float float2 = org.apache.commons.math3.util.FastMath.max(14.999999f, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 5.831193E31f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.14335945248362d + "'", double1 == 73.14335945248362d);
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5386895293271398E-26d, 0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5386895293271398E-26d + "'", double2 == 1.5386895293271398E-26d);
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 8388608.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.63553233343869d + "'", double1 == 16.63553233343869d);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.0f), 24000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 97.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929696407506087d + "'", double1 == 1.6929696407506087d);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.569462994251686d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.750202239606818d + "'", double1 == 0.750202239606818d);
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5643904318910452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1635411564360822d + "'", double1 == 1.1635411564360822d);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-29));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.7763568E-15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-49) + "'", int1 == (-49));
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.550462574188602d), 2.267909768656307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.267909768656307d + "'", double2 == 2.267909768656307d);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5403021903467493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403021903467494d + "'", double1 == 0.5403021903467494d);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 750, 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2220482392758836d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4934018991172873d + "'", double2 == 1.4934018991172873d);
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0788405256891818E-19d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1576810513783636E-19d + "'", double2 == 2.1576810513783636E-19d);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-15.999999046325684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27925266367433593d) + "'", double1 == (-0.27925266367433593d));
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-31.776061130789305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        int int1 = org.apache.commons.math3.util.FastMath.round(63.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-6.196498107675438d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 44L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8956399139416201d, (-0.8178612782693988d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2128758905748798d + "'", double2 == 1.2128758905748798d);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3402918541993147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.340291854199315d + "'", double1 == 1.340291854199315d);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.010518978623430845d, 1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010518978623430843d + "'", double2 == 0.010518978623430843d);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1746142944486795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4639780495538803d + "'", double1 == 1.4639780495538803d);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(36.04365338911715d, 0.028392510015146796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.04365338911715d + "'", double2 == 36.04365338911715d);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-63));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        int int2 = org.apache.commons.math3.util.FastMath.max(15, (-26));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        double double1 = org.apache.commons.math3.util.FastMath.floor(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-62.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-62.999992f) + "'", float1 == (-62.999992f));
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.2124675420131484E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.398046511104E12d + "'", double1 == 4.398046511104E12d);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6286665988545064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.12692801104297252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11949535639186176d + "'", double1 == 0.11949535639186176d);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-8.881785E-16f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881785255792436E-16d + "'", double1 == 8.881785255792436E-16d);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-4.8103634E12f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        double double2 = org.apache.commons.math3.util.FastMath.max(20.87998490068716d, (double) 29L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.0d + "'", double2 == 29.0d);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        int int1 = org.apache.commons.math3.util.FastMath.round(3072.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3072 + "'", int1 == 3072);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.932447891572509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        double double1 = org.apache.commons.math3.util.FastMath.log10(22.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3424226808222062d + "'", double1 == 1.3424226808222062d);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.2776724662502028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0387993333213206d + "'", double1 == 1.0387993333213206d);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) (-15));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.34807962410585763d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2016L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2016.0f) + "'", float2 == (-2016.0f));
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.017453292524006958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017452406441346557d + "'", double1 == 0.017452406441346557d);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.6929696407506087d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.557321860113169d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6821738184917205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6821738184917208d + "'", double1 == 1.6821738184917208d);
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1025.0f, (-1.933186133561807d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0d + "'", double2 == 1025.0d);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        double double1 = org.apache.commons.math3.util.FastMath.log10(173.11183609364076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2383267627016337d + "'", double1 == 2.2383267627016337d);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.0282408E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342813E25f + "'", float1 == 1.9342813E25f);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.882288307236088d, (-1024.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.138777926348185d + "'", double2 == 3.138777926348185d);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5673056820522289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027354644537026792d + "'", double1 == 0.027354644537026792d);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.702986674926819d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.654091005086663d) + "'", double1 == (-2.654091005086663d));
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1.1E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        long long2 = org.apache.commons.math3.util.FastMath.max(112L, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.02283260560253408d, 6.139932559690632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.139932559690632d + "'", double2 == 6.139932559690632d);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 750, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        int int2 = org.apache.commons.math3.util.FastMath.max((-47), (-63));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 52);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.34720030357470333d, (-0.001721599228683447d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.575754804945882d + "'", double2 == 1.575754804945882d);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000003d + "'", double1 == 100.00000000000003d);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.19077079376318204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1023.99994f), (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.9999998f) + "'", float2 == (-3.9999998f));
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1499.9999f, 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6143999.5f + "'", float2 == 6143999.5f);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        double double2 = org.apache.commons.math3.util.FastMath.min(3282.6426454739853d, 4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3713210688081606E-4d + "'", double2 == 4.3713210688081606E-4d);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        double double1 = org.apache.commons.math3.util.FastMath.signum(11915.86542515003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.743392130574644E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.63946495171592d) + "'", double1 == (-51.63946495171592d));
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-11.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999994421064d) + "'", double1 == (-0.9999999994421064d));
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.298534883328E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.517646691625867d + "'", double1 == 29.517646691625867d);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.129321527924962d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.129321527924963d + "'", double2 == 4.129321527924963d);
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        double double2 = org.apache.commons.math3.util.FastMath.max(127.11046571371325d, 1.5707730557363138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.11046571371325d + "'", double2 == 127.11046571371325d);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        int int2 = org.apache.commons.math3.util.FastMath.min(512, (-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49) + "'", int2 == (-49));
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.0019531248835846782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0019512187763363572d) + "'", double1 == (-0.0019512187763363572d));
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-126.99999999999999d), (-97.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-126.99999999999997d) + "'", double2 == (-126.99999999999997d));
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 74L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5370263527767281E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28957769347715206d) + "'", double1 == (-0.28957769347715206d));
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8425767838562601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7001686872743049d + "'", double1 == 0.7001686872743049d);
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-20), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.0d) + "'", double2 == (-40.0d));
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3495150228208087E50d + "'", double1 == 3.3495150228208087E50d);
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 34, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        long long1 = org.apache.commons.math3.util.FastMath.abs(38L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(13.0f, 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416.0f + "'", float2 == 416.0f);
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-205.9115765284781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5938349783942183d) + "'", double1 == (-3.5938349783942183d));
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0633824E37f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.437470063761967d, (-2.935896209259133d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3207731692232265d + "'", double2 == 5.3207731692232265d);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.46963893897202424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4538925674179464d + "'", double1 == 0.4538925674179464d);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 6143999.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(402.4286011229416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.690663329467393d + "'", double1 == 6.690663329467393d);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.0034310190995747916d), 2.229020270326605E-63d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0034310190995747916d) + "'", double2 == (-0.0034310190995747916d));
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.7772088E-35f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.7772088E-35f + "'", float2 == 4.7772088E-35f);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 11014L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11014.0f + "'", float2 == 11014.0f);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-5.026525695313479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7129945017319592d) + "'", double1 == (-1.7129945017319592d));
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9953380705322047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004672830152988219d) + "'", double1 == (-0.004672830152988219d));
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299044217186d) + "'", double1 == (-2.5049299044217186d));
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9103830457157227E-11d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.9527368038560544d, 8.58832562355607E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9527368038560544d + "'", double2 == 1.9527368038560544d);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.29807406E33f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-121L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 86L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        int int2 = org.apache.commons.math3.util.FastMath.max(39, (-50));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 8L, (float) (-63L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8032057313113643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8032057313113644d + "'", double1 == 0.8032057313113644d);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.000003814697266d + "'", double2 == 32.000003814697266d);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.7559662776027264d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7559662776027263d) + "'", double1 == (-0.7559662776027263d));
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-8.376517822945031E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.376517822941523E-13d) + "'", double1 == (-8.376517822941523E-13d));
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207033E-4f + "'", float1 == 1.2207033E-4f);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(89.9236056725866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6532181001115565E38d + "'", double1 == 5.6532181001115565E38d);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1029798377113775d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8766229492125006E38d + "'", double2 == 1.8766229492125006E38d);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5707870865672484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810432931264618d + "'", double1 == 4.810432931264618d);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.28430256748260907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28060558553372966d + "'", double1 == 0.28060558553372966d);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 127L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-104973.24821800704d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.704872438963137d, 0.7853951831651208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3486868894677745d + "'", double2 == 0.3486868894677745d);
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-67));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 67L + "'", long1 == 67L);
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 35.0f, 0.020093845590042958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.664475681299524E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-2521.014298575622d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-1L), 0.9124034991009714d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.5872036550391518d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.159276472395984E9d, 0.5996946512663103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.159276472395984E9d + "'", double2 == 1.159276472395984E9d);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1025.0001220703898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.625595429178968d + "'", double1 == 7.625595429178968d);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.469447E-18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.05751362495359344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0016543644801585d + "'", double1 == 1.0016543644801585d);
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        long long2 = org.apache.commons.math3.util.FastMath.min(3072L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 141);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 141L + "'", long1 == 141L);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-44.0f), (-0.42331082513074814d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.00203622623245d + "'", double2 == 44.00203622623245d);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.27376591469257794d), 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3025749260254341E-60d + "'", double2 == 2.3025749260254341E-60d);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 661);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 661L + "'", long1 == 661L);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.441162712889187d, 0.5597383986215132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2269808089751189d + "'", double2 == 1.2269808089751189d);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.932448010665489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.070961690487835d + "'", double1 == 2.070961690487835d);
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.0000002f, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.294967808E9d + "'", double2 == 4.294967808E9d);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.007570773924451899d), 0.7805065035757566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.007570773924451898d) + "'", double2 == (-0.007570773924451898d));
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5707870865672484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9133817649450813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5475585765788982d + "'", double1 == 1.5475585765788982d);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.925955988934938d, (-4.999875010412076E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9259559902848267d + "'", double2 == 0.9259559902848267d);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        double double1 = org.apache.commons.math3.util.FastMath.log(160.80803418105256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.080211319309233d + "'", double1 == 5.080211319309233d);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6143003604059988d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.488074682093421E62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5773632055089344E31d + "'", double1 == 1.5773632055089344E31d);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.084202172485505E-19d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-6.000001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7182818285381576d, 1.0090262908655008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7182818285381576d + "'", double2 == 1.7182818285381576d);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-29.328990934768964d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000608595834288d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8623150089993341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5597383986215132d, 7.174600241584084E-43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5597383986215132d + "'", double2 == 0.5597383986215132d);
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934062E18d + "'", double1 == 7.2638973976934062E18d);
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.17726509371386773d, (double) 43);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.906803404478674E-33d + "'", double2 == 4.906803404478674E-33d);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (-1.5694538891241967d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5694538891241967d + "'", double2 == 1.5694538891241967d);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        long long2 = org.apache.commons.math3.util.FastMath.max(74L, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-25.30591789243267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-47));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2692.901637114869d) + "'", double1 == (-2692.901637114869d));
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1024.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.274490838357367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2425467563871425d + "'", double1 == 0.2425467563871425d);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.080211319309233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-7.4505815E-9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-1.04453605E13f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.8212977905128216E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6694228143633276E22d + "'", double1 == 6.6694228143633276E22d);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.02718858648935137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5577912567662449d) + "'", double1 == (-1.5577912567662449d));
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-62.999996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        double double1 = org.apache.commons.math3.util.FastMath.tan(173.11183609364076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33610184966221995d + "'", double1 == 0.33610184966221995d);
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.93496684993349d, 0.30196465536956996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.93496684993349d + "'", double2 == 4.93496684993349d);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-15.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0788405256891818E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.673229889783244d) + "'", double1 == (-43.673229889783244d));
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.62364218539641d) + "'", double1 == (-7.62364218539641d));
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(20.57108454052487d, 1.9580333260613905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.571084540524865d + "'", double2 == 20.571084540524865d);
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.64926744E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.649267441664E12d + "'", double1 == 1.649267441664E12d);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.2491542559227398d, (-9.632848614896421E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2491542559227393d + "'", double2 == 3.2491542559227393d);
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 661);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 661.00006f + "'", float1 == 661.00006f);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.171869616492817E-49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.171869616492817E-49d + "'", double1 == 3.171869616492817E-49d);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.4411627128891868d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 3072, (double) 29);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3071.9998f + "'", float2 == 3071.9998f);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 6000);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6000.0f + "'", float1 == 6000.0f);
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1024), 661);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 661 + "'", int2 == 661);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.0517578129736954E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.515449934892307d) + "'", double1 == (-4.515449934892307d));
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1597153257338444d + "'", double1 == 1.1597153257338444d);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.005519215703220058d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.6293945E-6f, (float) 661L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 661.0f + "'", float2 == 661.0f);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0016543644801585d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        float float1 = org.apache.commons.math3.util.FastMath.abs(131072.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 131072.0f + "'", float1 == 131072.0f);
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-121L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 121L + "'", long1 == 121L);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.5091784786580553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9868561771800732d + "'", double1 == 0.9868561771800732d);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 512.5f, (double) 4.768372E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.768372150465439E-7d + "'", double2 == 4.768372150465439E-7d);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(36.83394510450251d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 9.6935236E-24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-77) + "'", int1 == (-77));
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        double double2 = org.apache.commons.math3.util.FastMath.max((-7277.0d), 0.40408300167069183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40408300167069183d + "'", double2 == 0.40408300167069183d);
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.19902326E12f + "'", float1 == 2.19902326E12f);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(39.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.070961690487835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.932448010665488d + "'", double1 == 7.932448010665488d);
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324817E-45d + "'", double1 == 1.401298464324817E-45d);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-28.999998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1190346870425511E-15d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-50) + "'", int1 == (-50));
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11.548739357257748d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2372506.8737414116d + "'", double2 == 2372506.8737414116d);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-42));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.999999880790727d, 0.3486868894677745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999880790727d + "'", double2 == 0.999999880790727d);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(69.5378615119413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0844638552900231E46d, 44.36141937702255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.36141937702255d + "'", double2 == 44.36141937702255d);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(99.99999f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597357E12f + "'", float2 == 3.43597357E12f);
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.962088504675655d, (-77));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.608439339962796d + "'", double2 == 19.608439339962796d);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0179147401920297d, (double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0179147401920297d + "'", double2 == 0.0179147401920297d);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0387993333213206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7123610724880716d + "'", double1 == 0.7123610724880716d);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        int int2 = org.apache.commons.math3.util.FastMath.max(149, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8.359154094323616E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-0.0f), (float) (-127L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.103515621210439E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515621210439E-5d + "'", double1 == 6.103515621210439E-5d);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.0019512187763363572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.313219861265277d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.000015f, (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.3789063f + "'", float2 == 0.3789063f);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5200669294466767d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3442544716776892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3442544716776892d + "'", double1 == 1.3442544716776892d);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(114.59156092460519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.434540380772147d + "'", double1 == 5.434540380772147d);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.80144007E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014400656965632E16d + "'", double1 == 1.8014400656965632E16d);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        float float1 = org.apache.commons.math3.util.FastMath.abs(8.881785E-16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.881785E-16f + "'", float1 == 8.881785E-16f);
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.536732862475499E20d, 8.58832562355607E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.536732862475499E20d + "'", double2 == 9.536732862475499E20d);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-63.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0272356433182504d, 6.176517423269412E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.839778762877425E-14d) + "'", double2 == (-8.839778762877425E-14d));
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.89704490591024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.875693037185416d + "'", double1 == 2.875693037185416d);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7853983422113506d, (double) (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853983422113506d + "'", double2 == 0.7853983422113506d);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0000001372850489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453294916019414d + "'", double1 == 0.017453294916019414d);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10.999999f, (-9.223372E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999999f) + "'", float2 == (-10.999999f));
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.2089258E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.313219861265277d, 8102.083927575384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.523270109455961d + "'", double2 == 4.523270109455961d);
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7224284372420832d), 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2411226046620543E10d) + "'", double2 == (-1.2411226046620543E10d));
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.204690469334889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20614747059855767d + "'", double1 == 0.20614747059855767d);
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.570796326794411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-29.328990934768964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        long long1 = org.apache.commons.math3.util.FastMath.abs(51L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9251475365964139d), 13192.8407798297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964138d) + "'", double2 == (-0.9251475365964138d));
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        double double2 = org.apache.commons.math3.util.FastMath.min(87.09341963470486d, 2.0831675322560934E97d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 87.09341963470486d + "'", double2 == 87.09341963470486d);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.5565987203972821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6222213932374686d + "'", double1 == 0.6222213932374686d);
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.015625000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5551706909421597d + "'", double1 == 1.5551706909421597d);
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1920929665620893E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920929665620922E-7d + "'", double1 == 1.1920929665620922E-7d);
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8573172772549914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15394721039774337d) + "'", double1 == (-0.15394721039774337d));
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-77));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 77L + "'", long1 == 77L);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-11));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999832982992097d) + "'", double1 == (-0.9999832982992097d));
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.882813470127877E-4d, 0.8483318952611161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02157266329311401d + "'", double2 == 0.02157266329311401d);
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        int int2 = org.apache.commons.math3.util.FastMath.max(149, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.641588833612778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.611686E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.611686E18f + "'", float1 == 4.611686E18f);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8441539875937955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7667766979320225d + "'", double1 == 0.7667766979320225d);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999999585824487d, (-0.23226068750587248d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000096196693d + "'", double2 == 1.0000000096196693d);
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029101516801199417d + "'", double1 == 0.029101516801199417d);
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2048.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 20.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.999998f + "'", float2 == 20.999998f);
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.09888586507799793d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.002864717361895405d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.370365924753115E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3703656465050736E-4d + "'", double1 == 4.3703656465050736E-4d);
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1368887786267312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1170554140246223d + "'", double1 == 2.1170554140246223d);
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.000004f, 128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.437470063761967d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.703958628749687d + "'", double2 == 4.703958628749687d);
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-63L), 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2064384.0f) + "'", float2 == (-2064384.0f));
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343774.6770784939d + "'", double1 == 343774.6770784939d);
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1500.0006666663703d, 1.3083939125614241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14307.993086635926d + "'", double2 == 14307.993086635926d);
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-750.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0d + "'", double2 == 750.0d);
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8338268425894415d, (double) 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8338268425894416d + "'", double2 == 0.8338268425894416d);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.4E-45f, 1.0691650524286674E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3106474637771692E-31d + "'", double2 == 1.3106474637771692E-31d);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.7925203868835002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9460259264495212d + "'", double1 == 0.9460259264495212d);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1024.0001220703127d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.046745412134744E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.30685281944006d + "'", double1 == 50.30685281944006d);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 749.9998f, 1.6942252369286008E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 749.9998168945312d + "'", double2 == 749.9998168945312d);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.492660490989457d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.8934439858858716d, (-2.38388025641375E-13d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8934439858858716d + "'", double2 == 2.8934439858858716d);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.946190480851357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5188167989089678d) + "'", double1 == (-0.5188167989089678d));
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 2.2382098E-13f, 1.2676506002282294E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3796650960678907d) + "'", double2 == (-2.3796650960678907d));
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 112L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 112.0f + "'", float2 == 112.0f);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.02668142320876577d, (-1024.0001220703127d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9830277404112437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.991477554164109d + "'", double1 == 0.991477554164109d);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.569462994251686d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569462994251686d + "'", double2 == 1.569462994251686d);
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        double double1 = org.apache.commons.math3.util.FastMath.signum(21481.281039031423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.465850228008332E-85d, 1.0000009536748848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000009536748848d + "'", double2 == 1.0000009536748848d);
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0691650524286674E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0000038147045416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175207080049058d + "'", double1 == 1.175207080049058d);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414711136259806d + "'", double1 == 0.8414711136259806d);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.055939846045818E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.8255079892949791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6018582986008164d + "'", double1 == 0.6018582986008164d);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1484736.8269696261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1484736.8269696264d + "'", double1 == 1484736.8269696264d);
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 63L, 7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.84410303977296d) + "'", double2 == (-2.84410303977296d));
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.50359936E15f, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.60287949E16f + "'", float2 == 3.60287949E16f);
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1746142944486795d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.739111695586088E71d + "'", double2 == 3.739111695586088E71d);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.648361369288039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7724664664710889d + "'", double1 == 0.7724664664710889d);
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.984137914278307E171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        double double1 = org.apache.commons.math3.util.FastMath.log((-13.79932245896842d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        double double1 = org.apache.commons.math3.util.FastMath.asin(71.74447588040013d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(63.0d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.164663517184E12d + "'", double2 == 2.164663517184E12d);
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 661L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 661.0f + "'", float1 == 661.0f);
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        float float2 = org.apache.commons.math3.util.FastMath.min(100.00001f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7954782038978773d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7954782038978773d + "'", double2 == 0.7954782038978773d);
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.4507335189035081d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.934003745760645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7391201086066823d + "'", double1 == 1.7391201086066823d);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.440892098500627E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1646222122142713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0521113110369735d + "'", double1 == 1.0521113110369735d);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.14351994778492885d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        float float2 = org.apache.commons.math3.util.FastMath.min(750.0f, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        long long2 = org.apache.commons.math3.util.FastMath.min((-8L), (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(29.0f, 1.66633186E17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(89.9236056725866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.2382098E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(8.49495711583675E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5707963267948872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948872d + "'", double1 == 1.5707963267948872d);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-49));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2005.3522829578808d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.626935056102789E35d + "'", double2 == 1.626935056102789E35d);
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.31321994264556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.7465363222182906d), (-0.796960035003417d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.091998982501293d + "'", double2 == 1.091998982501293d);
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.327747459134791d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.020907704486165288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8676375522391298d) + "'", double1 == (-3.8676375522391298d));
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 4.50359936E15f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.04260447632084876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04257871730688656d) + "'", double1 == (-0.04257871730688656d));
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 38, (-38));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.382432E-10f + "'", float2 == 1.382432E-10f);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(239.46884570409546d, (-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 239.46884570409543d + "'", double2 == 239.46884570409543d);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2664005294302818d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.4023066454805946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5040345674078843d + "'", double1 == 1.5040345674078843d);
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.12150579067946177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4952969556875082d + "'", double1 == 0.4952969556875082d);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5.820766E-11f, (double) 3.60287949E16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.820766091346742E-11d + "'", double2 == 5.820766091346742E-11d);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 37L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.0051598093960231765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005159763605553577d) + "'", double1 == (-0.005159763605553577d));
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5126339703518791d, 0.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5126339703518791d + "'", double2 == 0.5126339703518791d);
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.14973832340422d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.339735781143019E61d + "'", double2 == 6.339735781143019E61d);
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-15));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7719980488790864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1640858863087704d + "'", double1 == 2.1640858863087704d);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.958797365297499d, 1296.7941421366083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.958797365297499d + "'", double2 == 1.958797365297499d);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.1808389053476742d, 1.1017419656965828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16268839399612045d + "'", double2 == 0.16268839399612045d);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.44227590364287706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42799748776778734d + "'", double1 == 0.42799748776778734d);
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35985980731916883d + "'", double1 == 0.35985980731916883d);
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.154056433601276E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.6372488768187d + "'", double1 == 90.6372488768187d);
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.3234889800848443E-23d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.778151250383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 216.47212100905753d + "'", double1 == 216.47212100905753d);
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.04402615488638885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3531047710855999d + "'", double1 == 0.3531047710855999d);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0877197964243557d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1572.9759898255788d + "'", double2 == 1572.9759898255788d);
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.70197740328915E-38d + "'", double1 == 4.70197740328915E-38d);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-4.124460139243949E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.007599577149562085d), 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.500763327991557E223d) + "'", double2 == (-4.500763327991557E223d));
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.399636108162734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.399636108162734d + "'", double1 == 0.399636108162734d);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-2015.9998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        int int2 = org.apache.commons.math3.util.FastMath.min(31, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-2015.9996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.934003745760645d, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0405800537533875E10d + "'", double2 == 5.0405800537533875E10d);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(99.99999f, 2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41591936703229365d) + "'", double1 == (-0.41591936703229365d));
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-7.4505815E-9f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.881784E-16f + "'", float1 == 8.881784E-16f);
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.8171205928321397d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8171205928321397d + "'", double2 == 1.8171205928321397d);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3, (long) (-44));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.1305288720617787E-6d, (-44.67977267251461d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44.67977267251466d + "'", double2 == 44.67977267251466d);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-29L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-29) + "'", int1 == (-29));
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8813735870194143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5565987203972821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5054494651244237d + "'", double1 == 0.5054494651244237d);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        int int2 = org.apache.commons.math3.util.FastMath.min(31, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(201.7158284912051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.71582849120512d + "'", double1 == 201.71582849120512d);
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.827881037133875E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.6571063883041222d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 7.7990222E28f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8742149727184364d) + "'", double1 == (-0.8742149727184364d));
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5353836659458734d, (-0.749444424663085d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.749444424663085d) + "'", double2 == (-0.749444424663085d));
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(100.0f, 0.13533528323661262d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 744.8451336700701d + "'", double1 == 744.8451336700701d);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 97, (-4.500763327991557E223d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.4507335189035081d, 345.8492399234712d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4507335189035081d + "'", double2 == 0.4507335189035081d);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.7427521618439966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8129545935888933d) + "'", double1 == (-0.8129545935888933d));
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-4.5035996E15f), 8.52208019114035E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.5035996273704955E15d) + "'", double2 == (-4.5035996273704955E15d));
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-15), 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5.332177586716706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4013650846586734d) + "'", double1 == (-1.4013650846586734d));
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        int int1 = org.apache.commons.math3.util.FastMath.round((-5.8774718E-37f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7819835177797978d, 108.43494882292201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007211420032440578d + "'", double2 == 0.007211420032440578d);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.015625f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        float float2 = org.apache.commons.math3.util.FastMath.max(38.000004f, 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E15f + "'", float2 == 1.64926744E15f);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 85L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4835298641951802d + "'", double1 == 1.4835298641951802d);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.0914126326390014E99d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.3648145037862d + "'", double1 == 229.3648145037862d);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.389301394574591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8710010196891413d + "'", double1 == 0.8710010196891413d);
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1612231530729578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5604785871723786d + "'", double1 == 0.5604785871723786d);
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.1071487177940904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.018864831372454823d, 8537.071147449265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.018864831372454823d + "'", double2 == 0.018864831372454823d);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.20152396769507416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035172567579617323d + "'", double1 == 0.0035172567579617323d);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        double double1 = org.apache.commons.math3.util.FastMath.exp(122.79022124234764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1238092952040056E53d + "'", double1 == 2.1238092952040056E53d);
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-8.376517822941523E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999991623d + "'", double1 == 0.9999999999991623d);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E100d + "'", double1 == 1.0E100d);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.7405240741728077d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.088825268418815d + "'", double1 == 1.088825268418815d);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.09738634525693146d), 0.4043787951567745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09738634525693146d + "'", double2 == 0.09738634525693146d);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5258905478413947E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-34), (-8L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-2.3796650960678907d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 20, (long) 48000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48000L + "'", long2 == 48000L);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.232686862584267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8892415974417167d + "'", double1 == 0.8892415974417167d);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7480575296890003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2930884003786862d + "'", double1 == 1.2930884003786862d);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.12180677292442696d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(14307.993086635926d, (double) 43.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677910224103013d + "'", double2 == 1.5677910224103013d);
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.509644039241865d, 1.309341227634172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13368005472684846d + "'", double2 == 0.13368005472684846d);
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011048544114584294d + "'", double1 == 0.011048544114584294d);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5707497746364167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441975974626319d + "'", double1 == 0.9441975974626319d);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.32152464392844765d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.3789063f, 29);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.03423776E8f + "'", float2 == 2.03423776E8f);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.4414062500710543E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4414062985774393E-4d + "'", double1 == 2.4414062985774393E-4d);
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-50));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.4825767815644055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        int int2 = org.apache.commons.math3.util.FastMath.min(38, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3083939125614241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7002260506765845d + "'", double1 == 3.7002260506765845d);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 112L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(50.793076005481666d, 1.0000013113029667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20699087096963353d) + "'", double2 == (-0.20699087096963353d));
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8795935176771806d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5183740707087225d + "'", double2 == 3.5183740707087225d);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.029101516801199417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1705916668574389d + "'", double1 == 0.1705916668574389d);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2220482392758838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6546526650756924d + "'", double1 == 0.6546526650756924d);
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.3841857910156255E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.91802404552728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        double double1 = org.apache.commons.math3.util.FastMath.abs(9.9749371855331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.9749371855331d + "'", double1 == 9.9749371855331d);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.562490436697348d, 57.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5624904366973482d + "'", double2 == 1.5624904366973482d);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(750.0003050086721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0003050086722d + "'", double1 == 750.0003050086722d);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        double double1 = org.apache.commons.math3.util.FastMath.exp(36.54883000018738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.463717431233864E15d + "'", double1 == 7.463717431233864E15d);
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.4337816812784116d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.011675895096193602d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8584921772293283E-8d + "'", double2 == 1.8584921772293283E-8d);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.9732551840809704d, (double) 20L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09834447715602475d + "'", double2 == 0.09834447715602475d);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-149), (long) (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42L) + "'", long2 == (-42L));
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-29L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 29.0f + "'", float1 == 29.0f);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.70805020110221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.15984723271046d + "'", double1 == 155.15984723271046d);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-88.17576400073732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, 661L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-77));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-50));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-2.14748365E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.748066029033894E7d) + "'", double1 == (-3.748066029033894E7d));
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        int int2 = org.apache.commons.math3.util.FastMath.max((-44), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.768372150465439E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768372150465439E-7d + "'", double1 == 4.768372150465439E-7d);
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.970193088617227d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0329318964938872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0.99999994f, (-47));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000002801422312d + "'", double2 == 1.000002801422312d);
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5574077246549025d, (-50));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3981910502487487E-10d + "'", double2 == 2.3981910502487487E-10d);
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5773632055089344E31d, 2.0794415416798357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.486437511937208E64d + "'", double2 == 7.486437511937208E64d);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.405955456193999d, (double) 7.0368744E13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.405955456193999d + "'", double2 == 1.405955456193999d);
    }
}

