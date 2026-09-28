package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9223370937343148032L, 3.814697265634253E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223370937343148E18d + "'", double2 == 9.223370937343148E18d);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533628E25d + "'", double1 == 7.737125245533628E25d);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.18792839447947E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.187928385330529E-5d + "'", double1 == 8.187928385330529E-5d);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        int int1 = org.apache.commons.math3.util.FastMath.round(39.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.14550003380861354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14499148489666977d) + "'", double1 == (-0.14499148489666977d));
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-3.3334775868839928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05818015943256102d) + "'", double1 == (-0.05818015943256102d));
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.16745572513813106d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999618530266d + "'", double1 == 9.999999618530266d);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-7276.563998161455d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.005159786500818854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0051598093962670006d) + "'", double1 == (-0.0051598093962670006d));
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0012766217907877948d, 1356.9350801851149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012766217907877948d + "'", double2 == 0.0012766217907877948d);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3017603994181974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-6.0d), 3.3495150228208087E50d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.0d) + "'", double2 == (-6.0d));
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(69.53786160730874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.53786160730876d + "'", double1 == 69.53786160730876d);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.3012989023072947d, 0.20745350934872828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8870997475188376d) + "'", double2 == (-1.8870997475188376d));
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.0000000000000049d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0000000000000016d) + "'", double1 == (-1.0000000000000016d));
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.17512404686688d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.570796325565935d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9466715061814477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0945435074627021d + "'", double1 == 1.0945435074627021d);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.09951163E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9190098068653538E10d + "'", double1 == 1.9190098068653538E10d);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 6.0f, (-44));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.410605131648481E-13d + "'", double2 == 3.410605131648481E-13d);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        double double1 = org.apache.commons.math3.util.FastMath.signum(97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.8934439858858716d, 2.688101119437145E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0763895617482287E-43d + "'", double2 == 1.0763895617482287E-43d);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        double double1 = org.apache.commons.math3.util.FastMath.signum(11.43043228949497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.0f, (-15.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(416.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416.00003f + "'", float1 == 416.00003f);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5403021903467494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7165255012534797d + "'", double1 == 1.7165255012534797d);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        double double1 = org.apache.commons.math3.util.FastMath.log(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.931471805599453d + "'", double1 == 6.931471805599453d);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.3777027516270768d), 0.11294857116009238d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0000013113029667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000013113029667d + "'", double1 == 1.0000013113029667d);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-47));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(21.5642090973306d, (double) (-2064384.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.564209097330597d + "'", double2 == 21.564209097330597d);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(73.14335945248362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.552389107874104d + "'", double1 == 8.552389107874104d);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 31, 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8592453E20f + "'", float2 == 2.8592453E20f);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-12));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.507682751276436E-5d, 6.118326675323529E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707961910638124d + "'", double2 == 1.5707961910638124d);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.2269808089751189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.852046083290303d + "'", double1 == 1.852046083290303d);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8415957046430611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.320066164941908d + "'", double1 == 2.320066164941908d);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 15.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.708050264680496d + "'", double1 == 2.708050264680496d);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5707963267945722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218537937d + "'", double1 == 1.0038848218537937d);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 49, (long) (-50));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1.04453605E13f), 512);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        double double2 = org.apache.commons.math3.util.FastMath.min((-14.951156451311066d), 3.002741601523296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.951156451311066d) + "'", double2 == (-14.951156451311066d));
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.882812888051005E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.1474839E9f + "'", float1 == 2.1474839E9f);
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        double double2 = org.apache.commons.math3.util.FastMath.max(65.9642038991485d, 0.020431121603772754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 65.9642038991485d + "'", double2 == 65.9642038991485d);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.2547422950466232d, 1.0000123108260284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2547299842205948d + "'", double2 == 0.2547299842205948d);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-49.999996f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.4359738367999996E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7763568394002505E-15d, 0.7929669390349671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.776356839400251E-15d + "'", double2 == 1.776356839400251E-15d);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(101.0d, 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.9999999999999787d) + "'", double2 == (-3.9999999999999787d));
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.77028216800638E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        long long2 = org.apache.commons.math3.util.FastMath.min(43L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.7819835177797978d, 0.5645971953656318d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7819835177797978d + "'", double2 == 0.7819835177797978d);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.007570629285707457d), 0.9950371911495349d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.12499492157923593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3956124250860895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0170751976386376E12d, 1.5565511495583535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8984560355111834E18d + "'", double2 == 4.8984560355111834E18d);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.999999f, 1024.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999995f + "'", float2 == 5.9999995f);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-74.20321057778875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.534652329259588d + "'", double1 == 2.534652329259588d);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9925907227207792d), 1.030192941051162E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9925907227207792d + "'", double2 == 0.9925907227207792d);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.4258259770489514E8d, (-0.027181889027663657d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4258259770489514E8d + "'", double2 == 2.4258259770489514E8d);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0409981776839905E9d, 0.3231816144628952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0409981776839905E9d + "'", double2 == 1.0409981776839905E9d);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.6606416351184965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.5565987203972821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.822584902878921d + "'", double1 == 0.822584902878921d);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 50, (-35));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4551915E-9f + "'", float2 == 1.4551915E-9f);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.9351525542706054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20942362448062432d) + "'", double1 == (-0.20942362448062432d));
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        double double2 = org.apache.commons.math3.util.FastMath.pow(82.0602573466037d, 0.7580103071638075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.244406168441813d + "'", double2 == 28.244406168441813d);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100, 3.60287949E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.4495975180859562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.16647580713079d + "'", double1 == 1.16647580713079d);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 18L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.649946976182961E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.370359225760373E12d + "'", double1 == 6.370359225760373E12d);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.19902312E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 131072.0f + "'", float1 == 131072.0f);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        long long2 = org.apache.commons.math3.util.FastMath.min(5L, (long) 230);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.779595846079306d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7795958460793061d + "'", double2 == 0.7795958460793061d);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(749.99994f, (-49));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3322675E-12f + "'", float2 == 1.3322675E-12f);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9036922050915067d), 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.614768820366027d) + "'", double2 == (-3.614768820366027d));
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 5.877472E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-83.42452166883102d) + "'", double1 == (-83.42452166883102d));
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8192955636350346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-34.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(15.000001f, 0.39567227992801673d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.03434437172145996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034330874616771256d + "'", double1 == 0.034330874616771256d);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0919835173646293d, (-0.8538433260930435d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0919835173646293d) + "'", double2 == (-1.0919835173646293d));
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(46.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.686997580331529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.304812462981526d + "'", double1 == 1.304812462981526d);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-62.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1697497520826802d) + "'", double1 == (-0.1697497520826802d));
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 43, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43.0f + "'", float2 == 43.0f);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 6000, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5999.9995f + "'", float2 == 5999.9995f);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 0.3789063f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006613162659182065d + "'", double1 == 0.006613162659182065d);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-77L), (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.40625f) + "'", float2 == (-2.40625f));
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.3899208787571631d, 0.6806784082777886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5202106391317335d + "'", double2 == 0.5202106391317335d);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.5065230921350898E254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5065230921350898E254d) + "'", double1 == (-1.5065230921350898E254d));
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        int int2 = org.apache.commons.math3.util.FastMath.min(50, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.9309514699964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 167.93114918845825d + "'", double1 == 167.93114918845825d);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 35.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036873048705543d) + "'", double1 == (-0.9036873048705543d));
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.007211420032440578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007237484939209d + "'", double1 == 1.007237484939209d);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.6294995E15f, 3.469447E-18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6294995E15f + "'", float2 == 5.6294995E15f);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-51.63946495171592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.637527123319108d) + "'", double1 == (-4.637527123319108d));
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5403019046233176d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E30d + "'", double2 == 1.5845632502852868E30d);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.23781619457280337d, (-2.2343605386104213d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 44L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.6530981204434476d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.081218734622052d, (double) 230L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.081218734622053d + "'", double2 == 4.081218734622053d);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.922386521532856E25d, 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.511732844609233E37d + "'", double2 == 6.511732844609233E37d);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.986979343053352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0942626235935053d + "'", double1 == 1.0942626235935053d);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-12.0f), (double) 8.8817837E-16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.541098841762901E-21d) + "'", double2 == (-2.541098841762901E-21d));
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.882288307236088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5729.578825572446d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.204690469334889d, 2.2439404956380444E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.204690469335012d + "'", double2 == 0.204690469335012d);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.1932569E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.9999263715154889d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.5251190530819294E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5890623188163294E20d + "'", double1 == 1.5890623188163294E20d);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.6953302980477645d, (-0.016714315836654003d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.016714315836654003d) + "'", double2 == (-0.016714315836654003d));
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.26620587907525334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.007599723455542785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007599796612124502d) + "'", double1 == (-0.007599796612124502d));
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.1839570179408234d, 6.027800920562904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1839570179408234d + "'", double2 == 2.1839570179408234d);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 77L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.03434437172145996d, (-0.5872036550391518d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.240206570923631d + "'", double2 == 7.240206570923631d);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-20));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999979388464d) + "'", double1 == (-0.9999999979388464d));
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.9999995f, 2.9843788128357573d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 47999.996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47999.99609375d + "'", double1 == 47999.99609375d);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.4013650846586734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4013650846586734d + "'", double1 == 1.4013650846586734d);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.2922549758657981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0430113262078275d + "'", double1 == 1.0430113262078275d);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.240342741956245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23581945748578867d + "'", double1 == 0.23581945748578867d);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.070961690487835d, 1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9732551840809704d + "'", double2 == 1.9732551840809704d);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.07977109790154036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07985594402776272d) + "'", double1 == (-0.07985594402776272d));
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.2124675420131484E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7379567555085281d) + "'", double1 == (-0.7379567555085281d));
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.64158883361278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.100656565716712d + "'", double1 == 14.100656565716712d);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5.132761631686654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3191636513460576d + "'", double1 == 2.3191636513460576d);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.0141204E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.69674459530097d + "'", double1 == 73.69674459530097d);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-9.2233715E18f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 40.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.713572066704308d + "'", double1 == 3.713572066704308d);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.941742215644044E83d, 1.4844222297453324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4844222297453324d + "'", double2 == 1.4844222297453324d);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8352820081427102E-4d, 39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9249057814734434E-146d + "'", double2 == 1.9249057814734434E-146d);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.000000953674316d, 0.36693586126414035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000953674316d + "'", double2 == 6.000000953674316d);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 63L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 106L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 37, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 192.00002f, 1.5670585390721963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5670585390721963d + "'", double2 == 1.5670585390721963d);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1406354131908332d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.820816877190263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 916.7335630388013d + "'", double1 == 916.7335630388013d);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 56L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 56.0f + "'", float1 == 56.0f);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-49));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.66633186E17f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1934290145215238d + "'", double1 == 1.1934290145215238d);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.665378035886179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1023, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-11), (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.0f + "'", float2 == 11.0f);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.3236692321000447d, (-1.570796311160112d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3236692321000443d + "'", double2 == 3.3236692321000443d);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1646222122142713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.20471195344719d + "'", double1 == 2.20471195344719d);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.4414062985774404E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000298023237d + "'", double1 == 1.0000000298023237d);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.310309660994801d + "'", double1 == 0.310309660994801d);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9166893899372177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9714208072666499d + "'", double1 == 0.9714208072666499d);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.6812492467611788E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.681247833462456E-6d) + "'", double1 == (-1.681247833462456E-6d));
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 6.000001f, (-7.62364218539641d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.62364218539641d) + "'", double2 == (-7.62364218539641d));
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 29L, 0.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.0d + "'", double2 == 29.0d);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 205, 5.434540380772147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5442925813011463d + "'", double2 == 1.5442925813011463d);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-29), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-29L) + "'", long2 == (-29L));
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.09545486558053895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 4.882813E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.624618866950116d) + "'", double1 == (-7.624618866950116d));
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.2645189576252271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1245083181663118d + "'", double1 == 1.1245083181663118d);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3072.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.536964742657117d + "'", double1 == 14.536964742657117d);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.9296500271102235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0748829712226142d + "'", double1 == 1.0748829712226142d);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.5207040267328378d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5565511495583535d, 6.005947419223087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0516640514709925d + "'", double2 == 4.0516640514709925d);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.08640384017873165d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9251475365964138d), 0.012638627557620415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9251475365964138d + "'", double2 == 0.9251475365964138d);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 10L, (double) 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.702986674926819d), 0.15693881177778274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.702986674926819d) + "'", double2 == (-1.702986674926819d));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(12.300506591100818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4438.5341089142175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.2207031249999999E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.113374435736984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1133744357369846d + "'", double1 == 3.1133744357369846d);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-10445360463872L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6321205588285577d, (double) 47.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.000003814697266d + "'", double2 == 47.000003814697266d);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-2015.9999f), 1.8692317197309762d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0029602048452943563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.999999111110716d, (-0.6865874069985795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1724641318598454d + "'", double2 == 2.1724641318598454d);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042697E42d + "'", double1 == 1.3383347192042697E42d);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-6.020599913279624d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.01791665688303047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998395009965734d + "'", double1 == 0.9998395009965734d);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1368887786267312d, 0.7227342478134157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0045308019936836d + "'", double2 == 1.0045308019936836d);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 661L, (float) 141);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 141.0f + "'", float2 == 141.0f);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        float float2 = org.apache.commons.math3.util.FastMath.max((-0.49609375f), 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        int int2 = org.apache.commons.math3.util.FastMath.min(230, (-44));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44) + "'", int2 == (-44));
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.006613162659182065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006635077902415d + "'", double1 == 1.006635077902415d);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.9999999f, (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1024.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.8184464592320668d, (-0.9999999806537986d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9233845397715967d, (double) 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9233845397715968d + "'", double2 == 0.9233845397715968d);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        double double1 = org.apache.commons.math3.util.FastMath.abs(88.94410169625873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.94410169625873d + "'", double1 == 88.94410169625873d);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.017453291479645996d), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5585053273486719d) + "'", double2 == (-0.5585053273486719d));
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1359.4785752092612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77892.38469794914d + "'", double1 == 77892.38469794914d);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2064384.0f, 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2064384.0f + "'", float2 == 2064384.0f);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.6493713266343334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6106971308849317d) + "'", double1 == (-0.6106971308849317d));
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-724));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13667749552301828d + "'", double1 == 0.13667749552301828d);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 7.9999995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.999999523162843d + "'", double1 == 7.999999523162843d);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(39936.0f, 3072);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.0000002f, (float) 137);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0000002f + "'", float2 == 3.0000002f);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-1.3440585709080678E43d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.659189757353836d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        double double1 = org.apache.commons.math3.util.FastMath.exp(159.37082854749778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6363319661787496E69d + "'", double1 == 1.6363319661787496E69d);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.8984560355111834E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5581072508214118d) + "'", double1 == (-0.5581072508214118d));
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.298292365610485d, 0.5353836659458734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05554429384824888d) + "'", double2 == (-0.05554429384824888d));
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(12.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(141.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 141.00002f + "'", float1 == 141.00002f);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        double double1 = org.apache.commons.math3.util.FastMath.sin(65.9642038991485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009241694678239648d + "'", double1 == 0.009241694678239648d);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0021077632011064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7624779424024872d + "'", double1 == 0.7624779424024872d);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-44), (long) (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-5.734409381589459E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.7371252E25f, 1.637689859280612d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.737125E25f + "'", float2 == 7.737125E25f);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9029845678036967d, (-0.005846743218732369d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0025861121189119478d + "'", double2 == 0.0025861121189119478d);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-5.9029581035870565E20d), 123.08755801768092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9029581035870565E20d + "'", double2 == 5.9029581035870565E20d);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 15, (-2.14748352E9f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748352E9f) + "'", float2 == (-2.14748352E9f));
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.50359936E15f, (float) 141);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 141.0f + "'", float2 == 141.0f);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.33909301561996863d), 0.8772762058832566d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.739706489124846E-4d), (double) (-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.739706489124846E-4d) + "'", double2 == (-1.739706489124846E-4d));
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-919.120475255045d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9811607348543806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019018984872656398d) + "'", double1 == (-0.019018984872656398d));
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920929E-7f, 1.962109144995424E32d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.192093E-7f + "'", float2 == 1.192093E-7f);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4863445844633245d, 4.768372150465078E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4863445844633245d + "'", double2 == 1.4863445844633245d);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.4414062985774393E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.441406250071053E-4d + "'", double1 == 2.441406250071053E-4d);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6188532336455966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5503290788107932d + "'", double1 == 0.5503290788107932d);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000008f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8406759214397472d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.796720822921585E297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.894234176820905E299d + "'", double1 == 3.894234176820905E299d);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.14748352E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562537753657d + "'", double1 == 21.487562537753657d);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.086097232552573E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 192L, 1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.0f + "'", float2 == 192.0f);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.4247770070950634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9588203048038427d + "'", double1 == 0.9588203048038427d);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        long long1 = org.apache.commons.math3.util.FastMath.abs(8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.6571063883041222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1833597603409414d) + "'", double1 == (-1.1833597603409414d));
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.06491568643588523d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.28957769347715206d), 3.53711887601422E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.53711887601422E15d + "'", double2 == 3.53711887601422E15d);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.0f, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04000000000000001d + "'", double2 == 0.04000000000000001d);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.000000001862645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806370042263d + "'", double1 == 1.5430806370042263d);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.009408018010304003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 20, (-0.49609375f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.49609375f) + "'", float2 == (-0.49609375f));
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-10), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        float float2 = org.apache.commons.math3.util.FastMath.max(29.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-67));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5353836659458734d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.0601456127484035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0708629090528623d + "'", double1 == 0.0708629090528623d);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7182818285381576d, (-0.9999832982992097d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0978507187362676d + "'", double2 == 2.0978507187362676d);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        double double1 = org.apache.commons.math3.util.FastMath.log10(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0043213737826426d + "'", double1 == 2.0043213737826426d);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.123573122745224d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1500.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0001f + "'", float1 == 1500.0001f);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-56.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5258789062500003E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.525878906368424E-5d + "'", double1 == 1.525878906368424E-5d);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.4414062985774404E-4d, 6.244997998398398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7594301770234377E-23d + "'", double2 == 2.7594301770234377E-23d);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        double double1 = org.apache.commons.math3.util.FastMath.sin(6.370359225760373E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8977400331674263d) + "'", double1 == (-0.8977400331674263d));
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0844638552900231E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.18774846815194668d, 1.220703131063298E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5701461468115028d + "'", double2 == 1.5701461468115028d);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8866182725444937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8866182725444937d + "'", double1 == 0.8866182725444937d);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.16118920324881E-9d + "'", double1 == 4.16118920324881E-9d);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.020431121603772754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02042970020377229d + "'", double1 == 0.02042970020377229d);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 5.6294995E15f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5407909080932595d, 1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.591064607026499d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8255079892949791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2830402308036004d + "'", double1 == 2.2830402308036004d);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.469447E-18f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.5527137E-15f + "'", float2 == 3.5527137E-15f);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000798685164107d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.2220482392758838d, (-77));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.086836889068596E-24d + "'", double2 == 8.086836889068596E-24d);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.6360022856629775d, (double) 16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.632416418432009d + "'", double2 == 5.632416418432009d);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        long long2 = org.apache.commons.math3.util.FastMath.min((-44L), (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9223372036854775808L) + "'", long2 == (-9223372036854775808L));
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-17L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.1E-44f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1210387714598537E-44d + "'", double1 == 1.1210387714598537E-44d);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1.5474252E26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.547425233574166E26d + "'", double1 == 1.547425233574166E26d);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(37.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.859571186401347E15d + "'", double1 == 5.859571186401347E15d);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(46040.886104364334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.430432289730845d + "'", double1 == 11.430432289730845d);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.06778294805138535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.234360538610421d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(37.999996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.663561548316891d + "'", double1 == 3.663561548316891d);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(8.376517822945031E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.376517822945032E-13d + "'", double1 == 8.376517822945032E-13d);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(96.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 46);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.7300933056128451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15862412560908754d) + "'", double1 == (-0.15862412560908754d));
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.5067879719422177d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.4349004398852625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(34.581559855949905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2579783423155004d + "'", double1 == 3.2579783423155004d);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-47), 1.64926744E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.64926744E15f + "'", float2 == 1.64926744E15f);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.9843788128357573d, 8102.083927575384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.12150579067946177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12120703299629262d + "'", double1 == 0.12120703299629262d);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.2542596133585809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2245095517692758d) + "'", double1 == (-0.2245095517692758d));
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.2756035467681588E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999741081426d + "'", double1 == 0.9999999741081426d);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5597471089165569d, 1.5707962075856072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2136421954640464d + "'", double2 == 2.2136421954640464d);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-17), 3.450873173395282E69d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999998f) + "'", float2 == (-16.999998f));
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(749.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.0d + "'", double1 == 749.0d);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 112);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6821738184917205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9938039362991882d + "'", double1 == 0.9938039362991882d);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.7079938E27f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7263408560807765E25d + "'", double1 == 4.7263408560807765E25d);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9403184054350179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0851465914881697d + "'", double1 == 1.0851465914881697d);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6110610404570322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8190397210252126d + "'", double1 == 0.8190397210252126d);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.36274713936822706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7131835741878096d + "'", double1 == 0.7131835741878096d);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8.0f, 87);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.23794004E27f + "'", float2 == 1.23794004E27f);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.03272640277836577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027415567780803774d) + "'", double1 == (-0.027415567780803774d));
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-20L), 0.22652043378197598d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-19.999998f) + "'", float2 == (-19.999998f));
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 20, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.2207031310632982E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1499.0006666663703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.162497122918175d + "'", double1 == 26.162497122918175d);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        int int2 = org.apache.commons.math3.util.FastMath.min(37, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        int int1 = org.apache.commons.math3.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(16.91153452528776d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.938659142988208d, 1.4639780495538803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5253189065656724d) + "'", double2 == (-0.5253189065656724d));
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(13.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.158638853279167d, 205);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.13845599541372E62d + "'", double2 == 2.13845599541372E62d);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.2233715E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.04260447632084876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04260447632084875d) + "'", double1 == (-0.04260447632084875d));
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.05243197782655937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.2202849466483139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0686129132810362d + "'", double1 == 1.0686129132810362d);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.2455323929060171d), 2.4825767815644055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2455323929060171d + "'", double2 == 0.2455323929060171d);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 8L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-67));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5558720618048116d) + "'", double1 == (-1.5558720618048116d));
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        double double1 = org.apache.commons.math3.util.FastMath.atan(113.05919416648635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5619516332603731d + "'", double1 == 1.5619516332603731d);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.6268613048244727d, (-0.05037245961609866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6268613048244727d) + "'", double2 == (-3.6268613048244727d));
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0000000999848258d, 0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000283619133d + "'", double2 == 1.0000000283619133d);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.743706083493738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8958211783688693d + "'", double1 == 0.8958211783688693d);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        int int2 = org.apache.commons.math3.util.FastMath.min((-26), 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9975054538602377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975054538602377d + "'", double1 == 0.9975054538602377d);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.80144007E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.80144007E16f + "'", float1 == 1.80144007E16f);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(10.127541722024175d, 1.000000005268356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.127541722024173d + "'", double2 == 10.127541722024173d);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 10, (float) 74L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.0029226537549750234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999957290505544d + "'", double1 == 0.9999957290505544d);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.013560982203286d, 0.1705916668574389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.013560982203284d + "'", double2 == 9.013560982203284d);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        float float2 = org.apache.commons.math3.util.FastMath.min(127.00001f, 24000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.00001f + "'", float2 == 127.00001f);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.3264961565739686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.80144007E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7300933056128451d, (double) 1048576.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1048576.0d + "'", double2 == 1048576.0d);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 3072);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414062E-4f + "'", float1 == 2.4414062E-4f);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-2015.9998f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2016L) + "'", long1 == (-2016L));
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.4815203834508854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1844686623498537d + "'", double1 == 1.1844686623498537d);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7262340257027773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1305288720633893E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707941962660246d + "'", double1 == 1.5707941962660246d);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.611686E18f, 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.611686E18f + "'", float2 == 4.611686E18f);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.713244699303313d + "'", double1 == 17.713244699303313d);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 128.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.0d + "'", double1 == 128.0d);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.521546720938896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9089668247421057d + "'", double1 == 0.9089668247421057d);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        int int1 = org.apache.commons.math3.util.FastMath.round(258047.98f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 258048 + "'", int1 == 258048);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        float float2 = org.apache.commons.math3.util.FastMath.max((-44.0f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.4414062E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.999999f, (-0.0034310190995747916d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999986f + "'", float2 == 5.9999986f);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.20824159849321072d, 16.252646034500078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.412374522703435E-12d + "'", double2 == 8.412374522703435E-12d);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.313219861265277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.844153986113171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(7.56939756606048E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        long long2 = org.apache.commons.math3.util.FastMath.min((-2016L), (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2016L) + "'", long2 == (-2016L));
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.0101769735763335d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.4917433895193939d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2549818703122236E-30d + "'", double2 == 1.2549818703122236E-30d);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        double double1 = org.apache.commons.math3.util.FastMath.sin(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9176338407880035d + "'", double1 == 0.9176338407880035d);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.13667749552301828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-10445360463872L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.32152464392844765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32152464392844765d + "'", double1 == 0.32152464392844765d);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        float float2 = org.apache.commons.math3.util.FastMath.max(6000.0005f, 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0005f + "'", float2 == 6000.0005f);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-14.0f), 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-28.0d) + "'", double2 == (-28.0d));
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.64926744E15f, 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.08355E24f + "'", float2 == 7.08355E24f);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.465850228008332E-85d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.42440892460022006d), 0.36832110635936816d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        double double1 = org.apache.commons.math3.util.FastMath.signum(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 1.044757795734393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.2491542559227393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.768537111054233d + "'", double1 == 24.768537111054233d);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.4837637461282407d, 402.4286011229416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 402.4286011229416d + "'", double2 == 402.4286011229416d);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6148367167674555d, 1.1017419656965828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6955243449660649d + "'", double2 == 1.6955243449660649d);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-8.376517822945031E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.376517822945031E-13d) + "'", double1 == (-8.376517822945031E-13d));
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9124034991009714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.6383344E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.7762636E-21f + "'", float1 == 6.7762636E-21f);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-4.124460373116969E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.124460606990028E-4d) + "'", double1 == (-4.124460606990028E-4d));
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.36787944117144233d, (-0.9092974268256815d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.36787944117144233d) + "'", double2 == (-0.36787944117144233d));
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.49278093949912594d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7252312445040109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0652086128946063d + "'", double1 == 1.0652086128946063d);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 128, (-2016.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-128.0f) + "'", float2 == (-128.0f));
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 109, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.3017603994181974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275969202823d + "'", double1 == 0.9640275969202823d);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8190397210252126d, 0.9998536059613301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8190397210252126d + "'", double2 == 0.8190397210252126d);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5490899152547166E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 40L, 5.298342441912637d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8114933394509746d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6704132351346599d) + "'", double1 == (-0.6704132351346599d));
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.028392510015146796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5467962123511316d) + "'", double1 == (-1.5467962123511316d));
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8415957046430611d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        double double1 = org.apache.commons.math3.util.FastMath.asin(14.536964742657117d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-63.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.97480452983425E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.97480452983425E36d + "'", double1 == 6.97480452983425E36d);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5999.9995f, 0.9983465473243199d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5999.999f + "'", float2 == 5999.999f);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        int int2 = org.apache.commons.math3.util.FastMath.min(46, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.07892412815811237d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07876066216728575d) + "'", double1 == (-0.07876066216728575d));
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        long long2 = org.apache.commons.math3.util.FastMath.max(63L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5474254E26f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5474254E26f + "'", float2 == 1.5474254E26f);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.1771933557663606E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6174449004242214E-24d + "'", double1 == 6.6174449004242214E-24d);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.6759384609369061d), 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009096742519807272d + "'", double2 == 0.009096742519807272d);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9033391107665127d, 80.44386220622742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665127d + "'", double2 == 0.9033391107665127d);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1024), 749.9998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        int int1 = org.apache.commons.math3.util.FastMath.round(30.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.8828122E-4f, 0.5628219188284787d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 39, (-1023.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.0f + "'", float2 == 39.0f);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7502685605935906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.392373E-9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.392373E-9f + "'", float1 == 7.392373E-9f);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9999940395531084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999940395531085d + "'", double1 == 0.9999940395531085d);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.339735781143019E61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.33973578114302E61d + "'", double1 == 6.33973578114302E61d);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-44), (long) (-26));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44L) + "'", long2 == (-44L));
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        double double2 = org.apache.commons.math3.util.FastMath.log((-2.304341850669857d), 1.1612231530729578d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.644483341943245d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5.3687091E8f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(122.07712677639502d, 3.6313226197565623E-11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 122.07712677639502d + "'", double2 == 122.07712677639502d);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7252312445040109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 3.469447E-18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8905770416677471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8905770416677472d + "'", double1 == 0.8905770416677472d);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.24553239290601714d), 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2466344651024274E-65d + "'", double2 == 2.2466344651024274E-65d);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1023.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.854718247901992d + "'", double1 == 17.854718247901992d);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.23912643706564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.150771154373546d) + "'", double1 == (-1.150771154373546d));
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        double double1 = org.apache.commons.math3.util.FastMath.log10(230.25850929941265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3622156886994783d + "'", double1 == 2.3622156886994783d);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.5035996E15f, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        long long1 = org.apache.commons.math3.util.FastMath.abs(141L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 141L + "'", long1 == 141L);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.395994700000028E7d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.4349004383915853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        long long2 = org.apache.commons.math3.util.FastMath.min(2016L, 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2016L + "'", long2 == 2016L);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8849970445005179d, (-35));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5756803937853485E-11d + "'", double2 == 2.5756803937853485E-11d);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.000000000000022E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000022E200d + "'", double1 == 1.000000000000022E200d);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0276664277248058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.15411301352167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.15411301352167d + "'", double1 == 6.15411301352167d);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.8014400656965632E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3421773599999976E8d + "'", double1 == 1.3421773599999976E8d);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 17, 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.3458488E12f + "'", float2 == 9.3458488E12f);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-205.9115765284781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        int int2 = org.apache.commons.math3.util.FastMath.max((-26), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.89704490591024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9827914620218157d + "'", double1 == 2.9827914620218157d);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8608291180359888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7583832500211217d + "'", double1 == 0.7583832500211217d);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6931471805599453d, (-0.7615941309233423d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(112.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.010518784647500399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8032057313113644d, 34);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.809130825225381E-4d + "'", double2 == 5.809130825225381E-4d);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4489023749402996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.01599101056074d + "'", double1 == 83.01599101056074d);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, (long) (-77));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.765626164153218E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0102999048678782d) + "'", double1 == (-3.0102999048678782d));
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1024L), 48000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48000L + "'", long2 == 48000L);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 17, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 29L, 4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.000000000000004d + "'", double2 == 29.000000000000004d);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.8483318952611161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6142835540966499d + "'", double1 == 0.6142835540966499d);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.07985594402776272d), 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.871129647133168E307d) + "'", double2 == (-2.871129647133168E307d));
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.6215477523208263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569289d) + "'", double1 == (-0.5872139151569289d));
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9442156593254849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3814241049095075d + "'", double1 == 1.3814241049095075d);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.000000000014552d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        long long2 = org.apache.commons.math3.util.FastMath.min(72L, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5640537039872793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 230);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 230.0f + "'", float1 == 230.0f);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9738115534140308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3414339173983056d + "'", double1 == 1.3414339173983056d);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, (long) 6000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 256.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 256.0d + "'", double1 == 256.0d);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.0f, (float) (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.632416418432009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.373271248389448d + "'", double1 == 2.373271248389448d);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.9827914620218157d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.05818015943256102d), 5.77028216800638E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05818015943256102d) + "'", double2 == (-0.05818015943256102d));
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.656473403698357d, (double) 48000.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.656473403698357d + "'", double2 == 1.656473403698357d);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.2922549758657981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005100811584194742d + "'", double1 == 0.005100811584194742d);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.000000000705009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.999625033326321E-5d, 230);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.626535952270647E64d + "'", double2 == 8.626535952270647E64d);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.545331397489227d, 9.027538327591038E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.9512437185814275d, (-0.08583325804146333d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0029138486741144276d + "'", double2 == 0.0029138486741144276d);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.1035153E-5f, 7.941742215644044E83d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1035156E-5f + "'", float2 == 6.1035156E-5f);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1024.9999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7451734706821028d + "'", double1 == 0.7451734706821028d);
    }
}

