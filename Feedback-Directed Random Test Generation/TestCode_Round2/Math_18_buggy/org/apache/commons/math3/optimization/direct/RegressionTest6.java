package org.apache.commons.math3.optimization.direct;

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int11 = cMAESOptimizer7.getEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsDHistory();
        int int15 = cMAESOptimizer7.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray27, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator51, false);
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator51, false, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        int int72 = cMAESOptimizer71.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer71.getStatisticsSigmaHistory();
        java.lang.Class<?> wildcardClass74 = cMAESOptimizer71.getClass();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(doubleList73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker28 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator18, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList41 = cMAESOptimizer40.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer40.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(realMatrixList41);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker42);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        int int15 = cMAESOptimizer14.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer14.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsSigmaHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.lang.Class<?> wildcardClass15 = cMAESOptimizer7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(realMatrixList12);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction20 = null;
        org.apache.commons.math3.optimization.GoalType goalType21 = null;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray46);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker48 = cMAESOptimizer47.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray31, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator38, true, pointValuePairConvergenceChecker48);
        double[] doubleArray64 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray64);
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList77 = cMAESOptimizer76.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer76.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray64, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator74, true, pointValuePairConvergenceChecker79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31, 0, (double) 100.0f, false, 0, 1, randomGenerator74, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair84 = cMAESOptimizer12.optimize((int) 'a', multivariateFunction20, goalType21, doubleArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator38);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker48);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator74);
        org.junit.Assert.assertNotNull(realMatrixList77);
        org.junit.Assert.assertNotNull(doubleList78);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker79);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer6.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer6.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer6.getGoalType();
        int int12 = cMAESOptimizer6.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer6.getConvergenceChecker();
        int int8 = cMAESOptimizer6.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer6.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer6.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer6.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator15, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8, (int) (byte) 1, (double) '#', true, (int) (short) 1, (int) (byte) 1, randomGenerator23, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator31 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray8, (int) '4', 1.0d, false, (int) (short) 0, (int) (short) 100, randomGenerator31, true);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer33.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer33.getGoalType();
        java.util.List<java.lang.Double> doubleList37 = cMAESOptimizer33.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer33.getStatisticsDHistory();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = cMAESOptimizer33.getUpperBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator15);
        org.junit.Assert.assertNotNull(doubleList34);
        org.junit.Assert.assertNull(goalType35);
        org.junit.Assert.assertNull(goalType36);
        org.junit.Assert.assertNotNull(doubleList37);
        org.junit.Assert.assertNotNull(realMatrixList38);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer6.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer6.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer6.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker28 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator18, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, 0, (double) (short) 1, true, (int) (short) 0, 0, randomGenerator44, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray61);
        org.apache.commons.math3.random.RandomGenerator randomGenerator71 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray81 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray81);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray61, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator71, true, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11, 30000, (double) ' ', false, (int) '#', 1, randomGenerator71, true);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray90 = cMAESOptimizer89.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator71);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker86);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer14.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer14.getGoalType();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer14.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNull(goalType18);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList10);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        int int17 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator36, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList59 = cMAESOptimizer58.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList60 = cMAESOptimizer58.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12, (int) (short) 100, 100.0d, true, 0, (int) (short) 0, randomGenerator56, true, pointValuePairConvergenceChecker61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator36);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker46);
        org.junit.Assert.assertNotNull(realMatrixList59);
        org.junit.Assert.assertNotNull(doubleList60);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker61);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer15.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer15.getStatisticsFitnessHistory();
        int int20 = cMAESOptimizer15.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator13);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.random.RandomGenerator randomGenerator31 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray24, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator31, true);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray46);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray75 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray75);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray60, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator67, true, pointValuePairConvergenceChecker77);
        double[] doubleArray86 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray86);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer87.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray46, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator67, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray24, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10, 1, (double) (-1.0f), false, 1, 1, randomGenerator67, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        java.util.List<java.lang.Double> doubleList99 = cMAESOptimizer98.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator31);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator67);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker77);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList88);
        org.junit.Assert.assertNotNull(realMatrixList89);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker90);
        org.junit.Assert.assertNotNull(doubleList99);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.lang.Class<?> wildcardClass17 = pointValuePairConvergenceChecker16.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(randomGenerator34);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer12.getGoalType();
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction21 = null;
        org.apache.commons.math3.optimization.GoalType goalType22 = null;
        double[] doubleArray38 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair50 = cMAESOptimizer12.optimize((int) (short) -1, multivariateFunction21, goalType22, doubleArray38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNull(goalType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer6.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer6.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = cMAESOptimizer6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer44.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray28, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator35, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray28, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator52, false);
        double[] doubleArray64 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray64);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator52, false, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.random.RandomGenerator randomGenerator76 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator76, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.GoalType goalType81 = cMAESOptimizer80.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(randomGenerator52);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker69);
        org.junit.Assert.assertNotNull(randomGenerator76);
        org.junit.Assert.assertNull(goalType81);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realMatrixList11);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer14.getStatisticsDHistory();
        int int16 = cMAESOptimizer14.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        int int15 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertNotNull(realMatrixList18);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray27, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator51, false);
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator51, false, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator75, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10);
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer78.getStatisticsSigmaHistory();
        int int80 = cMAESOptimizer78.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer78.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(randomGenerator51);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(randomGenerator75);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(realMatrixList81);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        int int11 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray26, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator33, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray26, (int) (byte) 1, (double) '#', true, (int) (short) 1, (int) (byte) 1, randomGenerator41, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList53 = cMAESOptimizer52.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType54 = cMAESOptimizer52.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray26, (int) (short) 10, (double) (short) -1, false, 1, (int) (short) 10, randomGenerator49, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair60 = cMAESOptimizer10.optimize((int) (short) 100, multivariateFunction13, goalType14, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator33);
        org.junit.Assert.assertNotNull(doubleList53);
        org.junit.Assert.assertNull(goalType54);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker55);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realMatrixList3);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleList5);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray22 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray37 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray37);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray22, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator29, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray22, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator46, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray7, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator46, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7, (int) (byte) 100, (double) 10, true, (int) (byte) 10, (int) (short) 0, randomGenerator56, false);
        int int59 = cMAESOptimizer58.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType60 = cMAESOptimizer58.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator29);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(goalType60);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray26, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator50, false);
        double[] doubleArray62 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray62);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator50, false, pointValuePairConvergenceChecker67);
        double[] doubleArray80 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray80);
        org.apache.commons.math3.random.RandomGenerator randomGenerator87 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray80, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator87, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, 30000, (double) 100, true, (int) (short) 1, 10, randomGenerator87, false);
        java.lang.Class<?> wildcardClass92 = cMAESOptimizer91.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator33);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker67);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator87);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator17, true);
        org.apache.commons.math3.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, (int) (byte) 1, (double) '#', true, (int) (short) 1, (int) (byte) 1, randomGenerator25, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray46 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer51.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, (int) (byte) 1, (double) (-1L), true, 10, 30000, randomGenerator35, true, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optimization.GoalType goalType54 = cMAESOptimizer53.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList55 = cMAESOptimizer53.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator17);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker52);
        org.junit.Assert.assertNull(goalType54);
        org.junit.Assert.assertNotNull(realMatrixList55);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double[] doubleArray1 = null;
        double[] doubleArray15 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray15, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator22, true, pointValuePairConvergenceChecker32);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray46);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray75 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray75);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray60, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator67, true, pointValuePairConvergenceChecker77);
        double[] doubleArray86 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray86);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer87.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray46, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator67, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15, (int) '#', (double) (byte) 0, true, (int) 'a', (int) 'a', randomGenerator67, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray1, 0, (double) (-1), false, (int) '#', (int) (short) 100, randomGenerator67, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList96 = cMAESOptimizer95.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList97 = cMAESOptimizer95.getStatisticsDHistory();
        int int98 = cMAESOptimizer95.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator22);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator67);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker77);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList88);
        org.junit.Assert.assertNotNull(realMatrixList89);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker90);
        org.junit.Assert.assertNotNull(realMatrixList96);
        org.junit.Assert.assertNotNull(realMatrixList97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double[] doubleArray16 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray16);
        org.apache.commons.math3.random.RandomGenerator randomGenerator26 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray36 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray36);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker41 = cMAESOptimizer40.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray16, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator26, true, pointValuePairConvergenceChecker41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray16);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray71 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray71);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray56, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator63, true, pointValuePairConvergenceChecker73);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray16, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator63, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray16);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray16);
        int int82 = cMAESOptimizer81.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer81.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator26);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker41);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator63);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker73);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(realMatrixList83);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsDHistory();
        int int20 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray68 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray68);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray48, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator58, true, pointValuePairConvergenceChecker73);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray30, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator58, false);
        double[] doubleArray84 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray84);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer85.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList87 = cMAESOptimizer85.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator58, false, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator58);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker73);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList86);
        org.junit.Assert.assertNotNull(realMatrixList87);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker88);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double[] doubleArray15 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray15);
        double[] doubleArray32 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray47 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray47);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker49 = cMAESOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray32, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator39, true, pointValuePairConvergenceChecker49);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator39, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = null;
        double[] doubleArray70 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray70);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList75 = cMAESOptimizer74.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer74.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray15, (int) (short) 10, (double) (short) -1, false, 30000, (int) (byte) 100, randomGenerator60, false, pointValuePairConvergenceChecker76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator39);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker49);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList75);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker76);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer12.getStatisticsDHistory();
        int int21 = cMAESOptimizer12.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(realMatrixList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double[] doubleArray1 = null;
        double[] doubleArray15 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray15);
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray33);
        org.apache.commons.math3.random.RandomGenerator randomGenerator43 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray53 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray53);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray33, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator43, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray15, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator43, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker63 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray1, 1, 100.0d, true, (int) (byte) 1, 30000, randomGenerator43, false, pointValuePairConvergenceChecker63);
        java.util.List<java.lang.Double> doubleList65 = cMAESOptimizer64.getStatisticsSigmaHistory();
        int int66 = cMAESOptimizer64.getEvaluations();
        java.util.List<java.lang.Double> doubleList67 = cMAESOptimizer64.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker58);
        org.junit.Assert.assertNotNull(doubleList65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(doubleList67);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator49, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray42, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (-1), (double) 100, false, 100, (int) (short) 1, randomGenerator66, true);
        java.lang.Class<?> wildcardClass73 = cMAESOptimizer72.getClass();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator49);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker59);
        org.junit.Assert.assertNotNull(randomGenerator66);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer7.optimize((int) (short) 0, multivariateFunction19, goalType20, doubleArray30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer12.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        int int17 = cMAESOptimizer12.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(realMatrixList1);
        org.junit.Assert.assertNotNull(doubleList2);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        int int11 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realMatrixList12);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer6.getStatisticsDHistory();
        int int8 = cMAESOptimizer6.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer6.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer6.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(realMatrixList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer10.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer10.getGoalType();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.lang.Class<?> wildcardClass17 = pointValuePairConvergenceChecker16.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator36, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        int int53 = cMAESOptimizer52.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator36);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray42);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray42);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray42);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList55 = cMAESOptimizer54.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList56 = cMAESOptimizer54.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker57 = cMAESOptimizer54.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray42, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator52, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9, 0, (double) 100.0f, false, 0, 1, randomGenerator52, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, (int) 'a', (double) 100, true, (int) (byte) 100, 0, randomGenerator66, true);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray69 = cMAESOptimizer68.getLowerBound();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator52);
        org.junit.Assert.assertNotNull(realMatrixList55);
        org.junit.Assert.assertNotNull(doubleList56);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker57);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray9);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        double[] doubleArray39 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer55.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray39, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator46, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator63 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray39, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator63, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray24, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator63, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer81.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9, (-1), (double) 10L, true, (int) 'a', (int) (byte) -1, randomGenerator63, false, pointValuePairConvergenceChecker84);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer86.getConvergenceChecker();
        int int88 = cMAESOptimizer86.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator46);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker56);
        org.junit.Assert.assertNotNull(randomGenerator63);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker82);
        org.junit.Assert.assertNotNull(realMatrixList83);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker84);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsDHistory();
        int int20 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double[] doubleArray15 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray15, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator22, true, pointValuePairConvergenceChecker32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray15, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator39, false);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator61, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray15, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator22);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(randomGenerator39);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator61);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker71);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer12.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double[] doubleArray15 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray15);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker32 = cMAESOptimizer31.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray15, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator22, true, pointValuePairConvergenceChecker32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray15, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator39, false);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator61, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray15, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator22);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(randomGenerator39);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator61);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker71);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList71 = cMAESOptimizer70.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer70.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray29, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator50, true, pointValuePairConvergenceChecker73);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, 0, (double) 1L, true, (int) ' ', 0, randomGenerator50, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        int int78 = cMAESOptimizer76.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType79 = cMAESOptimizer76.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList71);
        org.junit.Assert.assertNotNull(realMatrixList72);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker73);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(goalType79);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.junit.Assert.assertNotNull(realMatrixList2);
        org.junit.Assert.assertNotNull(doubleList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realMatrixList6);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray38 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray38);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker40 = cMAESOptimizer39.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray23, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator30, true, pointValuePairConvergenceChecker40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray23, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator47, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator47, false);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8, (int) (byte) 100, (double) 10, true, (int) (byte) 10, (int) (short) 0, randomGenerator57, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int61 = cMAESOptimizer60.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator30);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList71 = cMAESOptimizer70.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer70.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray29, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator50, true, pointValuePairConvergenceChecker73);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7, 0, (double) 1L, true, (int) ' ', 0, randomGenerator50, false);
        int int77 = cMAESOptimizer76.getEvaluations();
        java.lang.Class<?> wildcardClass78 = cMAESOptimizer76.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator14);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator50);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList71);
        org.junit.Assert.assertNotNull(realMatrixList72);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer12.getConvergenceChecker();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsSigmaHistory();
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator14);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.analysis.MultivariateFunction multivariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        double[] doubleArray32 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator39 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray47 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray47);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker49 = cMAESOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray32, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator39, true, pointValuePairConvergenceChecker49);
        double[] doubleArray65 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray65);
        org.apache.commons.math3.random.RandomGenerator randomGenerator75 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList78 = cMAESOptimizer77.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer77.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker80 = cMAESOptimizer77.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray65, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator75, true, pointValuePairConvergenceChecker80);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray32, 0, (double) 100.0f, false, 0, 1, randomGenerator75, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.PointValuePair pointValuePair87 = cMAESOptimizer7.optimize((-1), multivariateFunction19, goalType20, doubleArray32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator39);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker49);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator75);
        org.junit.Assert.assertNotNull(realMatrixList78);
        org.junit.Assert.assertNotNull(doubleList79);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker80);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator34, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        java.util.List<java.lang.Double> doubleList49 = cMAESOptimizer48.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator34);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(doubleList49);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsMeanHistory();
        int int16 = cMAESOptimizer10.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer10.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray46);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker48 = cMAESOptimizer47.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray31, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator38, true, pointValuePairConvergenceChecker48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray31, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator55, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray12, 30000, (double) 1, true, 30000, (int) (short) 0, randomGenerator55, true, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator38);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker48);
        org.junit.Assert.assertNotNull(randomGenerator55);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker61);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker62);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray27);
        double[] doubleArray45 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray45);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray65 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray65);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray45, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator55, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray27, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator55, false);
        double[] doubleArray81 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray81);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer82.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer82.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator55, false, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        int int89 = cMAESOptimizer88.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType90 = cMAESOptimizer88.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList91 = cMAESOptimizer88.getStatisticsDHistory();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator55);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList83);
        org.junit.Assert.assertNotNull(realMatrixList84);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(goalType90);
        org.junit.Assert.assertNotNull(realMatrixList91);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        int int15 = cMAESOptimizer10.getEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(realMatrixList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int19 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker20 = cMAESOptimizer12.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertNotNull(realMatrixList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker20);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        int int13 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer7.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker14);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int16 = cMAESOptimizer10.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer10.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realMatrixList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNull(goalType19);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList22 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList24 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType25 = cMAESOptimizer12.getGoalType();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(realMatrixList15);
        org.junit.Assert.assertNotNull(realMatrixList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(realMatrixList19);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(realMatrixList21);
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNull(goalType25);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realMatrixList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker28 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator18, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator35, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator44 = null;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, 0, (double) (short) 1, true, (int) (short) 0, 0, randomGenerator44, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray11);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker48 = cMAESOptimizer47.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker49 = cMAESOptimizer47.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(randomGenerator35);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker48);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker49);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray28);
        double[] doubleArray50 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray50);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray50);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray50);
        double[] doubleArray68 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray68);
        org.apache.commons.math3.random.RandomGenerator randomGenerator78 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer80.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList82 = cMAESOptimizer80.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray68, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator78, true, pointValuePairConvergenceChecker83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray50, 10, (double) 0, false, (int) 'a', (int) '4', randomGenerator78, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int90 = cMAESOptimizer89.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList91 = cMAESOptimizer89.getStatisticsSigmaHistory();
        int int92 = cMAESOptimizer89.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker93 = cMAESOptimizer89.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray28, (int) (short) 10, (double) 10L, false, (int) '4', (int) (short) 1, randomGenerator78, false, pointValuePairConvergenceChecker93);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray7, (int) (short) 10, (double) 1L, true, (int) (short) 100, (int) '#', randomGenerator78, false);
        java.util.List<java.lang.Double> doubleList97 = cMAESOptimizer96.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker98 = cMAESOptimizer96.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator78);
        org.junit.Assert.assertNotNull(realMatrixList81);
        org.junit.Assert.assertNotNull(doubleList82);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker83);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(doubleList91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker93);
        org.junit.Assert.assertNotNull(doubleList97);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker98);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.GoalType goalType1 = cMAESOptimizer0.getGoalType();
        org.junit.Assert.assertNull(goalType1);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker29 = cMAESOptimizer28.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator19, true, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator36, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator19);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(randomGenerator36);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker43);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        int int12 = cMAESOptimizer8.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(realMatrixList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer10.getStatisticsDHistory();
        java.lang.Class<?> wildcardClass15 = cMAESOptimizer10.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(realMatrixList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray23);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray55 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker57 = cMAESOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray40, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator47, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray40, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator64, false);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker81 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator64, false, pointValuePairConvergenceChecker81);
        org.apache.commons.math3.random.RandomGenerator randomGenerator88 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray23, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator88, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator88, true);
        org.apache.commons.math3.optimization.GoalType goalType93 = cMAESOptimizer92.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType94 = cMAESOptimizer92.getGoalType();
        java.util.List<java.lang.Double> doubleList95 = cMAESOptimizer92.getStatisticsSigmaHistory();
        int int96 = cMAESOptimizer92.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType97 = cMAESOptimizer92.getGoalType();
        int int98 = cMAESOptimizer92.getMaxEvaluations();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator47);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker57);
        org.junit.Assert.assertNotNull(randomGenerator64);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 10.0d, 1.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker81);
        org.junit.Assert.assertNotNull(randomGenerator88);
        org.junit.Assert.assertNull(goalType93);
        org.junit.Assert.assertNull(goalType94);
        org.junit.Assert.assertNotNull(doubleList95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNull(goalType97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList28 = cMAESOptimizer27.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList29 = cMAESOptimizer27.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker30 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10, 100, (double) 1, false, (int) (byte) 0, (int) (byte) 100, randomGenerator18, true, pointValuePairConvergenceChecker30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        int int34 = cMAESOptimizer33.getEvaluations();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(randomGenerator18);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, 0.0d, 100.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrixList28);
        org.junit.Assert.assertNotNull(realMatrixList29);
        org.junit.Assert.assertNotNull(pointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }
}

