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
        int[] intArray0 = null;
        int[] intArray6 = new int[] { (byte) 10, (byte) -1, (short) 100, (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, (-1), 100, 1, 0 });
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) '4', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42L + "'", long2 == 42L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1), (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.1f) + "'", float3 == (-1.1f));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        float float1 = org.apache.commons.math.util.MathUtils.sign((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 10.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        double double0 = org.apache.commons.math.util.MathUtils.SAFE_MIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.2250738585072014E-308d + "'", double0 == 2.2250738585072014E-308d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 0, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) -1, 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) -1, 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(99.99999999999999d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double[] doubleArray6 = new double[] { 10.0d, 10L, (byte) 100, 11013.232920103324d, ' ', 42L };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 100.0d, 11013.232920103324d, 32.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 100L, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(2, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1, 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 'a', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        double double0 = org.apache.commons.math.util.MathUtils.EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.1102230246251565E-16d + "'", double0 == 1.1102230246251565E-16d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, bigInteger3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000L + "'", long2 == 10000L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 100, (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double double3 = org.apache.commons.math.util.MathUtils.round(11013.232874703393d, 1000, 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11013.232874703393d + "'", double3 == 11013.232874703393d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        double[] doubleArray2 = new double[] { (-1.1f), 0.0f };
        double[] doubleArray4 = new double[] { 99.99999999999999d };
        double[] doubleArray6 = new double[] { 2.2250738585072014E-308d };
        double double7 = org.apache.commons.math.util.MathUtils.distance(doubleArray4, doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray2, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.100000023841858d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.99999999999999d + "'", double7 == 99.99999999999999d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(32, (int) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1000, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 315.28470261696987d + "'", double2 == 315.28470261696987d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(2.2250738585072014E-308d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8206162122887962E-278d + "'", double2 == 2.8206162122887962E-278d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean3 = false; // flaky "1) test060(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals((double) 0.0f, 100.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 10L, (double) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 100, (-22));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1L, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        java.lang.Class<?> wildcardClass18 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int[] intArray5 = new int[] { (-1), (byte) 0, '4', (short) 1, (short) 10 };
        int[] intArray6 = new int[] {};
        int[] intArray11 = new int[] { (short) 1, 100, ' ', 'a' };
        int int12 = org.apache.commons.math.util.MathUtils.distanceInf(intArray6, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.math.util.MathUtils.distance(intArray5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 0, 52, 1, 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) (-22));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double double0 = org.apache.commons.math.util.MathUtils.TWO_PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 6.283185307179586d + "'", double0 == 6.283185307179586d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        float float1 = org.apache.commons.math.util.MathUtils.sign(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        boolean boolean3 = false; // flaky "2) test086(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals(1.3440585709080487E43d, (double) 34L, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(99.99999999999999d, (double) (-1L), 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) ' ', 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88.54866776461628d + "'", double2 == 88.54866776461628d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double double2 = org.apache.commons.math.util.MathUtils.round(81.55795945611504d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 81.55795945611504d + "'", double2 == 81.55795945611504d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int1 = org.apache.commons.math.util.MathUtils.sign(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        boolean boolean3 = false; // flaky "3) test093(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals((double) 42L, (double) 100L, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) -1, (-22));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(129.57623238850556d, (int) (byte) 0, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-8814407033341083648L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083649L) + "'", long2 == (-8814407033341083649L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray16 = new int[] { (short) 1, 100, ' ', 'a' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) -1, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        float float1 = org.apache.commons.math.util.MathUtils.sign((-1.1f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(3.948148009134034E13d, (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(81.55795945611504d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12344953721958518d) + "'", double2 == (-0.12344953721958518d));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) (-22));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22L) + "'", long2 == (-22L));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = org.apache.commons.math.util.MathUtils.distance(intArray16, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10L, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075516d + "'", double1 == 15.104412573075516d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 42L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43008.0d + "'", double2 == 43008.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) '#', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2952797043614583d + "'", double2 == 1.2952797043614583d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10240.0d + "'", double2 == 10240.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        long long2 = org.apache.commons.math.util.MathUtils.pow(0L, 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(1.3440585709080487E43d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080485E43d + "'", double2 == 1.3440585709080485E43d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (byte) 0, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (byte) 100, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(32, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 496.0d + "'", double2 == 496.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double[] doubleArray5 = new double[] { (-1), (-1.1f), (-1.1f), '4', (-22) };
        double[] doubleArray7 = new double[] { 99.99999999999999d };
        double[] doubleArray9 = new double[] { 2.2250738585072014E-308d };
        double double10 = org.apache.commons.math.util.MathUtils.distance(doubleArray7, doubleArray9);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray14);
        double[] doubleArray18 = new double[] { 1.0d };
        double[] doubleArray20 = new double[] { 99.99999999999999d };
        double[] doubleArray22 = new double[] { 2.2250738585072014E-308d };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray20, doubleArray22);
        double[] doubleArray25 = new double[] { 99.99999999999999d };
        double[] doubleArray27 = new double[] { 2.2250738585072014E-308d };
        double double28 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray27);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray27);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray18, doubleArray27);
        boolean boolean31 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray18);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double34 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.100000023841858d), (-1.100000023841858d), 52.0d, (-22.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.99999999999999d + "'", double10 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.99999999999999d + "'", double23 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.99999999999999d + "'", double28 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(315.28470261696987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2206231761532727E136d + "'", double1 == 4.2206231761532727E136d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (-22), 15.104412573075516d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(10240.0d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.398046511104E13d + "'", double2 == 4.398046511104E13d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int1 = org.apache.commons.math.util.MathUtils.hash(2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(4.398046511104E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(96, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        boolean boolean3 = false; // flaky "4) test144(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals((double) 32, (double) 2, (-4));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2576469727536E13d + "'", double2 == 1.2576469727536E13d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438016d) + "'", double1 == (-1.1752011936438016d));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        long long2 = org.apache.commons.math.util.MathUtils.pow(100L, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(100.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-22), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-9), (-22));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31) + "'", int2 == (-31));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int int2 = org.apache.commons.math.util.MathUtils.pow(32, 1048576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        float float1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(3.948148009134034E13d, (-4), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 96);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3200 + "'", int2 == 3200);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(9700, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) '4', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1048576, 3200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-31));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.0f, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 1, (long) (-1079574497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079574498L + "'", long2 == 1079574498L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(4.2206231761532727E136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-1.1f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.100000023841858d) + "'", double2 == (-1.100000023841858d));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1048607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) -1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98L) + "'", long2 == (-98L));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        int[] intArray33 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray38 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double39 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray33);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray33);
        int[] intArray42 = new int[] {};
        int[] intArray47 = new int[] { (short) 1, 100, ' ', 'a' };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray47);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 129.57623238850556d + "'", double39 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] {});
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.55795945611504d + "'", double1 == 81.55795945611504d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-0.12344953721958518d), 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        int int1 = org.apache.commons.math.util.MathUtils.sign(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        int[] intArray33 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray38 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double39 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray33);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray33);
        int[] intArray46 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray51 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double52 = org.apache.commons.math.util.MathUtils.distance(intArray46, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray33, intArray51);
        int[] intArray54 = new int[] {};
        int[] intArray59 = new int[] { (short) 1, 100, ' ', 'a' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray59);
        int int61 = org.apache.commons.math.util.MathUtils.distance1(intArray33, intArray59);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 129.57623238850556d + "'", double39 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 129.57623238850556d + "'", double52 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 96 + "'", int53 == 96);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] {});
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 358 + "'", int61 == 358);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-9), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 900 + "'", int2 == 900);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 9700);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-1.1f), 358, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 2, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-8814407033341083649L), (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(900);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1048607);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 900, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1408855402054065E33d + "'", double2 == 1.1408855402054065E33d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (-22));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int int2 = org.apache.commons.math.util.MathUtils.pow(900, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 3200, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3201L + "'", long2 == 3201L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.1752011936438016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7737756783403533d + "'", double1 == 1.7737756783403533d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        int[] intArray33 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray38 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double39 = org.apache.commons.math.util.MathUtils.distance(intArray33, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray33);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray33);
        int[] intArray42 = new int[] {};
        int[] intArray47 = new int[] { (short) 1, 100, ' ', 'a' };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray42, intArray47);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.math.util.MathUtils.distance1(intArray33, intArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 129.57623238850556d + "'", double39 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] {});
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 9700, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(3201L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, (-31));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 96, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) (-22L), 96, (int) (byte) 1);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079525376 + "'", int1 == 1079525376);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(3200, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3210 + "'", int2 == 3210);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray12 = new int[] { (short) 1, 100, ' ', 'a' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray7, intArray12);
        int[] intArray18 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray23 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray18, intArray23);
        int[] intArray30 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double31 = org.apache.commons.math.util.MathUtils.distance(intArray18, intArray30);
        int int32 = org.apache.commons.math.util.MathUtils.distanceInf(intArray7, intArray18);
        int[] intArray37 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray42 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double43 = org.apache.commons.math.util.MathUtils.distance(intArray37, intArray42);
        int[] intArray49 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double50 = org.apache.commons.math.util.MathUtils.distance(intArray37, intArray49);
        int[] intArray55 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray60 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double61 = org.apache.commons.math.util.MathUtils.distance(intArray55, intArray60);
        int[] intArray66 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray71 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double72 = org.apache.commons.math.util.MathUtils.distance(intArray66, intArray71);
        int int73 = org.apache.commons.math.util.MathUtils.distanceInf(intArray55, intArray66);
        int int74 = org.apache.commons.math.util.MathUtils.distanceInf(intArray37, intArray66);
        int[] intArray79 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray84 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double85 = org.apache.commons.math.util.MathUtils.distance(intArray79, intArray84);
        int int86 = org.apache.commons.math.util.MathUtils.distanceInf(intArray66, intArray84);
        int int87 = org.apache.commons.math.util.MathUtils.distanceInf(intArray18, intArray84);
        int int88 = org.apache.commons.math.util.MathUtils.distance1(intArray0, intArray18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 129.57623238850556d + "'", double24 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 87.51571287488893d + "'", double31 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 129.57623238850556d + "'", double43 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 87.51571287488893d + "'", double50 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 129.57623238850556d + "'", double61 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 129.57623238850556d + "'", double72 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 129.57623238850556d + "'", double85 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 96 + "'", int86 == 96);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 96 + "'", int87 == 96);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        double double3 = org.apache.commons.math.util.MathUtils.round(11013.232920103324d, (-22), 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E22d + "'", double3 == 1.0E22d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-9), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6627890308811632801L + "'", long2 == 6627890308811632801L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((-1.100000023841858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(97, 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 310400 + "'", int2 == 310400);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1079574498L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 1000, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1000.0f + "'", float3 == 1000.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1048607, (-1079574497));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 10000L, 1.1102230246251565E-16d, 4.2206231761532727E136d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 3201L, 1079525376);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3201.0d + "'", double2 == 3201.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1000, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1079574498L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 99.99999999999999d };
        double[] doubleArray4 = new double[] { 2.2250738585072014E-308d };
        double double5 = org.apache.commons.math.util.MathUtils.distance(doubleArray2, doubleArray4);
        double[] doubleArray7 = new double[] { 99.99999999999999d };
        double[] doubleArray9 = new double[] { 2.2250738585072014E-308d };
        double double10 = org.apache.commons.math.util.MathUtils.distance(doubleArray7, doubleArray9);
        boolean boolean11 = org.apache.commons.math.util.MathUtils.equals(doubleArray2, doubleArray9);
        double[] doubleArray13 = new double[] { 1.0d };
        double[] doubleArray15 = new double[] { 99.99999999999999d };
        double[] doubleArray17 = new double[] { 2.2250738585072014E-308d };
        double double18 = org.apache.commons.math.util.MathUtils.distance(doubleArray15, doubleArray17);
        double[] doubleArray20 = new double[] { 99.99999999999999d };
        double[] doubleArray22 = new double[] { 2.2250738585072014E-308d };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray15, doubleArray22);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray22);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray9, doubleArray13);
        double[] doubleArray28 = new double[] { 99.99999999999999d };
        double[] doubleArray30 = new double[] { 2.2250738585072014E-308d };
        double double31 = org.apache.commons.math.util.MathUtils.distance(doubleArray28, doubleArray30);
        double[] doubleArray33 = new double[] { 99.99999999999999d };
        double[] doubleArray35 = new double[] { 2.2250738585072014E-308d };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray33, doubleArray35);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray35);
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) 10.0f);
        int int40 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray42 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, 1.543080634815244d);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = org.apache.commons.math.util.MathUtils.distance1(doubleArray0, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.99999999999999d + "'", double5 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.99999999999999d + "'", double10 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 99.99999999999999d + "'", double18 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.99999999999999d + "'", double23 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.99999999999999d + "'", double36 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1079574497) + "'", int40 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.5430806348152442d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-4), 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray16 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray16);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 87.51571287488893d + "'", double17 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(6627890308811632801L, (-8814407033341083649L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: subtract");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(15.104412573075516d, 1000, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(88.54866776461628d, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray11 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray16 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray16);
        int[] intArray23 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray11);
        int[] intArray30 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray35);
        int[] intArray41 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray46 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double47 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray41);
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray30);
        int[] intArray54 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray59 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double60 = org.apache.commons.math.util.MathUtils.distance(intArray54, intArray59);
        int[] intArray66 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double67 = org.apache.commons.math.util.MathUtils.distance(intArray54, intArray66);
        int[] intArray72 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray77 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double78 = org.apache.commons.math.util.MathUtils.distance(intArray72, intArray77);
        int[] intArray83 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray88 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double89 = org.apache.commons.math.util.MathUtils.distance(intArray83, intArray88);
        int int90 = org.apache.commons.math.util.MathUtils.distanceInf(intArray72, intArray83);
        int int91 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray83);
        double double92 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray54);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 129.57623238850556d + "'", double17 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.51571287488893d + "'", double24 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 129.57623238850556d + "'", double36 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 129.57623238850556d + "'", double47 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 129.57623238850556d + "'", double60 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 87.51571287488893d + "'", double67 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 129.57623238850556d + "'", double78 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 129.57623238850556d + "'", double89 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-31), 2.0000000000000004d, (double) 310400);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-22L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 3201L, (int) (short) 100);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.1102230246251565E-16d, (double) 9, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 3210);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-22), 903);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-9));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-9));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1048576, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-9), 1048607);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1048598 + "'", int2 == 1048598);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(903, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 1, (-22));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1079525376);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1079525376, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079525340L + "'", long2 == 1079525340L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 3200, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1048607 + "'", int11 == 1048607);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, (long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray16 = new int[] { (short) 1, 100, ' ', 'a' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(2.0000000000000004d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(3210, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51360 + "'", int2 == 51360);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-22), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-22.0d) + "'", double2 == (-22.0d));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(2, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray15 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray20 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double21 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray20);
        int int22 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray15);
        int[] intArray27 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray32 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double33 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray32);
        double double34 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray40 = new int[] { (short) 1, 100, ' ', 'a' };
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray35, intArray40);
        int int42 = org.apache.commons.math.util.MathUtils.distance1(intArray15, intArray40);
        int[] intArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.math.util.MathUtils.distanceInf(intArray40, intArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 129.57623238850556d + "'", double21 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 129.57623238850556d + "'", double33 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 129.57623238850556d + "'", double34 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 358 + "'", int42 == 358);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 97, (long) (-1079574497));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-104718726209L) + "'", long2 == (-104718726209L));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) 100, 1048576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) '4', (double) 2, 1.543080634815244d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4051.54190208279d + "'", double1 == 4051.54190208279d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 100.0f, 2.2250738585072014E-308d, (double) (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 9);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) 1, (-9));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) Float.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double[] doubleArray32 = new double[] { 99.99999999999999d };
        double[] doubleArray34 = new double[] { 2.2250738585072014E-308d };
        double double35 = org.apache.commons.math.util.MathUtils.distance(doubleArray32, doubleArray34);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray34);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray27, (double) 10.0f);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        double[] doubleArray45 = new double[] { 99.99999999999999d };
        double[] doubleArray47 = new double[] { 2.2250738585072014E-308d };
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray45, doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        double[] doubleArray51 = new double[] { 1.0d };
        double[] doubleArray53 = new double[] { 99.99999999999999d };
        double[] doubleArray55 = new double[] { 2.2250738585072014E-308d };
        double double56 = org.apache.commons.math.util.MathUtils.distance(doubleArray53, doubleArray55);
        double[] doubleArray58 = new double[] { 99.99999999999999d };
        double[] doubleArray60 = new double[] { 2.2250738585072014E-308d };
        double double61 = org.apache.commons.math.util.MathUtils.distance(doubleArray58, doubleArray60);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equals(doubleArray53, doubleArray60);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equals(doubleArray51, doubleArray60);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray51);
        double[] doubleArray66 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray51, 0.0d);
        double double67 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray51);
        double double68 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 99.99999999999999d + "'", double35 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.99999999999999d + "'", double48 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 99.99999999999999d + "'", double56 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 99.99999999999999d + "'", double61 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 98.99999999999999d + "'", double67 == 98.99999999999999d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 99.99999999999999d + "'", double68 == 99.99999999999999d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = null;
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger8);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger8);
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger16);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 3210);
        java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 0L);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-4), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0d) + "'", double2 == (-4.0d));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1079574497));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int2 = org.apache.commons.math.util.MathUtils.pow(310400, 3210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double[] doubleArray23 = new double[] { 1.0d };
        double[] doubleArray25 = new double[] { 99.99999999999999d };
        double[] doubleArray27 = new double[] { 2.2250738585072014E-308d };
        double double28 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray27);
        double[] doubleArray30 = new double[] { 99.99999999999999d };
        double[] doubleArray32 = new double[] { 2.2250738585072014E-308d };
        double double33 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray32);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray32);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray32);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray23);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, 0.0d);
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray38);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) 3200);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double[] doubleArray44 = new double[] { 99.99999999999999d };
        double[] doubleArray46 = new double[] { 2.2250738585072014E-308d };
        double double47 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray46);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        double[] doubleArray55 = new double[] { 99.99999999999999d };
        double[] doubleArray57 = new double[] { 2.2250738585072014E-308d };
        double double58 = org.apache.commons.math.util.MathUtils.distance(doubleArray55, doubleArray57);
        double[] doubleArray60 = new double[] { 99.99999999999999d };
        double[] doubleArray62 = new double[] { 2.2250738585072014E-308d };
        double double63 = org.apache.commons.math.util.MathUtils.distance(doubleArray60, doubleArray62);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray62);
        double[] doubleArray66 = new double[] { 1.0d };
        double[] doubleArray68 = new double[] { 99.99999999999999d };
        double[] doubleArray70 = new double[] { 2.2250738585072014E-308d };
        double double71 = org.apache.commons.math.util.MathUtils.distance(doubleArray68, doubleArray70);
        double[] doubleArray73 = new double[] { 99.99999999999999d };
        double[] doubleArray75 = new double[] { 2.2250738585072014E-308d };
        double double76 = org.apache.commons.math.util.MathUtils.distance(doubleArray73, doubleArray75);
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equals(doubleArray68, doubleArray75);
        boolean boolean78 = org.apache.commons.math.util.MathUtils.equals(doubleArray66, doubleArray75);
        boolean boolean79 = org.apache.commons.math.util.MathUtils.equals(doubleArray62, doubleArray66);
        double[] doubleArray81 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray66, 0.0d);
        double double82 = org.apache.commons.math.util.MathUtils.distance(doubleArray51, doubleArray81);
        double[] doubleArray84 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray51, (double) 3200);
        int int85 = org.apache.commons.math.util.MathUtils.hash(doubleArray51);
        double double86 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray51);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.99999999999999d + "'", double28 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.99999999999999d + "'", double33 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 3200.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1048607 + "'", int42 == 1048607);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.99999999999999d + "'", double47 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 99.99999999999999d + "'", double58 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 99.99999999999999d + "'", double63 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 99.99999999999999d + "'", double71 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 99.99999999999999d + "'", double76 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 3200.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1048607 + "'", int85 == 1048607);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(3201L, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3205L + "'", long2 == 3205L);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(358);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray15 = new double[] { 99.99999999999999d };
        double[] doubleArray17 = new double[] { 2.2250738585072014E-308d };
        double double18 = org.apache.commons.math.util.MathUtils.distance(doubleArray15, doubleArray17);
        double[] doubleArray20 = new double[] { 99.99999999999999d };
        double[] doubleArray22 = new double[] { 2.2250738585072014E-308d };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray15, doubleArray22);
        double[] doubleArray26 = new double[] { 1.0d };
        double[] doubleArray28 = new double[] { 99.99999999999999d };
        double[] doubleArray30 = new double[] { 2.2250738585072014E-308d };
        double double31 = org.apache.commons.math.util.MathUtils.distance(doubleArray28, doubleArray30);
        double[] doubleArray33 = new double[] { 99.99999999999999d };
        double[] doubleArray35 = new double[] { 2.2250738585072014E-308d };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray33, doubleArray35);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray35);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray35);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, 0.0d);
        double double42 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray26);
        double[] doubleArray44 = new double[] { 99.99999999999999d };
        double[] doubleArray46 = new double[] { 2.2250738585072014E-308d };
        double double47 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray46);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        double[] doubleArray55 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray44, (double) 10.0f);
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        double[] doubleArray62 = new double[] { 99.99999999999999d };
        double[] doubleArray64 = new double[] { 2.2250738585072014E-308d };
        double double65 = org.apache.commons.math.util.MathUtils.distance(doubleArray62, doubleArray64);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray57, doubleArray64);
        double[] doubleArray68 = new double[] { 1.0d };
        double[] doubleArray70 = new double[] { 99.99999999999999d };
        double[] doubleArray72 = new double[] { 2.2250738585072014E-308d };
        double double73 = org.apache.commons.math.util.MathUtils.distance(doubleArray70, doubleArray72);
        double[] doubleArray75 = new double[] { 99.99999999999999d };
        double[] doubleArray77 = new double[] { 2.2250738585072014E-308d };
        double double78 = org.apache.commons.math.util.MathUtils.distance(doubleArray75, doubleArray77);
        boolean boolean79 = org.apache.commons.math.util.MathUtils.equals(doubleArray70, doubleArray77);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray68, doubleArray77);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equals(doubleArray64, doubleArray68);
        double[] doubleArray83 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray68, 0.0d);
        double double84 = org.apache.commons.math.util.MathUtils.distance1(doubleArray44, doubleArray68);
        double double85 = org.apache.commons.math.util.MathUtils.distance(doubleArray26, doubleArray44);
        double[] doubleArray87 = new double[] { 99.99999999999999d };
        double[] doubleArray89 = new double[] { 2.2250738585072014E-308d };
        double double90 = org.apache.commons.math.util.MathUtils.distance(doubleArray87, doubleArray89);
        double[] doubleArray92 = new double[] { 99.99999999999999d };
        double[] doubleArray94 = new double[] { 2.2250738585072014E-308d };
        double double95 = org.apache.commons.math.util.MathUtils.distance(doubleArray92, doubleArray94);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray87, doubleArray94);
        double[] doubleArray98 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray87, (double) 10.0f);
        double double99 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray98);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1079574497) + "'", int13 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 99.99999999999999d + "'", double18 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.99999999999999d + "'", double23 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.99999999999999d + "'", double36 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 98.99999999999999d + "'", double42 == 98.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.99999999999999d + "'", double47 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 99.99999999999999d + "'", double65 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 99.99999999999999d + "'", double73 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 99.99999999999999d + "'", double78 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 98.99999999999999d + "'", double84 == 98.99999999999999d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 98.99999999999999d + "'", double85 == 98.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 99.99999999999999d + "'", double90 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 99.99999999999999d + "'", double95 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertArrayEquals(doubleArray98, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 9.0d + "'", double99 == 9.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(51360, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray11 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray16 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray16);
        int[] intArray23 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray11);
        int[] intArray30 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray35);
        int[] intArray41 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray46 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double47 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray41);
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray30);
        int[] intArray54 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray59 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double60 = org.apache.commons.math.util.MathUtils.distance(intArray54, intArray59);
        int[] intArray65 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray70 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double71 = org.apache.commons.math.util.MathUtils.distance(intArray65, intArray70);
        int int72 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray65);
        int int73 = org.apache.commons.math.util.MathUtils.distance1(intArray11, intArray65);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 129.57623238850556d + "'", double17 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.51571287488893d + "'", double24 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 129.57623238850556d + "'", double36 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 129.57623238850556d + "'", double47 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 129.57623238850556d + "'", double60 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 129.57623238850556d + "'", double71 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 32, (-4), (int) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean3 = false; // flaky "5) test302(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals(1.7737756783403533d, 1.3440585709080678E43d, (-1079574497));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(2, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-104718726209L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 913924536 + "'", int1 == 913924536);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 34L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(1.1408855402054065E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-9), 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-864) + "'", int2 == (-864));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.1102230246251565E-16d, 496.0d, 1000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-864), 310400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-268185600) + "'", int2 == (-268185600));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-268185600));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 51360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51360) + "'", int2 == (-51360));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 3201L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(3201L, (long) 903);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4104L + "'", long2 == 4104L);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-104718726209L), (double) 358);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, 0.0d);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        double[] doubleArray34 = new double[] { 99.99999999999999d };
        double[] doubleArray36 = new double[] { 2.2250738585072014E-308d };
        double double37 = org.apache.commons.math.util.MathUtils.distance(doubleArray34, doubleArray36);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray36);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        double[] doubleArray45 = new double[] { 99.99999999999999d };
        double[] doubleArray47 = new double[] { 2.2250738585072014E-308d };
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray45, doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        double double50 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray40);
        double[] doubleArray52 = new double[] { 99.99999999999999d };
        double[] doubleArray54 = new double[] { 2.2250738585072014E-308d };
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray54);
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray59);
        double double62 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray59);
        double[] doubleArray64 = new double[] { 99.99999999999999d };
        double[] doubleArray66 = new double[] { 2.2250738585072014E-308d };
        double double67 = org.apache.commons.math.util.MathUtils.distance(doubleArray64, doubleArray66);
        double[] doubleArray69 = new double[] { 99.99999999999999d };
        double[] doubleArray71 = new double[] { 2.2250738585072014E-308d };
        double double72 = org.apache.commons.math.util.MathUtils.distance(doubleArray69, doubleArray71);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray64, doubleArray71);
        double[] doubleArray75 = new double[] { 1.0d };
        double[] doubleArray77 = new double[] { 99.99999999999999d };
        double[] doubleArray79 = new double[] { 2.2250738585072014E-308d };
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray77, doubleArray79);
        double[] doubleArray82 = new double[] { 99.99999999999999d };
        double[] doubleArray84 = new double[] { 2.2250738585072014E-308d };
        double double85 = org.apache.commons.math.util.MathUtils.distance(doubleArray82, doubleArray84);
        boolean boolean86 = org.apache.commons.math.util.MathUtils.equals(doubleArray77, doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray75, doubleArray84);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray71, doubleArray75);
        double[] doubleArray90 = new double[] { 99.99999999999999d };
        double[] doubleArray92 = new double[] { 2.2250738585072014E-308d };
        double double93 = org.apache.commons.math.util.MathUtils.distance(doubleArray90, doubleArray92);
        double double94 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray71, doubleArray90);
        double double95 = org.apache.commons.math.util.MathUtils.distance(doubleArray59, doubleArray71);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray71);
        double[] doubleArray97 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double98 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray12, doubleArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 99.99999999999999d + "'", double37 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.99999999999999d + "'", double48 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.99999999999999d + "'", double50 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 99.99999999999999d + "'", double55 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 99.99999999999999d + "'", double67 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 99.99999999999999d + "'", double72 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 99.99999999999999d + "'", double80 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 99.99999999999999d + "'", double85 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 99.99999999999999d + "'", double93 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 99.99999999999999d + "'", double94 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { 99.99999999999999d };
        double[] doubleArray5 = new double[] { 2.2250738585072014E-308d };
        double double6 = org.apache.commons.math.util.MathUtils.distance(doubleArray3, doubleArray5);
        double[] doubleArray8 = new double[] { 99.99999999999999d };
        double[] doubleArray10 = new double[] { 2.2250738585072014E-308d };
        double double11 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equals(doubleArray3, doubleArray10);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray10);
        double[] doubleArray15 = new double[] { 99.99999999999999d };
        double[] doubleArray17 = new double[] { 2.2250738585072014E-308d };
        double double18 = org.apache.commons.math.util.MathUtils.distance(doubleArray15, doubleArray17);
        double[] doubleArray20 = new double[] { 99.99999999999999d };
        double[] doubleArray22 = new double[] { 2.2250738585072014E-308d };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray15, doubleArray22);
        double[] doubleArray26 = new double[] { 1.0d };
        double[] doubleArray28 = new double[] { 99.99999999999999d };
        double[] doubleArray30 = new double[] { 2.2250738585072014E-308d };
        double double31 = org.apache.commons.math.util.MathUtils.distance(doubleArray28, doubleArray30);
        double[] doubleArray33 = new double[] { 99.99999999999999d };
        double[] doubleArray35 = new double[] { 2.2250738585072014E-308d };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray33, doubleArray35);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray35);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray35);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray41 = new double[] { 99.99999999999999d };
        double[] doubleArray43 = new double[] { 2.2250738585072014E-308d };
        double double44 = org.apache.commons.math.util.MathUtils.distance(doubleArray41, doubleArray43);
        double[] doubleArray46 = new double[] { 99.99999999999999d };
        double[] doubleArray48 = new double[] { 2.2250738585072014E-308d };
        double double49 = org.apache.commons.math.util.MathUtils.distance(doubleArray46, doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray41, doubleArray48);
        double[] doubleArray52 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray41, (double) 10.0f);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        double[] doubleArray55 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray41, 1.543080634815244d);
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray55);
        double double57 = org.apache.commons.math.util.MathUtils.distance(doubleArray10, doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.99999999999999d + "'", double6 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 99.99999999999999d + "'", double11 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 99.99999999999999d + "'", double18 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.99999999999999d + "'", double23 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.99999999999999d + "'", double36 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 99.99999999999999d + "'", double44 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 99.99999999999999d + "'", double49 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1079574497) + "'", int53 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.5430806348152442d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.5430806348152442d + "'", double57 == 1.5430806348152442d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-51360), (int) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray27);
        int int32 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1079574497) + "'", int32 == (-1079574497));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1048576);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1000, 900);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.385051192630519E139d + "'", double2 == 6.385051192630519E139d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int int1 = org.apache.commons.math.util.MathUtils.hash(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146435072 + "'", int1 == 2146435072);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 6627890308811632801L, (-1079574497));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.5430806348152442d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5430806348152442d + "'", double2 == 1.5430806348152442d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 100L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray16 = new double[] { 99.99999999999999d };
        double[] doubleArray18 = new double[] { 2.2250738585072014E-308d };
        double double19 = org.apache.commons.math.util.MathUtils.distance(doubleArray16, doubleArray18);
        double[] doubleArray21 = new double[] { 99.99999999999999d };
        double[] doubleArray23 = new double[] { 2.2250738585072014E-308d };
        double double24 = org.apache.commons.math.util.MathUtils.distance(doubleArray21, doubleArray23);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray16, doubleArray23);
        double[] doubleArray27 = new double[] { 1.0d };
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        double[] doubleArray34 = new double[] { 99.99999999999999d };
        double[] doubleArray36 = new double[] { 2.2250738585072014E-308d };
        double double37 = org.apache.commons.math.util.MathUtils.distance(doubleArray34, doubleArray36);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray36);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray36);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray27);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double double42 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1079574497) + "'", int13 == (-1079574497));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1079574497) + "'", int14 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 99.99999999999999d + "'", double19 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 99.99999999999999d + "'", double24 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 99.99999999999999d + "'", double37 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1048607 + "'", int41 == 1048607);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 99.99999999999999d + "'", double42 == 99.99999999999999d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray15 = new double[] { 99.99999999999999d };
        double[] doubleArray17 = new double[] { 2.2250738585072014E-308d };
        double double18 = org.apache.commons.math.util.MathUtils.distance(doubleArray15, doubleArray17);
        double[] doubleArray20 = new double[] { 99.99999999999999d };
        double[] doubleArray22 = new double[] { 2.2250738585072014E-308d };
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray20, doubleArray22);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray15, doubleArray22);
        double[] doubleArray26 = new double[] { 1.0d };
        double[] doubleArray28 = new double[] { 99.99999999999999d };
        double[] doubleArray30 = new double[] { 2.2250738585072014E-308d };
        double double31 = org.apache.commons.math.util.MathUtils.distance(doubleArray28, doubleArray30);
        double[] doubleArray33 = new double[] { 99.99999999999999d };
        double[] doubleArray35 = new double[] { 2.2250738585072014E-308d };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray33, doubleArray35);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray35);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray26, doubleArray35);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray22, doubleArray26);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, 0.0d);
        double double42 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray26);
        double[] doubleArray44 = new double[] { 99.99999999999999d };
        double[] doubleArray46 = new double[] { 2.2250738585072014E-308d };
        double double47 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray46);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        double[] doubleArray55 = new double[] { 99.99999999999999d };
        double[] doubleArray57 = new double[] { 2.2250738585072014E-308d };
        double double58 = org.apache.commons.math.util.MathUtils.distance(doubleArray55, doubleArray57);
        double[] doubleArray60 = new double[] { 99.99999999999999d };
        double[] doubleArray62 = new double[] { 2.2250738585072014E-308d };
        double double63 = org.apache.commons.math.util.MathUtils.distance(doubleArray60, doubleArray62);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray62);
        double double65 = org.apache.commons.math.util.MathUtils.distance1(doubleArray51, doubleArray55);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray55);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 315.28470261696987d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1079574497) + "'", int13 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 99.99999999999999d + "'", double18 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.99999999999999d + "'", double23 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.99999999999999d + "'", double36 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 98.99999999999999d + "'", double42 == 98.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.99999999999999d + "'", double47 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 99.99999999999999d + "'", double58 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 99.99999999999999d + "'", double63 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 99.99999999999999d + "'", double65 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 315.28470261696987d }, 1.0E-15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1000, 1048607);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) '4', 98.99999999999999d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 0, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 94.24777960769379d + "'", double2 == 94.24777960769379d);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) 1, (long) 1048598);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 2, (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (byte) 0, 913924536);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 3200);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 2146435072, (long) 110);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2146434962L + "'", long2 == 2146434962L);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1.0f, (double) 34L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-22L), (int) '4', 9700);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 2146435072, (-104718726209L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106865161281L + "'", long2 == 106865161281L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(110, 1048598);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 0, 106865161281L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 2146434962L, 110);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7862318775604805E42d + "'", double2 == 2.7862318775604805E42d);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 100, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 3205L, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3205.0d + "'", double2 == 3205.0d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-4), 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int1 = org.apache.commons.math.util.MathUtils.hash(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1911350513) + "'", int1 == (-1911350513));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-51360), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5136000) + "'", int2 == (-5136000));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(3210, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 65.62181704668616d + "'", double2 == 65.62181704668616d);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger9);
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger15, (long) 0);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, bigInteger20);
        java.math.BigInteger bigInteger22 = null;
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger22, (long) 0);
        java.math.BigInteger bigInteger25 = null;
        java.math.BigInteger bigInteger27 = org.apache.commons.math.util.MathUtils.pow(bigInteger25, (long) 0);
        java.math.BigInteger bigInteger28 = org.apache.commons.math.util.MathUtils.pow(bigInteger24, bigInteger27);
        java.math.BigInteger bigInteger29 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, bigInteger24);
        java.math.BigInteger bigInteger31 = org.apache.commons.math.util.MathUtils.pow(bigInteger24, 9700);
        java.math.BigInteger bigInteger32 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger24);
        java.math.BigInteger bigInteger34 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger34);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray12);
        double[] doubleArray24 = new double[] { 99.99999999999999d };
        double[] doubleArray26 = new double[] { 2.2250738585072014E-308d };
        double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray24, doubleArray26);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray31);
        double[] doubleArray36 = new double[] { 99.99999999999999d };
        double[] doubleArray38 = new double[] { 2.2250738585072014E-308d };
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray36, doubleArray38);
        double[] doubleArray41 = new double[] { 99.99999999999999d };
        double[] doubleArray43 = new double[] { 2.2250738585072014E-308d };
        double double44 = org.apache.commons.math.util.MathUtils.distance(doubleArray41, doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray36, doubleArray43);
        double[] doubleArray47 = new double[] { 1.0d };
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        double[] doubleArray54 = new double[] { 99.99999999999999d };
        double[] doubleArray56 = new double[] { 2.2250738585072014E-308d };
        double double57 = org.apache.commons.math.util.MathUtils.distance(doubleArray54, doubleArray56);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equals(doubleArray49, doubleArray56);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray56);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equals(doubleArray43, doubleArray47);
        double[] doubleArray62 = new double[] { 99.99999999999999d };
        double[] doubleArray64 = new double[] { 2.2250738585072014E-308d };
        double double65 = org.apache.commons.math.util.MathUtils.distance(doubleArray62, doubleArray64);
        double double66 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray43, doubleArray62);
        double double67 = org.apache.commons.math.util.MathUtils.distance(doubleArray31, doubleArray43);
        int int68 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 99.99999999999999d + "'", double27 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 99.99999999999999d + "'", double39 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 99.99999999999999d + "'", double44 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 99.99999999999999d + "'", double57 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 99.99999999999999d + "'", double65 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 99.99999999999999d + "'", double66 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1048607 + "'", int68 == 1048607);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(0L, (-5136000));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1072693279, 110);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3924354856807808E42d + "'", double2 == 1.3924354856807808E42d);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int2 = org.apache.commons.math.util.MathUtils.pow(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.1102230246251565E-16d, (double) (-864));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int int2 = org.apache.commons.math.util.MathUtils.pow(96, 913924536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) 0, (-1911350513), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1079574498L, 358);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079574498E9d + "'", double2 == 1.079574498E9d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray16 = new int[] { (short) 1, 100, ' ', 'a' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray16);
        int[] intArray22 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray27 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double28 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray27);
        int[] intArray34 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double35 = org.apache.commons.math.util.MathUtils.distance(intArray22, intArray34);
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 129.57623238850556d + "'", double28 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 87.51571287488893d + "'", double35 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        double double2 = org.apache.commons.math.util.MathUtils.round(Double.NEGATIVE_INFINITY, 1048576);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 2146435072);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger9);
        java.lang.Class<?> wildcardClass15 = bigInteger9.getClass();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(9700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 100, (double) 97.0f, (double) 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(106865161281L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106865161381L + "'", long2 == 106865161381L);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray11 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray16 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray16);
        int[] intArray23 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray11);
        int[] intArray30 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray35);
        int[] intArray41 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray46 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double47 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray41);
        int[] intArray53 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray58 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double59 = org.apache.commons.math.util.MathUtils.distance(intArray53, intArray58);
        double double60 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray58);
        double double61 = org.apache.commons.math.util.MathUtils.distance(intArray0, intArray41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 129.57623238850556d + "'", double17 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.51571287488893d + "'", double24 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 129.57623238850556d + "'", double36 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 129.57623238850556d + "'", double47 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 129.57623238850556d + "'", double59 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 129.57623238850556d + "'", double60 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-9), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        double double2 = org.apache.commons.math.util.MathUtils.log(10240.0d, (double) 10000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9974316243794288d + "'", double2 == 0.9974316243794288d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(1000, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97000 + "'", int2 == 97000);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 903, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.75228068101296d + "'", double2 == 98.75228068101296d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(3210);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((-1.1752011936438016d), (double) (-4), 3205.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 1048607);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray15 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray20 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double21 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray20);
        int int22 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray15);
        int[] intArray27 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray32 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double33 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray32);
        double double34 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray40 = new int[] { (short) 1, 100, ' ', 'a' };
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray35, intArray40);
        int[] intArray46 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray51 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double52 = org.apache.commons.math.util.MathUtils.distance(intArray46, intArray51);
        int[] intArray58 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double59 = org.apache.commons.math.util.MathUtils.distance(intArray46, intArray58);
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray35, intArray46);
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray32, intArray46);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 129.57623238850556d + "'", double21 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 129.57623238850556d + "'", double33 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 129.57623238850556d + "'", double34 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 129.57623238850556d + "'", double52 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 87.51571287488893d + "'", double59 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 96 + "'", int61 == 96);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-104718726209L), 97000, (int) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray11 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray16 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray16);
        int[] intArray23 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray11);
        int[] intArray30 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray35);
        int[] intArray42 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double43 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray42);
        int[] intArray48 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray53 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double54 = org.apache.commons.math.util.MathUtils.distance(intArray48, intArray53);
        int[] intArray59 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray64 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double65 = org.apache.commons.math.util.MathUtils.distance(intArray59, intArray64);
        int int66 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray59);
        int int67 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray59);
        int[] intArray72 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray77 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double78 = org.apache.commons.math.util.MathUtils.distance(intArray72, intArray77);
        int int79 = org.apache.commons.math.util.MathUtils.distanceInf(intArray59, intArray77);
        int int80 = org.apache.commons.math.util.MathUtils.distanceInf(intArray11, intArray77);
        int[] intArray81 = new int[] {};
        int[] intArray86 = new int[] { (short) 1, 100, ' ', 'a' };
        int int87 = org.apache.commons.math.util.MathUtils.distanceInf(intArray81, intArray86);
        double double88 = org.apache.commons.math.util.MathUtils.distance(intArray77, intArray86);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 129.57623238850556d + "'", double17 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.51571287488893d + "'", double24 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 129.57623238850556d + "'", double36 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 87.51571287488893d + "'", double43 == 87.51571287488893d);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 129.57623238850556d + "'", double54 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 129.57623238850556d + "'", double65 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 129.57623238850556d + "'", double78 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 96 + "'", int79 == 96);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 96 + "'", int80 == 96);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] {});
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 140.356688476182d + "'", double88 == 140.356688476182d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-268185600), 3200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268185600 + "'", int2 == 268185600);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1911350513), 3210);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = null;
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger8);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger8);
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger18 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger16);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 3210);
        java.math.BigInteger bigInteger22 = org.apache.commons.math.util.MathUtils.pow(bigInteger16, 2146435072);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(110, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        double[] doubleArray11 = new double[] { 99.99999999999999d };
        double[] doubleArray13 = new double[] { 2.2250738585072014E-308d };
        double double14 = org.apache.commons.math.util.MathUtils.distance(doubleArray11, doubleArray13);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray13);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        double[] doubleArray22 = new double[] { 99.99999999999999d };
        double[] doubleArray24 = new double[] { 2.2250738585072014E-308d };
        double double25 = org.apache.commons.math.util.MathUtils.distance(doubleArray22, doubleArray24);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray24);
        double[] doubleArray28 = new double[] { 1.0d };
        double[] doubleArray30 = new double[] { 99.99999999999999d };
        double[] doubleArray32 = new double[] { 2.2250738585072014E-308d };
        double double33 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray32);
        double[] doubleArray35 = new double[] { 99.99999999999999d };
        double[] doubleArray37 = new double[] { 2.2250738585072014E-308d };
        double double38 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray37);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray30, doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray37);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray28);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, 0.0d);
        double double44 = org.apache.commons.math.util.MathUtils.distance(doubleArray13, doubleArray43);
        double double45 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.99999999999999d + "'", double14 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 99.99999999999999d + "'", double25 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.99999999999999d + "'", double33 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 99.99999999999999d + "'", double38 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 99.99999999999999d + "'", double45 == 99.99999999999999d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 100.0f, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5309649148733797d) + "'", double2 == (-0.5309649148733797d));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-31), 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31000) + "'", int2 == (-31000));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-22.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1079525376, 2146435072);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double double2 = org.apache.commons.math.util.MathUtils.round(Double.NEGATIVE_INFINITY, 51360);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 32);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 'a');
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 900);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 900, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 900.0f + "'", float2 == 900.0f);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(6627890308811632801L, (long) (-5136000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6627890308806496801L + "'", long2 == 6627890308806496801L);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, 0.0d);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        double[] doubleArray34 = new double[] { 99.99999999999999d };
        double[] doubleArray36 = new double[] { 2.2250738585072014E-308d };
        double double37 = org.apache.commons.math.util.MathUtils.distance(doubleArray34, doubleArray36);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray36);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        double[] doubleArray45 = new double[] { 99.99999999999999d };
        double[] doubleArray47 = new double[] { 2.2250738585072014E-308d };
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray45, doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        double double50 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray40);
        double[] doubleArray52 = new double[] { 99.99999999999999d };
        double[] doubleArray54 = new double[] { 2.2250738585072014E-308d };
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray54);
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray59);
        double double62 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray59);
        double[] doubleArray64 = new double[] { 99.99999999999999d };
        double[] doubleArray66 = new double[] { 2.2250738585072014E-308d };
        double double67 = org.apache.commons.math.util.MathUtils.distance(doubleArray64, doubleArray66);
        double[] doubleArray69 = new double[] { 99.99999999999999d };
        double[] doubleArray71 = new double[] { 2.2250738585072014E-308d };
        double double72 = org.apache.commons.math.util.MathUtils.distance(doubleArray69, doubleArray71);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray64, doubleArray71);
        double[] doubleArray75 = new double[] { 1.0d };
        double[] doubleArray77 = new double[] { 99.99999999999999d };
        double[] doubleArray79 = new double[] { 2.2250738585072014E-308d };
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray77, doubleArray79);
        double[] doubleArray82 = new double[] { 99.99999999999999d };
        double[] doubleArray84 = new double[] { 2.2250738585072014E-308d };
        double double85 = org.apache.commons.math.util.MathUtils.distance(doubleArray82, doubleArray84);
        boolean boolean86 = org.apache.commons.math.util.MathUtils.equals(doubleArray77, doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray75, doubleArray84);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray71, doubleArray75);
        double[] doubleArray90 = new double[] { 99.99999999999999d };
        double[] doubleArray92 = new double[] { 2.2250738585072014E-308d };
        double double93 = org.apache.commons.math.util.MathUtils.distance(doubleArray90, doubleArray92);
        double double94 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray71, doubleArray90);
        double double95 = org.apache.commons.math.util.MathUtils.distance(doubleArray59, doubleArray71);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray71);
        int int97 = org.apache.commons.math.util.MathUtils.hash(doubleArray71);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 99.99999999999999d + "'", double37 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.99999999999999d + "'", double48 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.99999999999999d + "'", double50 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 99.99999999999999d + "'", double55 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 99.99999999999999d + "'", double67 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 99.99999999999999d + "'", double72 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 99.99999999999999d + "'", double80 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 99.99999999999999d + "'", double85 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 99.99999999999999d + "'", double93 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 99.99999999999999d + "'", double94 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1048607 + "'", int97 == 1048607);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1048576, 1072693279);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0950671531879624E27d + "'", double2 == 1.0950671531879624E27d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1072693279, 97000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double double3 = org.apache.commons.math.util.MathUtils.round(Double.POSITIVE_INFINITY, 9, 1079525376);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(32, 913924536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, (long) 0);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger6, 0L);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1911350513), (-268185600));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, (-5136000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(3, 3210);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        double double1 = org.apache.commons.math.util.MathUtils.sign(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1079525340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 'a', (double) 1072693279);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0726932768871273E9d + "'", double2 == 1.0726932768871273E9d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(Double.NEGATIVE_INFINITY, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-36L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-360L) + "'", long2 == (-360L));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(81.55795945611504d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 81.55795945611503d + "'", double2 == 81.55795945611503d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 4, 1.2952797043614583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9999999999999996d + "'", double2 == 3.9999999999999996d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(97, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 194 + "'", int2 == 194);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-98L), (double) (-9), (double) (-4));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((-4), (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-4), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(4104L, (long) 194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4298L + "'", long2 == 4298L);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(110, 913924536);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 913924536, 9.0d, 3205.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 106865161381L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray15 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 1.543080634815244d);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        double[] doubleArray22 = new double[] { 99.99999999999999d };
        double[] doubleArray24 = new double[] { 2.2250738585072014E-308d };
        double double25 = org.apache.commons.math.util.MathUtils.distance(doubleArray22, doubleArray24);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray24);
        double[] doubleArray28 = new double[] { 1.0d };
        double[] doubleArray30 = new double[] { 99.99999999999999d };
        double[] doubleArray32 = new double[] { 2.2250738585072014E-308d };
        double double33 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray32);
        double[] doubleArray35 = new double[] { 99.99999999999999d };
        double[] doubleArray37 = new double[] { 2.2250738585072014E-308d };
        double double38 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray37);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equals(doubleArray30, doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray37);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray28);
        double[] doubleArray43 = new double[] { 99.99999999999999d };
        double[] doubleArray45 = new double[] { 2.2250738585072014E-308d };
        double double46 = org.apache.commons.math.util.MathUtils.distance(doubleArray43, doubleArray45);
        double[] doubleArray48 = new double[] { 99.99999999999999d };
        double[] doubleArray50 = new double[] { 2.2250738585072014E-308d };
        double double51 = org.apache.commons.math.util.MathUtils.distance(doubleArray48, doubleArray50);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray43, doubleArray50);
        double[] doubleArray54 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10.0f);
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray57 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, 1.543080634815244d);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray57);
        double[] doubleArray60 = new double[] { 99.99999999999999d };
        double[] doubleArray62 = new double[] { 2.2250738585072014E-308d };
        double double63 = org.apache.commons.math.util.MathUtils.distance(doubleArray60, doubleArray62);
        double[] doubleArray65 = new double[] { 99.99999999999999d };
        double[] doubleArray67 = new double[] { 2.2250738585072014E-308d };
        double double68 = org.apache.commons.math.util.MathUtils.distance(doubleArray65, doubleArray67);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray60, doubleArray67);
        double[] doubleArray71 = new double[] { 99.99999999999999d };
        double[] doubleArray73 = new double[] { 2.2250738585072014E-308d };
        double double74 = org.apache.commons.math.util.MathUtils.distance(doubleArray71, doubleArray73);
        double[] doubleArray76 = new double[] { 99.99999999999999d };
        double[] doubleArray78 = new double[] { 2.2250738585072014E-308d };
        double double79 = org.apache.commons.math.util.MathUtils.distance(doubleArray76, doubleArray78);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray71, doubleArray78);
        double double81 = org.apache.commons.math.util.MathUtils.distance1(doubleArray67, doubleArray71);
        double[] doubleArray83 = new double[] { 99.99999999999999d };
        double[] doubleArray85 = new double[] { 2.2250738585072014E-308d };
        double double86 = org.apache.commons.math.util.MathUtils.distance(doubleArray83, doubleArray85);
        double[] doubleArray88 = new double[] { 99.99999999999999d };
        double[] doubleArray90 = new double[] { 2.2250738585072014E-308d };
        double double91 = org.apache.commons.math.util.MathUtils.distance(doubleArray88, doubleArray90);
        boolean boolean92 = org.apache.commons.math.util.MathUtils.equals(doubleArray83, doubleArray90);
        double double93 = org.apache.commons.math.util.MathUtils.distance1(doubleArray67, doubleArray90);
        int int94 = org.apache.commons.math.util.MathUtils.hash(doubleArray67);
        boolean boolean95 = org.apache.commons.math.util.MathUtils.equals(doubleArray57, doubleArray67);
        double double96 = org.apache.commons.math.util.MathUtils.distance1(doubleArray15, doubleArray57);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1079574497) + "'", int13 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.5430806348152442d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 99.99999999999999d + "'", double25 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.99999999999999d + "'", double33 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 99.99999999999999d + "'", double38 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 99.99999999999999d + "'", double46 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 99.99999999999999d + "'", double51 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1079574497) + "'", int55 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.5430806348152442d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 99.99999999999999d + "'", double63 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 99.99999999999999d + "'", double68 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 99.99999999999999d + "'", double74 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 99.99999999999999d + "'", double79 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 99.99999999999999d + "'", double81 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 99.99999999999999d + "'", double86 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 99.99999999999999d + "'", double91 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1048607 + "'", int94 == 1048607);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        long long2 = org.apache.commons.math.util.MathUtils.pow((-98L), 194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(913924536, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-913924536) + "'", int2 == (-913924536));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-31000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 10, 1.0d, 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, 0.0d);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        double[] doubleArray34 = new double[] { 99.99999999999999d };
        double[] doubleArray36 = new double[] { 2.2250738585072014E-308d };
        double double37 = org.apache.commons.math.util.MathUtils.distance(doubleArray34, doubleArray36);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray36);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        double[] doubleArray45 = new double[] { 99.99999999999999d };
        double[] doubleArray47 = new double[] { 2.2250738585072014E-308d };
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray45, doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        double double50 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray40);
        double[] doubleArray52 = new double[] { 99.99999999999999d };
        double[] doubleArray54 = new double[] { 2.2250738585072014E-308d };
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray54);
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray59);
        double double62 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray59);
        double[] doubleArray64 = new double[] { 99.99999999999999d };
        double[] doubleArray66 = new double[] { 2.2250738585072014E-308d };
        double double67 = org.apache.commons.math.util.MathUtils.distance(doubleArray64, doubleArray66);
        double[] doubleArray69 = new double[] { 99.99999999999999d };
        double[] doubleArray71 = new double[] { 2.2250738585072014E-308d };
        double double72 = org.apache.commons.math.util.MathUtils.distance(doubleArray69, doubleArray71);
        boolean boolean73 = org.apache.commons.math.util.MathUtils.equals(doubleArray64, doubleArray71);
        double[] doubleArray75 = new double[] { 1.0d };
        double[] doubleArray77 = new double[] { 99.99999999999999d };
        double[] doubleArray79 = new double[] { 2.2250738585072014E-308d };
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray77, doubleArray79);
        double[] doubleArray82 = new double[] { 99.99999999999999d };
        double[] doubleArray84 = new double[] { 2.2250738585072014E-308d };
        double double85 = org.apache.commons.math.util.MathUtils.distance(doubleArray82, doubleArray84);
        boolean boolean86 = org.apache.commons.math.util.MathUtils.equals(doubleArray77, doubleArray84);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray75, doubleArray84);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray71, doubleArray75);
        double[] doubleArray90 = new double[] { 99.99999999999999d };
        double[] doubleArray92 = new double[] { 2.2250738585072014E-308d };
        double double93 = org.apache.commons.math.util.MathUtils.distance(doubleArray90, doubleArray92);
        double double94 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray71, doubleArray90);
        double double95 = org.apache.commons.math.util.MathUtils.distance(doubleArray59, doubleArray71);
        boolean boolean96 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray71);
        java.lang.Class<?> wildcardClass97 = doubleArray71.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 99.99999999999999d + "'", double37 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.99999999999999d + "'", double48 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.99999999999999d + "'", double50 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 99.99999999999999d + "'", double55 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 99.99999999999999d + "'", double67 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 99.99999999999999d + "'", double72 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 99.99999999999999d + "'", double80 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 99.99999999999999d + "'", double85 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 99.99999999999999d + "'", double93 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 99.99999999999999d + "'", double94 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, 0.0d);
        double[] doubleArray29 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, 3.948148009134034E13d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 3.948148009134034E13d }, 1.0E-15);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 100, ' ', 'a' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray5);
        int[] intArray11 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray16 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double17 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray16);
        int[] intArray23 = new int[] { (short) 100, (short) 10, (short) 10, (-1), (byte) 1 };
        double double24 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray11);
        int[] intArray30 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double36 = org.apache.commons.math.util.MathUtils.distance(intArray30, intArray35);
        int[] intArray41 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray46 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double47 = org.apache.commons.math.util.MathUtils.distance(intArray41, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray41);
        double double49 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray30);
        int[] intArray54 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray59 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double60 = org.apache.commons.math.util.MathUtils.distance(intArray54, intArray59);
        int[] intArray65 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray70 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double71 = org.apache.commons.math.util.MathUtils.distance(intArray65, intArray70);
        int int72 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray65);
        int[] intArray77 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray82 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double83 = org.apache.commons.math.util.MathUtils.distance(intArray77, intArray82);
        double double84 = org.apache.commons.math.util.MathUtils.distance(intArray65, intArray82);
        int[] intArray85 = new int[] {};
        int[] intArray90 = new int[] { (short) 1, 100, ' ', 'a' };
        int int91 = org.apache.commons.math.util.MathUtils.distanceInf(intArray85, intArray90);
        int int92 = org.apache.commons.math.util.MathUtils.distance1(intArray65, intArray90);
        double double93 = org.apache.commons.math.util.MathUtils.distance(intArray11, intArray90);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 129.57623238850556d + "'", double17 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 100, 10, 10, (-1), 1 });
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 87.51571287488893d + "'", double24 == 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 129.57623238850556d + "'", double36 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 129.57623238850556d + "'", double47 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 129.57623238850556d + "'", double60 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 129.57623238850556d + "'", double71 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 129.57623238850556d + "'", double83 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 129.57623238850556d + "'", double84 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] {});
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 1, 100, 32, 97 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 358 + "'", int92 == 358);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 181.23465452280368d + "'", double93 == 181.23465452280368d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(2146434962L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        double double2 = org.apache.commons.math.util.MathUtils.log(2.8206162122887962E-278d, 87.51571287488893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0069972561405250945d) + "'", double2 == (-0.0069972561405250945d));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080485E43d, (double) 4298L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(10240.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1048607);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1093664799 + "'", int1 == 1093664799);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.2952797043614583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6890980259259323d + "'", double1 == 1.6890980259259323d);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        double double1 = org.apache.commons.math.util.MathUtils.sign(43008.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 1);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        boolean boolean3 = false; // flaky "6) test444(org.apache.commons.math.util.RegressionTest0)": org.apache.commons.math.util.MathUtils.equals(99.99999999999999d, (double) 1000.0f, (-1079574497));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray12);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1079574497) + "'", int23 == (-1079574497));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1079574497) + "'", int24 == (-1079574497));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-8814407033341083648L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1000, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        double double2 = org.apache.commons.math.util.MathUtils.log(1.3440585709080678E43d, (double) 42L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03763758000748657d + "'", double2 == 0.03763758000748657d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 1, 110);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(Double.NaN, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        long long2 = org.apache.commons.math.util.MathUtils.pow((-8814407033341083649L), (long) 51360);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6398919491949953025L + "'", long2 == 6398919491949953025L);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        double[] doubleArray25 = new double[] { 1.0d };
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double[] doubleArray32 = new double[] { 99.99999999999999d };
        double[] doubleArray34 = new double[] { 2.2250738585072014E-308d };
        double double35 = org.apache.commons.math.util.MathUtils.distance(doubleArray32, doubleArray34);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray34);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray34);
        boolean boolean38 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray25);
        double[] doubleArray40 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray25, 0.0d);
        double double41 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray25);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double[] doubleArray44 = new double[] { 99.99999999999999d };
        double[] doubleArray46 = new double[] { 2.2250738585072014E-308d };
        double double47 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray46);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        double[] doubleArray55 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray44, (double) 10.0f);
        int int56 = org.apache.commons.math.util.MathUtils.hash(doubleArray44);
        double[] doubleArray58 = new double[] { 99.99999999999999d };
        double[] doubleArray60 = new double[] { 2.2250738585072014E-308d };
        double double61 = org.apache.commons.math.util.MathUtils.distance(doubleArray58, doubleArray60);
        double[] doubleArray63 = new double[] { 99.99999999999999d };
        double[] doubleArray65 = new double[] { 2.2250738585072014E-308d };
        double double66 = org.apache.commons.math.util.MathUtils.distance(doubleArray63, doubleArray65);
        boolean boolean67 = org.apache.commons.math.util.MathUtils.equals(doubleArray58, doubleArray65);
        double[] doubleArray69 = new double[] { 1.0d };
        double[] doubleArray71 = new double[] { 99.99999999999999d };
        double[] doubleArray73 = new double[] { 2.2250738585072014E-308d };
        double double74 = org.apache.commons.math.util.MathUtils.distance(doubleArray71, doubleArray73);
        double[] doubleArray76 = new double[] { 99.99999999999999d };
        double[] doubleArray78 = new double[] { 2.2250738585072014E-308d };
        double double79 = org.apache.commons.math.util.MathUtils.distance(doubleArray76, doubleArray78);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray71, doubleArray78);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equals(doubleArray69, doubleArray78);
        boolean boolean82 = org.apache.commons.math.util.MathUtils.equals(doubleArray65, doubleArray69);
        double[] doubleArray84 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray69, 0.0d);
        double double85 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray69);
        double double86 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 99.99999999999999d + "'", double35 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 98.99999999999999d + "'", double41 == 98.99999999999999d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1072693279 + "'", int42 == 1072693279);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.99999999999999d + "'", double47 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1079574497) + "'", int56 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 99.99999999999999d + "'", double61 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 99.99999999999999d + "'", double66 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 99.99999999999999d + "'", double74 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 99.99999999999999d + "'", double79 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 98.99999999999999d + "'", double85 == 98.99999999999999d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 98.99999999999999d + "'", double86 == 98.99999999999999d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray12);
        double[] doubleArray24 = new double[] { 99.99999999999999d };
        double[] doubleArray26 = new double[] { 2.2250738585072014E-308d };
        double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray24, doubleArray26);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray31);
        int int35 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double[] doubleArray38 = new double[] { 99.99999999999999d };
        double[] doubleArray40 = new double[] { 2.2250738585072014E-308d };
        double double41 = org.apache.commons.math.util.MathUtils.distance(doubleArray38, doubleArray40);
        double[] doubleArray43 = new double[] { 99.99999999999999d };
        double[] doubleArray45 = new double[] { 2.2250738585072014E-308d };
        double double46 = org.apache.commons.math.util.MathUtils.distance(doubleArray43, doubleArray45);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray38, doubleArray45);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        double[] doubleArray54 = new double[] { 99.99999999999999d };
        double[] doubleArray56 = new double[] { 2.2250738585072014E-308d };
        double double57 = org.apache.commons.math.util.MathUtils.distance(doubleArray54, doubleArray56);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equals(doubleArray49, doubleArray56);
        double double59 = org.apache.commons.math.util.MathUtils.distance1(doubleArray45, doubleArray49);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray8, doubleArray45);
        double[] doubleArray62 = new double[] { 99.99999999999999d };
        double[] doubleArray64 = new double[] { 2.2250738585072014E-308d };
        double double65 = org.apache.commons.math.util.MathUtils.distance(doubleArray62, doubleArray64);
        double[] doubleArray67 = new double[] { 99.99999999999999d };
        double[] doubleArray69 = new double[] { 2.2250738585072014E-308d };
        double double70 = org.apache.commons.math.util.MathUtils.distance(doubleArray67, doubleArray69);
        boolean boolean71 = org.apache.commons.math.util.MathUtils.equals(doubleArray62, doubleArray69);
        double[] doubleArray73 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray62, (double) 10.0f);
        int int74 = org.apache.commons.math.util.MathUtils.hash(doubleArray62);
        double[] doubleArray76 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray62, 1.543080634815244d);
        double[] doubleArray78 = new double[] { 99.99999999999999d };
        double[] doubleArray80 = new double[] { 2.2250738585072014E-308d };
        double double81 = org.apache.commons.math.util.MathUtils.distance(doubleArray78, doubleArray80);
        double[] doubleArray83 = new double[] { 99.99999999999999d };
        double[] doubleArray85 = new double[] { 2.2250738585072014E-308d };
        double double86 = org.apache.commons.math.util.MathUtils.distance(doubleArray83, doubleArray85);
        boolean boolean87 = org.apache.commons.math.util.MathUtils.equals(doubleArray78, doubleArray85);
        double[] doubleArray89 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray78, (double) 10.0f);
        int int90 = org.apache.commons.math.util.MathUtils.hash(doubleArray78);
        int int91 = org.apache.commons.math.util.MathUtils.hash(doubleArray78);
        double double92 = org.apache.commons.math.util.MathUtils.distance1(doubleArray62, doubleArray78);
        boolean boolean93 = org.apache.commons.math.util.MathUtils.equals(doubleArray45, doubleArray78);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 99.99999999999999d + "'", double27 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1048607 + "'", int35 == 1048607);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1048607 + "'", int36 == 1048607);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 99.99999999999999d + "'", double41 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 99.99999999999999d + "'", double46 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 99.99999999999999d + "'", double57 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 99.99999999999999d + "'", double59 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 99.99999999999999d + "'", double65 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 99.99999999999999d + "'", double70 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1079574497) + "'", int74 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 1.5430806348152442d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 99.99999999999999d + "'", double81 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 99.99999999999999d + "'", double86 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1079574497) + "'", int90 == (-1079574497));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1079574497) + "'", int91 == (-1079574497));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(1.0f, 51360, 1079525376);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        double double2 = org.apache.commons.math.util.MathUtils.log(3205.0d, (double) 3201L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998452976856061d + "'", double2 == 0.9998452976856061d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1048576);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(903, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072693279, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.072693279E9d + "'", double2 == 1.072693279E9d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1048576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 9700, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9700.0d + "'", double2 == 9700.0d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(268185600, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268185610 + "'", int2 == 268185610);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 310400, 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1048607, 1072693279);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-4));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10.0f);
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        double[] doubleArray25 = new double[] { 99.99999999999999d };
        double[] doubleArray27 = new double[] { 2.2250738585072014E-308d };
        double double28 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray27);
        double[] doubleArray30 = new double[] { 99.99999999999999d };
        double[] doubleArray32 = new double[] { 2.2250738585072014E-308d };
        double double33 = org.apache.commons.math.util.MathUtils.distance(doubleArray30, doubleArray32);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray32);
        double double35 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray25);
        double[] doubleArray37 = new double[] { 99.99999999999999d };
        double[] doubleArray39 = new double[] { 2.2250738585072014E-308d };
        double double40 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray39);
        double[] doubleArray42 = new double[] { 99.99999999999999d };
        double[] doubleArray44 = new double[] { 2.2250738585072014E-308d };
        double double45 = org.apache.commons.math.util.MathUtils.distance(doubleArray42, doubleArray44);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray44);
        double double47 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray44);
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double double50 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray21);
        double[] doubleArray52 = new double[] { 99.99999999999999d };
        double[] doubleArray54 = new double[] { 2.2250738585072014E-308d };
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray54);
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        boolean boolean61 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray59);
        double[] doubleArray63 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray52, (double) 10.0f);
        int int64 = org.apache.commons.math.util.MathUtils.hash(doubleArray52);
        double[] doubleArray66 = new double[] { 99.99999999999999d };
        double[] doubleArray68 = new double[] { 2.2250738585072014E-308d };
        double double69 = org.apache.commons.math.util.MathUtils.distance(doubleArray66, doubleArray68);
        double[] doubleArray71 = new double[] { 99.99999999999999d };
        double[] doubleArray73 = new double[] { 2.2250738585072014E-308d };
        double double74 = org.apache.commons.math.util.MathUtils.distance(doubleArray71, doubleArray73);
        boolean boolean75 = org.apache.commons.math.util.MathUtils.equals(doubleArray66, doubleArray73);
        double[] doubleArray77 = new double[] { 1.0d };
        double[] doubleArray79 = new double[] { 99.99999999999999d };
        double[] doubleArray81 = new double[] { 2.2250738585072014E-308d };
        double double82 = org.apache.commons.math.util.MathUtils.distance(doubleArray79, doubleArray81);
        double[] doubleArray84 = new double[] { 99.99999999999999d };
        double[] doubleArray86 = new double[] { 2.2250738585072014E-308d };
        double double87 = org.apache.commons.math.util.MathUtils.distance(doubleArray84, doubleArray86);
        boolean boolean88 = org.apache.commons.math.util.MathUtils.equals(doubleArray79, doubleArray86);
        boolean boolean89 = org.apache.commons.math.util.MathUtils.equals(doubleArray77, doubleArray86);
        boolean boolean90 = org.apache.commons.math.util.MathUtils.equals(doubleArray73, doubleArray77);
        double[] doubleArray92 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray77, 0.0d);
        double double93 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray77);
        double double94 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 99.99999999999999d + "'", double28 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 99.99999999999999d + "'", double33 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 99.99999999999999d + "'", double35 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 99.99999999999999d + "'", double40 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 99.99999999999999d + "'", double45 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1048607 + "'", int48 == 1048607);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1048607 + "'", int49 == 1048607);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.99999999999999d + "'", double50 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 99.99999999999999d + "'", double55 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1079574497) + "'", int64 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 99.99999999999999d + "'", double69 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 99.99999999999999d + "'", double74 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 99.99999999999999d + "'", double82 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 99.99999999999999d + "'", double87 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 98.99999999999999d + "'", double93 == 98.99999999999999d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 98.99999999999999d + "'", double94 == 98.99999999999999d);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 97000, (-864));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-51360));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1093664799, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1093664798L + "'", long2 == 1093664798L);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray12);
        double[] doubleArray24 = new double[] { 99.99999999999999d };
        double[] doubleArray26 = new double[] { 2.2250738585072014E-308d };
        double double27 = org.apache.commons.math.util.MathUtils.distance(doubleArray24, doubleArray26);
        double[] doubleArray29 = new double[] { 99.99999999999999d };
        double[] doubleArray31 = new double[] { 2.2250738585072014E-308d };
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray31);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray31);
        double[] doubleArray35 = new double[] { 99.99999999999999d };
        double[] doubleArray37 = new double[] { 2.2250738585072014E-308d };
        double double38 = org.apache.commons.math.util.MathUtils.distance(doubleArray35, doubleArray37);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray35, doubleArray42);
        double double45 = org.apache.commons.math.util.MathUtils.distance1(doubleArray31, doubleArray35);
        double[] doubleArray47 = new double[] { 99.99999999999999d };
        double[] doubleArray49 = new double[] { 2.2250738585072014E-308d };
        double double50 = org.apache.commons.math.util.MathUtils.distance(doubleArray47, doubleArray49);
        double[] doubleArray52 = new double[] { 99.99999999999999d };
        double[] doubleArray54 = new double[] { 2.2250738585072014E-308d };
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray52, doubleArray54);
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray54);
        double double57 = org.apache.commons.math.util.MathUtils.distance1(doubleArray31, doubleArray54);
        double double58 = org.apache.commons.math.util.MathUtils.distance1(doubleArray12, doubleArray31);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 99.99999999999999d + "'", double27 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 99.99999999999999d + "'", double32 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 99.99999999999999d + "'", double38 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 99.99999999999999d + "'", double45 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.99999999999999d + "'", double50 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 99.99999999999999d + "'", double55 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 99.99999999999999d + "'", double58 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1079574497) + "'", int59 == (-1079574497));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842624L + "'", long2 == 1125899906842624L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1000, 358);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1000.0d + "'", double2 == 1000.0d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 6398919491949953025L, (double) 42L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08631501038161032d + "'", double2 == 0.08631501038161032d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-913924536));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 32);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (long) 'a');
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = null;
        java.math.BigInteger bigInteger16 = org.apache.commons.math.util.MathUtils.pow(bigInteger14, (long) 0);
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger13, bigInteger16);
        java.math.BigInteger bigInteger19 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, 106865161381L);
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger20);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 1.0d };
        double[] doubleArray4 = new double[] { 99.99999999999999d };
        double[] doubleArray6 = new double[] { 2.2250738585072014E-308d };
        double double7 = org.apache.commons.math.util.MathUtils.distance(doubleArray4, doubleArray6);
        double[] doubleArray9 = new double[] { 99.99999999999999d };
        double[] doubleArray11 = new double[] { 2.2250738585072014E-308d };
        double double12 = org.apache.commons.math.util.MathUtils.distance(doubleArray9, doubleArray11);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equals(doubleArray2, doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray0, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.99999999999999d + "'", double7 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.99999999999999d + "'", double12 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1093664799);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 99.99999999999999d };
        double[] doubleArray14 = new double[] { 2.2250738585072014E-308d };
        double double15 = org.apache.commons.math.util.MathUtils.distance(doubleArray12, doubleArray14);
        double[] doubleArray17 = new double[] { 99.99999999999999d };
        double[] doubleArray19 = new double[] { 2.2250738585072014E-308d };
        double double20 = org.apache.commons.math.util.MathUtils.distance(doubleArray17, doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray19);
        double double22 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray12);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray12, (double) 100);
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double[] doubleArray32 = new double[] { 99.99999999999999d };
        double[] doubleArray34 = new double[] { 2.2250738585072014E-308d };
        double double35 = org.apache.commons.math.util.MathUtils.distance(doubleArray32, doubleArray34);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray34);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray27, (double) 10.0f);
        double[] doubleArray40 = new double[] { 99.99999999999999d };
        double[] doubleArray42 = new double[] { 2.2250738585072014E-308d };
        double double43 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray42);
        double[] doubleArray45 = new double[] { 99.99999999999999d };
        double[] doubleArray47 = new double[] { 2.2250738585072014E-308d };
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray45, doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        double[] doubleArray51 = new double[] { 99.99999999999999d };
        double[] doubleArray53 = new double[] { 2.2250738585072014E-308d };
        double double54 = org.apache.commons.math.util.MathUtils.distance(doubleArray51, doubleArray53);
        double[] doubleArray56 = new double[] { 99.99999999999999d };
        double[] doubleArray58 = new double[] { 2.2250738585072014E-308d };
        double double59 = org.apache.commons.math.util.MathUtils.distance(doubleArray56, doubleArray58);
        boolean boolean60 = org.apache.commons.math.util.MathUtils.equals(doubleArray51, doubleArray58);
        double double61 = org.apache.commons.math.util.MathUtils.distance1(doubleArray47, doubleArray51);
        double[] doubleArray63 = new double[] { 99.99999999999999d };
        double[] doubleArray65 = new double[] { 2.2250738585072014E-308d };
        double double66 = org.apache.commons.math.util.MathUtils.distance(doubleArray63, doubleArray65);
        double[] doubleArray68 = new double[] { 99.99999999999999d };
        double[] doubleArray70 = new double[] { 2.2250738585072014E-308d };
        double double71 = org.apache.commons.math.util.MathUtils.distance(doubleArray68, doubleArray70);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equals(doubleArray63, doubleArray70);
        double double73 = org.apache.commons.math.util.MathUtils.distance1(doubleArray47, doubleArray70);
        int int74 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        int int75 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double double76 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray47);
        double double77 = org.apache.commons.math.util.MathUtils.distance(doubleArray25, doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 99.99999999999999d + "'", double15 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.99999999999999d + "'", double20 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1079574497) + "'", int23 == (-1079574497));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 99.99999999999999d + "'", double35 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 99.99999999999999d + "'", double43 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.99999999999999d + "'", double48 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 99.99999999999999d + "'", double54 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 99.99999999999999d + "'", double59 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 99.99999999999999d + "'", double61 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 99.99999999999999d + "'", double66 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 99.99999999999999d + "'", double71 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1048607 + "'", int74 == 1048607);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1048607 + "'", int75 == 1048607);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 99.99999999999999d + "'", double76 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.4210854715202004E-14d + "'", double77 == 1.4210854715202004E-14d);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '4', 97000);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        long long2 = org.apache.commons.math.util.MathUtils.pow((-360L), 6398919491949953025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 100L, (double) 97000, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.9998452976856061d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.8415848300607d + "'", double2 == 1023.8415848300607d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(6.283185307179586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        double[] doubleArray1 = new double[] { 99.99999999999999d };
        double[] doubleArray3 = new double[] { 2.2250738585072014E-308d };
        double double4 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray3);
        double[] doubleArray6 = new double[] { 99.99999999999999d };
        double[] doubleArray8 = new double[] { 2.2250738585072014E-308d };
        double double9 = org.apache.commons.math.util.MathUtils.distance(doubleArray6, doubleArray8);
        boolean boolean10 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray8);
        double[] doubleArray12 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { 99.99999999999999d };
        double[] doubleArray16 = new double[] { 2.2250738585072014E-308d };
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray16);
        double[] doubleArray19 = new double[] { 99.99999999999999d };
        double[] doubleArray21 = new double[] { 2.2250738585072014E-308d };
        double double22 = org.apache.commons.math.util.MathUtils.distance(doubleArray19, doubleArray21);
        boolean boolean23 = org.apache.commons.math.util.MathUtils.equals(doubleArray14, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray21);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equals(doubleArray8, doubleArray12);
        double[] doubleArray27 = new double[] { 99.99999999999999d };
        double[] doubleArray29 = new double[] { 2.2250738585072014E-308d };
        double double30 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray8, doubleArray27);
        double[] doubleArray33 = new double[] { 99.99999999999999d };
        double[] doubleArray35 = new double[] { 2.2250738585072014E-308d };
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray33, doubleArray35);
        double[] doubleArray38 = new double[] { 99.99999999999999d };
        double[] doubleArray40 = new double[] { 2.2250738585072014E-308d };
        double double41 = org.apache.commons.math.util.MathUtils.distance(doubleArray38, doubleArray40);
        boolean boolean42 = org.apache.commons.math.util.MathUtils.equals(doubleArray33, doubleArray40);
        double[] doubleArray44 = new double[] { 99.99999999999999d };
        double[] doubleArray46 = new double[] { 2.2250738585072014E-308d };
        double double47 = org.apache.commons.math.util.MathUtils.distance(doubleArray44, doubleArray46);
        double[] doubleArray49 = new double[] { 99.99999999999999d };
        double[] doubleArray51 = new double[] { 2.2250738585072014E-308d };
        double double52 = org.apache.commons.math.util.MathUtils.distance(doubleArray49, doubleArray51);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray44, doubleArray51);
        double[] doubleArray55 = new double[] { 1.0d };
        double[] doubleArray57 = new double[] { 99.99999999999999d };
        double[] doubleArray59 = new double[] { 2.2250738585072014E-308d };
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray57, doubleArray59);
        double[] doubleArray62 = new double[] { 99.99999999999999d };
        double[] doubleArray64 = new double[] { 2.2250738585072014E-308d };
        double double65 = org.apache.commons.math.util.MathUtils.distance(doubleArray62, doubleArray64);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray57, doubleArray64);
        boolean boolean67 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray64);
        boolean boolean68 = org.apache.commons.math.util.MathUtils.equals(doubleArray51, doubleArray55);
        double[] doubleArray70 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, 0.0d);
        double double71 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray70);
        double[] doubleArray73 = new double[] { 1.0d };
        double[] doubleArray75 = new double[] { 99.99999999999999d };
        double[] doubleArray77 = new double[] { 2.2250738585072014E-308d };
        double double78 = org.apache.commons.math.util.MathUtils.distance(doubleArray75, doubleArray77);
        double[] doubleArray80 = new double[] { 99.99999999999999d };
        double[] doubleArray82 = new double[] { 2.2250738585072014E-308d };
        double double83 = org.apache.commons.math.util.MathUtils.distance(doubleArray80, doubleArray82);
        boolean boolean84 = org.apache.commons.math.util.MathUtils.equals(doubleArray75, doubleArray82);
        boolean boolean85 = org.apache.commons.math.util.MathUtils.equals(doubleArray73, doubleArray82);
        double double86 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray70, doubleArray82);
        double double87 = org.apache.commons.math.util.MathUtils.distance(doubleArray27, doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 99.99999999999999d + "'", double4 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.99999999999999d + "'", double9 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 99.99999999999999d + "'", double17 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 99.99999999999999d + "'", double22 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 99.99999999999999d + "'", double30 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 99.99999999999999d + "'", double31 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.99999999999999d + "'", double36 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 99.99999999999999d + "'", double41 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 99.99999999999999d + "'", double47 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 99.99999999999999d + "'", double52 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 99.99999999999999d + "'", double60 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 99.99999999999999d + "'", double65 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 99.99999999999999d + "'", double78 == 99.99999999999999d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 99.99999999999999d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 2.2250738585072014E-308d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 99.99999999999999d + "'", double83 == 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2.2250738585072014E-308d + "'", double86 == 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 99.99999999999999d + "'", double87 == 99.99999999999999d);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        int[] intArray4 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray4, intArray9);
        int[] intArray15 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray20 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double21 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray20);
        int int22 = org.apache.commons.math.util.MathUtils.distanceInf(intArray4, intArray15);
        int[] intArray27 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray32 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double33 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray32);
        double double34 = org.apache.commons.math.util.MathUtils.distance(intArray15, intArray32);
        int[] intArray39 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray44 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double45 = org.apache.commons.math.util.MathUtils.distance(intArray39, intArray44);
        int int46 = org.apache.commons.math.util.MathUtils.distanceInf(intArray15, intArray44);
        int[] intArray51 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray56 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double57 = org.apache.commons.math.util.MathUtils.distance(intArray51, intArray56);
        int[] intArray62 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray67 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double68 = org.apache.commons.math.util.MathUtils.distance(intArray62, intArray67);
        int int69 = org.apache.commons.math.util.MathUtils.distanceInf(intArray51, intArray62);
        int[] intArray74 = new int[] { 'a', (byte) 1, 'a', (short) -1 };
        int[] intArray79 = new int[] { (byte) 1, 0, (short) 10, (byte) 1 };
        double double80 = org.apache.commons.math.util.MathUtils.distance(intArray74, intArray79);
        double double81 = org.apache.commons.math.util.MathUtils.distance(intArray62, intArray79);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray44, intArray62);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.57623238850556d + "'", double10 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 129.57623238850556d + "'", double21 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 129.57623238850556d + "'", double33 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 129.57623238850556d + "'", double34 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 129.57623238850556d + "'", double45 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 96 + "'", int46 == 96);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 129.57623238850556d + "'", double57 == 129.57623238850556d);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 129.57623238850556d + "'", double68 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 97, 1, 97, (-1) });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 1, 0, 10, 1 });
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 129.57623238850556d + "'", double80 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 129.57623238850556d + "'", double81 == 129.57623238850556d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 96 + "'", int82 == 96);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math.util.MathUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math.util.MathUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger9);
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger17 = org.apache.commons.math.util.MathUtils.pow(bigInteger15, (long) 0);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math.util.MathUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = null;
        java.math.BigInteger bigInteger23 = org.apache.commons.math.util.MathUtils.pow(bigInteger21, (long) 0);
        java.math.BigInteger bigInteger24 = org.apache.commons.math.util.MathUtils.pow(bigInteger20, bigInteger23);
        java.math.BigInteger bigInteger25 = org.apache.commons.math.util.MathUtils.pow(bigInteger17, bigInteger23);
        java.math.BigInteger bigInteger26 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, bigInteger25);
        java.math.BigInteger bigInteger28 = org.apache.commons.math.util.MathUtils.pow(bigInteger25, 0);
        java.math.BigInteger bigInteger30 = org.apache.commons.math.util.MathUtils.pow(bigInteger28, (long) 9);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.3924354856807808E42d, (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 100, (long) 358);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35800L + "'", long2 == 35800L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        int int1 = org.apache.commons.math.util.MathUtils.sign(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-0.5309649148733797d), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5309649148733796d) + "'", double2 == (-0.5309649148733796d));
    }
}
