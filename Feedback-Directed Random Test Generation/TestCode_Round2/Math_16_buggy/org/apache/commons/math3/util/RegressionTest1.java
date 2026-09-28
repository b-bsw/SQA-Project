package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        double double1 = org.apache.commons.math3.util.FastMath.log(112.81581913850151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.725756569820719d + "'", double1 == 4.725756569820719d);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8414439706668982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2260986406399412d + "'", double1 == 1.2260986406399412d);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) '#', 1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.499188385108773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.94410169625873d + "'", double1 == 88.94410169625873d);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(749.99994f, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        double double1 = org.apache.commons.math3.util.FastMath.acos(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8524213316116924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7730812391918281d + "'", double1 == 0.7730812391918281d);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845631E30f + "'", float2 == 1.5845631E30f);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1546709519529927d + "'", double1 == 1.1546709519529927d);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1025);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1025L + "'", long1 == 1025L);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9358793340080341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1.5845631E30f, 3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.37438953472E11d) + "'", double2 == (-1.37438953472E11d));
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078128E-7d + "'", double1 == 1.1920928955078128E-7d);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012984643248174E-45d + "'", double1 == 1.4012984643248174E-45d);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-57.29577951308232d), 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.32153907959692d + "'", double2 == 57.32153907959692d);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '4', (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.433773393518789d) + "'", double1 == (-0.433773393518789d));
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4403865801148885d + "'", double1 == 1.4403865801148885d);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        double double1 = org.apache.commons.math3.util.FastMath.exp(22025.4658761156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '4', (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2, 0.36832110635936816d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1500L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0f + "'", float1 == 1500.0f);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0d), 1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100.00001f, 1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000762939453d + "'", double2 == 100.00000762939453d);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0075707739244519d) + "'", double1 == (-0.0075707739244519d));
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7976931348623157E308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double double1 = org.apache.commons.math3.util.FastMath.sin(155.74607629780772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9719903465379038d) + "'", double1 == (-0.9719903465379038d));
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.743392130574644E-23d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8623150089993341d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.827881037133875E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 97.0f, (-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-97.0d) + "'", double2 == (-97.0d));
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 3, (float) 1025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9866275920404852d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9732551840809704d + "'", double2 == 1.9732551840809704d);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(6000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999244973d + "'", double1 == 0.9999999999244973d);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030765742067207565d + "'", double1 == 0.030765742067207565d);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.2401310215141802E-16d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2401310215141802E-16d + "'", double2 == 1.2401310215141802E-16d);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.154434690031884d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.327747459134791d + "'", double2 == 2.327747459134791d);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        double double1 = org.apache.commons.math3.util.FastMath.floor(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 749.0d + "'", double1 == 749.0d);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11026740251372914d) + "'", double1 == (-0.11026740251372914d));
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        long long2 = org.apache.commons.math3.util.FastMath.max(750L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.11026740251372914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 10.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078154E-7d + "'", double1 == 1.1920928955078154E-7d);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(100.00001f, (-97.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.6414445250304635d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6414445250304635d) + "'", double2 == (-1.6414445250304635d));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1025L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.1306478036226246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.130647803622625d + "'", double1 == 2.130647803622625d);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.1628723067131066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1628723067131066d + "'", double1 == 3.1628723067131066d);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 749.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 100, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.892546881191539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31622776601683805d) + "'", double1 == (-0.31622776601683805d));
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.762747174039086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1024.0f, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2980742E33f + "'", float2 == 1.2980742E33f);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        int int1 = org.apache.commons.math3.util.FastMath.abs(750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 750 + "'", int1 == 750);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.8146973E-6f, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2260986406399412d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.352513421777619d + "'", double1 == 0.352513421777619d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7781512503836434d + "'", double1 == 3.7781512503836434d);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        double double2 = org.apache.commons.math3.util.FastMath.log(6.103515625000001E-5d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11321160719436832d) + "'", double2 == (-0.11321160719436832d));
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 5, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        double double2 = org.apache.commons.math3.util.FastMath.min(1296.7941421366083d, 3.7781512503836434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7781512503836434d + "'", double2 == 3.7781512503836434d);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6881171418161356E43d, 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1024, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 750L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425511E-15d + "'", double1 == 1.1190346870425511E-15d);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453294184418977d + "'", double1 == 0.17453294184418977d);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 3072.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.5997382704646929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 5, 19.949874371066198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.949874371066198d + "'", double2 == 19.949874371066198d);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1296.7941421366083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.01102806275611d + "'", double1 == 36.01102806275611d);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 0L, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.7182818284590453d, 1.0E200d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E200d + "'", double2 == 1.0E200d);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 5L, 6000.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4403865801148885d, 0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4403865801148885d + "'", double2 == 1.4403865801148885d);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.00000038146972d + "'", double1 == 10.00000038146972d);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.6673940104325407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029101515410080516d + "'", double1 == 0.029101515410080516d);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.298342365610589d, 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5845633E30f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E30f + "'", float2 == 1.5845633E30f);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-127.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24304604515482672d) + "'", double1 == (-0.24304604515482672d));
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8623150089993341d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1017419656965828d + "'", double1 == 1.1017419656965828d);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7224284372420832d) + "'", double1 == (-0.7224284372420832d));
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1L, 1.2246467991473532E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2246467991473532E-16d + "'", double2 == 1.2246467991473532E-16d);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.5251711488118009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2796991406480593d) + "'", double1 == (-0.2796991406480593d));
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1500L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5545968900472659d) + "'", double1 == (-0.5545968900472659d));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4242728127018156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8904869112092367d + "'", double1 == 0.8904869112092367d);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3458247401995457E41d + "'", double1 == 2.3458247401995457E41d);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.327747459134791d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1025);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011048543456039806d + "'", double1 == 0.011048543456039806d);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7730812391918281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0279410268437934d + "'", double1 == 1.0279410268437934d);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.2246467991473532E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100, (-1024.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1024.0f) + "'", float2 == (-1024.0f));
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(36.871107594012706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.30039148809513d + "'", double1 == 4.30039148809513d);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.5845631E30f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0141204E32f + "'", float2 == 1.0141204E32f);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 750L + "'", long2 == 750L);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094947E-13f + "'", float1 == 9.094947E-13f);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 100, (float) 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1920929E-7f, (float) 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        float float2 = org.apache.commons.math3.util.FastMath.max(6000.0f, 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6000.0f + "'", float2 == 6000.0f);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        long long2 = org.apache.commons.math3.util.FastMath.min(5L, 750L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1L, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9738115534140308d + "'", double1 == 0.9738115534140308d);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 750L, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.761141328797799d + "'", double1 == 4.761141328797799d);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.011032585021104841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (short) 100, 97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.80038650342911d + "'", double2 == 0.80038650342911d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.615120516841261d, 0.011048543456039806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841261d + "'", double2 == 4.615120516841261d);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.148283155648077d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9351525542706054d + "'", double2 == 2.9351525542706054d);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1296.7941421366083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002E100d + "'", double1 == 1.0000000000000002E100d);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.8828125E-4f, (-0.7224284372420832d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828122E-4f + "'", float2 == 4.8828122E-4f);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.8414439706668982d, 1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414439706668982d + "'", double2 == 0.8414439706668982d);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2980742E33f, 4.725756569820719d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2980741E33f + "'", float2 == 1.2980741E33f);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        int int2 = org.apache.commons.math3.util.FastMath.min(1500, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13158548711983195d + "'", double1 == 0.13158548711983195d);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6321205588285577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2065299964591305d + "'", double1 == 1.2065299964591305d);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004962015874444895d + "'", double1 == 0.004962015874444895d);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1425465430742778d) + "'", double1 == (-0.1425465430742778d));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.085602964160698d + "'", double1 == 9.085602964160698d);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3440585709080676E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5771174481917147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9466715061814477d + "'", double1 == 0.9466715061814477d);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.103515628789562E-5d + "'", double1 == 6.103515628789562E-5d);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        double double1 = org.apache.commons.math3.util.FastMath.log(749.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.620073206530356d + "'", double1 == 6.620073206530356d);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.049877523736615d + "'", double1 == 20.049877523736615d);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.327747459134791d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9073862646776047d + "'", double1 == 0.9073862646776047d);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9866275920404852d, 10.079368399158986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.127541722024175d + "'", double2 == 10.127541722024175d);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.5845631E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.5378615119413d + "'", double1 == 69.5378615119413d);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        double double1 = org.apache.commons.math3.util.FastMath.tan(100.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872036550391518d) + "'", double1 == (-0.5872036550391518d));
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-57.29577951308232d), 0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009967783941837574d) + "'", double2 == (-0.009967783941837574d));
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.922737656982237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39567227992801673d + "'", double1 == 0.39567227992801673d);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0955641261303415d + "'", double1 == 1.0955641261303415d);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 1500);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1500.0f + "'", float1 == 1500.0f);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0000000000291038d, (double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9103830456733704E-11d + "'", double2 == 2.9103830456733704E-11d);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        long long1 = org.apache.commons.math3.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17543140958325787d + "'", double1 == 0.17543140958325787d);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4505495340698077d) + "'", double1 == (-0.4505495340698077d));
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.0d + "'", double1 == 44.0d);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9734594443576854d + "'", double1 == 0.9734594443576854d);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4411627128891868d + "'", double1 == 1.4411627128891868d);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272356433182504d + "'", double1 == 0.0272356433182504d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9111477955680065d, 1.569820717348332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8640954259078426d + "'", double2 == 0.8640954259078426d);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 97.00001f, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.443593622809233E69d + "'", double2 == 3.443593622809233E69d);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108222.44191876269d + "'", double1 == 108222.44191876269d);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7976931348623157E308d, (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.37438953472E11d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.9029581035870565E20d) + "'", double2 == (-5.9029581035870565E20d));
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1017419656965828d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1017419656965828d + "'", double2 == 1.1017419656965828d);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.004962015874444895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000123108260284d + "'", double1 == 1.0000123108260284d);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425511E-15d + "'", double1 == 1.1190346870425511E-15d);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.5545968900472659d), 2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5545968900472659d) + "'", double2 == (-0.5545968900472659d));
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) ' ', (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2679114584199251d + "'", double2 == 1.2679114584199251d);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.349101754933678d) + "'", double1 == (-2.349101754933678d));
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21991180375937056d) + "'", double1 == (-0.21991180375937056d));
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(100.00000762939453d, (double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000763058662d + "'", double2 == 100.00000763058662d);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        float float1 = org.apache.commons.math3.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.174271293851463d + "'", double1 == 15.174271293851463d);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9073862646776047d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9073862646776047d + "'", double2 == 0.9073862646776047d);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(Double.POSITIVE_INFINITY, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 3, 1.7300933056128451d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9999998f + "'", float2 == 2.9999998f);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.37438953472E11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.33959286127792d) + "'", double1 == (-26.33959286127792d));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.118326675304813E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5055429617727457E-10d + "'", double1 == 3.5055429617727457E-10d);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.298342365610589d, 0.5997382704646929d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.332177586716706d + "'", double2 == 5.332177586716706d);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        double double1 = org.apache.commons.math3.util.FastMath.atan(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500, 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48000.0f + "'", float2 == 48000.0f);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842022E-19f + "'", float1 == 1.0842022E-19f);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(44.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.0d + "'", double1 == 44.0d);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.220703125E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1305288720633906E-6d + "'", double1 == 2.1305288720633906E-6d);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 5.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        double double1 = org.apache.commons.math3.util.FastMath.cos(32.01562118716424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8255079892949791d + "'", double1 == 0.8255079892949791d);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4411627128891868d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.6414445250304635d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7976931348623157E308d) + "'", double2 == (-1.7976931348623157E308d));
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.16499547112384425d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16499547112384425d + "'", double2 == 0.16499547112384425d);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1024);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0001f + "'", float1 == 1024.0001f);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1025, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.13158548711983195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        int int1 = org.apache.commons.math3.util.FastMath.round(99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        int int1 = org.apache.commons.math3.util.FastMath.round(10.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9239385290558519d + "'", double1 == 0.9239385290558519d);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(15.174271293851463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998679d + "'", double1 == 0.9999999999998679d);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000002f + "'", float1 == 1.0000002f);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.21991180375937056d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1L), 22025.465794806678d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(108222.44191876269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.65470400249466d + "'", double1 == 47.65470400249466d);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.004962015874444895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.305943194514724d) + "'", double1 == (-5.305943194514724d));
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.7615941559557649d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.45477224674693d) + "'", double2 == (-8.45477224674693d));
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.0d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34559293815501096d + "'", double1 == 0.34559293815501096d);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4255617839730704E64d + "'", double1 == 1.4255617839730704E64d);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.3683211063593682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 100, 6.620073206530356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.2188872880747d + "'", double2 == 100.2188872880747d);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2980741E33f, (double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29807406E33f + "'", float2 == 1.29807406E33f);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0f + "'", float1 == 1025.0f);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.2065299964591305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0201468328002705d + "'", double1 == 1.0201468328002705d);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.814697265625009E-6d, (double) 750L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.009967783941837574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.990081729765975d + "'", double1 == 0.990081729765975d);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026871352843612424d + "'", double1 == 0.026871352843612424d);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.9512437185814275d, 1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1181358553707477E-11d + "'", double2 == 2.1181358553707477E-11d);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.443593622809233E69d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 160.80803418105256d + "'", double1 == 160.80803418105256d);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.1759754114836391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9232666633273902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3222026309922488d + "'", double1 == 1.3222026309922488d);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5997382704646929d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 35, 1.0141204E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-0.99999994f), 6.103515628789562E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999403953551d) + "'", double2 == (-0.9999999403953551d));
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4403865801148885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9070766022988521d + "'", double1 == 0.9070766022988521d);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015263d + "'", double1 == 0.19611987703015263d);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1500.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.013560982203286d + "'", double1 == 9.013560982203286d);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 35.0f, 10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.29807406E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.29807406E33f + "'", float1 == 1.29807406E33f);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.29807406E33f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.090853653267673E11d + "'", double1 == 1.090853653267673E11d);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8640954259078426d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0786964586302374E-39d + "'", double2 == 5.0786964586302374E-39d);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.725756569820719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998428711716857d + "'", double1 == 0.9998428711716857d);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(48000.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        double double2 = org.apache.commons.math3.util.FastMath.min(100.0d, 1025.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        double double1 = org.apache.commons.math3.util.FastMath.rint(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.061328855954495554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.6026819659087781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6026819659087781d + "'", double1 == 0.6026819659087781d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.29807406E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.7371252E25f + "'", float1 == 7.7371252E25f);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078128E-7d + "'", double1 == 1.1920928955078128E-7d);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2980741E33f, (double) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.29807406E33f + "'", float2 == 1.29807406E33f);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        double double1 = org.apache.commons.math3.util.FastMath.tan(7.62939453125E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453139803E-6d + "'", double1 == 7.62939453139803E-6d);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(750.0f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.7976931348623157E308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.137566414384587E306d) + "'", double1 == (-3.137566414384587E306d));
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        double double1 = org.apache.commons.math3.util.FastMath.exp(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.474197238054d + "'", double1 == 22026.474197238054d);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 750L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9998428711716857d, 0.9998428711716857d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998428711716857d + "'", double2 == 0.9998428711716857d);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3440585709080676E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3776033183918694E14d + "'", double1 == 2.3776033183918694E14d);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7615941559679877d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.602681965908778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5845633E30f, (double) (-1024.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845631E30f + "'", float2 == 1.5845631E30f);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.3776033183918694E14d, 4.3713210688081606E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.75502076286542E-5d + "'", double2 == 3.75502076286542E-5d);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7730812391918281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.29429222643544d + "'", double1 == 44.29429222643544d);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.31358451852720004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.433773393518789d), 3.913940518571937E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.433773393518789d) + "'", double2 == (-0.433773393518789d));
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 97.00000000000001d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4255617839730704E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.17889304790669835d, 43.42944819032518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.42944819032518d + "'", double2 == 43.42944819032518d);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.0d), 0.022832605602534084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.99999994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.75502076286542E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8880936454516588d + "'", double1 == 0.8880936454516588d);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 7.7371252E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.6308050742098271d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.630805074209827d) + "'", double1 == (-0.630805074209827d));
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9734594443576854d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9734594443576854d + "'", double2 == 0.9734594443576854d);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.2260986406399412d, 1.569462994251686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9916154164156743d + "'", double2 == 1.9916154164156743d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2260986406399412d, 1.0000000000000002E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2260986406399412d + "'", double2 == 1.2260986406399412d);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.569820717348332d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2915496650148839d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.9916154164156743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2343605386104213d) + "'", double1 == (-2.2343605386104213d));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9239385290558519d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (short) 0, (double) 99.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.1628723067131066d, 0.7564260666383823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1628723067131066d + "'", double2 == 3.1628723067131066d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 9223372036854775807L, 1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.2233715E18f + "'", float2 == 9.2233715E18f);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        long long1 = org.apache.commons.math3.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1024.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1024) + "'", int1 == (-1024));
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.31322083153445d, (-5.9029581035870565E20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.31322083153445d + "'", double2 == 7.31322083153445d);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.36004964460910377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35232069507293856d + "'", double1 == 0.35232069507293856d);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1025L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.1305288720633906E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.130528872063391E-6d + "'", double1 == 2.130528872063391E-6d);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402864822065015d + "'", double1 == 1.8402864822065015d);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.768372E-7f + "'", float1 == 4.768372E-7f);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182228d + "'", double1 == 1.3132616875182228d);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        double double2 = org.apache.commons.math3.util.FastMath.pow(750.0d, 0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.35674296486279d + "'", double2 == 74.35674296486279d);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 1.17512404686688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.9732551840809704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.9351525542706054d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.795192390859045E46d + "'", double2 == 5.795192390859045E46d);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.9351525542706054d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.569820717348332d, 1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569820717348332d + "'", double2 == 1.569820717348332d);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.8163011535675582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-0.99999994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.99999994f + "'", float1 == 0.99999994f);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.022832605602534084d, 6.103515625000001E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02283260560253408d + "'", double2 == 0.02283260560253408d);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.615120516841261d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7476805260785286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120592379816d + "'", double1 == 4.615120592379816d);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267909768656307d + "'", double1 == 2.267909768656307d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.7453291188362752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24187733445678708d + "'", double1 == 0.24187733445678708d);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1025, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9239385290558519d, 0.02283260560253408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9981953489305545d + "'", double2 == 0.9981953489305545d);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4411627128891868d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.441162712889187d + "'", double2 == 1.441162712889187d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.21991180375937056d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941309233423d) + "'", double1 == (-0.7615941309233423d));
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9088714301767988d + "'", double1 == 0.9088714301767988d);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.503897021644941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9659011330697134d + "'", double1 == 0.9659011330697134d);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.7910068511973d + "'", double1 == 11.7910068511973d);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 6000.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.699681400989514d + "'", double1 == 8.699681400989514d);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 6, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.130647803622625d, (-26.33959286127792d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1306478036226246d + "'", double2 == 2.1306478036226246d);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1024.0d, (-0.9999999801317847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0004882811143d + "'", double2 == 1024.0004882811143d);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3440585709080676E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        int int2 = org.apache.commons.math3.util.FastMath.min((-127), 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.2679114584199251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9029845678036967d + "'", double1 == 0.9029845678036967d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.24187733445678708d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.288323357835553E-62d + "'", double2 == 2.288323357835553E-62d);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        int int1 = org.apache.commons.math3.util.FastMath.round(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.061328855954495554d, (-0.31622776601683805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.061328855954495554d) + "'", double2 == (-0.061328855954495554d));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0536712127723509E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.037091348628667E-7d + "'", double1 == 6.037091348628667E-7d);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 35, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(19.949874371066198d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.974937185533099d + "'", double2 == 9.974937185533099d);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5988104444497883d + "'", double1 == 0.5988104444497883d);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2980742E33f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1024.0001f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(44.29429222643544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7730812391918281d + "'", double1 == 0.7730812391918281d);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        double double1 = org.apache.commons.math3.util.FastMath.log10(97.0463806640928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.986979343053352d + "'", double1 == 1.986979343053352d);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(19.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.466528223471357d + "'", double1 == 4.466528223471357d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(22026.474197238054d, (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4322216757321002d + "'", double2 == 1.4322216757321002d);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5997382704646929d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.844537546692157E-12d + "'", double2 == 2.844537546692157E-12d);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999877116507956d + "'", double1 == 0.9999877116507956d);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.103515628789562E-5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double double1 = org.apache.commons.math3.util.FastMath.log10(89.94410169625876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9539726886959428d + "'", double1 == 1.9539726886959428d);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.7615941309233423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999403953551d) + "'", double1 == (-0.9999999403953551d));
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6.1035156E-5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.704060527839234d) + "'", double1 == (-9.704060527839234d));
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.9982230451921064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768639379495386d + "'", double1 == 0.4768639379495386d);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0E200d, 9.974937185533099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4489023749402996d + "'", double2 == 1.4489023749402996d);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.011048543456039806d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3486991523486093E-6d + "'", double2 == 1.3486991523486093E-6d);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9070766022988521d, 749.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.885078775995249E-32d + "'", double2 == 1.885078775995249E-32d);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.782135461917777E-9d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-29) + "'", int1 == (-29));
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.6308050742098271d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1190346870425511E-15d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1190346870425511E-15d + "'", double2 == 1.1190346870425511E-15d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.4422495703074083d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4422495703074083d + "'", double2 == 1.4422495703074083d);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085536923187668d + "'", double1 == 20.085536923187668d);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.9512437185814275d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        int int2 = org.apache.commons.math3.util.FastMath.min((-14), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.2246467991473532E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5251711488118009d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(36.01102806275611d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.313219942645561d, 11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5628219188284785d + "'", double2 == 0.5628219188284785d);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6973483401028054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.433773393518789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5687609160957652d) + "'", double1 == (-0.5687609160957652d));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9358793340080341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8352990546308762d + "'", double1 == 0.8352990546308762d);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4E-45f, 4.30039148809513d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8E-45f + "'", float2 == 2.8E-45f);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.990081729765975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01728018604825701d + "'", double1 == 0.01728018604825701d);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(47.65470400249466d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6718308188647008E103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.671830818864701E103d + "'", double1 == 1.671830818864701E103d);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        long long1 = org.apache.commons.math3.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.17453294184418977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(3.7781512503836434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5640537039872793d + "'", double1 == 1.5640537039872793d);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8402864822065015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402864822065015d + "'", double1 == 1.8402864822065015d);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), (-14));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1035153E-5f) + "'", float2 == (-6.1035153E-5f));
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5574077246549025d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.918828546453101d + "'", double2 == 8.918828546453101d);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.018862593966410546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018864831372454823d + "'", double1 == 0.018864831372454823d);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.13158548711983195d, 155.74607629780772d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.44871722863096E-4d + "'", double2 == 8.44871722863096E-4d);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.5055429617727457E-10d, 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1626899390303921E-17d) + "'", double2 == (-1.1626899390303921E-17d));
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.0d), 0.352513421777619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0272356433182504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003709130606282d + "'", double1 == 1.0003709130606282d);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1017419656965828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8011238661903161d + "'", double1 == 0.8011238661903161d);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 5.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-6.1035153E-5f), 230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.25850929941265d + "'", double2 == 230.25850929941265d);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998140668686113d + "'", double1 == 0.9998140668686113d);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }
}

