package org.apache.commons.math3.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair35 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray22 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray22);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker24 = cMAESOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator14, true, pointValuePairConvergenceChecker24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair26 = cMAESOptimizer25.doOptimize();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer34.getUpperBound();
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer34.getLowerBound();
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator32, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator49, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator49, false, pointValuePairConvergenceChecker66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray68 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        int int35 = cMAESOptimizer34.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer34.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator49, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray42, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator66, false);
        double[] doubleArray78 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray78);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator66, false, pointValuePairConvergenceChecker83);
        org.apache.commons.math3.random.RandomGenerator randomGenerator90 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray25, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator90, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator90, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer96.getLowerBound();
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair95 = cMAESOptimizer94.doOptimize();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray1 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator58, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer71.getUpperBound();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair39 = cMAESOptimizer38.doOptimize();
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int95 = cMAESOptimizer94.getMaxEvaluations();
        int int96 = cMAESOptimizer94.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray21 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator28, true);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray72 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray72);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray57, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator64, true, pointValuePairConvergenceChecker74);
        double[] doubleArray83 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray83);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList85 = cMAESOptimizer84.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer84.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray43, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator64, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray7, 1, (double) (-1.0f), false, 1, 1, randomGenerator64, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer92.getLowerBound();
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer92.getUpperBound();
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        int int77 = cMAESOptimizer76.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType78 = cMAESOptimizer76.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair79 = cMAESOptimizer76.doOptimize();
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray61 = cMAESOptimizer60.getStartPoint();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer36.doOptimize();
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray28);
        double[] doubleArray45 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray45);
        org.apache.commons.math3.random.RandomGenerator randomGenerator52 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray60);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer61.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray45, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator52, true, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.random.RandomGenerator randomGenerator69 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray45, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator69, false);
        double[] doubleArray81 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray81);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray81);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator69, false, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.random.RandomGenerator randomGenerator93 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray28, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator93, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9, 30000, (double) (-1L), false, (int) '#', (int) (short) 1, randomGenerator93, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray98 = cMAESOptimizer97.getStartPoint();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        double[] doubleArray71 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray71);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray26, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator50, true, pointValuePairConvergenceChecker76);
        double[] doubleArray85 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray85);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer86.getConvergenceChecker();
        int int88 = cMAESOptimizer86.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer86.getConvergenceChecker();
        int int90 = cMAESOptimizer86.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker91 = cMAESOptimizer86.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8, (int) 'a', (double) (short) 1, true, 0, (int) 'a', randomGenerator50, true, pointValuePairConvergenceChecker91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer92.getLowerBound();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair2 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray21 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray36 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray36);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray21, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator28, true, pointValuePairConvergenceChecker38);
        double[] doubleArray47 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray47);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList49 = cMAESOptimizer48.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList50 = cMAESOptimizer48.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker51 = cMAESOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator28, true, pointValuePairConvergenceChecker51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair53 = cMAESOptimizer52.doOptimize();
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator20, true, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer37.getStartPoint();
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray22 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray22);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker24 = cMAESOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator14, true, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optimization.GoalType goalType26 = cMAESOptimizer25.getGoalType();
        int int27 = cMAESOptimizer25.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray28 = cMAESOptimizer25.getLowerBound();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair78 = cMAESOptimizer76.doOptimize();
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray31);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator55, true, pointValuePairConvergenceChecker65);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker81 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray31, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator55, true, pointValuePairConvergenceChecker81);
        double[] doubleArray90 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray90);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer91.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList93 = cMAESOptimizer91.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList94 = cMAESOptimizer91.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker95 = cMAESOptimizer91.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7, 0, (double) ' ', false, (int) (short) 1, 100, randomGenerator55, true, pointValuePairConvergenceChecker95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair97 = cMAESOptimizer96.doOptimize();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer39.getLowerBound();
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray31);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator55, true, pointValuePairConvergenceChecker65);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker81 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray31, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator55, true, pointValuePairConvergenceChecker81);
        double[] doubleArray90 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray90);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer91.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList93 = cMAESOptimizer91.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList94 = cMAESOptimizer91.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker95 = cMAESOptimizer91.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7, 0, (double) ' ', false, (int) (short) 1, 100, randomGenerator55, true, pointValuePairConvergenceChecker95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer96.getStartPoint();
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        int int77 = cMAESOptimizer76.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType78 = cMAESOptimizer76.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer76.getStartPoint();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        int int77 = cMAESOptimizer76.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType78 = cMAESOptimizer76.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer76.getUpperBound();
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
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
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer76.getStartPoint();
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer9.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer9.getLowerBound();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        org.apache.commons.math3.optimization.GoalType goalType35 = cMAESOptimizer34.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer34.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair37 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer21.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList23 = cMAESOptimizer21.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker24 = cMAESOptimizer21.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator19, true, pointValuePairConvergenceChecker24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray26 = cMAESOptimizer25.getLowerBound();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
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
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray92 = cMAESOptimizer91.getUpperBound();
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray21 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray36 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray36);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray21, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator28, true, pointValuePairConvergenceChecker38);
        double[] doubleArray47 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray47);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList49 = cMAESOptimizer48.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList50 = cMAESOptimizer48.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker51 = cMAESOptimizer48.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator28, true, pointValuePairConvergenceChecker51);
        java.util.List<java.lang.Double> doubleList53 = cMAESOptimizer52.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray54 = cMAESOptimizer52.getStartPoint();
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer76.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair79 = cMAESOptimizer76.doOptimize();
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray41, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator51, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (-1), (double) 10L, false, (int) (byte) -1, (int) (byte) -1, randomGenerator51, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList77 = cMAESOptimizer75.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair78 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray28 = cMAESOptimizer27.getLowerBound();
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        double[] doubleArray21 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray21);
        org.apache.commons.math3.random.RandomGenerator randomGenerator28 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray21, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator28, true);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray72 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray72);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer73.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray57, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator64, true, pointValuePairConvergenceChecker74);
        double[] doubleArray83 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray83);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList85 = cMAESOptimizer84.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer84.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray43, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator64, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray21, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray7, 1, (double) (-1.0f), false, 1, 1, randomGenerator64, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer92.getStartPoint();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer62.getUpperBound();
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer9.getStartPoint();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair40 = cMAESOptimizer39.doOptimize();
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator15, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray8);
        double[] doubleArray32 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList50 = cMAESOptimizer49.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList51 = cMAESOptimizer49.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker52 = cMAESOptimizer49.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray32, 100, (double) 1, false, (int) (byte) 0, (int) (byte) 100, randomGenerator40, true, pointValuePairConvergenceChecker52);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray8, 30000, (double) '#', false, 0, 100, randomGenerator40, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray56 = cMAESOptimizer55.getUpperBound();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int11 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<java.lang.Double> doubleList1 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray22 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray22);
        org.apache.commons.math3.random.RandomGenerator randomGenerator29 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray22, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator29, true);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray73 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray73);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker75 = cMAESOptimizer74.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray58, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator65, true, pointValuePairConvergenceChecker75);
        double[] doubleArray84 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray84);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer85.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList87 = cMAESOptimizer85.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray44, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator65, true, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray22, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator65, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8, 1, (double) (-1.0f), false, 1, 1, randomGenerator65, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer94.getUpperBound();
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer92.getUpperBound();
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair2 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer17.doOptimize();
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        int int8 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        int int35 = cMAESOptimizer34.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
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
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray74 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer78.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray54, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator64, true, pointValuePairConvergenceChecker79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11, (int) (byte) -1, (double) ' ', true, (int) (byte) -1, (int) (short) 10, randomGenerator64, false);
        java.util.List<java.lang.Double> doubleList83 = cMAESOptimizer82.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer82.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair85 = cMAESOptimizer82.doOptimize();
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair2 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker60);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.random.RandomGenerator randomGenerator86 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer88.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList90 = cMAESOptimizer88.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker91 = cMAESOptimizer88.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray76, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator86, true, pointValuePairConvergenceChecker91);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, 0, (double) 0, true, (int) '#', (int) '4', randomGenerator86, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair95 = cMAESOptimizer94.doOptimize();
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray41, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator51, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (-1), (double) 10L, false, (int) (byte) -1, (int) (byte) -1, randomGenerator51, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray77 = cMAESOptimizer75.getUpperBound();
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray28 = cMAESOptimizer27.getUpperBound();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray31);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator55, true, pointValuePairConvergenceChecker65);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker81 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray31, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator55, true, pointValuePairConvergenceChecker81);
        double[] doubleArray90 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray90);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer91.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList93 = cMAESOptimizer91.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList94 = cMAESOptimizer91.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker95 = cMAESOptimizer91.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray7, 0, (double) ' ', false, (int) (short) 1, 100, randomGenerator55, true, pointValuePairConvergenceChecker95);
        java.util.List<java.lang.Double> doubleList97 = cMAESOptimizer96.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray98 = cMAESOptimizer96.getStartPoint();
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator58, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer71.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray73 = cMAESOptimizer71.getUpperBound();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        java.util.List<java.lang.Double> doubleList34 = cMAESOptimizer33.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer33.getUpperBound();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        int int12 = cMAESOptimizer7.getEvaluations();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer78.getStartPoint();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        int int16 = cMAESOptimizer15.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer15.getStartPoint();
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer53.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList55 = cMAESOptimizer53.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer53.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator51, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8, 0, (double) 100.0f, false, 0, 1, randomGenerator51, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray60 = cMAESOptimizer59.getLowerBound();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer12.getEvaluations();
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        int int20 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator32, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator49, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator49, false, pointValuePairConvergenceChecker66);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer67.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList69 = cMAESOptimizer67.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray70 = cMAESOptimizer67.getLowerBound();
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        int int77 = cMAESOptimizer76.getEvaluations();
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer76.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer76.getLowerBound();
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer38.getStartPoint();
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer53.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList55 = cMAESOptimizer53.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer53.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray41, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator51, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8, 0, (double) 100.0f, false, 0, 1, randomGenerator51, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList60 = cMAESOptimizer59.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray61 = cMAESOptimizer59.getStartPoint();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
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
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker94 = cMAESOptimizer92.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer92.getUpperBound();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator53, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator53, false);
        double[] doubleArray79 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray79);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer80.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer80.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator53, false, pointValuePairConvergenceChecker83);
        java.util.List<java.lang.Double> doubleList85 = cMAESOptimizer84.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer84.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair87 = cMAESOptimizer84.doOptimize();
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int14 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray22 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray22);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker24 = cMAESOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator14, true, pointValuePairConvergenceChecker24);
        org.apache.commons.math3.optimization.GoalType goalType26 = cMAESOptimizer25.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray27 = cMAESOptimizer25.getUpperBound();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        int int12 = cMAESOptimizer7.getEvaluations();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer38.getUpperBound();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray41, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator51, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (-1), (double) 10L, false, (int) (byte) -1, (int) (byte) -1, randomGenerator51, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList77 = cMAESOptimizer75.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer75.getUpperBound();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer6.getGoalType();
        int int11 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator20, true, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10);
        int int38 = cMAESOptimizer37.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer37.getStartPoint();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer38.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer38.getStartPoint();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator58, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer71.getStartPoint();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator32, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator49, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator49, false, pointValuePairConvergenceChecker66);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer67.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer67.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList71 = cMAESOptimizer67.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList24 = cMAESOptimizer23.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList25 = cMAESOptimizer23.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer23.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator21, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        int int30 = cMAESOptimizer29.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray31 = cMAESOptimizer29.getStartPoint();
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator32, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator49, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator49, false, pointValuePairConvergenceChecker66);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer67.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair70 = cMAESOptimizer67.doOptimize();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair94 = cMAESOptimizer92.doOptimize();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer42.getUpperBound();
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator20, true, pointValuePairConvergenceChecker35);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray10);
        int int38 = cMAESOptimizer37.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer37.getUpperBound();
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator53, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator53, false);
        double[] doubleArray79 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray79);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer80.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer80.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator53, false, pointValuePairConvergenceChecker83);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray85 = cMAESOptimizer84.getLowerBound();
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
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
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator58, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer71.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair73 = cMAESOptimizer71.doOptimize();
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray30);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker35 = cMAESOptimizer34.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator20, true, pointValuePairConvergenceChecker35);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray78 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray78);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker80 = cMAESOptimizer79.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray63, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator70, true, pointValuePairConvergenceChecker80);
        org.apache.commons.math3.random.RandomGenerator randomGenerator87 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray63, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator87, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray48, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator87, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10, (int) '#', (double) (short) 100, false, (int) '#', (int) (short) 1, randomGenerator87, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray94 = cMAESOptimizer93.getStartPoint();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray99 = cMAESOptimizer98.getStartPoint();
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        int int63 = cMAESOptimizer62.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType64 = cMAESOptimizer62.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer62.getLowerBound();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getMaxEvaluations();
        int int10 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        int int11 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer36.getStartPoint();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray89 = cMAESOptimizer88.getUpperBound();
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker59);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList61 = cMAESOptimizer60.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair62 = cMAESOptimizer60.doOptimize();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray41, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator51, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (-1), (double) 10L, false, (int) (byte) -1, (int) (byte) -1, randomGenerator51, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair77 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        int int17 = cMAESOptimizer12.getMaxEvaluations();
        int int18 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        double[] doubleArray39 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer55.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray39, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator46, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8, 1, (double) 10.0f, false, (int) (byte) 1, (-1), randomGenerator46, false);
        org.apache.commons.math3.optimization.GoalType goalType60 = cMAESOptimizer59.getGoalType();
        int int61 = cMAESOptimizer59.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair62 = cMAESOptimizer59.doOptimize();
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray70 = cMAESOptimizer69.getLowerBound();
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsDHistory();
        int int4 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer72.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer72.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker75 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray60, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator70, true, pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray27, 0, (double) 100.0f, false, 0, 1, randomGenerator70, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList82 = cMAESOptimizer81.getStatisticsFitnessHistory();
        int int83 = cMAESOptimizer81.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, 1, (double) (byte) 10, true, (int) (short) 100, (int) (byte) 10, randomGenerator70, false, pointValuePairConvergenceChecker84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray86 = cMAESOptimizer85.getLowerBound();
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        int int10 = cMAESOptimizer8.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer18.getUpperBound();
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray7, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator50, false);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer76.getLowerBound();
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
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
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray74 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer78.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray54, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator64, true, pointValuePairConvergenceChecker79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11, (int) (byte) -1, (double) ' ', true, (int) (byte) -1, (int) (short) 10, randomGenerator64, false);
        java.util.List<java.lang.Double> doubleList83 = cMAESOptimizer82.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer82.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray85 = cMAESOptimizer82.getUpperBound();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair41 = cMAESOptimizer40.doOptimize();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int95 = cMAESOptimizer94.getMaxEvaluations();
        int int96 = cMAESOptimizer94.getEvaluations();
        int int97 = cMAESOptimizer94.getEvaluations();
        java.util.List<java.lang.Double> doubleList98 = cMAESOptimizer94.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair99 = cMAESOptimizer94.doOptimize();
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        double[] doubleArray39 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray39);
        org.apache.commons.math3.random.RandomGenerator randomGenerator46 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker56 = cMAESOptimizer55.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray39, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator46, true, pointValuePairConvergenceChecker56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8, 1, (double) 10.0f, false, (int) (byte) 1, (-1), randomGenerator46, false);
        org.apache.commons.math3.optimization.GoalType goalType60 = cMAESOptimizer59.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray61 = cMAESOptimizer59.getUpperBound();
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        int int63 = cMAESOptimizer62.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList64 = cMAESOptimizer62.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer62.getLowerBound();
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer40.getLowerBound();
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator53, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator53, true);
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer73.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray75 = cMAESOptimizer73.getUpperBound();
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator53, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator53, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair74 = cMAESOptimizer73.doOptimize();
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator33, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9);
        java.util.List<java.lang.Double> doubleList37 = cMAESOptimizer36.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer36.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer36.getStartPoint();
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer15.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer15.getLowerBound();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker36 = cMAESOptimizer35.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator21, true, pointValuePairConvergenceChecker36);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator58, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer71.getLowerBound();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer12.getEvaluations();
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        int int13 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray29 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray29);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker34 = cMAESOptimizer33.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator19, true, pointValuePairConvergenceChecker34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = cMAESOptimizer35.getUpperBound();
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer78.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair80 = cMAESOptimizer78.doOptimize();
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray10, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator34, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        int int63 = cMAESOptimizer62.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray64 = cMAESOptimizer62.getLowerBound();
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker34 = cMAESOptimizer33.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer33.getStartPoint();
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer6.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer6.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        int int35 = cMAESOptimizer34.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer34.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType37 = cMAESOptimizer34.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair38 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        int int12 = cMAESOptimizer8.getMaxEvaluations();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList95 = cMAESOptimizer94.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray96 = cMAESOptimizer94.getUpperBound();
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        int int95 = cMAESOptimizer94.getMaxEvaluations();
        int int96 = cMAESOptimizer94.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType97 = cMAESOptimizer94.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray98 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
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
        org.apache.commons.math3.random.RandomGenerator randomGenerator74 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator74, true);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        int int78 = cMAESOptimizer76.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer76.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer76.getUpperBound();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        double[] doubleArray38 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray38);
        org.apache.commons.math3.random.RandomGenerator randomGenerator45 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray53);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker55 = cMAESOptimizer54.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray38, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator45, true, pointValuePairConvergenceChecker55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray38, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator62, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator62, false);
        double[] doubleArray76 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray76);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray76);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker81 = cMAESOptimizer80.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer80.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8, (-1), (double) 10L, true, (int) 'a', (int) (byte) -1, randomGenerator62, false, pointValuePairConvergenceChecker83);
        int int85 = cMAESOptimizer84.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray86 = cMAESOptimizer84.getUpperBound();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getEvaluations();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray32 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray32);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray32);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker37 = cMAESOptimizer36.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator22, true, pointValuePairConvergenceChecker37);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray12);
        int int42 = cMAESOptimizer41.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer41.getLowerBound();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray43, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator53, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator53, true);
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer73.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray75 = cMAESOptimizer73.getLowerBound();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator49, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray42, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator66, false);
        double[] doubleArray78 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray78);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator66, false, pointValuePairConvergenceChecker83);
        org.apache.commons.math3.random.RandomGenerator randomGenerator90 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray25, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator90, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator90, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList97 = cMAESOptimizer96.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList98 = cMAESOptimizer96.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair99 = cMAESOptimizer96.doOptimize();
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer15.getStartPoint();
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        int int18 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker59);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList61 = cMAESOptimizer60.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer60.getUpperBound();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray28);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray46, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator56, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray28, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator56, false);
        double[] doubleArray82 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray82);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer83.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList85 = cMAESOptimizer83.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer83.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator56, false, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray91 = cMAESOptimizer90.getUpperBound();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer41.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray25, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator32, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray25, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator49, false);
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator49, false, pointValuePairConvergenceChecker66);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer67.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer67.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer67.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray71 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        int int12 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList35 = cMAESOptimizer34.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer34.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType37 = cMAESOptimizer34.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        double[] doubleArray49 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray49);
        org.apache.commons.math3.random.RandomGenerator randomGenerator56 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray64 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray64);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray49, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator56, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator56, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray71 = cMAESOptimizer70.getStartPoint();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker44 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator34, true, pointValuePairConvergenceChecker44);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator70 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer72.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList74 = cMAESOptimizer72.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker75 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray60, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator70, true, pointValuePairConvergenceChecker75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray27, 0, (double) 100.0f, false, 0, 1, randomGenerator70, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList82 = cMAESOptimizer81.getStatisticsFitnessHistory();
        int int83 = cMAESOptimizer81.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, 1, (double) (byte) 10, true, (int) (short) 100, (int) (byte) 10, randomGenerator70, false, pointValuePairConvergenceChecker84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray86 = cMAESOptimizer85.getUpperBound();
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer15.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer15.getUpperBound();
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator34 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator34, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer38.getUpperBound();
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray61 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray61);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray61);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker66 = cMAESOptimizer65.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray41, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator51, true, pointValuePairConvergenceChecker66);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray23, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7, (-1), (double) 10L, false, (int) (byte) -1, (int) (byte) -1, randomGenerator51, false, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        int int77 = cMAESOptimizer75.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker28 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator18, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator35, false);
        double[] doubleArray50 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray65 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray65);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray50, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator57, true, pointValuePairConvergenceChecker67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator57, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer72.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray74 = cMAESOptimizer72.getStartPoint();
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        org.apache.commons.math3.random.RandomGenerator randomGenerator18 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker28 = cMAESOptimizer27.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator18, true, pointValuePairConvergenceChecker28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator35, false);
        double[] doubleArray50 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray65 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray65);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker67 = cMAESOptimizer66.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray50, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator57, true, pointValuePairConvergenceChecker67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray11, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator57, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair73 = cMAESOptimizer72.doOptimize();
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
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
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer76.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer76.getStartPoint();
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        int int10 = cMAESOptimizer7.getEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray41, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator65, false);
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator65, false, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.random.RandomGenerator randomGenerator89 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray24, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator89, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray55, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator62, true, pointValuePairConvergenceChecker72);
        double[] doubleArray81 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray81);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer82.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer82.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray41, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator62, true, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, (int) '#', (double) (byte) 0, true, (int) 'a', (int) 'a', randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10);
        java.util.List<java.lang.Double> doubleList91 = cMAESOptimizer90.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray92 = cMAESOptimizer90.getUpperBound();
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator33, true);
        int int47 = cMAESOptimizer46.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray48 = cMAESOptimizer46.getLowerBound();
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray23);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray23);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray55 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker57 = cMAESOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray40, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator47, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator47, true);
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.random.RandomGenerator randomGenerator76 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray84 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray84);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker86 = cMAESOptimizer85.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray69, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator76, true, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator47, true, pointValuePairConvergenceChecker86);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer89.getStartPoint();
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        int int15 = cMAESOptimizer14.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer14.getUpperBound();
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
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
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray75 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray75);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray75);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker80 = cMAESOptimizer79.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray55, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator65, true, pointValuePairConvergenceChecker80);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12, (int) (byte) -1, (double) ' ', true, (int) (byte) -1, (int) (short) 10, randomGenerator65, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray85 = cMAESOptimizer84.getStartPoint();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker43 = cMAESOptimizer42.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator33, true, pointValuePairConvergenceChecker43);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray54);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray9, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator33, true, pointValuePairConvergenceChecker59);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList61 = cMAESOptimizer60.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList62 = cMAESOptimizer60.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList63 = cMAESOptimizer60.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair64 = cMAESOptimizer60.doOptimize();
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray27);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer39.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList41 = cMAESOptimizer39.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker42 = cMAESOptimizer39.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray27, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator37, true, pointValuePairConvergenceChecker42);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9, 10, (double) 0, false, (int) 'a', (int) '4', randomGenerator37, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray47 = cMAESOptimizer46.getLowerBound();
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer16.doOptimize();
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer88.getUpperBound();
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer6.getStatisticsMeanHistory();
        int int13 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker16 = cMAESOptimizer12.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        int int15 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
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
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer12.getGoalType();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        double[] doubleArray57 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer61.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray12, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator36, true, pointValuePairConvergenceChecker62);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray67 = cMAESOptimizer66.getLowerBound();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        int int12 = cMAESOptimizer8.getMaxEvaluations();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.random.RandomGenerator randomGenerator32 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray8, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator32, false);
        int int35 = cMAESOptimizer34.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType36 = cMAESOptimizer34.getGoalType();
        java.util.List<java.lang.Double> doubleList37 = cMAESOptimizer34.getStatisticsFitnessHistory();
        int int38 = cMAESOptimizer34.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getStartPoint();
    }
}

