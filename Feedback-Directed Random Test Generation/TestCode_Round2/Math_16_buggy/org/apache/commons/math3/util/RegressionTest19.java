package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6499700825897167d, 112);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3748376179722083E33d + "'", double2 == 3.3748376179722083E33d);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.720544106967183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7042995643269254d + "'", double1 == 2.7042995643269254d);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999655062931482d, 44);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9984834019209213d + "'", double2 == 0.9984834019209213d);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.04260447632084876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04353867753168046d) + "'", double1 == (-0.04353867753168046d));
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-6.305123299389195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.41350526479812d) + "'", double1 == (-1.41350526479812d));
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.16500355124533647d, 1.9782433465861597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9851128205308588d + "'", double2 == 1.9851128205308588d);
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(108.36909013398466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.36909013398467d + "'", double1 == 108.36909013398467d);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 3, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(6.164414002968976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9691262718878781d + "'", double1 == 1.9691262718878781d);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5403126461166524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43198541277924896d + "'", double1 == 0.43198541277924896d);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double double2 = org.apache.commons.math3.util.FastMath.max((-22.18070977791825d), (double) 8.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5941072954913211d, 5.529646975408425E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.074403661089847E-24d + "'", double2 == 1.074403661089847E-24d);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.16083598627181606d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16224476391708761d) + "'", double1 == (-0.16224476391708761d));
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(8.881784E-16f, 2.3645773857050396E-12d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.881785E-16f + "'", float2 == 8.881785E-16f);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        int int2 = org.apache.commons.math3.util.FastMath.min(62, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 2.9999998f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        float float2 = org.apache.commons.math3.util.FastMath.max(1500.0f, (float) 63L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.6889023782052348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8458636785956073d) + "'", double1 == (-0.8458636785956073d));
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.9999995f, 2.2382096E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.2382096E-13f + "'", float2 == 2.2382096E-13f);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5698207173483318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.94410169625874d + "'", double1 == 89.94410169625874d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.363907966290751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7294813176368742d + "'", double1 == 0.7294813176368742d);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-20.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.23794004E27f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.23794004E27f + "'", float1 == 1.23794004E27f);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-51.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.3458478E12f, 5.15396076E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.15396076E11f + "'", float2 == 5.15396076E11f);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-2.14748339E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9610780441562604d + "'", double1 == 0.9610780441562604d);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9999998807907104d, (-32.318429737814974d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999998807907104d + "'", double2 == 1.9999998807907104d);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.444441275004965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        int int2 = org.apache.commons.math3.util.FastMath.max(38, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.39536067730187796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006900345551832582d + "'", double1 == 0.006900345551832582d);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.0601456127484035d, 137);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.073771310846417E41d + "'", double2 == 7.073771310846417E41d);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 0.0053710933f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        int int2 = org.apache.commons.math3.util.FastMath.max(87, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-10.999999f), 3.5991879441440995d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.999998f) + "'", float2 == (-10.999998f));
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 137, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.011020261488361868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8813735870194143d, 48000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        long long2 = org.apache.commons.math3.util.FastMath.max(22L, (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999992724d + "'", double1 == 0.999999999992724d);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0000001192092682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1.5258789E-5f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.525878906309212E-5d) + "'", double1 == (-1.525878906309212E-5d));
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        float float2 = org.apache.commons.math3.util.FastMath.min(97.000015f, (-2016.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2016.0f) + "'", float2 == (-2016.0f));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        int int2 = org.apache.commons.math3.util.FastMath.min((-34), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.469447E-18f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4694467E-18f + "'", float2 == 3.4694467E-18f);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 128L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.859812404361672d + "'", double1 == 4.859812404361672d);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 39L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.614554407101535d + "'", double1 == 3.614554407101535d);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 121);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9758424700897873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 7, (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.1345179953744407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13371245362029413d + "'", double1 == 0.13371245362029413d);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5670585390721965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002805014228613d + "'", double1 == 1.002805014228613d);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        int int2 = org.apache.commons.math3.util.FastMath.max(22, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0000000000000049d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195465d) + "'", double1 == (-0.8813735870195465d));
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        double double1 = org.apache.commons.math3.util.FastMath.abs(98.34967800989337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.34967800989337d + "'", double1 == 98.34967800989337d);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        int int1 = org.apache.commons.math3.util.FastMath.abs(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.022343035780788705d, 0.4449632606147725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4455238652921205d + "'", double2 == 0.4455238652921205d);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-2016), (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.06404342696225596d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        long long2 = org.apache.commons.math3.util.FastMath.max((-4L), 22026L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.030930445539300806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, 63.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.2418773344567871d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 61.9205976209375d + "'", double2 == 61.9205976209375d);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.507682749749894E-5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(29.517646691625867d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-6.0000005f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-6L) + "'", long1 == (-6L));
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.000000000000002d + "'", double1 == 9.000000000000002d);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.223370937343148E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.8870997475188376d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0617182222484527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3495528901657451d + "'", double1 == 0.3495528901657451d);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.1382155914975337E-50d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.9036873048705543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4919739160735788d) + "'", double1 == (-1.4919739160735788d));
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.0f, 2.8530946248522677d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.9103830456310187E-11d, 77892.38469794914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 77892.38469794914d + "'", double2 == 77892.38469794914d);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9124034991009714d, 1.0000013113029667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9124034991009714d + "'", double2 == 0.9124034991009714d);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9999991684712809d), 3.469446951953615E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999991684712808d) + "'", double2 == (-0.9999991684712808d));
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4, (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25f + "'", float2 == 0.25f);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1024));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1024) + "'", int1 == (-1024));
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, (-77));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6.776264E-21f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0779357E-28f + "'", float1 == 8.0779357E-28f);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 5.820766E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.820766091346742E-11d + "'", double1 == 5.820766091346742E-11d);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 22026L, (-28));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.2053244E-5f + "'", float2 == 8.2053244E-5f);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5475585765788982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023235658901919323d + "'", double1 == 0.023235658901919323d);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        float float2 = org.apache.commons.math3.util.FastMath.max(512.5f, 31.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.5f + "'", float2 == 512.5f);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.36832110635936816d, 0.0017485284275232642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36832110635936816d + "'", double2 == 0.36832110635936816d);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5407909080932595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4935864212642029d + "'", double1 == 0.4935864212642029d);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.25594028828308535d, (double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2559402882830853d + "'", double2 == 0.2559402882830853d);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.1932569E-7f, 121);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.172221E29f + "'", float2 == 3.172221E29f);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.363907966290751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.679692807608321d + "'", double1 == 1.679692807608321d);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-14.999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.466211969798772d) + "'", double1 == (-2.466211969798772d));
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(21.799911408087066d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.822835228275096d + "'", double2 == 21.822835228275096d);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9998140668686113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7301521188343126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.03444315284990291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.97344729142343d + "'", double1 == 1.97344729142343d);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.8889466E22f, (float) 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0142573275017009d, 0.09834447715602475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6583545549075497d + "'", double2 == 0.6583545549075497d);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.626859959358372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.626859959358372d + "'", double1 == 3.626859959358372d);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5785595485605854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5503531367499892d + "'", double1 == 0.5503531367499892d);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        double double1 = org.apache.commons.math3.util.FastMath.abs(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308233d + "'", double1 == 572.9577951308233d);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.4258259770489514E8d, 2881.4316395467454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4258259770489514E8d + "'", double2 == 2.4258259770489514E8d);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.890577041667747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.890577041667747d + "'", double1 == 0.890577041667747d);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.2455323929060171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9957901442164848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4790051189552496d + "'", double1 == 1.4790051189552496d);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(439893.1806067263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7677.584358657442d + "'", double1 == 7677.584358657442d);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5707963267945724d, (-0.007570773924451899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708145711347143d + "'", double2 == 1.5708145711347143d);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.28150449993860255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2893153073615482d + "'", double1 == 0.2893153073615482d);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.3106474637771692E-31d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.02707996890662637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02744996352848901d + "'", double1 == 0.02744996352848901d);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 112.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 112.00000762939453d + "'", double1 == 112.00000762939453d);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.323937163077181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        long long2 = org.apache.commons.math3.util.FastMath.min(3L, (-17L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.347702175396166d + "'", double1 == 1.347702175396166d);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-6L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        long long1 = org.apache.commons.math3.util.FastMath.abs(24000L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24000L + "'", long1 == 24000L);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.5360843953061922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.15629232893697098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15565680591084283d + "'", double1 == 0.15565680591084283d);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        double double1 = org.apache.commons.math3.util.FastMath.acos(11.548739357257748d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2887572196644652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.8403495037882d + "'", double1 == 73.8403495037882d);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-36.14246844765979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        double double2 = org.apache.commons.math3.util.FastMath.pow(31703.46692071624d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.713006301195823E283d + "'", double2 == 3.713006301195823E283d);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6.7762636E-21f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-46.44086109751633d) + "'", double1 == (-46.44086109751633d));
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-26), (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 5.6294995E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.62949953421312E15d + "'", double1 == 5.62949953421312E15d);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9070766022988521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.036683895975559d + "'", double1 == 1.036683895975559d);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.2794150403540232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004876712433770527d + "'", double1 == 0.004876712433770527d);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681338d + "'", double1 == 0.5403023058681338d);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.015625004f, 43.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43.000004f + "'", float2 == 43.000004f);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-7.447447E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05771808862843996d) + "'", double1 == (-0.05771808862843996d));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.005159740711202605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000133114916359d + "'", double1 == 1.0000133114916359d);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.NEGATIVE_INFINITY, (float) 62);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        float float2 = org.apache.commons.math3.util.FastMath.max(8.0779357E-28f, 1.04453594E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.04453594E13f + "'", float2 == 1.04453594E13f);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-2.14748352E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.12210729973125768d, 1.4403865801148885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1221072997312577d + "'", double2 == 0.1221072997312577d);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.644483341943245d, (-43.673229889783244d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.644483341943245d) + "'", double2 == (-4.644483341943245d));
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        long long2 = org.apache.commons.math3.util.FastMath.max(46L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 137);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.575121374985726E59d + "'", double1 == 1.575121374985726E59d);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-149L), 0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-10445360463872L), 9.536745E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536745E-7f + "'", float2 == 9.536745E-7f);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.0928604837473515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7853951831651208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.324606500416607d + "'", double1 == 1.324606500416607d);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-5.8774718E-37f), 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.3087225E-22f) + "'", float2 == (-3.3087225E-22f));
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.0426665814898082d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8637510370828466d) + "'", double1 == (-0.8637510370828466d));
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2016L), (long) 512);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 512L + "'", long2 == 512L);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.5035996E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5035996E15f + "'", float1 == 4.5035996E15f);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-128.0f), 2.5749804E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.7182816664368272d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0738843280310266E-5d + "'", double2 == 2.0738843280310266E-5d);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0469529584324009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232071923283186d + "'", double1 == 1.0232071923283186d);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.010043827553259d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707962075856072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158262939846133d + "'", double1 == 0.45158262939846133d);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-63L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.0f + "'", float1 == 63.0f);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.561543646156017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9406100635476846d + "'", double1 == 0.9406100635476846d);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8430153355241219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1023.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.6790281238451179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8789467960673509d) + "'", double1 == (-0.8789467960673509d));
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        int int2 = org.apache.commons.math3.util.FastMath.min(40, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1073424255447017E-8d + "'", double1 == 2.1073424255447017E-8d);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        int int2 = org.apache.commons.math3.util.FastMath.min(48000, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.4242728127018154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.7759319201505575d + "'", double1 == 6.7759319201505575d);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.023097294972507593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997332693408607d + "'", double1 == 0.9997332693408607d);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-6.52957015616005d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 31, 3.7778932E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.010518590673716181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8358403992591594E-4d + "'", double1 == 1.8358403992591594E-4d);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8588046979169688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8588046979169689d + "'", double1 == 0.8588046979169689d);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.257495530973488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.738840061351688d + "'", double1 == 1.738840061351688d);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(6.00031438115249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.77658293369473d + "'", double1 == 201.77658293369473d);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-1.8924475E-6f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        float float1 = org.apache.commons.math3.util.FastMath.signum(38.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-4.01583876946393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9993502060907962d) + "'", double1 == (-0.9993502060907962d));
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.48917865697472146d, 1.1597153257338444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4891786569747215d + "'", double2 == 0.4891786569747215d);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.16118920324881E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.5872036550391518d), (double) 106.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5872036550391517d) + "'", double2 == (-0.5872036550391517d));
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        float float1 = org.apache.commons.math3.util.FastMath.abs(96.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 96.99999f + "'", float1 == 96.99999f);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9233845397715967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        double double1 = org.apache.commons.math3.util.FastMath.log(22025.999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978852724889d + "'", double1 == 9.999978852724889d);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        double double1 = org.apache.commons.math3.util.FastMath.cos(10.082648376090521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.791296123406355d) + "'", double1 == (-0.791296123406355d));
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(6.103515625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000018626451d + "'", double1 == 1.0000000018626451d);
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 375.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 375.0d + "'", double1 == 375.0d);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(231.46791666571625d, 1.5709996927170293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 231.47324788320893d + "'", double2 == 231.47324788320893d);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.113374435736984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2600098479109616d + "'", double1 == 1.2600098479109616d);
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-104.99922643163309d), 7.625595310085968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4982983574750306d) + "'", double2 == (-1.4982983574750306d));
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 141L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.003484564854887573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(17.165292957783155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8496531118514985E7d + "'", double1 == 2.8496531118514985E7d);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2304176427147723E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        double double2 = org.apache.commons.math3.util.FastMath.min((-2.8634010859072955E41d), 0.16268839399612045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8634010859072955E41d) + "'", double2 == (-2.8634010859072955E41d));
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.222758749485078E-162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.303968219577201E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.306636266703005E-4d + "'", double1 == 7.306636266703005E-4d);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3570334.006879247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3570334.0068792473d + "'", double1 == 3570334.0068792473d);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 112);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 112.0f + "'", float1 == 112.0f);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        int int1 = org.apache.commons.math3.util.FastMath.round((-29.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-29) + "'", int1 == (-29));
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-13.79932245896842d), (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.367369290395171d + "'", double2 == 14.367369290395171d);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.748066029033894E7d, (-0.473814720414451d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20117348891112896d) + "'", double2 == (-0.20117348891112896d));
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.1691265E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.1691265E29f + "'", float1 == 3.1691265E29f);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.079409548469555d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.62949953421312E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.62949953421312E15d + "'", double1 == 5.62949953421312E15d);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.45093845821887724d, 27.528474355042587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01637933600536757d + "'", double2 == 0.01637933600536757d);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.015625637653511198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625637653511198d + "'", double1 == 0.015625637653511198d);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(519.9925989494324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 519.9925989494325d + "'", double1 == 519.9925989494325d);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.1724641318598454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1724641318598454d + "'", double1 == 2.1724641318598454d);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-77L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 77L + "'", long1 == 77L);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7853981633974483d), 0.050322743661769115d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01976573519085756d + "'", double2 == 0.01976573519085756d);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        double double1 = org.apache.commons.math3.util.FastMath.abs(13192.8407798297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13192.8407798297d + "'", double1 == 13192.8407798297d);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-28.999998f), 4.7772088E-35f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.999998f + "'", float2 == 28.999998f);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2016.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.469446951953614E-18d, 0.04001048220963152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.2915496650148839d, 82.71421988310894d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.258221602575652d + "'", double2 == 17.258221602575652d);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.4952969556875082d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7954782038978773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6510000170045274d + "'", double1 == 0.6510000170045274d);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.0073385494569225725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2016, (long) 192);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 192L + "'", long2 == 192L);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 127, (long) 16128);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.2245095517692758d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        double double1 = org.apache.commons.math3.util.FastMath.abs(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5258905478413947E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.738840061351688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3203475421367268d + "'", double1 == 1.3203475421367268d);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32.000008f, 8.659189757353836d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.361975406798963d, 9.999999618530266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3243261337430434d + "'", double2 == 0.3243261337430434d);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.950212931632136d), (-0.9999999999897818d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3794580875911027d + "'", double2 == 1.3794580875911027d);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.999999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(9216.0d, 0.7665477425729949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707131510417711d + "'", double2 == 1.5707131510417711d);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9729550745276566d + "'", double1 == 0.9729550745276566d);
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.2658595418453178E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2093416872987734E12d + "'", double1 == 2.2093416872987734E12d);
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        float float1 = org.apache.commons.math3.util.FastMath.signum(Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        double double2 = org.apache.commons.math3.util.FastMath.pow(661.6940238674958d, 3.4359738367999996E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-3.137566414384587E306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.44227590364287706d, 1.5707963267948581d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44227590364287706d + "'", double2 == 0.44227590364287706d);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-11.0f), 2016);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4304918528519632d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6929696407506087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3011416682093495d + "'", double1 == 1.3011416682093495d);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.19920008462778144d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1992000846277814d) + "'", double1 == (-0.1992000846277814d));
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.8067636098309507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.00455063280465d + "'", double1 == 45.00455063280465d);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 3.1691265E29f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.010518978623430845d, (double) 2.19902299E12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.2396687926517345d) + "'", double2 == (-6.2396687926517345d));
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.557068888645458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.84222839974734d + "'", double1 == 72.84222839974734d);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.055939846045818E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0839442125513057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0272330337068714d + "'", double1 == 1.0272330337068714d);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-6.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-6.000001f), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.000001f + "'", float2 == 6.000001f);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(271.3685902448305d, (-0.05037245961609865d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 271.36859024483044d + "'", double2 == 271.36859024483044d);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.23226068750587248d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.448719238886446E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.448718233758452E-4d + "'", double1 == 8.448718233758452E-4d);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-149), 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-6.196498107675438d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6805519689447348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939828934710806d + "'", double1 == 0.9939828934710806d);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-724), 4.7683733E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-724.0f) + "'", float2 == (-724.0f));
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-3.9999999999999787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-14.999998f), 2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.999998092651365d) + "'", double2 == (-14.999998092651365d));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.5942992187596847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5599282659827287d + "'", double1 == 0.5599282659827287d);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.681247833462456E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6812478334624557E-6d) + "'", double1 == (-1.6812478334624557E-6d));
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        long long2 = org.apache.commons.math3.util.FastMath.max(9L, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(15.000001f, (-1.192093E-7f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.000001f) + "'", float2 == (-15.000001f));
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(84010.50108557596d, 1.1523231175411188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84010.50108557595d + "'", double2 == 84010.50108557595d);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(15.174119582065703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1945388.779136774d + "'", double1 == 1945388.779136774d);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.7730812391918281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8836845217656303d + "'", double1 == 0.8836845217656303d);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        long long2 = org.apache.commons.math3.util.FastMath.max(32L, (-77L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9925907227207792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.8712591957408d + "'", double1 == 56.8712591957408d);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1024, 1.382432E-10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.220703131063298E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999925494193d + "'", double1 == 0.9999999925494193d);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.48941851000927195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7145373068472081d) + "'", double1 == (-0.7145373068472081d));
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.4056437262473316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2254339749629255d + "'", double1 == 1.2254339749629255d);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8284271247461903d + "'", double1 == 2.8284271247461903d);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 16L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2041199826559248d + "'", double1 == 1.2041199826559248d);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.62949953421312E15d, (double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-26));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        float float2 = org.apache.commons.math3.util.FastMath.min(512.49994f, 9.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.130528872063391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.130528872060167E-6d + "'", double1 == 2.130528872060167E-6d);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 9, (long) 19);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19L + "'", long2 == 19L);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.20614747059855767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20471460579603018d + "'", double1 == 0.20471460579603018d);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.09951163E12f, 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.09951163E12f + "'", float2 == 1.09951163E12f);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.45841043000825465d, (-750.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1409814397592286d + "'", double2 == 3.1409814397592286d);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-121), (-1.1332635352315577E21d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-121.00001f) + "'", float2 == (-121.00001f));
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        int int2 = org.apache.commons.math3.util.FastMath.max((-42), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-15.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-14.999999f) + "'", float1 == (-14.999999f));
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.36004964460910377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3455995287258587d + "'", double1 == 0.3455995287258587d);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.507682751276436E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.507682748223352E-5d + "'", double1 == 4.507682748223352E-5d);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12780120328091843d) + "'", double1 == (-0.12780120328091843d));
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5773632055089344E31d, (-4.489537669538574d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 72L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        float float2 = org.apache.commons.math3.util.FastMath.max(51.999996f, 3328.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3328.0f + "'", float2 == 3328.0f);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 18);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5152978215491797d + "'", double1 == 1.5152978215491797d);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.4287934927351d + "'", double1 == 402.4287934927351d);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.007601801268019861d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8892415974417167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7268393364727481d + "'", double1 == 0.7268393364727481d);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        long long1 = org.apache.commons.math3.util.FastMath.round(1024.000488281114d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 2015.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.302017810712327d + "'", double1 == 8.302017810712327d);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 12.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0791812460476249d + "'", double1 == 1.0791812460476249d);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(9.9749371855331d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        float float2 = org.apache.commons.math3.util.FastMath.min(6000.0f, (-1.1875f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.1875f) + "'", float2 == (-1.1875f));
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 22, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.19611987703015263d, 0.962088504675655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023725070184023398d + "'", double2 == 0.023725070184023398d);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3258176636680326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        float float2 = org.apache.commons.math3.util.FastMath.max(38.000004f, (-1.2207033E-4f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.000004f + "'", float2 == 38.000004f);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.014550758400599708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014551271864879664d + "'", double1 == 0.014551271864879664d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 192, (long) (-77));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 192L + "'", long2 == 192L);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4924307727615732E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 19);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 19.000002f + "'", float1 == 19.000002f);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9938148781603499d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.4520097748883845d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.7182818285381576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.890577041667747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9621080130171996d + "'", double1 == 0.9621080130171996d);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6000);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9223370937343148032L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223370937343148032L + "'", long1 == 9223370937343148032L);
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.732511156817248d, (-1.1221255244304277E-8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1221255244304277E-8d) + "'", double2 == (-1.1221255244304277E-8d));
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 35.999996f, (double) 1.66633186E17f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.065819144637265d + "'", double2 == 11.065819144637265d);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7954782038978773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.08168132328422244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08159052614480541d + "'", double1 == 0.08159052614480541d);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.93244801066549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6241171563152936d + "'", double1 == 2.6241171563152936d);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.12180677292442696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3490082705673706d + "'", double1 == 0.3490082705673706d);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        int int2 = org.apache.commons.math3.util.FastMath.max(4, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 128, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.138777926348185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1438335287334496d + "'", double1 == 1.1438335287334496d);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.718498871295094d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-121.00001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 121.00001f + "'", float1 == 121.00001f);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 19L, 7.31322083153445d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.999998f + "'", float2 == 18.999998f);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-9.632848599998937E-5d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-126.99999f), (double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.913897996290787E-8d) + "'", double2 == (-5.913897996290787E-8d));
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 52, (float) 137L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 3072.0f, 0.21991180375937053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.22864910185707277d, (-0.9999991684712808d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0258063894923344d + "'", double2 == 1.0258063894923344d);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.33934385609142426d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7694528797863664E-50d + "'", double2 == 1.7694528797863664E-50d);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.98216091375236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7887818595036669d + "'", double1 == 1.7887818595036669d);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.47588E27f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4757395E20f + "'", float1 == 1.4757395E20f);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9999991111122963d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999991111122963d + "'", double2 == 0.9999991111122963d);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.814697265625009E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972656157576E-6d + "'", double1 == 3.8146972656157576E-6d);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5040345674078843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9179032580179188d + "'", double1 == 0.9179032580179188d);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(9.999999046325684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998222855403824d + "'", double1 == 2.998222855403824d);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-63959947L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8464817522551715d) + "'", double1 == (-0.8464817522551715d));
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        float float1 = org.apache.commons.math3.util.FastMath.signum(86.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.653559774527022d + "'", double1 == 15.653559774527022d);
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5688831949237588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5640801472579727d) + "'", double1 == (-0.5640801472579727d));
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0942626235935053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.5607966601082315d, 1.570796326794411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0205810673115743d + "'", double2 == 1.0205810673115743d);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.6880966331881486E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6880966331881486E43d + "'", double1 == 2.6880966331881486E43d);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-8.316789127129839d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.026058106949877d) + "'", double1 == (-2.026058106949877d));
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.9311279069507328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9311279069507328d + "'", double1 == 1.9311279069507328d);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5152978215491797d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        long long1 = org.apache.commons.math3.util.FastMath.abs(31L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8772762058832566d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.66827237527655d + "'", double2 == 43.66827237527655d);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3458247401995457E41d + "'", double1 == 2.3458247401995457E41d);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.11835125533092143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4521670239027962d + "'", double1 == 1.4521670239027962d);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.326322180158476E-7d + "'", double1 == 5.326322180158476E-7d);
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 22);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22L + "'", long1 == 22L);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3978953594960317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9198923787365888d) + "'", double1 == (-0.9198923787365888d));
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(79.22121624008889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2714727798303683E34d + "'", double1 == 1.2714727798303683E34d);
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.2726787747159125d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.14319630411596E204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        double double1 = org.apache.commons.math3.util.FastMath.tan(47.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12452369428236172d) + "'", double1 == (-0.12452369428236172d));
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.671406E24f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.7646075E17f + "'", float1 == 5.7646075E17f);
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(108.36909013398466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6209.091494350129d + "'", double1 == 6209.091494350129d);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.085773152195142E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034868911669480884d + "'", double1 == 0.0034868911669480884d);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        float float1 = org.apache.commons.math3.util.FastMath.abs(8.2053244E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.2053244E-5f + "'", float1 == 8.2053244E-5f);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.45841043000825465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999996430957373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.17520064291182d + "'", double1 == 1.17520064291182d);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.248867982141762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982230451921073d + "'", double1 == 2.9982230451921073d);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 0.75000006f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0955641261303415d, 3.000059298989129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0955641261303417d + "'", double2 == 1.0955641261303417d);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.020431121366449895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6897077963682132d) + "'", double1 == (-1.6897077963682132d));
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-34.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-34.999992f) + "'", float1 == (-34.999992f));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        long long1 = org.apache.commons.math3.util.FastMath.abs(43L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 43L + "'", long1 == 43L);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 86, (long) 137);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4510508769333539d, 0.6110610404570322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5744663358146105d + "'", double2 == 1.5744663358146105d);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.079576664122082E-13d, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2401310215141802E-16d + "'", double2 == 1.2401310215141802E-16d);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.15693881177778274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.539398978976141d + "'", double1 == 0.539398978976141d);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-9.010913347279288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.014551271864879664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001058716245235d + "'", double1 == 1.0001058716245235d);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.5104620932674017E-5d), 38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5510985393881025E-175d + "'", double2 == 1.5510985393881025E-175d);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.8828120149362145E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.154056433601276E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0142084520165588E37d + "'", double1 == 2.0142084520165588E37d);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8476559388593563d, 1.2716849354187132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1830216320379257d + "'", double2 == 2.1830216320379257d);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4, 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.5899346E9f + "'", float2 == 8.5899346E9f);
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5125258378901132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866256553522402d + "'", double1 == 0.9866256553522402d);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6215477523208265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5522047440043304d + "'", double1 == 0.5522047440043304d);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        double double1 = org.apache.commons.math3.util.FastMath.asin(8.445151201175241E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.445152205030683E-4d + "'", double1 == 8.445152205030683E-4d);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.223372E18f, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.2076478E10f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        int int2 = org.apache.commons.math3.util.FastMath.max(50, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(20.871061917633263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1195.8237618366045d + "'", double1 == 1195.8237618366045d);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9640275716535813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.036635383480205265d) + "'", double1 == (-0.036635383480205265d));
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.4045683399228926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007061049580982098d) + "'", double1 == (-0.007061049580982098d));
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(286.8623667551892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.352152760972124d + "'", double1 == 6.352152760972124d);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.013707783890401887d, 1.6929693744345002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.013626087313598E-4d + "'", double2 == 7.013626087313598E-4d);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.5370264E31f, 8388608.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5370264E31f + "'", float2 == 1.5370264E31f);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(58670.885227282975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.672846070537526d + "'", double1 == 11.672846070537526d);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9.2233709E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.183039280066544d + "'", double1 == 2.183039280066544d);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 5.3687098E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.101268357310342d + "'", double1 == 20.101268357310342d);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9738671125025468d, 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22104612061990989d + "'", double2 == 0.22104612061990989d);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 5.3687091E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.36870912E8d + "'", double1 == 5.36870912E8d);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        long long1 = org.apache.commons.math3.util.FastMath.round(96.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.164414002968976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5184552170599437d + "'", double1 == 2.5184552170599437d);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        long long1 = org.apache.commons.math3.util.FastMath.round((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.2455323929060171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-121));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 121L + "'", long1 == 121L);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7615941545479653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941545479653d + "'", double1 == 0.7615941545479653d);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9179032580179188d, (-0.6606133228442809d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9179032580179187d + "'", double2 == 0.9179032580179187d);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        int int1 = org.apache.commons.math3.util.FastMath.round((-149.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9999999999997489d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        double double1 = org.apache.commons.math3.util.FastMath.acos(345.8492399234712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-16.999998f), 1.6363319661787273E69d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999996f) + "'", float2 == (-16.999996f));
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-35));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2710663101885897d) + "'", double1 == (-3.2710663101885897d));
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.733151276556472d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6796136672998835d) + "'", double1 == (-0.6796136672998835d));
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5092289492215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.3890552180865745d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.99499987499382d + "'", double1 == 199.99499987499382d);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 46);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.496119420602448E19d + "'", double1 == 9.496119420602448E19d);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.70805020110221d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2910768285942424E29d + "'", double2 == 4.2910768285942424E29d);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9734594443576854d, 0.9999999991883102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9734594443576855d + "'", double2 == 0.9734594443576855d);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4615835748927024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8979597229507145d + "'", double1 == 0.8979597229507145d);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.733151276556472d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6692145705553599d) + "'", double1 == (-0.6692145705553599d));
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9524805460485446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.2794150403540232d), 0.1319682047714509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2794150403540232d) + "'", double2 == (-0.2794150403540232d));
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5515061557428147d + "'", double1 == 0.5515061557428147d);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-29.012614126025312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9906193660583423E12d) + "'", double1 == (-1.9906193660583423E12d));
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-8));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.629395E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094947E-13f + "'", float1 == 9.094947E-13f);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.8063511429202184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.166486085112963d) + "'", double1 == (-4.166486085112963d));
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.08355E24f, 0.12499492157923593d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.083549E24f + "'", float2 == 7.083549E24f);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.1133744357369846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 178.38321521165335d + "'", double1 == 178.38321521165335d);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.9333273496E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.772006583446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.23271898780793d + "'", double1 == 44.23271898780793d);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 141, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 141L + "'", long2 == 141L);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.998222855403824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14436025976083594d) + "'", double1 == (-0.14436025976083594d));
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8724880508484311d), (double) 0.75000006f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1505370434194047d + "'", double2 == 1.1505370434194047d);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.684342E-14f, (double) 1.9342815E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6843426E-14f + "'", float2 == 5.6843426E-14f);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.4337816812784116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4212152259208643d) + "'", double1 == (-0.4212152259208643d));
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 86.0f, 8.881785255792436E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.5872036550391517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8848009191154943d) + "'", double1 == (-0.8848009191154943d));
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.9998140668686112d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(126.83235515216347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.047306400992099E54d + "'", double1 == 6.047306400992099E54d);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.6986437208666088d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-8));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.1548354004191266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2989.9569449385945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2990.0d + "'", double1 == 2990.0d);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9251475365964138d, 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10474152820342457d + "'", double2 == 0.10474152820342457d);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6812492467619707E-6d) + "'", double1 == (-1.6812492467619707E-6d));
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.9999995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 29, (-4.620233E-10f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.620233E-10f) + "'", float2 == (-4.620233E-10f));
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.04006919567109118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04009065368992251d + "'", double1 == 0.04009065368992251d);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0678494519699369E-13d, 1.1351374985682157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1351374985682157d + "'", double2 == 1.1351374985682157d);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(32.072414916432464d, 1.7025298952542374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.072414916432464d + "'", double2 == 32.072414916432464d);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7276.563998161455d, (-0.99331524545442d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7276.563998161455d) + "'", double2 == (-7276.563998161455d));
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        int int2 = org.apache.commons.math3.util.FastMath.max(141, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.01968878488836084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.0029226537549750234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.100993092008976E-5d + "'", double1 == 5.100993092008976E-5d);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.012757033706954423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012757033706954425d + "'", double1 == 0.012757033706954425d);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 47L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12452756813273719d) + "'", double1 == (-0.12452756813273719d));
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        double double2 = org.apache.commons.math3.util.FastMath.log(12.0d, (double) 5.4569678E-12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.436660803678556d) + "'", double2 == (-10.436660803678556d));
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.972630067242408d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.013462217145168067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013463030491940805d + "'", double1 == 0.013463030491940805d);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        long long2 = org.apache.commons.math3.util.FastMath.min(750L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        long long2 = org.apache.commons.math3.util.FastMath.min(8L, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-0.7405240741728077d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.853230586269599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06893358452826272d) + "'", double1 == (-0.06893358452826272d));
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.654074475403972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.654074475403972d + "'", double1 == 0.654074475403972d);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.151292546497023d, 8.918828546453101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.151292546497023d + "'", double2 == 1.151292546497023d);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 16127.999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.265437880678423d + "'", double1 == 25.265437880678423d);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-10L), 343.7746497577372d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5604328654353665d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4043787951567745d, (double) 10445360463872L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0445360463872E13d + "'", double2 == 1.0445360463872E13d);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.0053710938f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4074442083028742d, (double) 15.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4074442083028744d + "'", double2 == 1.4074442083028744d);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.781516350303278d, 57.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0738255464013205E53d + "'", double2 == 6.0738255464013205E53d);
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.854277055161758d, (-0.791296123406355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6134715957522356d + "'", double2 == 0.6134715957522356d);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 28.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.999998f + "'", float2 == 28.999998f);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.000000476837272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.013462623778017066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7713515236528451d) + "'", double1 == (-0.7713515236528451d));
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        float float2 = org.apache.commons.math3.util.FastMath.min(16128.0f, (-49.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-49.999996f) + "'", float2 == (-49.999996f));
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        int int2 = org.apache.commons.math3.util.FastMath.min(661, 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-6L), 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.12077263008635478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12836832618957508d + "'", double1 == 0.12836832618957508d);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-12.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.061877705960518836d, (double) 50);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.00003828849029d + "'", double2 == 50.00003828849029d);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.19902326E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 22L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22.000002f + "'", float1 == 22.000002f);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(89.92360567258659d, 1.5572364748926293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.93708824838384d + "'", double2 == 89.93708824838384d);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        double double1 = org.apache.commons.math3.util.FastMath.atan(9.064187021914602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.460916398062524d + "'", double1 == 1.460916398062524d);
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8524213316116924d, 0.930200124969514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.930200124969514d + "'", double2 == 0.930200124969514d);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.911129868857448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01590221612482661d) + "'", double1 == (-0.01590221612482661d));
    }
}

