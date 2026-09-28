package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.26548245743669d + "'", double2 == 49.26548245743669d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438016d) + "'", double1 == (-1.1752011936438016d));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 100.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282294E32d + "'", double2 == 1.2676506002282294E32d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) '#', (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 100, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(10.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 52, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10000 + "'", int2 == 10000);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (byte) 1, 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-10L), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 1, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double[] doubleArray6 = new double[] { '#', 0, 10.0d, (-10L), (byte) 100, 10 };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d, 10.0d, (-10.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-788546751) + "'", int7 == (-788546751));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 0.0f, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-788546751));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-788546751));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 1, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double[] doubleArray6 = new double[] { (byte) 10, 1L, (-10L), 1.0d, (short) 10, 10.0f };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, (-10.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-654427327) + "'", int7 == (-654427327));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-10.0f), (-1074790400), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1074790400), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790400) + "'", int2 == (-1074790400));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 10000, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((-10.0f), (int) (byte) 10, (-788546751));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '4', 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(10000);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 53L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1078624256 + "'", int1 == 1078624256);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        float float2 = org.apache.commons.math.util.MathUtils.round((-1.0f), (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-101), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 100.0f, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-101), 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1.0f), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2676506002282294E30d) + "'", double2 == (-1.2676506002282294E30d));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(Double.POSITIVE_INFINITY, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1074790400), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 10000, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-22));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        double double2 = org.apache.commons.math.util.MathUtils.round((-0.9999999999999999d), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-788546751), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-788546851L) + "'", long2 == (-788546851L));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1), 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-788546751), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((-1.0f), 1078624256, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) '#', (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1260L + "'", long2 == 1260L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1074790400), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        double[] doubleArray6 = new double[] { '#', 0, 10.0d, (-10L), (byte) 100, 10 };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray15 = new double[] { (byte) 10, 1L, (-10L), 1.0d, (short) 10, 10.0f };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray15);
        java.lang.Class<?> wildcardClass19 = doubleArray15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d, 10.0d, (-10.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-788546751) + "'", int7 == (-788546751));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-788546751) + "'", int8 == (-788546751));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0d, (-10.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-654427327) + "'", int16 == (-654427327));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-654427327) + "'", int17 == (-654427327));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0, (-788546751));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-788546751), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 10000, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9999.999999999998d + "'", double2 == 9999.999999999998d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) 0, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        double[] doubleArray6 = new double[] { '#', 0, 10.0d, (-10L), (byte) 100, 10 };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray15 = new double[] { (byte) 10, 1L, (-10L), 1.0d, (short) 10, 10.0f };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean18 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray15);
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d, 10.0d, (-10.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-788546751) + "'", int7 == (-788546751));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-788546751) + "'", int8 == (-788546751));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0d, (-10.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-654427327) + "'", int16 == (-654427327));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-654427327) + "'", int17 == (-654427327));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-788546751) + "'", int19 == (-788546751));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) -1, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(10.000000000000002d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.3608363030788d + "'", double1 == 156.3608363030788d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-101));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0L, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) '#', (long) (-22));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-770L) + "'", long2 == (-770L));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '4', 20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.1752011936438016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7737756783403533d + "'", double1 == 1.7737756783403533d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-788546851L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1346863138 + "'", int1 == 1346863138);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double[] doubleArray6 = new double[] { (byte) 10, 1L, (-10L), 1.0d, (short) 10, 10.0f };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, (-10.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-654427327) + "'", int7 == (-654427327));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-654427327) + "'", int8 == (-654427327));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-654427327) + "'", int9 == (-654427327));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1346863138, (double) (-1074790400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1346863138);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1260L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1163L + "'", long2 == 1163L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-22), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) 10, (-654427327));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-20), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1163L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 20, (-22));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 1260L, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1259.9999999999998d + "'", double2 == 1259.9999999999998d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1074790400), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32851362228393555d + "'", double2 == 0.32851362228393555d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        double double2 = org.apache.commons.math.util.MathUtils.round(9999.999999999998d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10000.0d + "'", double2 == 10000.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-788546751), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-788546731) + "'", int2 == (-788546731));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(2.2250738585072014E-308d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.225073858507202E-308d + "'", double2 == 2.225073858507202E-308d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) ' ', (-101));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 11L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 'a', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 970L + "'", long2 == 970L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 11L, (-20), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) -1, (-788546731));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-788546732) + "'", int2 == (-788546732));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1078624256, 10000);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 125880.54429808138d + "'", double2 == 125880.54429808138d);
    }
}

