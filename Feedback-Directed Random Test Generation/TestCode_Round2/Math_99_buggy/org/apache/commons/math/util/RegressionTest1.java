package org.apache.commons.math.util;

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079508992, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079508992);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(3628800.0d, 4.666310772197643E157d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.8661184782302594E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-2001860807), (-1072693248));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 100L, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102400.0d + "'", double2 == 102400.0d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-30), 96);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(32.0d, 1048576);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1077936128, 320);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3024575949587827E105d + "'", double2 == 2.3024575949587827E105d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 30950L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-2001860807));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((int) 'a', (-1072693248));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        int int1 = org.apache.commons.math.util.MathUtils.hash(2.8661184782302594E14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 352035295 + "'", int1 == 352035295);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1104148480);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1.07269325E9f, (-0.11896519008378684d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-98L), (double) (-30));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(1079508992, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-1.0d), (double) 1077968896);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0779688931294124E9d + "'", double2 == 1.0779688931294124E9d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(700);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 5365, (-4.11822527E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.118225287912405E8d) + "'", double2 == (-4.118225287912405E8d));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-715597665), 993280);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.15597665E8d) + "'", double2 == (-7.15597665E8d));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(4, 1079006360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(90L, (-100L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9000L) + "'", long2 == (-9000L));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-715597665));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-715597665));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-411822207), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-411822242) + "'", int2 == (-411822242));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1, (long) 96);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (-411822242), 5365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(36L, (long) 1076101120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1076101156L + "'", long2 == 1076101156L);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1.07269325E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        double double2 = org.apache.commons.math.util.MathUtils.round(363.7393755555636d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 363.7393755555636d + "'", double2 == 363.7393755555636d);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 70);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(5044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.9155040003582885E22d, (int) (byte) 100, (-715597665));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, 403520);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) Float.POSITIVE_INFINITY, 363.7393755555636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 664278593L, Double.NEGATIVE_INFINITY, (-1.1752011936438016d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 100, 1095479168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1077968896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104154656 + "'", int1 == 1104154656);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2001860807), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2001860807) + "'", int2 == (-2001860807));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1074790400), 31040);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-1.1752011936438016d), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936438014d) + "'", double2 == (-1.1752011936438014d));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 95, 96);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.526675438855112E30d + "'", double2 == 7.526675438855112E30d);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(11200L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        double[] doubleArray4 = new double[] { 1.791759469228055d, 11013.232874703393d, 70, 90L };
        double[] doubleArray10 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        double[] doubleArray17 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        double[] doubleArray25 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double[] doubleArray31 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int32 = org.apache.commons.math.util.MathUtils.hash(doubleArray31);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray31);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray25);
        double[] doubleArray40 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray47 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray53 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int54 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray53);
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        boolean boolean57 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray47);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equals(doubleArray10, doubleArray25);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray10);
        int int60 = org.apache.commons.math.util.MathUtils.hash(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.791759469228055d, 11013.232874703393d, 70.0d, 90.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-715597665) + "'", int11 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-715597665) + "'", int18 == (-715597665));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-715597665) + "'", int19 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-715597665) + "'", int26 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-411822207) + "'", int32 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-715597665) + "'", int41 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-715597665) + "'", int48 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-411822207) + "'", int54 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 26826535 + "'", int60 == 26826535);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-411822242));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        double double2 = org.apache.commons.math.util.MathUtils.log((-1.1752011936438016d), 4.666310772197643E157d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        int int1 = org.apache.commons.math.util.MathUtils.hash(Double.NaN);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2146959360 + "'", int1 == 2146959360);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(99.75222039230621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 700);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(99.75222039230621d, 1077936128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.75222039230621d + "'", double2 == 99.75222039230621d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        int int1 = org.apache.commons.math.util.MathUtils.sign(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-411822527L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(1.3440585709080678E43d, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.400366068175424E41d + "'", double2 == 8.400366068175424E41d);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(70, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 1, (-2001860807));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) -1, 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-25L) + "'", long2 == (-25L));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 0, 1079508992);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-7.15597665E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((-2.3384026197294447E49d), 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-9000L), 63L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9063L) + "'", long2 == (-9063L));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(100, (-30));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 300 + "'", int2 == 300);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 10, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350L + "'", long2 == 350L);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1073742144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 98L, (double) 300, 4.666310772197643E157d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 700, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.982357438963845d + "'", double2 == 33.982357438963845d);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray13 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray19 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray19);
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray13);
        double[] doubleArray28 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray35 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double[] doubleArray41 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray35, doubleArray41);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray28, doubleArray35);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray35);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-715597665) + "'", int7 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-715597665) + "'", int14 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-411822207) + "'", int20 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-715597665) + "'", int29 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-715597665) + "'", int36 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-411822207) + "'", int42 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-715597665) + "'", int46 == (-715597665));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) -1, 31040, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        double[] doubleArray6 = new double[] { 1077968896, 31040L, (-411822207), 36057L, 1.0333147966386297E40d, 350L };
        double[] doubleArray11 = new double[] { 1.791759469228055d, 11013.232874703393d, 70, 90L };
        double[] doubleArray17 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        double[] doubleArray24 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        double[] doubleArray32 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int33 = org.apache.commons.math.util.MathUtils.hash(doubleArray32);
        double[] doubleArray38 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equals(doubleArray24, doubleArray32);
        double[] doubleArray47 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray54 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray54);
        double[] doubleArray60 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int61 = org.apache.commons.math.util.MathUtils.hash(doubleArray60);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equals(doubleArray54, doubleArray60);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray54);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray32, doubleArray54);
        boolean boolean65 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray32);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray17);
        boolean boolean67 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.077968896E9d, 31040.0d, (-4.11822207E8d), 36057.0d, 1.0333147966386297E40d, 350.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.791759469228055d, 11013.232874703393d, 70.0d, 90.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-715597665) + "'", int18 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-715597665) + "'", int25 == (-715597665));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-715597665) + "'", int26 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-715597665) + "'", int33 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-411822207) + "'", int39 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-715597665) + "'", int48 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-715597665) + "'", int55 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-411822207) + "'", int61 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1048576, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1048577 + "'", int2 == 1048577);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((-1.1752011936438016d), 96, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-2.3384026197294447E49d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-902823936) + "'", int1 == (-902823936));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(664278593L, (long) (-30));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19928357790L) + "'", long2 == (-19928357790L));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray11 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double[] doubleArray20 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray26 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray26);
        double[] doubleArray34 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int35 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        double[] doubleArray41 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        double[] doubleArray47 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        boolean boolean49 = org.apache.commons.math.util.MathUtils.equals(doubleArray41, doubleArray47);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray34, doubleArray41);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray41);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-411822207) + "'", int12 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-411822207) + "'", int14 == (-411822207));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-715597665) + "'", int21 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411822207) + "'", int27 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-715597665) + "'", int35 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-715597665) + "'", int42 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-411822207) + "'", int48 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) -1, 1079006360, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 3628800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 1079508992, 1079509092);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1070232.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1077936128, 1095479168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(1.0726932479999999E9d, 1079509092, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1104148480);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(98.24777960769379d, 3628800.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 63L, 1079509092, 1079509092);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.8d, (double) 1, (-1.0779359399999998E9d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(993280, (-5045));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1077936228L, 352035295, 5365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1077936228L, (double) (-25L), (double) 33L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (byte) -1, (-1072693248), 1079508992);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray12 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray20 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray26 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray26);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray20);
        double[] doubleArray35 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double[] doubleArray42 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int43 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray48 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray42, doubleArray48);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equals(doubleArray35, doubleArray42);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray42);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray20);
        java.lang.Class<?> wildcardClass54 = doubleArray20.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-715597665) + "'", int13 == (-715597665));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-715597665) + "'", int14 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-715597665) + "'", int21 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411822207) + "'", int27 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-715597665) + "'", int36 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-715597665) + "'", int43 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-411822207) + "'", int49 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) '#', (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1070232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1073742144);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 24L, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.0d + "'", double2 == 24.0d);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1076101156L, 1079509092, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-2910L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-71L), (long) 1076101120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1076101049L + "'", long2 == 1076101049L);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 63L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1073741824, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073741825L + "'", long2 == 1073741825L);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1073741825L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073741826L + "'", long2 == 1073741826L);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.146891579734805E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(352035295, 1048577);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(96, 1095479168);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.07269325E9f, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.072693248E9d + "'", double2 == 1.072693248E9d);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(31040, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1104148480, (-25L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27603712000L) + "'", long2 == (-27603712000L));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1079509092);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(95);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 340.8150588707991d + "'", double1 == 340.8150588707991d);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1072693248);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 'a', (int) (short) 100, (-411822242));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10L, (-27603712000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-276037120000L) + "'", long2 == (-276037120000L));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        int int1 = org.apache.commons.math.util.MathUtils.sign(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 100, (-2001860807));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 70, 4.666310772197643E157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 85.4528974827991d + "'", double2 == 85.4528974827991d);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 90L, 70, 5044);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 98L, 1070232);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.0d + "'", double2 == 98.0d);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray13 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray19 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray19);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray19);
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray13);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray13);
        double[] doubleArray29 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray37 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int38 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray43 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray43);
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray29, doubleArray37);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray13, doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-715597665) + "'", int7 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-715597665) + "'", int14 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-411822207) + "'", int20 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-715597665) + "'", int23 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-715597665) + "'", int30 == (-715597665));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-715597665) + "'", int31 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-715597665) + "'", int38 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-411822207) + "'", int44 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1072693248));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1043335168) + "'", int1 == (-1043335168));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        double[] doubleArray4 = new double[] { 1.791759469228055d, 11013.232874703393d, 70, 90L };
        double[] doubleArray10 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        double[] doubleArray17 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        double[] doubleArray25 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray25);
        double[] doubleArray31 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int32 = org.apache.commons.math.util.MathUtils.hash(doubleArray31);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray31);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equals(doubleArray17, doubleArray25);
        double[] doubleArray40 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray47 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray53 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int54 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        boolean boolean55 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray53);
        boolean boolean56 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray47);
        boolean boolean57 = org.apache.commons.math.util.MathUtils.equals(doubleArray25, doubleArray47);
        boolean boolean58 = org.apache.commons.math.util.MathUtils.equals(doubleArray10, doubleArray25);
        boolean boolean59 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray10);
        double[] doubleArray65 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray65);
        double[] doubleArray72 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int73 = org.apache.commons.math.util.MathUtils.hash(doubleArray72);
        double[] doubleArray78 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int79 = org.apache.commons.math.util.MathUtils.hash(doubleArray78);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equals(doubleArray72, doubleArray78);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equals(doubleArray65, doubleArray72);
        boolean boolean82 = org.apache.commons.math.util.MathUtils.equals(doubleArray10, doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.791759469228055d, 11013.232874703393d, 70.0d, 90.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-715597665) + "'", int11 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-715597665) + "'", int18 == (-715597665));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-715597665) + "'", int19 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-715597665) + "'", int26 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-411822207) + "'", int32 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-715597665) + "'", int41 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-715597665) + "'", int48 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-411822207) + "'", int54 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-715597665) + "'", int66 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-715597665) + "'", int73 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-411822207) + "'", int79 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(2.3024575949587827E105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1077968896, 700);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10668.8900596759d + "'", double2 == 10668.8900596759d);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1076101120, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18999460329878004d + "'", double2 == 0.18999460329878004d);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(403520, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 403520 + "'", int2 == 403520);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        int int1 = org.apache.commons.math.util.MathUtils.hash(340.8150588707991d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 996076371 + "'", int1 == 996076371);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1073741826L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(9.619275968248924E151d, (-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 30950L, (-2001860807), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-411822492L), 15.104412573075516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.101432263851166d + "'", double2 == 17.101432263851166d);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.0726932479999999E9d, (double) 2146959360);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-902823936));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1077936228L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-2L), (double) 2L, (double) 1079508992);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-2L), (-7.15597665E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.15597662917386E8d) + "'", double2 == (-7.15597662917386E8d));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        long long1 = org.apache.commons.math.util.MathUtils.sign(63L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 320);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7119884080817924E138d + "'", double1 == 4.7119884080817924E138d);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-9063L), 1077936128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9063.0d) + "'", double2 == (-9063.0d));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-276037120000L), (double) 132L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        double double2 = org.apache.commons.math.util.MathUtils.log(8.400366068175424E41d, (-4.840425644941386E24d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        float float3 = org.apache.commons.math.util.MathUtils.round((-1.0f), 100, 4);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        int int1 = org.apache.commons.math.util.MathUtils.hash(363.7393755555636d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 989909612 + "'", int1 == 989909612);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1104148480, 1077936128, 403520);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.18999460329878004d, 1104148480);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18999460329878004d) + "'", double2 == (-0.18999460329878004d));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray12 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray18 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray18);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        double[] doubleArray27 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        int int29 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        double[] doubleArray35 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double[] doubleArray41 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray35, doubleArray41);
        boolean boolean44 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray35);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray27);
        java.lang.Class<?> wildcardClass46 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-715597665) + "'", int13 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-411822207) + "'", int19 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-715597665) + "'", int28 == (-715597665));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-715597665) + "'", int29 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-715597665) + "'", int36 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-411822207) + "'", int42 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1076101049L, (-0.18999460329878004d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) -1, 98.24777960769379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray12 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray20 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray26 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int27 = org.apache.commons.math.util.MathUtils.hash(doubleArray26);
        boolean boolean28 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray26);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray20);
        double[] doubleArray35 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double[] doubleArray42 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int43 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray48 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equals(doubleArray42, doubleArray48);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equals(doubleArray35, doubleArray42);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray42);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray20);
        java.lang.Class<?> wildcardClass54 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-715597665) + "'", int13 == (-715597665));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-715597665) + "'", int14 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-715597665) + "'", int21 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411822207) + "'", int27 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-715597665) + "'", int36 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-715597665) + "'", int43 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-411822207) + "'", int49 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray11 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray11);
        double[] doubleArray19 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray19);
        int int21 = org.apache.commons.math.util.MathUtils.hash(doubleArray19);
        double[] doubleArray27 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        double[] doubleArray33 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int34 = org.apache.commons.math.util.MathUtils.hash(doubleArray33);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equals(doubleArray27, doubleArray33);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray27);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray27);
        java.lang.Class<?> wildcardClass38 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-411822207) + "'", int12 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-715597665) + "'", int20 == (-715597665));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-715597665) + "'", int21 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-715597665) + "'", int28 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-411822207) + "'", int34 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1104148480, 700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1104149180 + "'", int2 == 1104149180);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079574528 + "'", int1 == 1079574528);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0333147966386297E40d + "'", double1 == 1.0333147966386297E40d);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1048577);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        int int1 = org.apache.commons.math.util.MathUtils.sign(993280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0732178989295803E14d + "'", double1 == 1.0732178989295803E14d);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(352035295, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.52035295E8d + "'", double2 == 3.52035295E8d);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815244d + "'", double1 == 1.543080634815244d);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(36057L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 5044, (long) 1073741824);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1073746868L + "'", long2 == 1073746868L);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(Double.POSITIVE_INFINITY, 0.0d, (-4.11822527E8d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-25L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(98.24777960769379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.330443333540319E42d + "'", double1 == 2.330443333540319E42d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) '#', (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1095479167, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1095479168 + "'", int2 == 1095479168);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-715597665));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        double double1 = org.apache.commons.math.util.MathUtils.sign(3628800.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(95, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1077968896, 320, 1073742144);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 100L, 1104148480, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(92.13617560368711d, 95);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6498899470858596E30d + "'", double2 == 3.6498899470858596E30d);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1043335168), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(3, 31040);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(30950L, (-25L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30975L + "'", long2 == 30975L);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 31040);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (short) 0, (int) (byte) 100, 996076371);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int6 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray12 = new double[] { 10.0d, (-1L), 10.0f, 10L, (-1) };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        double[] doubleArray18 = new double[] { '4', (-1.0f), (short) 0, (short) 0 };
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equals(doubleArray12, doubleArray18);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass22 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-715597665) + "'", int6 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-715597665) + "'", int13 == (-715597665));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 52.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-411822207) + "'", int19 == (-411822207));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1073742144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 32, 98L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66L) + "'", long2 == (-66L));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(36L, (long) 1048577);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37748772L + "'", long2 == 37748772L);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 3628800L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1104148480);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}

